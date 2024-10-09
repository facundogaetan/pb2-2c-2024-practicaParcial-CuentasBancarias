package dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class BancoTest {
	
	@Before
	public void inicializacion() {
		Banco nuevoBanco = new Banco();
	}
	

	

	
	@Test
	public void queSePuedaExtraer1000PesosDeUnaCuentaSueldoConSaldoIgualA2000Pesos() {
		//preparacion
		CuentaSueldo nuevaCuentaSueldo = new CuentaSueldo(2000);
		//ejecucion
		boolean extraccionCorrecta = nuevaCuentaSueldo.extraer(1000);
		//verificacion
		assertTrue(extraccionCorrecta);
	}
	
	@Test
	public void queNoSePuedaExtraer2500PesosDeUnaCuentaSueldoConSaldoIgualA2000Pesos(){
		//preparacion
		CuentaSueldo nuevaCuentaSueldo = new CuentaSueldo(2000);
		//ejecucion
		boolean extraccionCorrecta = nuevaCuentaSueldo.extraer(2500);
		//verificacion
		assertFalse(extraccionCorrecta);
	}
	
	@Test
	public void queAlRealizar5ExtraccionesDe1000EnUnaCajaDeAhorroConSaldoInicialDe5000SuSaldoFinalSea0() {
		//preparacion
		CajaDeAhorro nuevaCajaDeAhorro = new CajaDeAhorro(5000);
		//ejecucion
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		
		//verificacion
		assertEquals(0, nuevaCajaDeAhorro.getSaldo());
	}
	
	@Test
	public void queAlRealizar6ExtraccionesDe1000EnUnaCajaDeAhorroConSaldoInicialDe10000SuSaldoFinalSea3900() {
		//preparacion
		CajaDeAhorro nuevaCajaDeAhorro = new CajaDeAhorro(10000);
		//ejecucion
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		nuevaCajaDeAhorro.extraer(1000);
		//verificacion
		assertEquals(3900, nuevaCajaDeAhorro.getSaldo());
		
	}
	
	@Test
	public void queAlDepositar1000EnUnaCuentaCorrienteConSaldoIgualACeroSuSaldoFinalSea1000() {
		//preparacion
		CuentaCorriente nuevaCuentaCorriente = new CuentaCorriente(0);
		//ejecucion
		nuevaCuentaCorriente.depositar(1000);
		//verificacion
		assertEquals(1000,nuevaCuentaCorriente.getSaldo());
	}

}
