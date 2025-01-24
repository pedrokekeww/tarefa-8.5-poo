package pizzaria;
public class Alimentos {
    private String nome;
    private String ingredientes;
    private double preço;
    private String sabor;
    private int estoque;
    public Alimentos(int estoque) {
        if(estoque == 0){
            System.out.println("Não temos em estoque no momento.");
        }
        else{
            System.out.println("Bem vindo a pizzaria ambatak!");
        }
    }
	public Alimentos()
	{
            
            System.out.println("Bem vindo a pizzaria ambatak!");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}	
}
