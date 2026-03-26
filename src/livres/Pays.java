package livres;

public class Pays {
    private String nomPays;
    private String codePays;
    public static final String NOM_PAYS_DEFAUT = "Inconnu";
    public static final String CODE_PAYS_DEFAUT = "";


    public Pays(String nomPays, String codePays) {
        setNomPays(nomPays);
        setCodePays(codePays);


    }

    public Pays() {
        this(NOM_PAYS_DEFAUT, CODE_PAYS_DEFAUT);
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
        if (codePays != null && codePays.matches("[A-Z]{3}")) {
            this.codePays = codePays;
        } else {
            System.out.println("Le code doit être exactement de 3 lettres majuscules !!!");
        }
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nomPays='" + nomPays + '\'' +
                ", codePays='" + codePays + '\'' +
                '}';
    }
}
