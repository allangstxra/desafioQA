package noesis.desafio3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcularDescontoFilmeTest {

	@Test
	public void deveAplicarDescontoDe10PorcentoParaFilmesEntre100E200() {

		CalcularDescontoFilme calcularDescontoFilme = new CalcularDescontoFilme();

		int descontoAplicado = calcularDescontoFilme.aplicarDesconto(5);

		assertEquals(90, descontoAplicado);

	}

	@Test
	public void deveAplicarDescontoDe20PorcentoParaFilmesEntre200E300() {

		CalcularDescontoFilme calcularDescontoFilme = new CalcularDescontoFilme();

		int descontoAplicado = calcularDescontoFilme.aplicarDesconto(6);

		assertEquals(160, descontoAplicado);

	}

	@Test
	public void deveAplicarDescontoDe25PorcentoParaFilmesEntre300E400() {

		CalcularDescontoFilme calcularDescontoFilme = new CalcularDescontoFilme();

		int descontoAplicado = calcularDescontoFilme.aplicarDesconto(7);

		assertEquals(225, descontoAplicado);

	}

	@Test
	public void deveAplicarDescontoDe30PorcentoParaFilmesAcima400() {

		CalcularDescontoFilme calcularDescontoFilme = new CalcularDescontoFilme();

		int descontoAplicado = calcularDescontoFilme.aplicarDesconto(8);

		assertEquals(280, descontoAplicado);

	}

	@Test
	public void deveAplicarDescontoDe5PorcentoParaFilmesDoGeneroAcao() {

		CalcularDescontoFilme calcularDescontoFilme = new CalcularDescontoFilme();

		int descontoAplicado = calcularDescontoFilme.aplicarDesconto(3);

		assertEquals(85, descontoAplicado);

	}

}
