package org.example;
import org.example.Pessoas.Pessoa;
import org.example.Imc.CalculoIMC;


public class App {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Pedro", 2001, 105.78f, 1.87f);
        Pessoa pessoa2 = new Pessoa("Marcos", 1987, 78.90f, 1.75f);


        int idade = pessoa.defineIdade(pessoa.getAnoNascimento());
        float imc = CalculoIMC.realizaCalculoIMC(pessoa.getPeso(), pessoa.getAltura());

        int idade2 = pessoa2.defineIdade((pessoa2.getAnoNascimento()));
        float imc2 = CalculoIMC.realizaCalculoIMC(pessoa2.getPeso(), pessoa2.getAltura());

        System.out.println("Nome: "+ pessoa.getNome());
        System.out.println("Idade: "+ idade);
        System.out.println("IMC: "+ imc);
        System.out.println(CalculoIMC.classificaIMC(imc));
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Nome: "+ pessoa2.getNome());
        System.out.println("Idade: "+ idade2);
        System.out.println("IMC: "+ imc2);
        System.out.println(CalculoIMC.classificaIMC(imc2));

    }


}