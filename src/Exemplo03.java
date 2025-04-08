import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double valorcompra, valordesconto, valordesconto2, valorfinal1, valorfinal2;

        System.out.println("Digite o Valor da sua compra total:");
        valorcompra = sc.nextDouble();

        valordesconto = valorcompra * 0.15;
        valordesconto2 = valorcompra * 0.08;

        if (valorcompra >= 1000.00) {
            valorfinal1 = valorcompra - valordesconto;
            System.out.println("Você recebeu um desconto de 15%: " + df.format(valorfinal1));

        }else{
            valorfinal2 =  valorcompra - valordesconto2 ;
            System.out.println("Você recebeu um desconto de 8%: " + df.format(valorfinal2));
        }
    }
}
