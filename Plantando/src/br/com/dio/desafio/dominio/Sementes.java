package br.com.dio.desafio.dominio;

import java.util.Scanner;

public class Sementes{

    Scanner scan = new Scanner(System.in); 
    
    private String tipoDeSemente;
    private double tamanho = scan.nextDouble();
    private double quantidadeEmKg = scan.nextDouble();
    
    public String getTipoDeSemente() {
        return tipoDeSemente;
    }
    public double getQuantidadeEmKg() {
        return quantidadeEmKg;
    }
    public double getTamanho() {
        return tamanho;
    }
    public void setTipoDeSemente(String tipoDeSemente) {
        this.tipoDeSemente = tipoDeSemente;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public void setQuantidadeEmKg(double quantidadeEmKg) {
        this.quantidadeEmKg = quantidadeEmKg;
    }
    
    @Override
    public String toString() {
        return "Tipo de Semente = " + tipoDeSemente + ", Tamanho = " + tamanho
                + ", Quantidade em Kg = " + quantidadeEmKg;
    }
    
}
