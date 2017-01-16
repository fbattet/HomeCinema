/**
 * Created by association on 16/01/17.
 */
public class TestHomeCinema {
    public static void main(String[] args) {
        // instanciation des composants
        Amplificateur amp = new Amplificateur();
        Tuner tuner = new Tuner();
        LecteurDvd dvd = new LecteurDvd(amp);
        LecteurCd cd = new LecteurCd(amp);
        Projecteur projecteur = new Projecteur();
        Ecran ecran = new Ecran();
        Lumieres lumieres = new Lumieres();
        MachineAPopcorn machineAPopcorn = new MachineAPopcorn();

        FacadeHomeCinema homeCinema = new FacadeHomeCinema(
                amp, tuner, dvd, cd, projecteur, lumieres, ecran, machineAPopcorn);
        homeCinema.regarderFilm("Hotel du Nord");
        homeCinema.arreterFilm();
    }
}
