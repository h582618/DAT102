package no.hvl.dat102;

import java.util.Scanner;

public class Vare {

	private int varenr;
	private String navn;
	private double pris;
	private int antall; 
	
	public Vare() {
		this.varenr = 0;
		this.navn = "";
		this.pris = 0.0;
		this.antall = 0;
	}
	public Vare(int varenr) {
		this.varenr = varenr;
	}
	
	public Vare(int varenr, String navn, double pris, int antall) {
		this.varenr = varenr;
		this.navn = navn;
		this.pris = pris;
		this.antall = antall;
	}
	
	public int getVarenr() {
		return varenr;
	}
	public void setVarenr(int varenr) {
		this.varenr = varenr;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public double getPris() {
		return pris;
	}
	public void setPris(double pris) {
		this.pris = pris;
	}
	public int getAntall() {
		return antall;
	}
	public void setAntall(int antall) {
		this.antall = antall;
	}
	
	public void lesVare() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Navn");
		String navn = sc.nextLine();
		System.out.println("Pris");
		String prisI = sc.nextLine();
		double pris = Double.parseDouble(prisI);
		
		while (pris < 0) {
			System.out.println("Pris");
			 prisI = sc.nextLine();
			 pris = Double.parseDouble(prisI);
		}
		sc.close();
		this.navn = navn;
		this.pris = pris;
	}

	public String toString(){
		return "Varenr: " + varenr + " Navn: " + navn + " Pris: " + pris + " Antall " + antall;
	}
}
