package cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria{

	public CuentaCorriente(String numeroCuenta, double saldo) {
		super(numeroCuenta, saldo);
	}

	@Override
	public boolean retirar(double cantidad) {
		if (this.saldo - cantidad >=-500) {
			this.saldo -=cantidad;
			return true;
		}else {
			return false;
		}
	}


}
