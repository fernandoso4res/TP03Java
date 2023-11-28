package org.example;

import org.example.Imc.CalculoIMC;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraIMCTest {


    @Test
    @DisplayName("Testa se o IMC é menor que 0")
    public void verificaIMCTest(){
        CalculoIMC calculoIMC = new CalculoIMC();
        float imc = calculoIMC.realizaCalculoIMC(90f, 1.90f);
        assertEquals(24.90, imc, 0.1);
        assertThrows(IllegalArgumentException.class, () ->{
            calculoIMC.realizaCalculoIMC(-90, 1.90f);
        });
    }

    @Test
    @DisplayName("Deve testar se a pessoa possui magreza grave")
    public void verificaMagrezaGrave(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String magreza = calculoIMC.classificaIMC(15.9f);
        assertEquals("Magreza Grave", magreza);
    }

    @Test
    @DisplayName("Deve testar se a pessoa possui magreza moderada")
    public void verificaMagrezaModerada(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String magreza = calculoIMC.classificaIMC(16f);
        assertEquals("Magreza Moderada", magreza);
    }

    @Test
    @DisplayName("Deve testar se a pessoa possui magreza leve")
    public void verificaMagrezaLeve(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String magreza = calculoIMC.classificaIMC(17f);
        assertEquals("Magreza Leve", magreza);
    }


    @Test
    @DisplayName("Deve testar se a pessoa é saudável")
    public void verificaSaudavel(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String saudavel = calculoIMC.classificaIMC(18.5f);
        assertEquals("Saudável", saudavel);
    }


    @Test
    @DisplayName("Deve testar se a pessoa possui sobrepeso")
    public void verificaSobrepeso(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String sobrepeso = calculoIMC.classificaIMC(25.0f);
        assertEquals("Sobrepeso", sobrepeso);
    }


    @Test
    @DisplayName("Deve testar se a pessoa possui obesidade grau 1")
    public void verificaObesidade1(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String obesidade = calculoIMC.classificaIMC(30.0f);
        assertEquals("Obesidade Grau I", obesidade);
    }


    @Test
    @DisplayName("Deve testar se a pessoa possui obesidade grau 2")
    public void verificaObesidade2(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String obesidade = calculoIMC.classificaIMC(35.0f);
        assertEquals("Obesidade Grau II", obesidade);
    }


    @Test
    @DisplayName("Deve testar se a pessoa possui obesidade grau 3")
    public void verificaObesidade3(){
        CalculoIMC calculoIMC = new CalculoIMC();
        String obesidade = calculoIMC.classificaIMC(40.1f);
        assertEquals("Obesidade Grau III", obesidade);
    }
}
