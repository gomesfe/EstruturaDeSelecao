import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double y,x;

        System.out.println("Digite o valor de X");
        x = sc.nextDouble();
        if(x > 5 || x< -5){
            y = 8 / Math.sqrt(x * x - 25);
            System.out.println("Y = " +y);
        }
        else {
            System.out.println("Valor inválido para X");
        }


    }
}
