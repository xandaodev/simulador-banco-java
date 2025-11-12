import java.util.ArrayList;
public class Banco {

    private ArrayList<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
        System.out.println("Banco inicializado. Nenhuma conta cadastrada ainda.");
    }

    public void adicionarConta(Conta conta){
            this.contas.add(conta);
            System.out.println("Conta " + conta.getNumero() + " adicionada com sucesso.");
    }

    public Conta getConta(String numero){
        for (Conta c : this.contas){
            if(c.getNumero().equals(numero)){
                return c;
            }
        }
        return null;
    }

    

    }
    

