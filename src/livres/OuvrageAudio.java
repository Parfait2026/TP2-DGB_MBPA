package livres;

import java.time.LocalDate;

public class OuvrageAudio extends Ouvrage {

    public enum FormatAudio{
        NUMERIQUE,ANALOGIQUE;
    }

    private int durerMinute;
    private FormatAudio typeFormat ;

    public OuvrageAudio(String titre, Auteur auteur, Format type, LocalDate date, int nombreExemplaires, int durerMinute, FormatAudio typeFormat) {
        super(titre, auteur, type, date, nombreExemplaires);
        this.durerMinute = durerMinute;
        this.typeFormat = typeFormat;
    }

    public OuvrageAudio(String titre, Auteur auteur, Format type, int durerMinute, FormatAudio typeFormat) {
        super(titre, auteur, type);
        this.durerMinute = durerMinute;
        this.typeFormat = typeFormat;
    }

    public OuvrageAudio(String titre, Auteur auteur, int durerMinute, FormatAudio typeFormat) {
        super(titre, auteur);
        this.durerMinute = durerMinute;
        this.typeFormat = typeFormat;
    }

    public int getDurerMinute() {
        return durerMinute;
    }

    public void setDurerMinute(int durerMinute) {
        this.durerMinute = durerMinute;
    }

    public FormatAudio getTypeFormat() {
        return typeFormat;
    }

    public void setTypeFormat(FormatAudio typeFormat) {
        this.typeFormat = typeFormat;
    }

    @Override
    public String toString() {
        return super.toString() + "Durée: " + durerMinute + " min, TypeFormat: " + typeFormat;
    }
}
