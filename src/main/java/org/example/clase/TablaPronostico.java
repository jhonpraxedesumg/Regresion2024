package org.example.clase;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class TablaPronostico {
    public void calculos() {
        double[] demanda = {133, 292, 283, 302, 400, 505, 608, 667, 783, 785, 799};
        double[] periodo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        double pronostico = calcularPronostico(demanda,periodo,10);
        for( int x=0;x<periodo.length;x++){
            pronostico = calcularPronostico(demanda,periodo,x);
            System.out.println(x+ " .pronostico= "+pronostico);
        }
        DoubleStream StreamPeriodo = DoubleStream.of(periodo);
        StreamPeriodo.forEach((mes))->{
            System.out.println("mes= "+ mes+ );
        }
    }
    private double calcularPronostico(double[] y, double[] x, double valorX){
        double n= y.length;
        double sumXY =0;
        double sumX = Arrays.stream(x).sum();
        double sumY = Arrays.stream(y).sum();
        double sumX2 = Arrays.stream(x).map(xi -> xi * xi).sum();

        for (int i=0;i<n;i++){
            sumXY +=x[i]*y[i];
        }
    }
}
