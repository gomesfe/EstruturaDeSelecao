import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double prova1, prova2, trab1, trab2, trab3, medprova, medtrab, medfinal,medprovap,medtrabp;

        System.out.println("Digite o valor da primeira prova:");
        prova1 = sc.nextDouble();

        System.out.println("Digite o valor da segunda prova:");
        prova2 = sc.nextDouble();

        System.out.println("Digite o valor do primeiro trabalho:");
        trab1 = sc.nextDouble();

        System.out.println("Digite o valor do segundo trabalho:");
        trab2 = sc.nextDouble();

        System.out.println("Digite o valor do terceiro trabalho:");
        trab3 = sc.nextDouble();

        medprovap = (prova1 + prova2) / 2;
        medtrabp = (trab1+trab2+trab3) / 3;


        medprova = medprovap * 0.70;
        medtrab = medtrabp * 0.30;

        medfinal = medprova + medtrab;

        if (medfinal >= 5.99999998) {

            System.out.println("Você foi aprovado, sua média é: " + df.format(medfinal));

        } else {

            System.out.println("Você foi reprovado, sua média é: " + df.format(medfinal));
        }
    }
}
