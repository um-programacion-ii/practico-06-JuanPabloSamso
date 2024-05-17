package com.juan_pablo_samso.Entidades;

import java.util.HashMap;

public class Farmacia {

    private HashMap<String, Integer> stock;

    public Farmacia(HashMap<String, Integer> stock) {
        this.stock = stock;
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<String, Integer> stock) {
        this.stock = stock;
    }
}
