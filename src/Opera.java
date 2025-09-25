import java.util.ArrayList;

public class Opera extends MusicalShow{
    public int choirSize; // количество человек в хоре

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
