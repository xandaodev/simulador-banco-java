import java.util.Scanner;

public class BancoInterface {

    private Banco banco;
    private Scanner leitor;
    private ContaInterface interfaceDaConta;

    public BancoInterface(Banco banco){
        this.banco = banco;
        this.leitor = new Scanner(System.in);
        this.interfaceDaConta = new ContaInterface();
    }

    public void iniciarMenuPrincipal(){
        int opcao;

        do{
            System.out.println("\n--- Menu Principal do Banco ---");
            System.out.println("1: Abrir Nova Conta");
            System.out.println("2: Selecionar Conta (para sacar/depositar)");
            System.out.println("0: Sair do Programa");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Digite o número da nova conta: ");
                    String numeroConta = leitor.next(); 
                    
                    Conta novaConta = new Conta(numeroConta);
                    this.banco.adicionarConta(novaConta);
                    break;
                
                case 2:
                    System.out.print("Digite o número da conta que deseja acessar: ");
                    String numeroBusca = leitor.next();
                    
                    Conta contaEncontrada = this.banco.getConta(numeroBusca);
                    
                    if (contaEncontrada != null){
                        this.interfaceDaConta.mostrarMenu(contaEncontrada);
                    }else{
                        System.out.println("Erro: Conta não encontrada.");
                    }
                    break;
                    
                case 0:
                    System.out.println("Saindo do banco...");
                    break;
                
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

            }while(opcao !=0);

            this.leitor.close();
            this.interfaceDaConta.fecharScanner();
        }
    }

