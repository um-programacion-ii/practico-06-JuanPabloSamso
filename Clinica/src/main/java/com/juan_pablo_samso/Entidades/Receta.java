package com.juan_pablo_samso.Entidades;

import java.util.List;

public class Receta {

    private List<String> medicamentos;
    private int paciente_id;

    public Receta() {
    }

    public Receta(List<String> medicamentos, int paciente_id) {
        this.medicamentos = medicamentos;
        this.paciente_id = paciente_id;
    }

    public List<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }
}