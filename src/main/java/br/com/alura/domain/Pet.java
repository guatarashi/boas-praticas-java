package br.com.alura.domain;

public class Pet {

    private long id;
    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private float peso;

    public Pet() {
    }

    public Pet(String tipo, String nome, String raca, int idade, String cor, float peso){
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }
}
