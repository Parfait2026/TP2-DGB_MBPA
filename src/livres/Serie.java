package livres;

import java.util.List;

public class Serie {

    private String nom;
    private List<Ouvrage> listeOuvrages;

    public Serie(List<Ouvrage> listeOuvrages, String nom) {
        this.listeOuvrages = listeOuvrages;
        this.nom = nom;
    }

    public List<Ouvrage> getListeOuvrages() {
        return listeOuvrages;
    }

    public void setListeOuvrages(List<Ouvrage> listeOuvrages) {
        this.listeOuvrages = listeOuvrages;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
