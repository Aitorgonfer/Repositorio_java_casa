package cuentasBancarias;

public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria ahorro = new CuentaAhorro("ES01", 100);
	    CuentaBancaria corriente = new CuentaCorriente("ES02", 100);

	    System.out.println("Retirando 150 de Ahorro: " + ahorro.retirar(150)); 
	    System.out.println("Retirando 150 de Corriente: " + corriente.retirar(150)); 
	    
	    System.out.println("Saldo Corriente actual: " + corriente.saldo); // 
	}

}
