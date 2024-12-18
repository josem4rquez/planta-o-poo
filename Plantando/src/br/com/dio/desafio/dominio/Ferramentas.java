package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Ferramentas {

    public List<String> ferramentasADisposição;
    
    public Ferramentas() {
        this.ferramentasADisposição = new ArrayList<>();
    }
    public List<String> getFerramentasADisposição() {
        return ferramentasADisposição;
    }
    public void setFerramentasADisposição(List<String> ferramentasADisposição) {
        this.ferramentasADisposição = ferramentasADisposição;
    }
    @Override
    public String toString() {
        return "{ Ferramentas = " + ferramentasADisposição + " }";
    }
}
