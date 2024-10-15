import java.util.ArrayList;
import java.util.Scanner;

public class PublicationManager {
    private ArrayList<Publication> publications;

    // Constructeur
    public PublicationManager() {
        publications = new ArrayList<>();
    }

    // Ajouter une nouvelle publication
    public void ajouterPublication(String titre, String auteur, String datePublication) {
        Publication nouvellePublication = new Publication(titre, auteur, datePublication);
        publications.add(nouvellePublication);
        System.out.println("Publication ajoutée avec succès !");
    }

    // Supprimer une publication par titre
    public void supprimerPublication(String titre) {
        boolean found = false;
        for (Publication p : publications) {
            if (p.getTitre().equalsIgnoreCase(titre)) {
                publications.remove(p);
                System.out.println("Publication supprimée avec succès !");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Publication non trouvée.");
        }
    }

    // Afficher toutes les publications
    public void afficherPublications() {
        if (publications.isEmpty()) {
            System.out.println("Aucune publication à afficher.");
        } else {
            for (Publication p : publications) {
                p.afficherPublication();
                System.out.println("----------------------------");
            }
        }
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        PublicationManager manager = new PublicationManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ajouter une publication");
            System.out.println("2. Supprimer une publication");
            System.out.println("3. Afficher toutes les publications");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine();  // Consomme la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Titre: ");
                    String titre = scanner.nextLine();
                    System.out.print("Auteur: ");
                    String auteur = scanner.nextLine();
                    System.out.print("Date de publication: ");
                    String date = scanner.nextLine();
                    manager.ajouterPublication(titre, auteur, date);
                    break;
                case 2:
                    System.out.print("Entrez le titre de la publication à supprimer: ");
                    String titreSupprimer = scanner.nextLine();
                    manager.supprimerPublication(titreSupprimer);
                    break;
                case 3:
                    manager.afficherPublications();
                    break;
                case 4:
                    System.out.println("Fin du programme.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide.");
            }
        }
    }
}
