package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*
        // Control de flujo
        //if - else
        Scanner sc = new Scanner(System.in);
        System.out.print("How old are you? ");
        //nextInt() retorna el valor que atrapa en consola
        int edad = sc.nextInt();
        System.out.print("What is your name?: ");
        //limpia el scanner
        sc.nextLine();
        String name = sc.nextLine();
        if(edad >= 18){
            System.out.println("Hi! " + name + " you can vote");
        }else{
            System.out.println(name + "you are younger");
        }
        //close object scanner
        sc.close();

        //----------------Ejercicio 1-------------------
        //Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo es valido

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los angulos del trinagulo:");
        System.out.print("a) ");
        int val1 = sc.nextInt();
        System.out.print("b) ");
        //sc.nextInt();
        int val2 = sc.nextInt();
        System.out.print("c) ");
        //sc.nextInt();
        int val3 = sc.nextInt();
        System.out.println("aaaaa");
        if(val1 + val2 + val3 == 180){
            System.out.println("Es un triangulo, pero : ");
            if(val1 != val2 && val2 != val3 && val1 != val3){
                System.out.println("Es un triangulo escaleno");
            }else
            if(val1 == val2 && val2 == val3){
                System.out.println("Es un triangulo equilatero");
            }else
            if(val1 == val2 || val2 == val3 || val1 == val1){
                System.out.println("Es un triangulo ióseles");
            }
        }else{
            System.out.println("Ese treiangulo no es posible");
        }
        sc.nextLine();
        sc.close();

        //--------------------Ejercicio 2------------------
        //Pedir el año y determinar si es bisiesto o no
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el año: ");
        int anio = sc.nextInt();
        if(anio%100 == 0 && anio%400 == 0 || anio%4 == 0 && anio%100 != 0){
                System.out.print("Es anio bisiesto");
        }else{
            System.out.print("No es anio bisiesto");
        }

        //-------------Estructura switch---------

        Scanner op = new Scanner(System.in);
        System.out.println("Calculadora:");
        System.out.print("Ingresa el primer valor: val 1 = ");
        int val1 = op.nextInt();
        System.out.print("Ingresa el segundo valor: val 2 = ");
        int val2 = op.nextInt();
        System.out.print("Ingresa el numero de operación deseada: \n 1) suma \n 2) resta \n 3) multiplicación " +
                "\n 4) división \n opción : ");
        int a = op.nextInt();
        int res = 0;
        String operacion = "";
        op.nextLine();
        op.close();
        switch (a){
            case 1:
                res = val1 + val2;
                operacion = "suma";
                break;
            case 2:
                res = val1 - val2;
                operacion = "resta";
                break;
            case 3:
                res = val1 * val2;
                operacion = "multiplicación";
                break;
            case 4:
                res = val1 / val2;
                operacion = "división";
                break;
            default:
                System.out.print("Esa opción no existe");
                break;
        }
        System.out.print("El resultado de la " + operacion + " de " + val1 + " y " + val2 + " es: " + res);*/


        //-------------Ejercicio 3---------------
        System.out.println("Dia de la seman:");
        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa el numero de operación deseada: \n 1) LUNES \n 2) MARTES \n 3) MIERCOLES " +
                "\n 4) JUEVES \n 5) VIERNES \n 6) SABADO \n 7) DOMIENGO \n opción : ");
        int a = op.nextInt();
        String operacion = "";
        op.nextLine();
        op.close();
        switch (a){
            case 1: operacion = "LUNES";
                break;
            case 2: operacion = "MARTES";
                break;
            case 3: operacion = "MIERCOLES";
                break;
            case 4: operacion = "JUEVES";
                break;
            case 5: operacion = "VIERNES";
                break;
            case 6: operacion = "SABADO";
                break;
            case 7: operacion = "DOMINGO";
                break;
            default:
                System.out.print("YA NO HAY MAS DÍAS");
                break;
        }
        System.out.print("El día es " + operacion);
    }
}
