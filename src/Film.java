import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Film {
    public String titlul;
    public String regizor;
    public double buget;

    Film() {
    }

    public Film(String titlul, String regizor, double buget) {
        this.titlul = titlul;
        this.regizor = regizor;
        this.buget = buget;
    }

    public void listaFilm() {
        System.out.println("Filmul: " + titlul + " este regizat de regizorul: " + regizor + " are un buget de: " + buget + " Euro");
    }

    public static double bugetMax(ArrayList<Film> filme) {
        double max = 0;

        for (var film : filme) {
            if (film.getClass() == Film.class) {
                if (film.buget > max) {
                    max = film.buget;
                }
            }
        }
        return max;
    }

}
