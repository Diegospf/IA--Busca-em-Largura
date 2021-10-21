package BuscaEmLarguraCidades;

public class Conexao {
	private Cidade c1;
	private Cidade c2;
	private double dist;
	
	public Conexao(Cidade c1, Cidade c2, double d) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.dist = d;
	}

	public Cidade getC1() {
		return c1;
	}

	public Cidade getC2() {
		return c2;
	}

	public double getDist() {
		return dist;
	}
	
}
