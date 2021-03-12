public class main {
		
	public static void main(String[] args) {
		Chien Un = new Chien(1, 12, "Plouf", "Fox Terrier");
		Chien Deux = new Chien(1, 12, "Splash", "YorkShire");
		Chien trois = new Chien(1, 12, "Boing", "Pit Bull");
		Godzilla LeSeul = new Godzilla(40, 2000, "Godzilla", "rayons nucléaires");
		Godzilla Lunique = new Godzilla(40, 2100, "Godzillou", "pêts nucléaires");
		
		Etudiant eleveUn = new Etudiant("Truc", "Sa", 15, "BTS");
		Etudiant eleveDeux = new Etudiant("Chose", "Lee", 16, "BTS");
		
		
		eleveUn.ajouterGodzilla(LeSeul);
		eleveDeux.ajouterGodzilla(Lunique);
		
		
		Classe BTS = new Classe("BTS SIO");
		BTS.addEtudiant(eleveUn);
		BTS.addEtudiant(eleveDeux);
		BTS.présenterClasse();
	}
}
