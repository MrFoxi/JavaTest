
public class Godzilla {
	public int taille;
	
	public int age;
	
	public String Nom;
	
	public String Attaque;
	
	public Godzilla(int taille, int age, String Nom, String Attaque) {
		this.taille = taille;
		this.age = age;
		this.Nom = Nom;
		this.Attaque = Attaque;
	}
	
	public void sePrésenter() {
		System.out.println("Bonjour, je suis "+ Nom + " j'ai " + age + " ans, je fais " + taille + "m et j'attaque en faisant des "+ Attaque +".");
	}
}
