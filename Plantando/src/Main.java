
import br.com.dio.desafio.dominio.Sementes;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-- Informações Sobre as Sementes --\n");
        System.out.println("\n-- Digite o Tamanho das Sementes e a Quantidade de Sementes em Kg: --\n");
        
        Sementes semente1 = new Sementes();
        System.out.println("-- Tipo de Semente --");
        semente1.setTipoDeSemente("Trigo");
        System.out.println(semente1.getTipoDeSemente());
        System.out.println("-- Tamanho das Sementes --");
        semente1.getTamanho();
        if (semente1.getTamanho() <= 0) {
            System.out.println("Tamanho Inválido!");
        } else {
        System.out.println(semente1.getTamanho()); }

        System.out.println("-- Quantidade de Sementes em Kg --");
        semente1.getQuantidadeEmKg();
        if (semente1.getQuantidadeEmKg() <= 0) {
            System.out.println("Quantidade Inválida!");
        } else {
        System.out.println(semente1.getQuantidadeEmKg()); }

        System.out.println("\n" + semente1 + "\n");
        
        
    }
}
