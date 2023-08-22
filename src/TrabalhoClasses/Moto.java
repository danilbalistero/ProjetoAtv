package TrabalhoClasses;

import java.util.Scanner;

public class Moto extends Veiculo {
    private int cilindradas;
    public Moto(String modelo, String marca, int ano, int cilindradas) {
        super(modelo, marca, ano);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void emitirBarulho() {
        System.out.println("brapbraaaaaaaaaap, randandandandan");
        super.emitirBarulho();
    }

    public static Moto criarMoto(Scanner scanner){
        System.out.println("Digite o modelo da moto");
        String modelo = scanner.nextLine();
        System.out.println("Digite a marca da moto");
        String marca = scanner.nextLine();
        System.out.println("Digite o ano da moto");
        int ano = scanner.nextInt();
        System.out.println("Digite a cilindrada da moto");
        int cilindrada = scanner.nextInt();

        return new  Moto(modelo, marca, ano, cilindrada);
    }

    public void empinar(Scanner scanner) {
        boolean continuarEmpinando = true;
        while (continuarEmpinando) {
            System.out.println("Deseja empinar a moto? [sim] [não]");
            String empinando = scanner.nextLine();

            if ("sim".equalsIgnoreCase(empinando)) {
                System.out.println("Empinando moto");

                System.out.println("Deseja continuar empinando a moto? [sim] [não]");
                String continuar = scanner.nextLine();

                if ("sim".equalsIgnoreCase(continuar)) {
                    System.out.println("Você caiu tentando empinar mais");
                    continuarEmpinando = false;
                } else {
                    continuarEmpinando = false;
                }
            } else {
                continuarEmpinando = false;
            }
        }
    }

    @Override
    public void motorFuncionando() {
        System.out.println("O motor da moto esta funcionando");
        super.motorFuncionando();
    }

    public void ligarMoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a marcha atual (N para neutro): ");
        String marcha = scanner.nextLine();

        if ("N".equalsIgnoreCase(marcha)) {
            System.out.println("Moto ligada!");
            motorFuncionando();
        } else {
            System.out.println("Não é possível ligar a moto com a marcha em " + marcha + ". Coloque em neutro (N) primeiro.");
        }
    }
}