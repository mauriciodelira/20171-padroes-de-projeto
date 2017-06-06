package game;

public class Card {
	private String num, naipe;
	private int valor;
	
	public Card(String naipe, String num, int valor){
		this.naipe = naipe;
		this.num = num;
		this.valor = valor;
	}
	
	public String getNumber() {
		return num;
	}
	public void setNumber(String num) {
		this.num = num;
	}
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	public int getValor(){
		return this.valor;
	}
	public void setValor(int valor){
		this.valor = valor;
	}
	

	@Override
	public String toString() {
		return "Card [número: " + num + ", naipe: " + naipe + ", valor: "+ valor +"]\n---";
	}
	
	
}
