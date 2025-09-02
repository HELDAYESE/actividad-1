import javax.print.DocFlavor;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

          String candidato1 = "C1";
          String candidato2 = "C2";
          String candidato3 = "C3";

          int VI_internet = 700000;
          int VI_Radio = 200000;
          int VI_television = 600000;


          int votosC1 = 0, votosC2 = 0, votosC3 = 0;
          Scanner  sc = new Scanner(System.in);


        System.out.println("Seleccione el candidato de  su prefencia  ");
        System.out.println(" C1 " + candidato1);
        System.out.println(" C2 "+candidato2);
        System.out.println(" C3 "+candidato3);

        int opcionCandidato = sc.nextInt();


        System.out.println("Seleccione  voto influenciado  por  INTERNET,RADIO, TV ");
        System.out.println(" INTERNT ");
        System.out.println(" RADIO");
        System.out.println(" TV");

        int opcionMedio = sc.nextInt();
        if (opcionCandidato == 1) {
            votosC1++;
            System.out.println(" Voto registrado para " + candidato1);
        } else if (opcionCandidato == 2) {
            votosC2++;
            System.out.println(" Voto registrado para " + candidato2);
        } else if (opcionCandidato == 3) {
            votosC3++;
            System.out.println(" Voto registrado para " + candidato3);
        } else {
            System.out.println(" Voto en blanco");
        }





    }
}