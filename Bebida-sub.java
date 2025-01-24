package pizzaria;
public class Bebida extends Alimentos {
	private double volume;
	private int gelo;
	public Bebida(int estoque) {
		super(estoque);
		System.out.println("Alimento: Bebida");
	}
	public Bebida() {
		super();
		System.out.println("Alimento: Bebida");
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public int getGelo() {
		return gelo;
	}
	public void setGelo(int gelo) {
		this.gelo = gelo;
	}
	@Override
	public String toString() {
		return "Bebida\nvolume = " + volume + "ml, gelo = " + gelo;
	}
	public String converteMlpL(double volume) {
		this.volume = volume/1000;
		return "O volume em Litros é:" + this.volume;
	}
}
