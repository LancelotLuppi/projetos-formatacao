package br.com.vemser.java.aula1.basicos;

public class VariavelEConstantes {
    public static void main(String[] args) {
        int idade = 18;
        String nome = "Gabriel";
        float altura = 1.83f;
        double peso = 80.5;
        boolean ehSolteiro = false;

        final String MEU_NOME_EH = "Meu nome eh ";

        System.out.println(MEU_NOME_EH + nome + ", tenho " + idade
        + " anos, " + altura + "m e " + peso + "kg.");

    }
}
