package com.juan_pablo_samso.Entidades;

import java.util.List;

public class Medicamento {

    private int medicamento_id;
    private String nombre;

    public Medicamento() {
    }

    public Medicamento(String nombre, int medicamento_id) {
        this.nombre = nombre;
        this.medicamento_id = medicamento_id;
    }

    public int getMedicamento_id() {
        return medicamento_id;
    }

    public void setMedicamento_id(int medicamento_id) {
        this.medicamento_id = medicamento_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
