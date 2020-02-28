package no.hvl.dat102;

public class Butikk {
	private Vare[] varer;
	private int antallTyper;

	public Butikk(int n) {
		varer = new Vare[n];
		antallTyper = 0;	
	}
	public int finnVare(int varenr) {
		
		int i = 0;
		
		while( i < varer.length && varer[i] != null) {
				if(varer[i].getVarenr() != varenr) {
					i++; 
				} else {
					return i;
			}
		}
		return -1;
	}
	public boolean erLedigPlass() {
		if(antallTyper <= varer.length) {
			return true;
		} 
		return false;
	}
	
	
	public void leggInnNyVare(Vare v) {
		
		
		int varenr = v.getVarenr();
		if(erLedigPlass() && finnVare(varenr) == -1 ) {
		
			
			int i = 0;
			while(i < antallTyper && varenr > varer[i].getVarenr() ) {
				i++;
			}
			
			int j = antallTyper;
			
			while(i < j) {
				varer[j] = varer[j-1];
				j--;
			}
			varer[i] = v;
			antallTyper++;
		}
		
		else {
			if(erLedigPlass()) {
				System.out.println("Varen finnes");
			} else {
				System.out.println("Tabellen er full");
			}
		}
	}
	
	public void slettVare(int varenr) {
		int j = finnVare(varenr);
		if(j != -1 ) {
			varer[j] = varer[antallTyper];
			varer[antallTyper] = null;
			antallTyper--;
		} else {
			System.out.println("Varen finnes ikke");
		}
	}
	public void detaljSalg(int varenr) {
		int j = finnVare(varenr);
		if(j != -1 && varer[j].getAntall() != 0) {
			varer[j].setAntall(varer[j].getAntall()-1);
		} else if (varer[j].getAntall() == 0) {
			System.out.println("Varen er tom");
		} else {
			System.out.println("Varen finnes ikke");
		}
	}
	public void grissInnkjop(int varenr, int ant) {
		int j = finnVare(varenr);
		if(j != -1) {
			varer[j].setAntall(varer[j].getAntall()+ant);
		} else {
			System.out.println("Varen finnes ikke");
		}
		
	}
	public int salgverdi() {
		int k = 0;
		
		for(Vare v : varer) {
			k += v.getPris() * v.getAntall();
		}
		return k;
	}
	public void skrivUtVarer() {
		
		for(Vare v: varer) {
			if(v != null)
			System.out.println(v.toString());
		}
	}
}
