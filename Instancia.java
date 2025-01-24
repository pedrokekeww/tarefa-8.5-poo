package pizzaria;
public class Instancia {
	public static void main (String[] args) {
		Pizza Calabresa = new Pizza();
		Calabresa.setBorda("Catupiry");
		Calabresa.setFatia(8);
		Calabresa.setEstoque(2);
		Calabresa.setIngredientes("Calabresa, Queijo, Massa, Sal, Molho de Tomate");
		Calabresa.setNome("Pizza de Calabresa");
		Calabresa.setPreço(21);
		Calabresa.setSabor("Salgado");
		System.out.println(Calabresa.getNome() + "\nSabor: " + Calabresa.getSabor() + "\nPreço: "
				+ Calabresa.getPreço() + "\nIngredientes: " + Calabresa.getIngredientes()
				+ "\nEm estoque: " + Calabresa.getEstoque() + "\nQuantas Fatias:" 
				+ Calabresa.getFatia() + "\nBorda: " + Calabresa.getBorda() );
		System.out.println(Calabresa.numFatiaspPessoa(4));
		System.out.println(" ");
		Pizza chocolate = new Pizza(4) ;
		System.out.println(" ");
		Esfirra esfirra = new Esfirra();
		esfirra.setMolho("Shoyu");
		esfirra.setQuantidade(12);
		esfirra.setEstoque(32);
		esfirra.setIngredientes("Queijo, Massa, Sal, Molho Shoyu, Carne moida");
		esfirra.setNome("Esfihao do Carlão");
		esfirra.setPreço(32);
		System.out.println(esfirra.getNome() + "\nSabor: " + esfirra.getSabor() + "\nPreço: "
				+ esfirra.getPreço() + "\nIngredientes: " + esfirra.getIngredientes()
				+ "\nEm estoque: " + esfirra.getEstoque() + "\nQuantidade:" 
				+ esfirra.getQuantidade() + "\nMolho: " + esfirra.getMolho() );
		System.out.println(esfirra.Caixas());
		System.out.println(" ");
		Esfirra doce = new Esfirra(30);
		System.out.println(" ");
		Bebida suco = new Bebida();
		suco.setVolume(250);
		suco.setGelo(4);
		suco.setEstoque(4);
		suco.setIngredientes("Limão, Água, Açucar, Gelo");
		suco.setNome("Suquin do luis");
		suco.setPreço(8);
		suco.setSabor("Azedo");
		System.out.println(suco.getNome() + "\nSabor: " + suco.getSabor() + "\nPreço: "
				+ suco.getPreço() + "\nIngredientes: " + suco.getIngredientes()
				+ "\nEm estoque: " + suco.getEstoque() + "\nVolume: " 
				+ suco.getVolume() + "\nGelo: " + suco.getGelo());
		System.out.println(suco.converteMlpL(250));
		System.out.println(" ");
		Bebida coca = new Bebida(100);
	}	
}
