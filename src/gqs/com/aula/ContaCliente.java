package src.gqs.com.aula;

public class ContaCliente{
    private int Id;
    private Cliente cliente;
    private double Saldo;

    public ContaCliente(int id, Cliente cliente, double saldo){
        this.Id= id;
        this.cliente= cliente;
        this.Saldo= saldo;
    }
    public ContaCliente(int id, Cliente cliente){
        this.Id= id;
        this.cliente= cliente;
    }
    public ContaCliente(int id){
        this.Id= id;
    }

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String toString(){
        return "ID"+Id+"Saldo: "+Saldo;
    }

    public double addDeposito (double saldo){
        setSaldo(saldo);
        return getSaldo();
    }

    public double subSaldo (double saldo){
        double saldoAtual=getSaldo();
        if(saldoAtual < saldo){
            System.out.println("Saldo insuficiente");
            return saldoAtual;
        }else{
            double novoSaldo= saldoAtual - saldo;
            setSaldo(novoSaldo);
            return novoSaldo;
        }
    }
}