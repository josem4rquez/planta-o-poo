package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Terra {

    private Set<String> caracteristicasLocais =  new LinkedHashSet<>();
    
    public Set<String> getCaracteristicasLocais() {
        return caracteristicasLocais;
    }
    
    public void setCaracteristicasLocais(Set<String> caracteristicasLocais) {
        this.caracteristicasLocais = caracteristicasLocais;
    }

    @Override
    public String toString() {
        return "{ Caracteristicas da Terra Local = " + caracteristicasLocais + " }";
    }


    
}
