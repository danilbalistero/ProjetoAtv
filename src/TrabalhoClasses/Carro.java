package TrabalhoClasses;

import java.util.Scanner;

public class Carro extends Veiculo{
    private String categoria;
    public Carro(String modelo, String marca, int ano, String categoria) {
        super(modelo, marca, ano);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void emitirSom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a categoria do veiculo. Picape/Utilitario");
        String categoria = scanner.nextLine();

        if ("Picape".equalsIgnoreCase(categoria)){
            System.out.println("RAM TCHU");
            emitirSom();
        } else {
            System.out.println("VROOM VROOM");
        }
    }

    public void motorFuncionando() {
        System.out.println("O carro esta funcionando");
    }

    public void ligarCarro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a marcha atual (N para neutro): ");
        String marcha = scanner.nextLine();

        if ("N".equalsIgnoreCase(marcha)) {
            System.out.println("Carro ligado!");
            motorFuncionando();
        } else {
            System.out.println("Não é possível ligar o carro com a marcha em " + marcha + ". Coloque em neutro (N) primeiro.");
        }
    }

    public static Carro criarCarro(Carro carro, Scanner scanner) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a categoria do carro (picape/utilitario): ");
        String categoria = scanner.nextLine();

        return new Carro(modelo, marca, ano, categoria);
    }
}




