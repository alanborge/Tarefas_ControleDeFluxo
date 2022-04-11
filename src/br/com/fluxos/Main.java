package br.com.fluxos;

import java.util.Scanner;

/**
 * @author
 * Classe principal
 */
public class Main {

    public static void main(String[] args) {
	    RetornaNotasAluno();
    }

    /**
     *   <b>Metodos dos calculos e fluxos</b>
     */
    public static void RetornaNotasAluno() {
        Scanner input = new Scanner(System.in);
        Calculo_Das_Medias calc = new Calculo_Das_Medias();
        String result, situacao = "";
        do {
                for (int x = 0; x <= 3; x++) {
                    System.out.println("informe as notas do aluno");
                    System.out.println("Qual nome do Aluno: ");
                    calc.setAluno(input.next());
                    calc.getAluno();
                    System.out.println("1º nota: ");
                    calc.setNota1(input.nextDouble());
                    calc.getNota1();
                    System.out.println("2º nota: ");
                    calc.setNota2(input.nextDouble());
                    calc.getNota2();
                    System.out.println("3º nota: ");
                    calc.setNota3(input.nextDouble());
                    calc.getNota3();
                    System.out.println("4º nota: ");
                    calc.setNota4(input.nextDouble());
                    calc.getNota4();
                    calc.RetornaMedia(calc.getMedia());
                    System.out.println(x + " Aluno: " + calc.getAluno() + " | Media: " + calc.getMedia());
                    if (calc.getMedia() >= 7) {
                        situacao = "Aprovado";
                        System.out.println(x + " Aluno: " + calc.getAluno() + " foi " + situacao);
                    } else if (calc.getMedia() >= 5) {
                        situacao = "de recupeção";
                        System.out.println(x + " Aluno: " + calc.getAluno() + " esta " + situacao);
                    } else if (calc.getMedia() < 5) {
                        situacao = "Reprovado";
                        System.out.println(x + " Aluno: " + calc.getAluno() + " foi " + situacao);
                    }
                }

            System.out.println("deseja continuar? ");
            result = input.next();
        } while (result.equalsIgnoreCase("Sim"));

        if (result.equalsIgnoreCase("Não")){
            System.out.println("Obrigado");
        }

    }
}
