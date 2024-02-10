package org.example.clase;

import java.util.Arrays;

public class TablaPronostico {
    public void calculos() {
        double[] demanda = {133, 292, 283, 302, 400, 505, 608, 667, 783, 785, 799};
        double[] periodo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        double pronostico = calcularPronostico(demanda,periodo,10);
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
