package centralDeAplicativos;

import apps.navegadores.NavegadorDeInternet;
import apps.chamada.AparelhoTelefonico;
import apps.musica.ReprodutorMusical;

public class AreaDeTrabalho implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA VIA AREA DE TRABALHO");	
	}
	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO ABA VIA AREA DE TRABALHO");	
	}
	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA VIA AREA DE TRABALHO");
	}

	
	
	
	@Override
	public void tocar() {
		System.out.println("TOCANDO VIA AREA DE TRABALHO");		
	}
	@Override
	public void pausar() {
		System.out.println("PAUSANDO VIA AREA DE TRABALHO");	
	}
	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA VIA AREA DE TRABALHO");	
	}
	
	
	
	@Override
	public void ligar() {
		System.out.println("LIGANDO VIA AREA DE TRABALHO");
	}
	@Override
	public void atender() {
		System.out.println("ATENDENDO VIA AREA DE TRABALHO");
	}
	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA AREA DE TRABALHO");
	}

}
