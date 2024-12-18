package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Semeador {
    public int experiencia;
    private double altura;
    private double peso;
    private int idade;
    private String nome;
    private boolean sabeUsarFerramenta;
    private List<String> ferramentasComExperiencia;
    
    public Semeador(int experiencia, double altura, double peso, int idade, String nome, boolean sabeUsarFerramenta) {
        this.experiencia = experiencia;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.nome = nome;
        this.sabeUsarFerramenta = sabeUsarFerramenta;
        this.ferramentasComExperiencia = new ArrayList<>();

        ferramentasComExperiencia.add("Enxada");
        ferramentasComExperiencia.add("Pá");
        ferramentasComExperiencia.add("Trator");
        ferramentasComExperiencia.add("Fertilizantes");
        ferramentasComExperiencia.add("Regador");
    }
    public boolean isSabeUsarFerramenta() {
        return sabeUsarFerramenta;
    }
    public void setSabeUsarFerramenta(boolean sabeUsarFerramenta) {
        this.sabeUsarFerramenta = sabeUsarFerramenta;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "[Nome = " + nome + ", Tempo de Experiencia = " + experiencia + ", Altura = " + altura + ", Peso = " + peso + ", Idade = " + idade
                + ", Sabe Usar Ferramentas? = " + sabeUsarFerramenta + ", Ferramentas que tem Experiencia = "
                + ferramentasComExperiencia;
    }
}
