
package modelo;


public class Cuenta {
    
    private int numero;
    private String tipo;
    private double saldo;
    private String clave;
    private Cliente titular;

    public Cuenta(Cliente titular) {
        this.titular = titular;
    }

    public Cuenta(int numero, String tipo, double saldo, String clave, Cliente titular) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
    
}
