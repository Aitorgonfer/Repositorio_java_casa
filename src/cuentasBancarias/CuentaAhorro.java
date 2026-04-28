package cuentasBancarias;

public class CuentaAhorro extends CuentaBancaria{

	public CuentaAhorro(String numeroCuenta, double saldo) {
		super(numeroCuenta, saldo);
	}

	@Override
	public boolean retirar(double cantidad) {
		if (this.saldo-cantidad >= 0) {
			this.saldo-=cantidad;
			return true;
		}else {
			return false;
		}
	}
}
