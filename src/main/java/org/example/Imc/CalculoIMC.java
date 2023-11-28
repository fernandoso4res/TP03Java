package org.example.Imc;

import org.example.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculoIMC {
    public static float realizaCalculoIMC(float peso, float altura){
        if (peso < 0 || altura < 0){
            throw new IllegalArgumentException("Não pode conter valores menores que 0");
        }
        float imc;
        imc = peso / (altura * altura);
        return imc;
    }

    public static String classificaIMC(float imc){
        if (imc < 0){
            throw new IllegalArgumentException("O IMC não pode ser negativo");
        }
        if (imc < 16.0){
            return "Magreza Grave";
        }
        else if (imc == 16.0 || imc < 17.0){
            return "Magreza Moderada";
        }
        else if (imc == 17.0 || imc < 18.5){
            return "Magreza Leve";
        }
        else if (imc == 18.5 || imc < 25.0) {
            return "Saudável";
        }
        else if (imc == 25.0 || imc < 30.0) {
            return "Sobrepeso";
        }
        else if (imc == 30.0 || imc < 35.0) {
            return "Obesidade Grau I";
        }
        else if (imc == 35.0 || imc < 40.0) {
            return "Obesidade Grau II";
        }
        else {
            return "Obesidade Grau III";
        }
    }
}
