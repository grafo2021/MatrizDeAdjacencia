import java.util.ArrayList;

public class Grafo {
	private ArrayList<Vertice> vertices = new ArrayList<Vertice>();
	private ArrayList<Aresta> arestas = new ArrayList<Aresta>();

	public Grafo() {

	}

	public void insereVertice(Vertice v) {
		try {
			for(Vertice vertice : vertices) {
				if (v==vertice) {
					throw new Exception();
				}
			}
		vertices.add(v);
	}catch (Exception e) {
		System.out.println("vertice ja add ");
	}}

	public void insereAresta(Aresta a) {
		try{for(Aresta aresta:arestas ) {
			if ((aresta.getV1()==a.getV1()&&aresta.getV2()==a.getV2())||aresta.getV2()==a.getV1()||aresta.getV1()==a.getV2()) {
				throw new Exception();
			}
		}
		arestas.add(a);
		
	}catch(Exception e){
		System.out.println("aresta ja add");
	}
	}

	private boolean buscaAresta(Vertice a, Vertice b) {
		for (Aresta aresta : arestas) {
			if ((aresta.getV1() == a || aresta.getV1() == b) && (aresta.getV2() == a || aresta.getV2() == b)) {
				return true;

			}
		}

		return false;
	}

	public void gerarMatiz() {
		String matriz = new String();
		try {
			if (vertices.isEmpty()) {
				throw new Exception();
			}
			matriz = "  ";
			for (Vertice ref : vertices) {
				matriz = matriz + " " + ref.getValue();
			}
			matriz = matriz + "\n";
			for (Vertice linha : vertices) {
				matriz = matriz + linha.getValue() + '=';
				for (Vertice coluna : vertices) {

					if (this.buscaAresta(coluna, linha)) {
						matriz = matriz + "1 ";
					} else {
						matriz = matriz + "0 ";
					}
				}
				matriz = matriz + '\n';
			}

			System.out.println(matriz);

		} catch (Exception e) {
			System.out.println("nao foi possivel gerar matriz");
		}

	}

	public int calculaOrdem() {
		return vertices.size();
	}

	public int grau(Vertice v) {
		int contador = 0;
		for (Aresta arestaRef : arestas) {
			if (arestaRef.getV1() == v || arestaRef.getV2() == v) {
				contador++;
			}
		}
		return contador;
	}

	public void removeVertice(Vertice v) {
		this.vertices.remove(v);
	}

	public void removeAresta(Aresta a) {
		this.arestas.remove(a);
	}

}
