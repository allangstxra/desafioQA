package noesis.desafio3;

import java.util.ArrayList;
import java.util.List;

public class CalcularDescontoFilme {

	enum TabelaDeFilmes {

		SENHOR_DOS_ANEIS(1, "Senhor dos Anéis", 55, "Fantasia"), AS_BRANQUELAS(2, "As Branquelas", 55, "Comédia"), VELOZES_E_FURIOSOS_7(3, "Velozes e Furiosos 7", 100, "Ação"),
		VELOZES_E_FURIOSOS_6(4, "Velozes e Furiosos 6", 55, "Ação"), THE_SCAPEGOAT(5, "The Scapegoat", 100, "Drama"), MEU_MALVADO_FAVORITO(6, "Meu Malvado Favorito", 200, "Animação"),
		INTERESTELAR(7, "Interestelar", 300, "Ficção Científica"), DONNIE_DARKO(8, "Donnie Darko", 400, "Suspense");

		public int idFilme;
		public String nomeFilme;
		public int precoFilme;
		public String generoFilme;

		TabelaDeFilmes(int id, String nome, int preco, String genero) {
			idFilme = id;
			nomeFilme = nome;
			precoFilme = preco;
			generoFilme = genero;

		}
	}

	public int aplicarDesconto(int idFilme) {

		int valorFilmeComDesconto = 0;

		List<TabelaDeFilmes> tabelaDeFilmes = new ArrayList<TabelaDeFilmes>();
		tabelaDeFilmes.add(TabelaDeFilmes.SENHOR_DOS_ANEIS);
		tabelaDeFilmes.add(TabelaDeFilmes.AS_BRANQUELAS);
		tabelaDeFilmes.add(TabelaDeFilmes.VELOZES_E_FURIOSOS_7);
		tabelaDeFilmes.add(TabelaDeFilmes.VELOZES_E_FURIOSOS_6);
		tabelaDeFilmes.add(TabelaDeFilmes.THE_SCAPEGOAT);
		tabelaDeFilmes.add(TabelaDeFilmes.MEU_MALVADO_FAVORITO);
		tabelaDeFilmes.add(TabelaDeFilmes.INTERESTELAR);
		tabelaDeFilmes.add(TabelaDeFilmes.DONNIE_DARKO);

		for (TabelaDeFilmes filme : tabelaDeFilmes) {
			if (filme.idFilme == idFilme) {
				valorFilmeComDesconto = calcularDesconto(filme.precoFilme, filme.generoFilme);
			}
		}

		return valorFilmeComDesconto;
	}

	private int calcularDesconto(int precoFilme, String genero) {
		int descontoAplicado = 0;

		if (precoFilme >= 100 && precoFilme < 200) {
			descontoAplicado = precoFilme - (precoFilme * 10) / 100;
		}

		if (precoFilme >= 200 && precoFilme < 300) {
			descontoAplicado = precoFilme - (precoFilme * 20) / 100;
		}

		if (precoFilme >= 300 && precoFilme < 400) {
			descontoAplicado = precoFilme - (precoFilme * 25) / 100;
		}

		if (precoFilme >= 400) {
			descontoAplicado = precoFilme - (precoFilme * 30) / 100;
		}
		
		if (genero.equals("Ação")) {
			descontoAplicado = descontoAplicado - (precoFilme * 5) / 100;
		}

		return descontoAplicado;
	}

}
