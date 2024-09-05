package PadraoProjetoState;

public class Mario {

	private MarioState estado;
	
	public Mario() {
		estado = new MarioPequeno();
	}
	
	public void PegarCogumelo() {
		estado = estado.pegarCogumelo();
	}
	
	public void pegarFlor() {
		estado = estado.pegarFlor();
	}
	
	public void pegarPena() {
		estado = estado.pegarPena();
	}
	
	public void levarDano() {
		estado = estado.levarDano();
	}
	
}
