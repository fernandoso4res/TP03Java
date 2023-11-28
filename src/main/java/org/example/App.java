package org.example;
import org.example.Pessoas.Pessoa;
import org.example.Imc.CalculoIMC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        LOGGER.info("Início da aplicação");
        Pessoa pessoa = new Pessoa("Pedro", 2001, 105.78f, 1.87f);
        Pessoa pessoa2 = new Pessoa("Marcos", 1987, 78.90f, 1.75f);


        int idade = pessoa.defineIdade(pessoa.getAnoNascimento());
        float imc = CalculoIMC.realizaCalculoIMC(pessoa.getPeso(), pessoa.getAltura());
        LOGGER.debug("Idade do "+pessoa.getNome() + " é: " +pessoa.defineIdade(pessoa.getAnoNascimento()));

        int idade2 = pessoa2.defineIdade((pessoa2.getAnoNascimento()));
        float imc2 = CalculoIMC.realizaCalculoIMC(pessoa2.getPeso(), pessoa2.getAltura());
        LOGGER.debug("Idade do "+pessoa2.getNome() + " é: "+pessoa2.defineIdade(pessoa2.getAnoNascimento()));


        LOGGER.info("Nome: "+ pessoa.getNome());
        LOGGER.info("Idade: "+ idade);
        LOGGER.info("IMC: "+ imc);
        LOGGER.info(CalculoIMC.classificaIMC(imc));
        System.out.println();

        LOGGER.info("Nome: "+ pessoa2.getNome());
        LOGGER.info("Idade: "+ idade2);
        LOGGER.info("IMC: "+ imc2);
        LOGGER.info(CalculoIMC.classificaIMC(imc2));


        LOGGER.info("Fim da da aplicação");
    }



}