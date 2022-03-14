public class Documentar extends Film {
    int nrEpisoade;
    String descriere;

    Documentar() {
        nrEpisoade = 0;
    }

    public Documentar(String titlul, String regizor, double buget, int nrEpisoade, String descriere) {
        super(titlul,regizor,buget);
        this.nrEpisoade = nrEpisoade;
        this.descriere = descriere;
    }

    public void listaFilm() {
        System.out.println("Filmul: " + titlul + " este regizat de regizorul: " + regizor + " are un buget de: " + buget + " Euro" + " numar de episoade " + nrEpisoade + " o descriere " + descriere);
    }


}
