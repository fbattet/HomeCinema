/**
 * Created by association on 13/01/17.
 */
public class LecteurCd {
    Amplificateur amplificateur;

    public LecteurCd(Amplificateur amplificateur) {
        this.amplificateur = amplificateur;
    }

    public void marche() {
        System.out.println("Lecteur CD allumée");
    }

    public void arret() {
        System.out.println("Lecteur CD éteint");
    }

    public void ejecter() {
        System.out.println("CD éjecté");
    }

    public void pause() {
        System.out.println("Lecteur CD en pause");
    }

    public void jouer() {
        System.out.println("Lecture CD");
    }

    public void stop() {
        System.out.println("DVD stoppé");
    }
}


