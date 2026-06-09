package com.estagio.estagio;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public class MediaRequest {
    private String nome;

    @NotNull(message = "Nota 1 é obrigatória.")
    @DecimalMin(value = "0.0", message = "A nota deve ser no mínimo 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser no máximo 10.")
    private Double nota1;

    @NotNull(message = "Nota 2 é obrigatória.")
    @DecimalMin(value = "0.0", message = "A nota deve ser no mínimo 0.")
    @DecimalMax(value = "10.0", message = "A nota deve ser no máximo 10.")
    private Double nota2;

    public String getNome() { return nome; }
    public Double getNota1() { return nota1; }
    public Double getNota2() { return nota2; }

    public void setNome(String nome) { this.nome = nome; }
    public void setNota1(Double nota1) { this.nota1 = nota1; }
    public void setNota2(Double nota2) { this.nota2 = nota2; }
}