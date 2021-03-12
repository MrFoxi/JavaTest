import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	
	public String Nom;
	
	public String Prenom;
	
	public int age;
	
	public String libelle;
	
	private List<Chien> chiens;
	
	private List<Godzilla> godzillas;
	
	public Etudiant(String Nom, String Prenom, int age, String libelle) {
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.age = age;
		this.libelle = libelle;
		
		this.chiens = new ArrayList<>();
		this.godzillas = new ArrayList<>();
	}
	
	
	public void sePrésenter() {
		System.out.println("Bonjour, je m'appelle " + Nom +" "+ Prenom + " j'ai " + age + "ans et je suis en" + libelle);
		for (int i = 0 ; i < chiens.size() ; i++) {
			chiens.get(i).sePrésenter();
		}
		for (int i = 0 ; i <godzillas.size() ; i++) {
			godzillas.get(i).sePrésenter();
		}
	}
	
	public void ajouterChien(Chien chien) {
		chiens.add(chien);
	}
	
	public void retirerChien(int numeroChien) {
		chiens.remove(numeroChien);
	}
	
	public void ajouterGodzilla(Godzilla Godzilla) {
		godzillas.add(Godzilla);
	}
	
	public void retirerGodzilla(int numeroGodzilla) {
		godzillas.remove(numeroGodzilla);
	}
}
