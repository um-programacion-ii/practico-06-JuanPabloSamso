package com.juan_pablo_samso;

import com.juan_pablo_samso.Dao.MedicoDao;
import com.juan_pablo_samso.Entidades.Medico;
import com.juan_pablo_samso.Entidades.Paciente;
import com.juan_pablo_samso.Servicios.GestionTurnoService;

import java.util.ArrayList;
import java.util.List;


public class Clinica {
    public static void main(String[] args) {
        List<String> obra_sociales = new ArrayList<>();
        obra_sociales.add("particular");

        Medico eusebio_medico = new Medico("Eusebio", "Fernández", "Cardiólogo",1,obra_sociales);
        Medico carlos_medico = new Medico("Carlos", "Medicina","Urólogo",2,obra_sociales);

        MedicoDao medicodao = MedicoDao.getInstance();

        medicodao.create(1,eusebio_medico);
        medicodao.create(2,carlos_medico);

        GestionTurnoService gestionTurnoService = new GestionTurnoService();
        gestionTurnoService.solicitarTurno("Cardiólogo",new Paciente("Carlos", "Garcia", "particular", 1));







    }
}