public class UsaConta {
    public static void main(String[]args){
        System.out.println("--- Iniciando Sistema de Banco ---");
        Conta minhaConta = new Conta("2025-11");

        ContaInterface minhaInterface = new ContaInterface();

        minhaInterface.mostrarMenu(minhaConta);

        System.out.println("programa encerrado");

        minhaInterface.fecharScanner();
    }
    
}
