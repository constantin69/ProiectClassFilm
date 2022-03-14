import java.util.ArrayList;

public class Muzical<Actor> extends Film {
    ArrayList<Actor> actor = new ArrayList<>();

    String numeActor;
    String abilitatiDans;
    String abilitatiCantat;

    public Actor(String titlul, String regizor, double buget, String numeActor, String abilitatiDans, String abilitatiCantat) {
        super(titlul, regizor, buget);
        this.numeActor = numeActor;
        this.abilitatiDans = abilitatiDans;
        this.abilitatiCantat = abilitatiCantat;

    }

    public void listaFilm() {
        System.out.print("Filmul: " + titlul + " este regizat de regizorul: " + regizor + " are un buget de: " + buget + " Euro");
        System.out.print(" nume actor " + numeActor + " informatii despre dans: " + abilitatiDans + " si informatii despre cantat: " + abilitatiCantat + "\n");
    }
}
