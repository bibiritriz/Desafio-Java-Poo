package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {}

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "\n" + getTitulo() + ", " + getDescricao() + ", " + data.format(d);
    }
}
