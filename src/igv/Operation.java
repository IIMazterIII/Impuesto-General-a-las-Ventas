package igv;

import java.util.Scanner;

/**
 *
 * @author IIMazterIII
 */
public class Operation {

    public int IGV(int IGV) {
        double n, igv, total;
        Scanner Z = new Scanner(System.in);
        System.out.println("Introduza el monto del Importe,Precio Neto o Bruto,Sub Total o Base Imponible:");
        n = Z.nextDouble();
        igv = n * 0.18;
        total = n + igv;
        System.out.printf("\nLa Base Imponible es: %.2f", n);
        System.out.printf("\nEl IGV es: %.2f", igv);
        System.out.printf("\nEl Total o Precio Venta es: %.2f", total);
        return IGV;
    }

    public int Total(int Total) {
        double n, igv, total, op;
        Scanner Z = new Scanner(System.in);
        System.out.println("Selecione:\n1. IGV 18%:\n2. IGV 19%:\n...");
        op = Z.nextInt();
        if (op == 1) {
            System.out.println("Introduza el IGV: ");
            igv = Z.nextInt();
            n = igv / 0.18;
            total = n + igv;
            System.out.printf("\nLa Base Imponible es: %.2f", n);
            System.out.printf("\nEl IGV es: %.2f", igv);
            System.out.printf("\nEl Total o Precio Venta es: %.2f", total);
        } else if (op == 2) {
            System.out.println("Introduza el IGV: ");
            igv = Z.nextInt();
            n = igv / 0.19;
            total = n + igv;
            System.out.printf("\nLa Base Imponible es: %.2f", n);
            System.out.printf("\nEl IGV es: %.2f", igv);
            System.out.printf("\nEl Total o Precio Venta es: %.2f", total);
        }
        return Total;
    }

    public int Pneto(int Pneto) {
        double n, igv, total;
        Scanner Z = new Scanner(System.in);
        System.out.println("Introduza el monto del Total o Precio Venta: ");
        total = Z.nextInt();
        n = total / 1.18;
        igv = total - n;
        System.out.printf("\nLa Base Imponible es: %.2f", n);
        System.out.printf("\nEl IGV es: %.2f", igv);
        System.out.printf("\nEl Total o Precio Venta es: %.2f", total);
        return Pneto;
    }
}
