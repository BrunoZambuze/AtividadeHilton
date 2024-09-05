package PadraoProjetoState;

public class MarioPequeno implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario grande");
		return new MarioGrande();
	}
	
	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario grande e Mario fogo");
		return new MarioFogo();
	}
	
	@Override
	public MarioState pegarPena() {
		System.out.println("Mario grande e Mario Capa");
		return new MarioCapa();
	}
	
	@Override
	public MarioState levarDano() {
		System.out.println("Ainda pequeno");
		return this;
	}
	
}
