package com.duoc.cursosapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Curso {

    // Arreglo: Almacenar varios elementos y tiene tamaño fijo, es inmutable
    // String{} nombre_arreglo = {"cadena1","cadena2"};

    // Coleccion: Permite guardar varios elementos y puede crecer dinamicamente
    // list = son recomendables para endpoints
    // List<TipoDeDato String> nombre_lista = new.ArrayList();  // Esto es una lista vacia

    // ID del curso
    //integer
    // @NotNull: El mensaje no puede ser nulo
    @NotNull(message = "El ID no puede ser nulo")
    private Integer id;

    // Validacion: @NotBlank: Mensaje no puede ir en blanco
    @NotBlank(message = "El nombre del curso no puede estar en blanco")
    private String nombre;

    //Nombre docente
    @NotBlank(message ="El nombre del docente no puede estar en blanco")
    private String docente;

    //Cantidad de horas del curso
    @NotNull
    private Integer horas;


    //Constructor vacio
    public Curso() {}

    // Constructor con parametros
    public Curso(Integer id, String nombre, String docente, Integer horas) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
        this.horas = horas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
