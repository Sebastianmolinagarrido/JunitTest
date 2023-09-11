package entidad;

public class Nota {
	private double valor;
	private double ponderacion;
	
	public Nota(double valor, double ponderacion) {
		if(valor<=0) {
			throw new IllegalArgumentException("Valor mayor que 0");
			
		}
		if(ponderacion<=0) {
			throw new IllegalArgumentException("Ponderacion mayor que 0");
		}
		this.valor = valor;
		this.ponderacion = ponderacion;
	}

	public int getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPonderacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

