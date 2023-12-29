package CondicionalesYBucles;

import java.util.Scanner;

/*7. Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las
facturas. En cada factura figura: el código del artículo, la cantidad vendida en litros y el
precio por litro.
Se pide de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1
y cuantas facturas se emitieron de más de 600 €.*/
public class E17 {
    public static void main(String[] args) {
        int contadorFacturas600=0;
        double litrosVendidos=0;
        double facturacionTotal=0;
        int codigoArticulo;
        double precioLitro=0;
        double litrosVendidosTotales=0;
        double totalFactura=0;

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.println("Factura Nº "+(i+1));
            System.out.println("Código de artículo:");
            codigoArticulo= scanner.nextInt();
            System.out.println("Cantidad de litros:");
            litrosVendidos= scanner.nextDouble();
            System.out.println("Precio por litro:");
            precioLitro= scanner.nextDouble();
            totalFactura=litrosVendidos*precioLitro;
            facturacionTotal+=totalFactura;
            if(codigoArticulo==1){
                litrosVendidosTotales+=litrosVendidos;
            }

            if(totalFactura>600){
                contadorFacturas600++;
            }
        }
        System.out.println("La facturación total de las facturas introducidas es: "+facturacionTotal);
        System.out.println("Los litros vendidos totales del artículo 1 son: "+litrosVendidosTotales);
        System.out.println("El número de facturas que superan los 600€ son: "+contadorFacturas600);
    }
}
