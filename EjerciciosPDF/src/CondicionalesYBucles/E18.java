package CondicionalesYBucles;

import java.util.Scanner;
/*Igual que el anterior pero suponiendo que no se introduce el precio por litro. Solo existen tres
productos con precios:
1- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.*/
import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        int contadorFacturas600 = 0;
        double facturacionTotal = 0;
        double litrosVendidosTotales = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Factura Nº " + (i + 1));
            System.out.println("Código de artículo (1, 2 o 3):");
            int codigoArticulo = scanner.nextInt();

            System.out.println("Cantidad de litros:");
            double litrosVendidos = scanner.nextDouble();

            double precioLitro;
            switch (codigoArticulo) {
                case 1:
                    precioLitro = 0.6;
                    break;
                case 2:
                    precioLitro = 3;
                    break;
                case 3:
                    precioLitro = 1.25;
                    break;
                default:
                    System.out.println("Código de artículo inválido.");
                    continue; // Vuelve al inicio del bucle
            }

            double totalFactura = litrosVendidos * precioLitro;
            facturacionTotal += totalFactura;
            if (codigoArticulo == 1) {
                litrosVendidosTotales += litrosVendidos;
            }

            if (totalFactura > 600) {
                contadorFacturas600++;
            }
        }

        System.out.println("La facturación total de las facturas introducidas es: " + facturacionTotal);
        System.out.println("Los litros vendidos totales del artículo 1 son: " + litrosVendidosTotales);
        System.out.println("El número de facturas que superan los 600€ son: " + contadorFacturas600);
    }
}