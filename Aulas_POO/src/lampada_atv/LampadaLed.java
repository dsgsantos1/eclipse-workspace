package lampada_atv;

public class LampadaLed {
	
	boolean estado;
	
	boolean verificarEstado() {
		
		if(this.estado) {
			System.out.println("Estado anterior: Ligada");
			return true;
		}
		
		else{
			System.out.println("Estado anterior: Desligada");
			return false;
		}
		
	}
	
	void mudarEstado() {
		
		if(this.verificarEstado()) {
			System.out.println("Estado atual: Desligada");
		}
		
		else {
			System.out.println("Estado atual: Ligado");
		}
		
	}
	
}
