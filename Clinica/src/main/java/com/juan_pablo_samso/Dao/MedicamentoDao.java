package com.juan_pablo_samso.Dao;

import com.juan_pablo_samso.Entidades.Medicamento;

import java.util.HashMap;

public class MedicamentoDao {

    private HashMap<Integer, Medicamento> medicamentos = new HashMap<Integer, Medicamento>();

    private static MedicamentoDao instance;

    private MedicamentoDao() {
    }

    public static MedicamentoDao getInstance() {
        if (instance == null) {
            instance = new MedicamentoDao();
        }
        return instance;
    }

    public void create(int medicamento_id, Medicamento medicamento) {
        medicamentos.put(medicamento_id, medicamento);
    }

    public void update(int medicamento_id, Medicamento medicamento) {
        if (medicamentos.get(medicamento_id) == null) {
            medicamentos.put(medicamento_id, medicamento);
        } else {
            System.out.println("Este id ya es utilizado por otro medicamento");
        }
    }

    public Medicamento get_one(int medicamento_id) {
        return medicamentos.get(medicamento_id);
    }

    public HashMap<Integer, Medicamento> get_all() {
        return medicamentos;
    }

    public void delete(int medicamento_id) {
        medicamentos.remove(medicamento_id);
    }
}