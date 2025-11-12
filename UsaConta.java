public class UsaConta {
    public static void main(String[]args){
        System.out.println("--- Iniciando Sistema de Banco ---");
        Banco meuBanco = new Banco();

        BancoInterface minhaInterfaceBanco = new BancoInterface(meuBanco);

        minhaInterfaceBanco.iniciarMenuPrincipal();


        System.out.println("programa encerrado");

    }
    
}
