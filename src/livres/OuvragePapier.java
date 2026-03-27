package livres;

import java.time.LocalDate;

public class OuvragePapier extends Ouvrage {
    private int nombrePages;


    public OuvragePapier(String titre, Auteur auteur, Format type, LocalDate date, int nombreExemplaires, int nombrePages) {
        super(titre, auteur, type, date, nombreExemplaires);
        this.nombrePages = nombrePages;
    }

    public OuvragePapier(String titre, Auteur auteur, Format type, int nombrePages) {
        super(titre, auteur, type);
        this.nombrePages = nombrePages;
    }

    public OuvragePapier(String titre, Auteur auteur, int nombrePages) {
        super(titre, auteur);
        this.nombrePages = nombrePages;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    @Override
    public String toString() {
        return super.toString() + " NombreDePages: " + nombrePages;
    }
}
