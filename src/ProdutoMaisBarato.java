import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {

        System.out.println("Este programa recebe o preço de três produtos e indica o mais barato. Digite o preço do primeiro produto (em R$): ");

        Scanner teclado = new Scanner(System.in);
        double produto1 = teclado.nextDouble();

        System.out.println("Digite o preço do segundo produto (em R$): ");
        double produto2 = teclado.nextDouble();

        System.out.println("Digite o preço do terceiro produto (em R$): ");
        double produto3 = teclado.nextDouble();

        teclado.close();

        if (produto1 < produto2 & produto1 < produto3){
            System.out.println("Compre o produto 1, pois ele é o mais barato.");
        }else if (produto2 < produto1 & produto2 < produto3){
            System.out.println("Compre o produto 2, pois ele é o mais barato.");
        }else {
            System.out.println("Compre o produto 3, pois ele é o mais barato.");
        }


    }
}
