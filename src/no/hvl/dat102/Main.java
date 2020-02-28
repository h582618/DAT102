package no.hvl.dat102;

public class Main {

	public static void main(String[] args) {
		
		Butikk b = new Butikk(100);
		
		Vare v1 = new Vare(1,"Tunfisk",7.0,10);
		Vare v2 = new Vare(2,"Kylling",40,6);
		Vare v3 = new Vare(3,"Ris",14,5);
		Vare v4 = new Vare(4,"Wok",32,4);
		Vare v5 = new Vare(5,"Cola",20,2);
		Vare v6 = new Vare(6,"Boller",5,3);
		Vare v7 = new Vare(7,"Kirsebær",10,2);
		Vare v8 = new Vare(8,"Banan",4,3);
		Vare v9 = new Vare(9,"Barebells",35,10);
		
		b.skrivUtVarer();
		
		b.leggInnNyVare(v2);
		b.leggInnNyVare(v3);
		b.leggInnNyVare(v7);
		b.leggInnNyVare(v4);
		b.leggInnNyVare(v6);
		b.leggInnNyVare(v5);
		b.leggInnNyVare(v1);
		
		b.skrivUtVarer();
	}

}
