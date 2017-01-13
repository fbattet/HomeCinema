/**
 * Created by association on 13/01/17.
 */
public class Amplificateur {
    private Tuner tuner;
    private LecteurDvd lecteurDvd;
    private LecteurCd lecteurCd;
    private int volume;

    public void marche() {
        System.out.println("Amplificateur allumé");
    }

    public void arret() {
        System.out.println("Amplificateur eteint");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvd(LecteurDvd lecteurDvd) {
        this.lecteurDvd = lecteurDvd;
    }

    public void setLecteurCd(LecteurCd lecteurCd) {
        this.lecteurCd = lecteurCd;
    }

    public void setSonStereo() {
        System.out.println("Son stéréo");
    }

    public void setSonSurround() {
        System.out.println("Son surround");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
