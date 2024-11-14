package livraria.model;

public abstract class Principal {
  
	private int codigo;
	private String titulo;
	private float preco;

	public Principal(int codigo, String titulo, float preco) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		
		
		System.out.println("\n-------------------------------------");
		System.out.println("|          Dados do Livro           |");
		System.out.println("-------------------------------------");
		System.out.println("Título do livro: " + this.titulo + " ");
		System.out.println("Código: " + this.codigo);
		System.out.println("Preço: " + this.preco);
		

	}
  
}