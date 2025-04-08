/*
programa exemplo para calcular
a média entre duas notas e imprimir a situação do aluno
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double Nota1;
        double Nota2;
        double NotaFinal;

        System.out.println("Digite a Nota 1:");
        Nota1 = sc.nextDouble();
        System.out.println("Digite a Nota 2: ");
        Nota2 = sc.nextDouble();

        NotaFinal = (Nota1 + Nota2) / 2;

        if (NotaFinal >= 6) {
            System.out.println("Você Foi aprovado, sua média é: " + df.format(NotaFinal));

        }else{
            System.out.println("Você foi reprovado, sua média é: " + df.format(NotaFinal));
        }






    }
}
