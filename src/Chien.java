
public class Chien {

	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public int taille;
	
	public int age;
	
	public String Nom;
	
	public String race;
	
	public Chien(int taille, int age, String Nom, String race) {
		this.taille = taille;
		this.age = age;
		this.Nom = Nom;
		this.race = race;
	}
	
	
	public void sePrésenter() {
		System.out.println("Bonjour, je m'appelle " + Nom + " j'ai " + age + " ans, je fais " + taille + "m et je suis un " + race);
	}
	
	public String toString() {
		return Nom + " " + race;
	}
}
