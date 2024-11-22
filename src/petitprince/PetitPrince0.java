package petitprince;

import asteroide.Sujet;
import asteroide.console.ConsoleJavaBoy;



public class PetitPrince0 implements Sujet {
	private String nom;
	private int argent;
	private static int cpt=0;
	private ConsoleJavaBoy console;
	
	public PetitPrince0() {
		console = new ConsoleJavaBoy(this);
	}
	
	@Override
	public String getNom() {

		return null;
	}

	@Override
	public int getArgent() {

		return 0;
	}

	@Override
	public void run() {
		this.console.parler("Salut! Je suis "+nom+" et j'ai " +argent+" sous! Je dis ça pour la "+cpt+" ième fois !");
		this.console.seDirigerVers(0);
		cpt++;
	}

	

}
