package org.example;


import org.example.clase.Persona;

public class Main {
    public static void main(String[] args) {
//        Persona personas = new Persona(3);
//        //asignar el objeto persona
//
//        Persona[0]=new Persona("Juan",20);
//        Persona[0]=new Persona("Pedro",30);
//        Persona[0]=new Persona("Jose",35);
//
//        for (Persona persona: personas){
//            System.out.println(persona);
//        }
        //ahora con matrices
        Persona[][]matrix=new Persona[2][2];

        matrix[0][0]=new Persona("Juan   ",20);
        matrix[0][1]=new Persona("Pedro   ",21);
        matrix[1][0]=new Persona("Jose   ",27);
        matrix[1][1]=new Persona("Lucia  ",28);

        for (Persona[] fila: matrix){
            for (Persona persona : fila){
                System.out.println(persona);
            }
        }
    }
}
