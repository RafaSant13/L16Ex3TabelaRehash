package controller;

import model.Lista;

@SuppressWarnings("unchecked")
public class RehashControle {
	
	
	Lista<Integer> [] ListaA = new Lista[10];
	Lista<Integer> [] ListaB = new Lista[5];
	

	public RehashControle() {
		int tamanho = ListaA.length;
		int i;
		for (i= 0;i<tamanho;i++) {
			ListaA[i] = new Lista<Integer>();
		}
		tamanho = ListaB.length;
		for (i= 0;i<tamanho;i++) {
			ListaB[i] = new Lista<Integer>();
		}
		estabeleceLista();
	}


	private void estabeleceLista() {
		//primeira posicao
		ListaA[0].addFirst(467);
		ListaA[0].addFirst(136);
		ListaA[0].addFirst(158);
		ListaA[0].addFirst(647);
		ListaA[0].addFirst(12);
		
		//segunda posicao
		ListaA[1].addFirst(551);
		ListaA[1].addFirst(600);
		ListaA[1].addFirst(156);
				
		//terceira posicao
		ListaA[2].addFirst(629);
		ListaA[2].addFirst(933);
		ListaA[2].addFirst(914);
		ListaA[2].addFirst(945);
		ListaA[2].addFirst(882);
		ListaA[2].addFirst(414);
		ListaA[2].addFirst(263);
				
		//quarta posicao
		ListaA[3].addFirst(513);
		ListaA[3].addFirst(194);
		ListaA[3].addFirst(795);
		ListaA[3].addFirst(884);

		//quinta posicao
		ListaA[4].addFirst(979);
		ListaA[4].addFirst(337);
		ListaA[4].addFirst(66);
		ListaA[4].addFirst(847);
		ListaA[4].addFirst(591);

		//sexta posicao

		ListaA[5].addFirst(53);
		ListaA[5].addFirst(768);
		
		//setima posicao

		ListaA[6].addFirst(550);
		ListaA[6].addFirst(339);
		ListaA[6].addFirst(90);
		ListaA[6].addFirst(803);
		ListaA[6].addFirst(114);

		//oitava posicao

		ListaA[7].addFirst(88);
		ListaA[7].addFirst(617);
		ListaA[7].addFirst(99);
		ListaA[7].addFirst(216);
		ListaA[7].addFirst(977);
		ListaA[7].addFirst(574);

		//nona posicao

		ListaA[8].addFirst(206);
		ListaA[8].addFirst(338);
		ListaA[8].addFirst(585);
		ListaA[8].addFirst(939);
		ListaA[8].addFirst(227);
		ListaA[8].addFirst(148);
		ListaA[8].addFirst(142);

		//decima posicao

		ListaA[9].addFirst(844);
		ListaA[9].addFirst(708);
		ListaA[9].addFirst(569);		
	}

	private int hashCode(int valor) {
		int hash = valor % 5;
		return hash;
	}
	
	public void rehash() throws Exception {
		int tamanhoL = ListaA.length;
		for (int i = 0; i < tamanhoL; i++) {
			Lista<Integer> a = ListaA[i];
			int tamanho = a.size();
			for (int j = 0;j<tamanho;j++) {
				int valor = a.get(j);
				int hash = hashCode(valor);
				ListaB[hash].addLast(valor);
			}			
		}
	}
	
	public void list() throws Exception {
		int tamanhoL = ListaB.length;
		for (int i = 0; i < tamanhoL; i++) {
			Lista<Integer> l = ListaB[i];
			int tamanho = l.size();
			System.out.print("Linha " + i + ": ");
			for (int j = 0;j<tamanho;j++) {
				System.out.print(l.get(j)+" -> ");
			}
			System.out.print("NULL\n");
			
		}
	}
}
