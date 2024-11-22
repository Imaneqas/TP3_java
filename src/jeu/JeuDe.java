package jeu;
import java.util.Random;

public class JeuDe extends JeuSimple {
	private int v1;
	private java.util.Random random;
	
	public JeuDe() {
	}
	
	@Override
	public int arbitrer(String c1, String c2) {
		if(Integer.valueOf(c1)>Integer.valueOf(c2)) {
			return -1;
		} else if (Integer.valueOf(c1)<Integer.valueOf(c2)) {
			return +1;
		} else return 0;
		
		
	}

	@Override
	public String jouerUnTour() {
		v1=random.nextInt(1, 6);
		return ""+v1;
	}

}
