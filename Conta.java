public class Conta{
    private double saldo;
    private String numero;
    //private String titular;

    public Conta(String numero){
        this.numero = numero;
        //this.titular = titular;
        this.saldo = 0.0;

        //System.out.println("Conta " + this.numero + " criada para " + this.titular + ".");
    }

    public boolean depositar(double valor){
        if(valor>0){
            this.saldo = this.saldo + valor;
            //System.out.println("Depósito de R$"+ valor + " feito com sucesso! Novo saldo: R$" + this.saldo);
            return true;
        }
            //System.out.println("Valor do depósito deve ser positivo!");
            return false;
        
    }

    public boolean sacar(double valor){
        if(valor>0 && this.saldo >=valor){
            //System.out.println("Valor do saque tem que ser positivo!");
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public double conferirSaldo(){
        return this.saldo;
    }

    public String getNumero() {
        return this.numero;
    }


}