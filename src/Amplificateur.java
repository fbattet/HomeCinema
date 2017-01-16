/**
 * Created by association on 13/01/17.
 */
public class Amplificateur {
    private Tuner tuner;
    private LecteurDvd lecteurDvd;
    private LecteurCd lecteurCd;
    private int volume;

    public void marche() {
        System.out.println("[Amplificateur] Amplificateur allumé");
    }

    public void arret() {
        System.out.println("[Amplificateur] Amplificateur eteint");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvd(LecteurDvd lecteurDvd) {
        System.out.println("[Amplificateur] Mode DVD");
        this.lecteurDvd = lecteurDvd;
    }

    public void setLecteurCd(LecteurCd lecteurCd) {
        System.out.println("[Amplificateur] Mode CD");
        this.lecteurCd = lecteurCd;
    }

    public void setSonStereo() {
        System.out.println("[Amplificateur] Son stéréo");
    }

    public void setSonSurround() {
        System.out.println("[Amplificateur] Son surround");
    }

    public void setVolume(int volume) {
        System.out.println("[Amplificateur] volume = " + volume);
        this.volume = volume;
    }
}
