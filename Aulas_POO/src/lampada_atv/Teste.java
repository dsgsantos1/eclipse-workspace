package lampada_atv;

public class Teste {
	
	public static void main(String[] args) {
		
		LampadaLed lamp = new LampadaLed();		
		
		lamp.estado = false;
		
		lamp.verificarEstado();
		lamp.mudarEstado();
		
	}

}
