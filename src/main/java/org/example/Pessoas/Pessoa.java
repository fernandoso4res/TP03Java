package org.example.Pessoas;
import lombok.Getter;
import org.example.Calendario.AnoAtual;


public class Pessoa {
    @Getter
    private String nome;
    @Getter
    private int anoNascimento;
    @Getter
    private float peso;
    @Getter
    private float altura;


    public Pessoa(String nome, int anoNascimento, float peso, float altura){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.altura = altura;
    }
    public int defineIdade(int anoNascimento){
        int anoAtual = AnoAtual.defineAnoAtual();
        return anoAtual - anoNascimento;
    }



}
