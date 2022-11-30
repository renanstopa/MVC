package br.edu.fatecrl.mvcdemo.Models;

public class Jogo {

    private String nome;
    private double preco;
    private double horas;
    private String dispositivo;

    public Jogo(String nome, double preco, double horas, String dispositivo) {
        this.nome = nome;
        this.preco = preco;
        this.horas = horas;
        this.dispositivo = dispositivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

}
