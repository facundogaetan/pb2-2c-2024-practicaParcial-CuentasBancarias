package dominio;

public class CajaDeAhorro extends Cuenta {
	int contadorExtracciones = 0;

	public CajaDeAhorro(int saldo) {
		super(saldo);

	}

	@Override
	public boolean extraer(int monto) {
		if (monto <= getSaldo()) {
			setSaldo(getSaldo() - monto);
			contadorExtracciones++;

			if (contadorExtracciones > 5) {
				setSaldo(getSaldo() - 100);
			}
			return true;
		}
		return false;
	}

}
