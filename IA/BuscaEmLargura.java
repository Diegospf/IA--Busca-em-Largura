package BuscaEmLarguraCidades;

import java.util.ArrayList;

public class BuscaEmLargura {

	private Cidade cidadeInicial;
	private Cidade cidadeFinal;
	private ArrayList<Node> nosAtuais = new ArrayList<Node>();
	private ArrayList<Cidade> cidadesVisitadas = new ArrayList<Cidade>();

	public BuscaEmLargura(Cidade cidadeInicial, Cidade cidadeFinal) {
		super();
		this.cidadeInicial = cidadeInicial;
		this.cidadeFinal = cidadeFinal;
		Node cInit = new Node(cidadeInicial,null);
		nosAtuais.add(cInit);
	}

	public Cidade getCidadeInicial() {
		return cidadeInicial;
	}

	public void setCidadeInicial(Cidade cidadeInicial) {
		this.cidadeInicial = cidadeInicial;
	}

	public Cidade getCidadeFinal() {
		return cidadeFinal;
	}

	public void setCidadeFinal(Cidade cidadeFinal) {
		this.cidadeFinal = cidadeFinal;
	}
	
	public void distancia(Node noAtual, double distanciaPercorrida) {
		if(noAtual.getCidadePai() == null) {
			System.out.println("Distancia percorrida = " + distanciaPercorrida);
		}else {
			for(int i = 0; i < Main.listaConexoes.size(); i++) {
				if(Main.listaConexoes.get(i).getC1() == noAtual.getCidade()) {
					if(Main.listaConexoes.get(i).getC2() == noAtual.getCidadePai().getCidade()) {
						distanciaPercorrida += Main.listaConexoes.get(i).getDist();
						break;
					}
				}
			}
			
			distancia(noAtual.getCidadePai(), distanciaPercorrida);
		}
	}
	
	public void caminho(Node noAtual) {
		if(noAtual.getCidadePai() == null) {
			System.out.print("\nCaminho: " + noAtual.getCidade().getNome() + " -> ");
		}else {
			caminho(noAtual.getCidadePai());
			System.out.print(noAtual.getCidade().getNome() + " -> ");
		}
	}
	
	public void principal(int rodagem) {
		if(!cidadesVisitadas.contains(nosAtuais.get(0).getCidade())) {
			if(nosAtuais.get(0).getCidade().getNome() == this.cidadeFinal.getNome()) {
				System.out.println("\nCidade Atual: " + nosAtuais.get(0).getCidade().getNome() + "| Chegou na cidade objetivo");
				caminho(nosAtuais.get(0));
				System.out.println();
				distancia(nosAtuais.get(0),0);
			}else{
				System.out.println("\nRodagem Atual:" + rodagem);
				
				System.out.print("\nCidade Atual: " + nosAtuais.get(0).getCidade().getNome() + "| Não é a cidade objetivo");
				System.out.print("\nCidades já visitadas: ");
				for(int i=0; i< cidadesVisitadas.size();i++) {
					System.out.print(cidadesVisitadas.get(i).getNome() + " | ");
				}
				for(int i = 0; i < nosAtuais.get(0).getCidade().getConexoes().size(); i++) {
					Node n = new Node(nosAtuais.get(0).getCidade().getConexoes().get(i), nosAtuais.get(0));
					nosAtuais.add(n);
				}
				cidadesVisitadas.add(nosAtuais.get(0).getCidade());
				
				System.out.print("\nNós a serem visitados: ");
				for(int i=1; i< nosAtuais.size();i++) {
					System.out.print(nosAtuais.get(i).getCidade().getNome() + " | ");
				}

				System.out.println("\n");
				
				nosAtuais.remove(0);
				this.principal(rodagem+1);
			}
		}else {
			System.out.println(nosAtuais.get(0).getCidade().getNome() + " já foi visitada");
			nosAtuais.remove(0);
			this.principal(rodagem);
		}
		
	}

	}
