/**
 * Created by association on 13/01/17.
 */
public class Tuner {
    Amplificateur amplificateur;
    int sequence;

    public void marche() {
        System.out.println("Amplificateur allumée");
    }

    public void arret() {
        System.out.println("Amplificateur éteint");
    }

    public void setAm() {
        System.out.println("Bande AM");
    }

    public void setFm() {
        System.out.println("Bande FM");
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
        System.out.println("Séquence = " + sequence);
    }
}
