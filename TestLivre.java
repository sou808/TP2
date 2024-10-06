
/*public class TestLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
class Livre {
    private String titre;
    private String auteur;
    private double nbPages;


    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
    }

    
    public Livre(String auteur, String titre, double nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        setNbPages(nbPages); 
    }


    public Livre() {
        this.titre = "Titreinc";
        this.auteur = "Auteurinc";
        this.nbPages = 0;
    }

   
    public Livre(String titre, double nbPages) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.auteur = "Auteur";
    }

    public String getTitre() {
        return this.titre;
    }

    public double getNbPages() {
        return nbPages;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNbPages(double nbPages) {
        if (nbPages > 20) {
            this.nbPages = nbPages;
        } else {
            System.out.println(" nombre faible.");
        }
    }

    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", Pages: " + nbPages;
    }

    public void decrire() {
        System.out.println(toString());
    }
}


public class TestLivre {
    public static void main(String[] args) {
        
        Livre[] livres = new Livre[3];

      
        livres[0] = new Livre("L'alchimiste", "Coelho", 225);        
        livres[1] = new Livre("La Tunisie", 508);                      
        livres[2] = new Livre("JK Rowling", "Harry Potter");           

      
        System.out.println("Contenu du tableau de livres :");
        for (int i = 0; i < livres.length; i++) {
            livres[i].decrire(); 
        }

        livres[1].setAuteur("Paulo Coelho");

        livres[2].setNbPages(461);

      
        System.out.println("\nContenu du tableau après modifications :");
        for (int i = 0; i < livres.length; i++) {
            livres[i].decrire();
        
    }
}

    
}    