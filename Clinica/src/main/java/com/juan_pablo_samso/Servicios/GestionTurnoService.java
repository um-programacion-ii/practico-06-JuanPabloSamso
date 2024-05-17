package com.juan_pablo_samso.Servicios;

import com.juan_pablo_samso.Dao.MedicoDao;
import com.juan_pablo_samso.Dao.TurnoDao;
import com.juan_pablo_samso.Entidades.Medico;
import com.juan_pablo_samso.Entidades.Paciente;
import com.juan_pablo_samso.Entidades.Turno;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class GestionTurnoService {
    private MedicoDao medicodao = MedicoDao.getInstance();
    private TurnoDao turnoDao = TurnoDao.getInstance();
    int turnocounter = 1;

    public GestionTurnoService() {
    }

    public void solicitarTurno(String especialidad, Paciente paciente) {
        HashMap<Integer, Medico> medicos = medicodao.get_all();
        for (Medico medico : medicos.values()) {
            if (Objects.equals(medico.getEspecialidad(), especialidad) && medico.getObras_sociales().contains(paciente.getObra_social())) {
                Turno turno = new Turno(turnocounter, medico.getMedico_id(), paciente.getPaciente_id());
                turnoDao.create(turnocounter,turno);
                System.out.println("Se creo un turno");
                turnocounter ++;
                return;
            }
        }
        System.out.println("No se encontro un médico");
    }

}
