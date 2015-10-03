package igv;
import java.util.Scanner;
/**
 *
 * @author IImazterIII
 */
public class IGV {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operation en = new Operation();

        Scanner Z = new Scanner(System.in);

        System.out.println("Elija que dato desea introducir:\n1.Precio Neto o Base Imponible\n2.IGV\n3.Total o Precio Venta\n...");

        int numero = Z.nextInt();
        
        int IGV = 0;
        int Total = 0;
        int Pneto = 0;

        switch (numero) {

            case 1:
                en.IGV(IGV);
                break;
            case 2:
                en.Total(Total);
                break;
            case 3:
                en.Pneto(Pneto);
        }
    }

}
