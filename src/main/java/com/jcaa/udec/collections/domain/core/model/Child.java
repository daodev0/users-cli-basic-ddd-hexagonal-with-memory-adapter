package com.jcaa.udec.collections.domain.core.model;

import java.util.List;

public class Child {
    private String id;
    private String matricula;
    private String nombreCompleto;
    private String fechaNacimiento;
    private List<String> alergias;
    private String estado;

    public Child() {}

    public Child(String id, String matricula, String nombreCompleto, String fechaNacimiento, List<String> alergias, String estado) {
        this.id = id;
        this.matricula = matricula;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.alergias = alergias;
        this.estado = estado;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public List<String> getAllergias() { return alergias; }
    public void setAllergias(List<String> alergias) { this.alergias = alergias; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}