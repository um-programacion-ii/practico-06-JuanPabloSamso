package com.juan_pablo_samso.Dao;

import com.juan_pablo_samso.Entidades.Receta;

import java.util.HashMap;

public class RecetaDao {

    private HashMap<Integer, Receta> recetas = new HashMap<Integer, Receta>();

    private static RecetaDao instance;

    private RecetaDao() {
    }

    public static RecetaDao getInstance(){
        if (instance == null){
            instance = new RecetaDao();
        }
        return instance;
    }

    public void create_receta(int receta_id, Receta receta){
        recetas.put(receta_id, receta);
    }

}