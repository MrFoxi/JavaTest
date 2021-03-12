import java.util.ArrayList;
import java.util.List;

public class Classe {
	public String libelle;
	private List<Etudiant> etudiants;
	
	public Classe(String libelle) {
		this.libelle = libelle;
		this.etudiants = new ArrayList<>();
	}
	
	
	public Etudiant getEtudiant(int index) {
		return etudiants.get(index);
	}
	
	
	public void addEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
	}
	
	public void retirerEtudiant(int numeroEtudiant) {
		etudiants.remove(numeroEtudiant);
	}
	
	public void présenterClasse() {
		System.out.println("Voici la classe " + libelle);
		for (int i = 0 ; i < etudiants.size() ; i++) {
			etudiants.get(i).sePrésenter();
		}
	}
}	

