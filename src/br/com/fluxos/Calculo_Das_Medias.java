package br.com.fluxos;

import java.util.Scanner;

/**
 * calculando media e recebendo as variaveis
 */
public class Calculo_Das_Medias {
    /**
     * propriedades da classe
     */
    private Double nota1, nota2, nota3, nota4, media;
    private String aluno;

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    /**
     *
     * @param media da class
     * @hidden
     */
    public void RetornaMedia(Double media){
       this.media = ((nota1 + nota2 + nota3 + nota4) / 4);
    }
}
