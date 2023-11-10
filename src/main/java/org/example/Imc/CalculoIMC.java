package org.example.Imc;

public class CalculoIMC {

    public static float realizaCalculoIMC(float peso, float altura){
        float imc;
        imc = peso / (altura * altura);
        return imc;
    }

    public static String classificaIMC(float imc){
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
