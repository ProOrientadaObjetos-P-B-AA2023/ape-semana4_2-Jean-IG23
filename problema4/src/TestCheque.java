class Cheque{
    private double valorCheque;
    private double comision;
    private Cliente cliente;
    private Banco banco;

    public Cheque() {
    }

    public Cheque( Cliente cliente, Banco banco,double valorCheque) {
        this.valorCheque = valorCheque;
        this.cliente = cliente;
        this.banco = banco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public double getComision() {
        return comision;
    }

    public void CalcularComision() {
        this.comision = this.valorCheque*0.00003;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Cheque{" + "valorCheque=" + valorCheque + ", comision=" + comision + ", cliente=" + cliente + ", banco=" + banco + '}';
    }




}
class Cliente{
    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, String cedula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + '}';
    }

}
class Banco{
    private String nombreBanco;
    private int numeroSucursales;

    public Banco() {
    }

    public Banco(String nombreBanco, int numeroSucursales) {
        this.nombreBanco = nombreBanco;
        this.numeroSucursales = numeroSucursales;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombreBanco=" + nombreBanco + ", numeroSucursales=" + numeroSucursales + '}';
    }

}
public class TestCheque {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Steven Isaac","Neira Granda","1104641657");
        Banco banco1 = new Banco("Banco de Loja",10);
        Cheque cheque1 = new Cheque(cliente1,banco1,1500);
        cheque1.CalcularComision();
        System.out.println(cheque1);
    }

}