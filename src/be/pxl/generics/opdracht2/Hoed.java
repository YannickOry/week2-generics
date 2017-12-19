package be.pxl.generics.opdracht2;

public class Hoed <T extends Dier> {
	
	private Dier diertje;
	private int keer = 0;
	public Hoed(Dier soort){
		diertje = soort;
	}
	
	public Dier kijk () {
		if (keer == 0) {
			keer++;
			return null;
			
		}
		else {
			return diertje;
		}
	}
	

}
