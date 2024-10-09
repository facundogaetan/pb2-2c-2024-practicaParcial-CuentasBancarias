package dominio;

public class Cuenta {
	
	private int saldo;
	
	public Cuenta(int saldo) {
		this.saldo = saldo;
	}

	public boolean extraer(int monto) {
		  if (monto <= saldo) {
	            saldo -= monto;
	            return true;
	        }
	        return false;
		
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
