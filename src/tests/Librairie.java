package tests;

import livres.Auteur;
import livres.Ouvrage;
import livres.Pays;

import java.util.ArrayList;
import java.util.List;

public class Librairie {
    private List<Auteur> auteurs  = new ArrayList<>();
    private List<Ouvrage> ouvrages = new ArrayList<>();

    public Librairie(){
        // création des objects Pays
        Pays pays = new Pays("Canada","MHG");
        Pays pays1 = new Pays("Etats-Unis","GHQ");
        Pays pays2 = new Pays("Suisse","HG");

        Auteur albertine = new Auteur("Albertine", "Tremblay", pays);
        Auteur john = new Auteur("John", "Smith", pays1);
        Auteur jean = new Auteur("Jean", "Némarre", pays2);
        auteurs.add(albertine);
        auteurs.add(john);
        auteurs.add(jean);

        ouvrages.add(new Ouvrage("Titre 1", john));
        ouvrages.add(new Ouvrage("Titre 2", albertine));
        ouvrages.add(new Ouvrage("Titre 3", john));
        ouvrages.add(new Ouvrage("Titre 4", john));
        ouvrages.add(new Ouvrage("Titre 5", albertine));
        ouvrages.add(new Ouvrage("Titre 6", john));
        ouvrages.add(new Ouvrage("Titre 7", john));
        ouvrages.add(new Ouvrage("Titre 8", albertine,Ouvrage.Format.VIDEO));
        ouvrages.add(new Ouvrage("Titre 9", john,Ouvrage.Format.AUDIO));
        ouvrages.add(new Ouvrage("Titre 10", jean));
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public List<Ouvrage> getOuvrages() {
        return ouvrages;
    }

    public List<Ouvrage> trouverOuvrages(Auteur auteur) {
        //ATTENTION il faut implémenter equals dans auteur pour que ca marche!!!!!
        int count = 0;

        List<Ouvrage> trouves = new ArrayList<>();
        for (Ouvrage ouvrage : ouvrages) {
            if (ouvrage.getAuteur().equals(auteur)) {
                trouves.add(ouvrage);
            }
        }

        return trouves;
    }
}
