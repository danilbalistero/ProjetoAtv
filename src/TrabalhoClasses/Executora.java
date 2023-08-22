package TrabalhoClasses;

import java.util.Scanner;

public class Executora {
    private static Carro carro = null; //variavel para armazenar o carro
    private static Moto moto = null; //variavel para armazenar a moto

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("┏─━─━─━ ∞◆∞ ━─━─━─┓ ");
            System.out.println("   Menu Principal   ");
            System.out.println("   1. Carro");
            System.out.println("   2. Moto");
            System.out.println("   3. Sair");
            System.out.println("┗─━─━─━ ∞◆∞ ━─━─━─┛ ");
            System.out.println("Escolha uma opção para criar");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1){
                executarMenuCarro();
            } else if (opcao == 2) {
                executarMenuMoto();
            }

        } while (opcao != 3);

    }
    
    private static void executarMenuCarro() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("╔══━━────────────── • ──────────────━━══╗");
            System.out.println("             ==Menu Carro==              ");
            System.out.println("        1. Criar carro                   ");
            System.out.println("        2. Ligar carro                   ");
            System.out.println("        3. Emitir barulho do carro       ");
            System.out.println("        4. Ligar som do carro            ");
            System.out.println("        5. Sair                          ");
            System.out.println("╚══━━────────────── • ──────────────━━══╝");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();
            criacaoMenuCarro(opcao, scanner);
        } while (opcao != 5);
    }
    private static void criacaoMenuCarro(int opcao, Scanner scanner) {
        if (opcao == 1) {
            if (carro == null) {
                carro = Carro.criarCarro(scanner);
            } else {
                System.out.println("Um carro já foi criado.");
            }
        } else if (opcao == 2) {
            if (carro != null) {
                carro.ligarCarro();
            } else {
                System.out.println("Crie um carro primeiro.");
            }
        } else if (opcao == 3) {
            if (carro != null) {
                carro.emitirBarulho();
            } else {
                System.out.println("Crie um carro primeiro.");
            }
        } else if (opcao == 4) {
            carro.emitirSom();
        } else if (opcao == 5) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Opção inválida! Tente novamente.");
        }
    }
    
    private static void executarMenuMoto() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("╔══━━────────── • ──────────━━══╗");
            System.out.println("          ==Menu Moto==          ");
            System.out.println("          1. Criar Moto          ");
            System.out.println("          2. Ligar Moto          ");
            System.out.println("          3. Empinar moto        ");
            System.out.println("          4. Sair                ");
            System.out.println("╚══━━────────── • ──────────━━══╝");

            System.out.println("Escolha as opçoes disponiveis");
            opcao = scanner.nextInt();
            scanner.nextLine();
            criacaoMenuMoto(opcao, scanner);
        } while (opcao != 4);
    }

    private static void criacaoMenuMoto(int opcao, Scanner scanner) {
        if (opcao == 1) {
            if (moto == null) {
                moto = Moto.criarMoto(scanner);
            } else {
                System.out.println("A moto já foi criada.");
            }
        } else if (opcao == 2) {
            if (moto != null) {
               moto.ligarMoto();
            } else {
                System.out.println("Crie uma moto primeiro.");
            }
        } else if (opcao == 3) {
            if (moto != null) {
                moto.empinar(scanner);
            } else {
                System.out.println("Crie uma moto primeiro.");
            }
        } else if (opcao == 4) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Opção inválida. Digite apenas os números que estão no menu.");
        }
    }
}
