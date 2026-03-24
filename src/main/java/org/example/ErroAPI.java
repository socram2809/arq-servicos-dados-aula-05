package org.example;

import java.io.Serializable;

public class ErroAPI implements Serializable {
    private String mensagem;

    public ErroAPI(){}

    public ErroAPI(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return this.mensagem;
    }
}
