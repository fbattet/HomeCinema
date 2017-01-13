/**
 * Created by association on 13/01/17.
 */
public class LecteurDvd {
    Amplificateur amplificateur;

    public LecteurDvd(Amplificateur amplificateur) {
        this.amplificateur = amplificateur;
    }

    public void marche() {
        System.out.println("Lecteur DVD allumée");
    }

    public void arret() {
        System.out.println("Lecteur DVD éteint");
    }

    public void ejecter() {
        System.out.println("DVD éjecté");
    }

    public void pause() {
        System.out.println("Lecteur DVD en pause");
    }

    public void jouer() {
        System.out.println("Lecture DVD");
    }

    public void jouer(String film) {
        System.out.println("Lecture DVD : " + film);
    }

    public void setAudioSurround() {
        amplificateur.setSonSurround();
        System.out.println("Audio Surround");
    }

    public void setAudioStereo() {
        amplificateur.setSonStereo();
        System.out.println("Audio Stéréo");
    }

    public void stop() {
        System.out.println("DVD stoppé");
    }
}


