import java.util.Scanner;

public class ContaInterface {
    private Scanner leitor;

    public ContaInterface(){
        this.leitor = new Scanner(System.in);
    }

    public void mostrarMenu(Conta conta){
        int opcao;

        do{
            System.out.println("\n--- Menu da Conta " + conta.getNumero() + " ---");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Conferir Saldo");
            System.out.println("0: Sair do Menu");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite o valor para depósito: ");
                    double valorDeposito = leitor.nextDouble();

                    if(conta.depositar(valorDeposito)){
                        System.out.println("Depósito realizado com sucesso");
                    }else{
                        System.out.println("Erro: Valor do depósito deve ser positivo!");
                    }break;
                case 2:
                    System.out.println("Digite o valor para saque: ");
                    double valorSaque = leitor.nextDouble();
                    if(conta.sacar(valorSaque)){
                        System.out.println("Saque realizado com sucesso.");
                    }else{
                        System.out.println("Falha no saque. Verifique o valor ou saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual = R$" + conta.conferirSaldo());
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        }while (opcao!=0);

        }

    public void fecharScanner(){
        this.leitor.close();
    }
    }

    

