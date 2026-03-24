package com.duoc.cursosapi.service;

import com.duoc.cursosapi.model.Curso;
import com.duoc.cursosapi.model.Curso;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class CursoService {
    // Declarar lista que va a ser "base de datos"
    private List<Curso> listarCursos = new ArrayList<>();

    // Crear un arreglo
    private String[] modalidades = {"Presencial", "Online", "Hibrida"};

    public CursoService() {
        //Cargar algunos datos
        listarCursos.add(new Curso(1, "Fullstack 1", "Marcelo Crisostomo", 100));
        listarCursos.add(new Curso(2, "Base de datos 2", "German Barrientos", 120));
        listarCursos.add(new Curso(3, "Inteligencia Artifical", "Gio", 140));
    }

    //GET
    public List<Curso> obtenerCursos() {
        return listarCursos;
    }

    // Obtener modalidades
    public String[] obtenerModalidades(){
        return modalidades;
    }

    //Post Guardar
    public Curso guardarCurso(Curso curso) {
        listarCursos.add(curso);
        return curso;
    }
}
