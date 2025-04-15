import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1,lado2,lado3;

        System.out.println("Lado 1: ");
        lado1 = sc.nextDouble();

        System.out.println("Lado 1: ");
        lado2 = sc.nextDouble();

        System.out.println("Lado 1: ");
        lado3 = sc.nextDouble();

      if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 <lado1 + lado2){
            System.out.println(" Os valores representam um triângulo");

      } else {
            System.out.println("Os valores não representam um triângulo");

        }






        }

    }

