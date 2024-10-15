public class Publication {
    private String titre;
    private String auteur;
    private String datePublication;

    // Constructeur
    public Publication(String titre, String auteur, String datePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
    }

    // Getters
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getDatePublication() {
        return datePublication;
    }

    // Méthode pour afficher les informations de la publication
    public void afficherPublication() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Date de publication: " + datePublication);
    }
}
