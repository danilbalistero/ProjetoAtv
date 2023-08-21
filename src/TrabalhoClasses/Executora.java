package TrabalhoClasses;

import java.util.Scanner;

import static TrabalhoClasses.Carro.criarCarro;

public class Executora {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println();
            System.out.println("Menu Principal:");
            System.out.println("1. Criar carro");
            System.out.println("2. Ligar carro");
            System.out.println("3. Emitir barulho do carro");
            System.out.println("4. Ligar som do carro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            executarOpcao(opcao, scanner);
        } while (opcao != 5);

    }

    private static void executarOpcao(int opcao, Scanner scanner) {
        Carro carro = new Carro("","", 0, "");
        if (opcao == 1) {
            criarCarro(scanner);
        } else if (opcao == 2) {
                carro.ligarCarro();
        } else if (opcao == 3) {
                carro.emitirSom();
        } else if (opcao == 4) {
                carro.Som();
        } else if (opcao == 5){
            System.out.println("Saindo...");
        } else
            System.out.println("Opção inválida! Tente novamente.");

    }

}
