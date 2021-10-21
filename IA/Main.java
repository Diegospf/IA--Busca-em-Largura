package BuscaEmLarguraCidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Conexao> listaConexoes = new ArrayList<Conexao>();
	
	public static void main(String[] args) {
		int partida, chegada;
		Cidade inicio = null, fim = null;
		Scanner sc = new Scanner(System.in);
		Cidade c1 = new Cidade("Paris");
		Cidade c2 = new Cidade("Amiens");
		Cidade c3 = new Cidade("Rouen");
		Cidade c4 = new Cidade("Orleans");
		Cidade c5 = new Cidade("Chalons-en-Champagne");
		Cidade c6 = new Cidade("Lyon");
		Cidade c7 = new Cidade("Lille");
		Cidade c8 = new Cidade("Caen");
		Cidade c9 = new Cidade("Rennes");
		Cidade c10 = new Cidade("Nantes");
		Cidade c11 = new Cidade("Poitiers");
		Cidade c12 = new Cidade("Limoges");
		Cidade c13 = new Cidade("Bordeaux");
		Cidade c14 = new Cidade("Toulouse");
		Cidade c15 = new Cidade("Montpellier");
		Cidade c16 = new Cidade("Besancon");
		Cidade c17 = new Cidade("Strasbourg");
		Cidade c18 = new Cidade("Metz");
		Cidade c19 = new Cidade("Marselha");
		Cidade c20 = new Cidade("Dijon");
		
		//Conexões com paris (c1)
				Conexao parisRouen = new Conexao(c1, c3, 135.7);
				Conexao parisChalons = new Conexao(c1, c5, 187.5);
				Conexao parisCaen = new Conexao(c1, c8, 239.5);
				Conexao parisOrleans = new Conexao(c1, c4, 132.4);
				Conexao parisLyon = new Conexao(c1, c6, 391);
				Conexao parisDijon = new Conexao(c1, c20, 262);
				Conexao parisAmiens = new Conexao(c1, c2, 163.2);
				
				listaConexoes.add(parisRouen);
				listaConexoes.add(parisChalons);
				listaConexoes.add(parisCaen);
				listaConexoes.add(parisOrleans);
				listaConexoes.add(parisLyon);
				listaConexoes.add(parisDijon);
				listaConexoes.add(parisAmiens);
				
				//Conexões com Amiens (c2)
				Conexao amiensRouen = new Conexao(c2, c3, 119.9);
				Conexao amiensChalons = new Conexao(c2, c5, 218.5);
				Conexao amiensLille = new Conexao(c2, c7, 140.5);
				Conexao amiensParis = new Conexao(c2, c1, 163.2);
				
				listaConexoes.add(amiensRouen);
				listaConexoes.add(amiensChalons);
				listaConexoes.add(amiensLille);
				listaConexoes.add(amiensParis);
				
				//Conexões com Rouen(c3)
				Conexao rouenAmiens = new Conexao(c3, c2, 119.9);
				Conexao rouenParis = new Conexao(c3, c1, 135.7);
				Conexao rouenCaen = new Conexao(c3, c8, 132.2);
				
				listaConexoes.add(rouenAmiens);
				listaConexoes.add(rouenParis);
				listaConexoes.add(rouenCaen);
				
				//Conexões com Orleans(c4)
				Conexao orleansRenes = new Conexao(c4, c9, 307.2);
				Conexao orleansParis = new Conexao(c4, c1, 132.4);
				Conexao orleansLimoges = new Conexao(c4, c12, 269.6);
		        Conexao orleansPoitiers = new Conexao(c4, c11, 224.5);
				
				listaConexoes.add(orleansRenes);
				listaConexoes.add(orleansParis);
				listaConexoes.add(orleansLimoges);
				listaConexoes.add(orleansPoitiers);

				//Conexões com Chalons-en-Champagne(c5)
				Conexao chalonsParis = new Conexao(c5, c1, 187.5);
				Conexao chalonsAmiens = new Conexao(c5, c2, 218.5);
				Conexao chalonsDijon = new Conexao(c5, c20, 258.9);
				Conexao chalonsMetz = new Conexao(c5, c18, 157.1);
				
				listaConexoes.add(chalonsParis);
				listaConexoes.add(chalonsAmiens);
				listaConexoes.add(chalonsDijon);
				listaConexoes.add(chalonsMetz);
				
				//Conexões com Lyon(c6)
				Conexao lyonMont = new Conexao(c6, c15, 304.2);
				Conexao lyonMarselha = new Conexao(c6, c19, 313.7);
				Conexao lyonParis = new Conexao(c6, c1, 391);
				Conexao lyonBesancon = new Conexao(c6, c16, 226.7);
				Conexao lyonLimoges = new Conexao(c6, c12, 411.5);
				
				listaConexoes.add(lyonMont);
				listaConexoes.add(lyonMarselha);
				listaConexoes.add(lyonParis);
				listaConexoes.add(lyonBesancon);
				listaConexoes.add(lyonLimoges);
				
				//Conexões com Lille(c7)
				Conexao lilleAmiens = new Conexao(c7, c2, 140.5);
				
				listaConexoes.add(lilleAmiens);
				
				//Conexões com Caen(c8)
				Conexao caenParis = new Conexao(c8, c1, 239.5);
				Conexao caenRouen = new Conexao(c8, c3, 132.2);
				Conexao caenRennes = new Conexao(c8, c9, 184.6);
				
				listaConexoes.add(caenParis);
				listaConexoes.add(caenRouen);
				listaConexoes.add(caenRennes);
				
				
				//Conexões com Rennes(c9)
				Conexao rennesNantes = new Conexao(c9, c10, 113.4);
				Conexao rennesCaen = new Conexao(c9, c8, 184.6);
				Conexao rennesOrleans = new Conexao(c9, c4, 307.2);
				
				listaConexoes.add(rennesNantes);
				listaConexoes.add(rennesCaen);
				listaConexoes.add(rennesOrleans);
				
				//Conexões com Nantes(c10)
				Conexao nantesPoitiers = new Conexao(c10, c11, 218.8);
				Conexao nantesRennes = new Conexao(c10, c9, 113.4);
				
				listaConexoes.add(nantesPoitiers);
				listaConexoes.add(nantesRennes);
				
				//Conexões com Poitiers(c11)
				Conexao poitiersNantes = new Conexao(c11, c10, 218.8);
				Conexao poitiersLimoges = new Conexao(c11, c12, 133.6);
				Conexao poitiersOrleans = new Conexao(c11, c4, 224.5);
				
				listaConexoes.add(poitiersNantes);
				listaConexoes.add(poitiersLimoges);
				listaConexoes.add(poitiersOrleans);
				
				//Conexões com Limoges(c12)
				Conexao limogesBordeaux = new Conexao(c12, c13, 221.1);
				Conexao limogesPoitiers = new Conexao(c12, c11, 133.6);
				Conexao limogesToulouse = new Conexao(c12, c14, 290.1);
				Conexao limogesLyon = new Conexao(c12, c6, 411.5);
		        Conexao limogesOrleans = new Conexao(c12, c4, 269.6);
				
				listaConexoes.add(limogesBordeaux);
				listaConexoes.add(limogesPoitiers);
				listaConexoes.add(limogesToulouse);
				listaConexoes.add(limogesLyon);
				listaConexoes.add(limogesOrleans);

				//Conexões com Bordeaux(c13)
				Conexao bordeauxLimoges = new Conexao(c13, c12, 221.1);
				Conexao bordeauxToulouse = new Conexao(c13, c14, 244.9);

				listaConexoes.add(bordeauxLimoges);
				listaConexoes.add(bordeauxToulouse);

				//Conexões com Toulouse(c14)
				Conexao toulouseLimoges = new Conexao(c14, c12, 290.1);
				Conexao toulouseBordeaux = new Conexao(c14, c13, 244.9);
				Conexao toulouseMont = new Conexao(c14, c15, 242.8);
				
				listaConexoes.add(toulouseLimoges);
				listaConexoes.add(toulouseBordeaux);
				listaConexoes.add(toulouseMont);

				//Conexões com Montpellier(c15)
				Conexao montToulouse = new Conexao(c15, c14, 242.8);
				Conexao montMarselha = new Conexao(c15, c19, 170);
				Conexao montLyon = new Conexao(c15, c6, 302.9);
				
				listaConexoes.add(montToulouse);
				listaConexoes.add(montMarselha);
				listaConexoes.add(montLyon);

				//Conexões com Bnsancon(c16)
				Conexao besanconDijon = new Conexao(c16, c20, 92.9);
				Conexao besanconStras = new Conexao(c16, c17, 242.5);
				Conexao besanconLyon = new Conexao(c16, c6, 226.7);

				listaConexoes.add(besanconDijon);
				listaConexoes.add(besanconStras);
				listaConexoes.add(besanconLyon);
				
				
				//Conexões com Strasbourg(c17)
				Conexao strasMetz = new Conexao(c17, c18, 166.4);
				Conexao strasBesancon = new Conexao(c17, c16, 242.5);
				
				listaConexoes.add(strasMetz);
				listaConexoes.add(strasBesancon);
				
				//Conexões com Metz(c18)
				Conexao metzChalons = new Conexao(c18, c5, 157.1);
				Conexao metzStras = new Conexao(c18, c17, 166.4);
				Conexao metzDijon = new Conexao(c18, c20, 269.9);
				
				listaConexoes.add(metzChalons);
				listaConexoes.add(metzStras);
				listaConexoes.add(metzDijon);
				
				//Conexões com Marselha(c19)
				Conexao mareslhaMont = new Conexao(c19, c15, 170);
				Conexao mareslhaLyon = new Conexao(c19, c6, 313.7);
				
				listaConexoes.add(mareslhaMont);
				listaConexoes.add(mareslhaLyon);
				
				//Conexões com Dijon(c20)
				Conexao dijonMetz = new Conexao(c20, c18, 269.9);
				Conexao dijonChalons = new Conexao(c20, c5, 258.9);
				Conexao dijonBesancon = new Conexao(c20, c16, 92.9);
				Conexao dijonParis = new Conexao(c20, c1, 262);
				
				listaConexoes.add(dijonMetz);
				listaConexoes.add(dijonChalons);
				listaConexoes.add(dijonBesancon);
				listaConexoes.add(dijonParis);
				
				
				//Bloco antigo
				ArrayList<Cidade> c1Conex = new ArrayList<Cidade>();
				c1Conex.add(c3);
				c1Conex.add(c5);
				c1Conex.add(c8);
				c1Conex.add(c4);
				c1Conex.add(c6);
				c1Conex.add(c20);
				c1Conex.add(c2);
				ArrayList<Cidade> c2Conex = new ArrayList<Cidade>();
				c2Conex.add(c3);
				c2Conex.add(c5);
				c2Conex.add(c7);
				c2Conex.add(c1);
				ArrayList<Cidade> c3Conex = new ArrayList<Cidade>();
				c3Conex.add(c2);
				c3Conex.add(c1);
				c3Conex.add(c8);
				ArrayList<Cidade> c4Conex = new ArrayList<Cidade>();
				c4Conex.add(c9);
				c4Conex.add(c1);
				c4Conex.add(c12);
				c4Conex.add(c11);
				ArrayList<Cidade> c5Conex = new ArrayList<Cidade>();
				c5Conex.add(c1);
				c5Conex.add(c2);
				c5Conex.add(c20);
				c5Conex.add(c18);
				ArrayList<Cidade> c6Conex = new ArrayList<Cidade>();
				c6Conex.add(c15);
				c6Conex.add(c19);
				c6Conex.add(c1);
				c6Conex.add(c16);
				c6Conex.add(c12);
				ArrayList<Cidade> c7Conex = new ArrayList<Cidade>();
				c7Conex.add(c2);
				ArrayList<Cidade> c8Conex = new ArrayList<Cidade>();
				c8Conex.add(c1);
				c8Conex.add(c3);
				c8Conex.add(c9);
				ArrayList<Cidade> c9Conex = new ArrayList<Cidade>();
				c9Conex.add(c10);
				c9Conex.add(c8);
				c9Conex.add(c4);
				ArrayList<Cidade> c10Conex = new ArrayList<Cidade>();
				c10Conex.add(c11);
				c10Conex.add(c9);
				ArrayList<Cidade> c11Conex = new ArrayList<Cidade>();
				c11Conex.add(c10);
				c11Conex.add(c12);
				c11Conex.add(c4);
				ArrayList<Cidade> c12Conex = new ArrayList<Cidade>();
				c12Conex.add(c13);
				c12Conex.add(c11);
				c12Conex.add(c14);
				c12Conex.add(c6);
				c12Conex.add(c4);
				ArrayList<Cidade> c13Conex = new ArrayList<Cidade>();
				c13Conex.add(c12);
				c13Conex.add(c14);
				ArrayList<Cidade> c14Conex = new ArrayList<Cidade>();
				c14Conex.add(c12);
				c14Conex.add(c13);
				c14Conex.add(c15);
				ArrayList<Cidade> c15Conex = new ArrayList<Cidade>();
				c15Conex.add(c14);
				c15Conex.add(c19);
				c15Conex.add(c6);
				ArrayList<Cidade> c16Conex = new ArrayList<Cidade>();
				c16Conex.add(c20);
				c16Conex.add(c17);
				c16Conex.add(c6);
				ArrayList<Cidade> c17Conex = new ArrayList<Cidade>();
				c17Conex.add(c18);
				c17Conex.add(c16);
				ArrayList<Cidade> c18Conex = new ArrayList<Cidade>();
				c18Conex.add(c5);
				c18Conex.add(c17);
				c18Conex.add(c20);
				ArrayList<Cidade> c19Conex = new ArrayList<Cidade>();
				c19Conex.add(c15);
				c19Conex.add(c6);
				ArrayList<Cidade> c20Conex = new ArrayList<Cidade>();
				c20Conex.add(c18);
				c20Conex.add(c5);
				c20Conex.add(c16);
				c20Conex.add(c1);
		
		
		c1.setConexoes(c1Conex);
		c2.setConexoes(c2Conex);
		c3.setConexoes(c3Conex);
		c4.setConexoes(c4Conex);
		c5.setConexoes(c5Conex);
		c6.setConexoes(c6Conex);
		c7.setConexoes(c7Conex);
		c8.setConexoes(c8Conex);
		c9.setConexoes(c9Conex);
		c10.setConexoes(c10Conex);
		c11.setConexoes(c11Conex);
		c12.setConexoes(c12Conex);
		c13.setConexoes(c13Conex);
		c14.setConexoes(c14Conex);
		c15.setConexoes(c15Conex);
		c16.setConexoes(c16Conex);
		c17.setConexoes(c17Conex);
		c18.setConexoes(c18Conex);
		c19.setConexoes(c19Conex);
		c20.setConexoes(c20Conex);
		
		
		System.out.println("*****Busca em Largura - Mapa da Franca*****\nSelecione as cidades de partida e chegada dentre as cidades da lista abaixo:\n1.Paris\n"
				+ "2.Amiens\n3.Rouen\n4.Orleans\n5.Chalons-en-Champagne\n6.Lyon\n7.Lille\n8.Caen\n9.Rennes\n10.Nantes\n11.Poitiers\n12.Limoges\n13.Bordeaux\n14.Toulouse\n"
				+ "15.Montpellier\n16.Besancon\n17.Strasbourg\n18.Metz\n19.Marselha\n20.Dijon\n");
		
		do {
			System.out.println("Digite o numero da cidade de partida: ");
			partida = sc.nextInt();
		}while(partida < 1 || partida > 20);
		
		switch (partida) {
		case 1:
			inicio = c1;
			break;
		case 2:
			inicio = c2;
			break;
		case 3:
			inicio = c3;
			break;
		case 4:
			inicio = c4;
			break;
		case 5:
			inicio = c5;
			break;
		case 6:
			inicio = c6;
			break;
		case 7:
			inicio = c7;
			break;
		case 8:
			inicio = c8;
			break;
		case 9:
			inicio = c9;
			break;
		case 10:
			inicio = c10;
			break;
		case 11:
			inicio = c11;
			break;
		case 12:
			inicio = c12;
			break;
		case 13:
			inicio = c13;
			break;
		case 14:
			inicio = c14;
			break;
		case 15:
			inicio = c15;
			break;
		case 16:
			inicio = c16;
			break;
		case 17:
			inicio = c17;
			break;
		case 18:
			inicio = c18;
			break;
		case 19:
			inicio = c19;
			break;
		case 20:
			inicio = c20;
			break;
			
		}
		
		System.out.println();
		
		do {
			System.out.println("Digite o numero da cidade de chegada: ");
			chegada = sc.nextInt();
		}while(chegada < 1 || chegada > 20 || chegada == partida);
		
		switch (chegada) {
		case 1:
			fim = c1;
			break;
		case 2:
			fim = c2;
			break;
		case 3:
			fim = c3;
			break;
		case 4:
			fim = c4;
			break;
		case 5:
			fim = c5;
			break;
		case 6:
			fim = c6;
			break;
		case 7:
			fim = c7;
			break;
		case 8:
			fim = c8;
			break;
		case 9:
			fim = c9;
			break;
		case 10:
			fim = c10;
			break;
		case 11:
			fim = c11;
			break;
		case 12:
			fim = c12;
			break;
		case 13:
			fim = c13;
			break;
		case 14:
			fim = c14;
			break;
		case 15:
			fim = c15;
			break;
		case 16:
			fim = c16;
			break;
		case 17:
			fim = c17;
			break;
		case 18:
			fim = c18;
			break;
		case 19:
			fim = c19;
			break;
		case 20:
			fim = c20;
			break;
			
		}
		System.out.println();
		
		BuscaEmLargura bl = new BuscaEmLargura(inicio, fim);
		bl.principal(1);
	}
}