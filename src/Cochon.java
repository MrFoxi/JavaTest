
public class Cochon extends Animal{
	 private String couleur;
	 
	 public Cochon(int taille, int age, String nom, String espece, String couleur) {
		 super(taille, age, nom, espece);
		 this.couleur = couleur;
	 }
	 
	 public void sePrésenter() {
		System.out.println("Bonjour, je m'appelle " + nom + " j'ai " + age + " ans, je fais " + taille + "m et je suis un " + espece);
	}
}
