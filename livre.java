/*
public class livre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
class Livre {
    private String titre;
    private String auteur;
    private double nbPages;
    private double prix;
    private boolean prixfixe;


    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.prixfixe=false; //milou lprix mahouch fixe//
    }

    
    public Livre(String auteur, String titre, double nbPages) {
        this.auteur = auteur;
        this.titre = titre;
        setNbPages(nbPages); 
        this.prixfixe=false;
    }

    public Livre(String auteur, String titre, double nbPages, double prix) {
        this.auteur = auteur;
        this.titre = titre;
        setNbPages(nbPages);
        this.prix = prix;
        this.prixfixe = true;  
    }
    
    
    public Livre(String auteur2, int i) {
		// TODO Auto-generated constructor stub
	}


	public void setPrix(double prix) {
        if (!prixfixe) {
            this.prix = prix;
            this.prixfixe = true;
            System.out.println("Prix fixé à: " + prix);
        } else {
            System.out.println("Le prix a été fixé .");
        }
    }

    
    public boolean testPrix() {
        return prixfixe;
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
            System.out.println("Le nombre indiqué est faible.");
        }
    }

    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", Pages: " + nbPages;
    }

    public void decrire() {
        System.out.println(toString());
    }
}


public class JAAVA{
    public static void main(String[] args) {
        
        Livre[] livres = new Livre[3];

       
        livres[0] = new Livre("L'alchimiste", "Coelho", 225, 19.99);   
        livres[1] = new Livre("La Tunisie", 508);                     
        livres[2] = new Livre("JK Rowling", "Harry Potter");          
        System.out.println(" tableau de livres :");
        for (int i = 0; i < livres.length; i++) {
            livres[i].decrire(); 
        }

        
        System.out.println(" prix pour 'La Tunisie':");
        livres[1].setPrix(25.50);

      
        System.out.println("\n prix tentative de 'La Tunisie':");
        livres[1].setPrix(30.00);

       
        System.out.println("\nFixation du prix pour 'Harry Potter':");
        livres[2].setPrix(29.99);

        
        System.out.println("\nContenu du tableau après modifications :");
        for (int i = 0; i < livres.length; i++) {
            livres[i].decrire();  
    }
}
}


