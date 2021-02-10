
public class Teste {

	public static void main(String[] args) {
	Vertice v1= new Vertice("v1");
	Vertice v2 = new Vertice("v2");
	Vertice v3 = new Vertice ("v3");
	
	
	Aresta a1= new Aresta(v1,v2);
	Aresta a2= new Aresta (v2,v3);
//	Aresta a3 = new Aresta(v3,v4);
//	Aresta a4 = new Aresta (v3,v2);
//	Aresta a5 = new Aresta (v1,v2);
//	
	
	Grafo grafinho = new Grafo();
	grafinho.gerarMatiz();
	grafinho.insereVertice(v1);
	grafinho.insereVertice(v2);
	grafinho.insereVertice(v3);
//	grafinho.insereVertice(v4);
	grafinho.insereAresta(a1);
	grafinho.insereAresta(a2);
//	grafinho.insereAresta(a3);
//	grafinho.insereAresta(a4);
//	grafinho.insereAresta(a5);
//	
	
	grafinho.gerarMatiz();
	System.out.println("\n\n");
	System.out.println("ordem do grafo :"+grafinho.calculaOrdem()+"o vertice :"+v2.getValue()+"tem grau "+grafinho.grau(v2));

//	grafinho.removeAresta(a3);
grafinho.removeVertice(v1);
//grafinho.removeVertice(v2);
	
	grafinho.gerarMatiz();
	System.out.println("ordem do grafo :"+grafinho.calculaOrdem()+"o vertice :"+v2.getValue()+"tem grau "+grafinho.grau(v2));
	
	}
	


}
