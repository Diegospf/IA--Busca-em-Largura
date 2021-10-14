package BuscaEmLarguraCidades;

public class Node {
	private Cidade cidade;
	private Node nodePai;
	
	public Node(Cidade cidade, Node nodePai) {
		super();
		this.cidade = cidade;
		this.nodePai = nodePai;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Node getCidadePai() {
		return nodePai;
	}
	public void setCidadePai(Node cidadePai) {
		this.nodePai = cidadePai;
	}
}
