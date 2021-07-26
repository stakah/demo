package com.example.demo;

import java.io.Serializable;

public class CustomerPK implements Serializable {
    protected Long id1;
    protected String chave1;

    public CustomerPK() {}

    public CustomerPK(Long id1, String chave1) {
        this.id1 = id1;
        this.chave1 = chave1;
    }
}
