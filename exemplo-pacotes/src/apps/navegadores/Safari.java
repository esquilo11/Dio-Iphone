package apps.navegadores;

public class Safari implements NavegadorDeInternet{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA");
	}

}
