package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private int notaDoPimeiroSemestre;
    private int notaDoSegundoSemestre;
    private String professor;
    private int numeroSala;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNotaDoPimeiroSemestre() {
        return notaDoPimeiroSemestre;
    }

    public void setNotaDoPimeiroSemestre(int notaDoPimeiroSemestre) {
        this.notaDoPimeiroSemestre = notaDoPimeiroSemestre;
    }

    public int getNotaDoSegundoSemestre() {
        return notaDoSegundoSemestre;
    }

    public void setNotaDoSegundoSemestre(int notaDoSegundoSemestre) {
        this.notaDoSegundoSemestre = notaDoSegundoSemestre;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
}
