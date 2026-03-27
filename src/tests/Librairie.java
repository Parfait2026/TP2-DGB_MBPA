package tests;

import livres.*;

import java.time.LocalDate;
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

        ouvrages.add(new OuvrageVideo("Fille sensible", john, Ouvrage.Format.VIDEO, LocalDate.now(), 3,10,1));
        ouvrages.add(new OuvragePapier("Ma vie de demain", albertine, Ouvrage.Format.PAPIER, LocalDate.now(), 50,25));
        ouvrages.add(new OuvrageAudio("Vient", john, Ouvrage.Format.AUDIO, null, 125,5, OuvrageAudio.FormatAudio.NUMERIQUE));
        ouvrages.add(new OuvrageAudio("Yaoundé ma ville", john, Ouvrage.Format.AUDIO, LocalDate.now(), 34,3, OuvrageAudio.FormatAudio.ANALOGIQUE));
        ouvrages.add(new OuvragePapier("Journal de bord", albertine,Ouvrage.Format.PAPIER, LocalDate.now(), 70,16));
        ouvrages.add(new OuvragePapier("Avis de recherche", john, Ouvrage.Format.PAPIER, null, 1, 18));
        ouvrages.add(new OuvrageVideo("Grand et petit", john, Ouvrage.Format.VIDEO, LocalDate.now(), 17,3,6));
        ouvrages.add(new OuvrageVideo("Mon plan", albertine,Ouvrage.Format.VIDEO, null, 78,6,3));
        ouvrages.add(new OuvrageAudio("Avion de chasse", john,Ouvrage.Format.AUDIO, LocalDate.now(), 24,5, OuvrageAudio.FormatAudio.NUMERIQUE));
        ouvrages.add(new OuvrageVideo("Cégep", jean, Ouvrage.Format.VIDEO, LocalDate.now(),1,82,36));
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
