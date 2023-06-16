/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.util.Scanner;



/**
 *
 * @author hanpa
 */

public class Restaurante {
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        do {
            System.out.println("Bienvenido al Restaurante");
            System.out.println("1. Platillos para el desayuno");
            System.out.println("2. Platillos para la comida");
            System.out.println("3. Platillos para la cena");
            System.out.println("4. Bebidas");
            System.out.println("5. Postres");
            System.out.println("6. Salir");

            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenu("Desayuno");
                    break;
                case 2:
                    mostrarMenu("Comida");
                    break;
                case 3:
                    mostrarMenu("Cena");
                    break;
                case 4:
                    mostrarMenu("Bebidas");
                    break;
                case 5:
                    mostrarMenu("Postres");
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese una opción válida.");
                    break;
            }
        } while (!salir);

        sc.close();
    }

    public static void mostrarMenu(String tipoMenu) {
        System.out.println("==== " + tipoMenu + " ====");
        System.out.println("1. Sopa     $10.00");
        System.out.println("2. Pollo    $15.00");
        System.out.println("3. Pescado    $12.50");
        System.out.println("4. Papas fritas    $11.00");
        System.out.println("5. cafe    $9.00");
        System.out.println("6. Picadillo    $16.00");
        System.out.println("7. Pozole    $8.50");
        System.out.println("8. Arroz    $13.00");
        System.out.println("9. Huevo a la mexicana    $14.50");
        System.out.println("10. Sopa Maruchan  $18.00");

        System.out.print("Ingrese el número del platillo que desea ordenar (0 para regresar al menú principal): ");
        Scanner sc = new Scanner(System.in);
        int opcionPlatillo = sc.nextInt();
        if (opcionPlatillo == 0) {
            return;
        }

        System.out.print("Ingrese la cantidad que desea ordenar: ");
        double cantidad = sc.nextInt();
        
        

        double precioUnitario = 0;
        switch (opcionPlatillo) {
            case 1:
                precioUnitario = 10.00;
                break;
            case 2:
                precioUnitario = 15.00;
                break;
            case 3:
                precioUnitario = 12.50;
                break;
            case 4:
                precioUnitario = 11.00;
                break;
            case 5:
                precioUnitario = 9.00;
                break;
            case 6:
                precioUnitario = 16.00;
                break;
            case 7:
                precioUnitario = 8.50;
                break;
            case 8:
                precioUnitario = 13.00;
                break;
            case 9:
                precioUnitario = 14.50;
                break;
            case 10:
                precioUnitario = 18.50;
                break;
            default:
                
                double Total;
                while (cantidad >1) {
                    Total = precioUnitario * cantidad;
                    System.out.println("el total es: " + Total);
                         
            
            }
                
        }
    }
}
