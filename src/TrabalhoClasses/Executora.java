package TrabalhoClasses;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operação;

        System.out.println("Sistema de Entreterimento");

        System.out.println("Informe que tipo de entreterimento deseja criar");
        System.out.println("1 - Filme");
        System.out.println("2 - Jogo");
        System.out.println("3 - Sair");

        System.out.println("Informe a operação desejada!");

        operação = scanner.nextInt();

        while (operação < 1 || operação > 3){
            System.out.println("Operação invalida. Digite um numero entre 1 e 3");
            operação = scanner.nextInt();
        }







    }

}
