package org.example.Calendario;

import java.util.Calendar;
public class AnoAtual {

    public static int defineAnoAtual(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }
}
