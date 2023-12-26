import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el día");
        int dia = scanner.nextInt();
        System.out.println("Introduce el mes");
        int mes = scanner.nextInt();
        System.out.println("Introduce el año");
        int año = scanner.nextInt();

        if (año <= 0) {
            System.out.println("Fecha incorrecta.");
        } else {
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    if (dia > 0 && dia < 31) {
                        dia++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    } else if (dia == 31) {
                        dia = 1;
                        mes++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    }
                    break;
                case 12:
                    if (dia > 0 && dia < 31) {
                        dia++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    } else if (dia == 31) {
                        dia = 1;
                        mes = 1;
                        año++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    }
                    break;
                case 2:
                    if (dia > 0 && dia < 28) {
                        dia++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    } else if (dia == 28) {
                        dia = 1;
                        mes++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia > 0 && dia < 30) {
                        dia++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    } else if (dia == 30) {
                        dia = 1;
                        mes++;
                        System.out.println(dia + "/" + mes + "/" + año);
                    }
                    break;
                default:
                    System.out.println("Fecha incorrecta.");
            }
        }
    }
}
