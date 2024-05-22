package apps.musica;

public class Spotify implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA Spotify");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA Spotify");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA Spotify");
	}

}
