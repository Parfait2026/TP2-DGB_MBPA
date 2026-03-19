package livres;

public class Pays {
    private String nomPays;
    private String codePays;
    public static final String NOM_PAYS_DEFAUT = "Inconnu";


    public Pays(String nomPays) {
        this.nomPays = nomPays;

    }

    public Pays() {
        this(NOM_PAYS_DEFAUT);
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        // validation : non nul, longueur 3, uniquement en majuscule
        if (codePays != null && codePays.matches("[A-Z]{3}")){
            this.codePays = codePays;
        }else {
            throw new IllegalArgumentException("Le code doit être exactement de 3 lettres majuscules !!!");
        }
    }
}
