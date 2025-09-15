package org.example;

import java.util.Scanner;

public class Main
{ public static void main(String[] args) {
        String rojo="\u001B[31m";
        String azul="\u001B[34M";
        String amarillo="\u001B[33m";
        String purpura="\u001B[30M";
        String verde="\u001B[32m";
        System.out.println(rojo+"Restaurante tradición antigua.");
        System.out.println("******************************");

        System.out.println(rojo+"Menú del día:");
        System.out.println("1. Entradas:🥗");
        System.out.println(azul+"**** Empanaditas de iglesia---->$18000");
        System.out.println(azul+"**** Picada antioqueña (Choricitos, morcilla, patacón)---->$33000");
        System.out.println(azul+"**** Arepa de mote con quesito---->$15000");
        System.out.println(azul+"**** Salchipapa paisa (Papa criolla, papa capira, chicharrón, salchicha ranchera)---->$35000");
        System.out.println(amarillo+"2. Sobremesa:🥃");
        System.out.println(amarillo+"**** Guándolo---->$6000");
        System.out.println(amarillo+"**** Chocolate---->$12500");
        System.out.println(amarillo+"**** Shot de tapa roja---->$8000");
        System.out.println(amarillo+"**** Shot de tapa azul---->$11000");
        System.out.println(amarillo+"**** Shot de tapa verde---->$12000");
        System.out.println(amarillo+"**** Cóctel cucaracho---->$38000");
        System.out.println(amarillo+"**** Cóctel BlodyMary---->$40000");
        System.out.println(amarillo+"**** Caverné savugnon---->$850000");
        System.out.println(purpura+"3, Platos fuertes:🍝");
        System.out.println(purpura+"**** Sancocho trifásico---->48000");
        System.out.println(purpura+"**** Bandeja paisa---->$62000");
        System.out.println(purpura+"**** Móndongo de la abue---->42000");
        System.out.println(purpura+"**** Sopa del obispo---->$40000");
        System.out.println(purpura+"**** Sopa de la JUANFE---->$42000");
        System.out.println(verde+"4. Postres:🧁");
        System.out.println(verde+"**** Arroz con leche---->$20000");
        System.out.println(verde+"**** Brevas con arequipe y queso---->$20000");
        System.out.println(verde+"**** Dulce de vitoria----$18000");

        //Creando un ciclo para seleccionar el pedido
        Scanner leerTeclado=new Scanner(System.in);
        Integer opcionMenu = 0;
        while (opcionMenu != 5){
                System.out.println("Digita una opción:");
                opcionMenu=leerTeclado.nextInt();
        }



    }
}
