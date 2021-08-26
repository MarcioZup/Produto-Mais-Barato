import java.util.Scanner;

public class ComparaDoisNumeros {
    public static void main(String[] args) {

        System.out.println("Esse programa compara dois números e diz qual é o maior deles. Entre com o primeiro número: ");

        Scanner teclado = new Scanner(System.in);
        double primeiroNumero = teclado.nextDouble();

        System.out.println("Entre com o segundo número: ");
        double segundoNumero = teclado.nextDouble();

        teclado.close();

        if (primeiroNumero == segundoNumero){
            System.out.println(" Você digitou dois números iguais.");
        }else if (primeiroNumero > segundoNumero){
            System.out.println("O primeiro número é maior que o segundo.");
        }else{
            System.out.println("O segundo número é maior que o primeiro.");
        }
    }
}
