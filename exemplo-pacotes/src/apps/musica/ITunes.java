package apps.musica;

public class ITunes implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA ITunes");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA ITunes");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA ITunes");
	}

}
