package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RetanguloControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void deveRetornarAreaCalculadaViaEndpoint() {
        String url = "http://localhost:" + port + "/area?largura=5&altura=10";

        ResponseEntity<Integer> response = restTemplate.getForEntity(url, Integer.class);

        assertEquals(200, response.getStatusCode().value());
        assertEquals(50, response.getBody());
    }

    @Test
    void deveRetornarErroBadRequestParaCalculoInvalidoArea() {
        String url = "http://localhost:" + port + "/area?largura=-1&altura=10";

        ResponseEntity<ErroAPI> response = restTemplate.getForEntity(url, ErroAPI.class);

        assertEquals(400, response.getStatusCode().value());
        assertEquals("Altura e largura devem ser maior que zero", response.getBody().getMensagem());
    }
}
