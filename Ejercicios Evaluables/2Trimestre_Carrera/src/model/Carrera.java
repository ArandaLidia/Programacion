package model;

import java.util.Scanner;

public class Carrera {
    private int kmTotales;
    private int numVueltas;
    private Coche participante1;
    private Coche participante2;
    private Coche ganador;
    private boolean empate = false;
    private int vueltaGanadora = -1;

    public Carrera(Coche participante1, Coche participante2) {
        this.participante1 = participante1;
        this.participante2 = participante2;
    }

    public void iniciarCarrera() {
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
        participante1.mostrarDatos();
        System.out.println();
        participante2.mostrarDatos();
        System.out.println();
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas vueltas tiene la carrera?");
        this.numVueltas = scanner.nextInt();
        System.out.println("¿Cuántos km tiene el circuito?");
        this.kmTotales = scanner.nextInt();
        System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");

        boolean ganadorDeterminado = false;

        // Bucle para las vueltas iniciales
        for (int i = 0; i < this.numVueltas; ++i) {
            System.out.println();
            System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println(" 🏎️💨 --- Vuelta " + (i + 1) + " ---");
            System.out.println("Aceleraciones de participante 1 🚕:");
            participante1.acelerar(scanner.nextInt(), participante1.getCv());

            System.out.println("Aceleraciones de participante 2 🚗:");
            participante2.acelerar(scanner.nextInt(), participante2.getCv());
            System.out.println();
            System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println();
            System.out.println("El participante 1 🚕(" + participante1.getMarca() + " " + participante1.getModelo() + ") lleva " + participante1.getKmRecorridos() + " km recorridos, de un total de " + this.kmTotales + " km.");
            System.out.println("El participante 2 🚗(" + participante2.getMarca() + " " + participante2.getModelo() + ") lleva " + participante2.getKmRecorridos() + " km recorridos, de un total de " + this.kmTotales + " km.");

            // Evaluar ganador mientras el bucle funciona
            if (!ganadorDeterminado) {
                ganadorDeterminado = evaluarGanador();
                if (ganadorDeterminado) {
                    vueltaGanadora = i + 1; // Actualizar la vueltaGanadora
                }
            }
        }
        // Bucle para vueltas extras y evaluación de ganador
        while (!this.evaluarGanador()) {
            System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("La carrera aún no ha terminado.");
            System.out.println("El participante 1 🚕(" + participante1.getMarca() + " " + participante1.getModelo() + ") lleva " + participante1.getKmRecorridos() + " km recorridos, de un total de " + this.kmTotales + " km.");
            System.out.println("El participante 2 🚗(" + participante2.getMarca() + " " + participante2.getModelo() + ") lleva " + participante2.getKmRecorridos() + " km recorridos, de un total de " + this.kmTotales + " km.");
            System.out.println();
            System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
            System.out.println("\n🏎️💨 --- Vueltas Extras ---");
            System.out.println("Aceleración extra de participante 1 🚕:");
            int aceleracion1 = scanner.nextInt();
            participante1.acelerar(aceleracion1, participante1.getCv());

            System.out.println("Aceleración extra de participante 2 🚗:");
            int aceleracion2 = scanner.nextInt();
            participante2.acelerar(aceleracion2, participante2.getCv());
        }

        // Imprimir el ganador al final de todas las vueltas
        imprimirGanador();
    }

    private boolean evaluarGanador() {
        if (participante1.getKmRecorridos() >= kmTotales || participante2.getKmRecorridos() >= kmTotales) {
            if (participante1.getKmRecorridos() >= participante2.getKmRecorridos()) {
                ganador = participante1;
            } else {
                ganador = participante2;
            }
            return true;
        } else {
            return false;
        }
    }

    private void imprimirGanador() {
        if (ganador != null) {
            if (vueltaGanadora == -1) {
                System.out.println("\n🏁🏁🏁¡La carrera ha terminado!🥳🎉 El ganador es el coche " + ganador.getMarca() + " " + ganador.getModelo() + " con matrícula " + ganador.getMatricula() + " 🏁🏁🏁");
            } else {
                System.out.println("\n🏁🏁🏁¡La carrera ha terminado!🥳🎉 El ganador es el coche " + ganador.getMarca() + " " + ganador.getModelo() + " con matrícula " + ganador.getMatricula() + " en la vuelta " + vueltaGanadora + " 🏁🏁🏁");
            }
            System.out.println("Distancia total del circuito: " + this.kmTotales + " km");
            System.out.println("Distancia recorrida por 🚕" + participante1.getMarca() + " " + participante1.getModelo() +
                    ": " + participante1.getKmRecorridos() + " km");
            System.out.println("Distancia recorrida por 🚗" + participante2.getMarca() + " " + participante2.getModelo() +
                    ": " + participante2.getKmRecorridos() + " km");
            System.out.println();
            System.out.println("─────────────────────────────────────────────────────────────────────────────────────────────────");
        } else {
            System.out.println("\nLa carrera aún no ha terminado.");
        }
        
    }
}