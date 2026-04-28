package cuentasBancarias;

public abstract class CuentaBancaria {
	
	protected String numeroCuenta;
	protected double saldo;
	
	public CuentaBancaria(String numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public abstract boolean retirar(double cantidad);
	
	public void depositar(double cantidad) {
		this.saldo +=cantidad;
	}
}
