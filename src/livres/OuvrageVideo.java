package livres;

import java.time.LocalDate;

public class OuvrageVideo extends Ouvrage{
    private int durerMinutes;
    private  double tailleMb;

    public OuvrageVideo(String titre, Auteur auteur, Format type, LocalDate date, int nombreExemplaires, int durerMinutes, double tailleMb) {
        super(titre, auteur, type, date, nombreExemplaires);
        this.durerMinutes = durerMinutes;
        this.tailleMb = tailleMb;
    }

    public OuvrageVideo(String titre, Auteur auteur, Format type, int durerMinutes, double tailleMb) {
        super(titre, auteur, type);
        this.durerMinutes = durerMinutes;
        this.tailleMb = tailleMb;
    }

    public OuvrageVideo(String titre, Auteur auteur, int durerMinutes, double tailleMb) {
        super(titre, auteur);
        this.durerMinutes = durerMinutes;
        this.tailleMb = tailleMb;
    }

    public int getDurerMinutes() {
        return durerMinutes;
    }

    public void setDurerMinutes(int durerMinutes) {
        this.durerMinutes = durerMinutes;
    }

    public double getTailleMb() {
        return tailleMb;
    }

    public void setTailleMb(double tailleMb) {
        this.tailleMb = tailleMb;
    }

    @Override
    public String toString() {
        return super.toString() + " Durée: " + durerMinutes + " min, TailleMb: " +tailleMb;
    }
}
