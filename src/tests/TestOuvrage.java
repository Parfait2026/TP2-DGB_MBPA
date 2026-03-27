package tests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import livres.*;

/**
 * CoursPOO 1
 *
 * @author Julien.Brunet màj Jocelyn
 * @since H25
 */
public class TestOuvrage {

    public static void main(String[] args) {
        TestOuvrage test = new TestOuvrage();
        test.testOuvrages();
        test.testTrouver();
        test.crerSerieEtAjouterOuvrage();
        test.enleverOuvrage();
        test.testCreationPays();
    }


    public void testOuvrages() {
        //Deux auteurs deja prets pour les tests...
        Auteur albertine = new Auteur("Albertine", "Tremblay", new Pays("Canada", "CAN"));
        Auteur john = new Auteur("John", "Smith", new Pays("Etats-Unis", "USA"));

        //Voici une partie des tests! Il faut en ajouter, pour les fonctionnalités non testées!
        System.out.println("-----Test des constructeurs d'ouvrage et des diverses validations-----------");
        Ouvrage livreA = new OuvrageAudio("Titre assez long", john, Ouvrage.Format.AUDIO,LocalDate.now(),10,235, OuvrageAudio.FormatAudio.ANALOGIQUE);
        System.out.println(livreA);
        Ouvrage livreB = new OuvrageVideo("Ti", john, Ouvrage.Format.VIDEO,LocalDate.now(),24,10,1.2);
        System.out.println(livreB);
        Ouvrage livreC = new OuvragePapier(null, john, Ouvrage.Format.PAPIER,LocalDate.now(),4,317);
        System.out.println(livreC);

        //bibliotheque.Auteur null et valeur par défaut de l'bibliotheque.Auteur
        Ouvrage livreA1 = new OuvragePapier("Titre assez long", null, Ouvrage.Format.PAPIER,LocalDate.now(),20,120);
        System.out.println(livreA1);
        //bibliotheque.Auteur fonctionnel
        Ouvrage livre1 = new OuvrageAudio("Tout va bien", albertine, Ouvrage.Format.AUDIO,null,3,6, OuvrageAudio.FormatAudio.NUMERIQUE);
        System.out.println(livre1);

        //Date null et valeur par défaut de la date
        livre1.setDate(null);
        System.out.println(livre1);
        livre1.setDate(LocalDate.now().minusYears(5));
        System.out.println(livre1);

        //Test de la validation sur le nb d'exemplaires (valide et non valide)
        Ouvrage livre2 = new OuvragePapier("Tout va bien", albertine, Ouvrage.Format.PAPIER, LocalDate.now(), -10,190);
        System.out.println(livre2);

        livre2 = new OuvrageVideo("Tout va bien", albertine, Ouvrage.Format.VIDEO, LocalDate.now(), 20,7,3.4);
        System.out.println(livre2);

        System.out.println("\n-----Tests des méthodes acheter et vendre-----------");

        Ouvrage livre3 = new OuvrageAudio("Musique du hasard", new Auteur("Paul", "Auster", new Pays("Etats-Unis", "USA")), Ouvrage.Format.AUDIO, LocalDate.now(), 5,12, OuvrageAudio.FormatAudio.ANALOGIQUE);
        System.out.println(livre3);

        livre3.acheter(5);
        System.out.println(livre3);

        System.out.println("On peut vendre 8 livres? " + livre3.vendre(8));
        System.out.println(livre3);

        System.out.println("On peut vendre 10 livres? " + livre3.vendre(10));
        System.out.println(livre3);

        Ouvrage livre4 = new OuvrageVideo("Test", new Auteur("A", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.VIDEO, LocalDate.now(), 5,30,4.5);

        System.out.println("\n-----Tests de la  méthode equals()-----------");
        //Deux ouvrages égaux
        Ouvrage livre5 = new OuvragePapier("Test", new Auteur("A", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, null, 5,467);
        Ouvrage livre6 = new OuvragePapier("Test", new Auteur("A", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, LocalDate.now(), 10,600);
        //Un qui ne l'est pas
        Ouvrage livre7 = new OuvragePapier("Test", new Auteur("Z", "B", new Pays("Etats-Unis", "USA")), Ouvrage.Format.PAPIER, LocalDate.now(), 5,578);

        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre5));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + livre4.equals(livre6));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(livre7));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(john));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals(null));
        System.out.println("Test de la méthode equals d'bibliotheque.Ouvrage:" + !livre4.equals("Test"));
    }


    private void testTrouver() {
        Librairie bibliotheque = new Librairie();
        Auteur john = bibliotheque.getAuteurs().get(1);

        System.out.println("\n-----Test de votre méthode trouverOuvrage-----------");
        List<Ouvrage> resultat = bibliotheque.trouverOuvrages(new Auteur("Albertine", "Tremblay", new Pays("Canada", "CAD")));
        System.out.println("Livres de albertine: " + resultat);

        resultat = bibliotheque.trouverOuvrages(john);
        System.out.println("Livres de john: " + resultat);

        resultat = bibliotheque.trouverOuvrages(new Auteur("Jacques", "Beaulieu", new Pays("France", "FRA")));
        System.out.println("Livres de Jacques: " + resultat);

        System.out.println();
    }

    // creation des pays
    public void testCreationPays() {

        System.out.println("==== AFFICHAGE PAYS ======");
        // ==== CRÉATION DES PAYS =====
        Pays pays = new Pays("Canada", "HELLO");
        Pays pays1 = new Pays("Etats-Unis", "MIA");

        // ===== CRÉATION DES AUTEURS ====
        Auteur auteur1 = new Auteur("Ali", "Mohamend", pays);
        Auteur auteur2 = new Auteur("Bob", "Jeans", pays1);

        // ==== ATTRIBUTION DE SETPAYSORIGINE À UN AUTEUR ====
        auteur1.setPaysOrigine(pays);
        auteur2.setPaysOrigine(pays1);

        // === AFFICHAGE DE PAYS D'UN AUTEUR ====
        System.out.println(auteur1);
        System.out.println(auteur2);


        System.out.println();
    }

    // Création d'une série, en ajoutant des ouvragses, puis enlever des ouvrages


    // ===== CRÉATION ET AJOUT DES OUVRAGES DANS UNE SÉRIE =====
    public void crerSerieEtAjouterOuvrage() {

        // ==== CRÉATION D'UNE SÉRIE ====
        List<Ouvrage> listOuvrage = new ArrayList<>(List.of());
        Serie serie1 = new Serie(listOuvrage, "Romans");
        Serie serie2 = new Serie(listOuvrage, "Journaux");

        // === CRÉATION DES PAYS ===
        Pays pays1 = new Pays("Canada","CAN");
        Pays pays2 = new Pays("Cameroun","CMR");


        // ===CREATION DES AUTEURS ===
        Auteur auteur1 = new Auteur("Parfait", "Antoine", pays1);
        Auteur auteur2 = new Auteur("Joseph", "Ignace", pays2);

        // ==== CRÉATION DES OUVRAGES ====
        Ouvrage ouvrage1 = new OuvrageVideo("Disque d'or", auteur1, Ouvrage.Format.VIDEO,10,4.0);
        Ouvrage ouvrage2 = new OuvragePapier("Livre de l'année", auteur2, Ouvrage.Format.PAPIER,920);
        Ouvrage ouvrage3 = new OuvrageAudio("Le Figarot", auteur1, Ouvrage.Format.AUDIO,3, OuvrageAudio.FormatAudio.ANALOGIQUE);
        Ouvrage ouvrage4 = new OuvrageAudio("CNN", auteur2, Ouvrage.Format.AUDIO,6, OuvrageAudio.FormatAudio.NUMERIQUE);

        System.out.println("====== AFFICHAGE DES SERIES ======");
        // ==== PREMIÈRE SÉRIE ===
        listOuvrage.add(ouvrage1);
        listOuvrage.add(ouvrage2);
        System.out.println(serie1);

        // === DEUXIÈME SÉRIE ===
        listOuvrage.add(ouvrage3);
        listOuvrage.add(ouvrage4);
        System.out.println(serie2);
        System.out.println();
    }

    //===== ENLEVER DES SÉRIES =====
    public void enleverOuvrage() {
        List<Ouvrage> listOuvrage = new ArrayList<>(List.of());
        Serie serie1 = new Serie(listOuvrage, "Romans");

        Pays pays1 = new Pays("Canada","CAN");
        Pays pays2 = new Pays("Cameroun","CMR");

        Auteur auteur1 = new Auteur("Parfait", "Antoine", pays1);
        Auteur auteur2 = new Auteur("Joseph", "Ignace", pays2);

        Ouvrage ouvrage1 = new OuvrageVideo("Le Figarot", auteur1,16,5.6);
        Ouvrage ouvrage2 = new OuvrageAudio("CNN", auteur2,20, OuvrageAudio.FormatAudio.ANALOGIQUE);

        System.out.println("====== ENLEVER DES OUVRAGES ======");
        // ==== ENLEVER OUVRAGE1 DANS SÉRIE1 ===
        listOuvrage.add(ouvrage1);
        listOuvrage.add(ouvrage2);
        listOuvrage.remove(ouvrage1);
        System.out.println(serie1);
        System.out.println();

    }

}

