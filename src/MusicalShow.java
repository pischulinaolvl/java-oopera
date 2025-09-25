import java.util.ArrayList;

public class MusicalShow extends Show{
    protected Person musicAuthor; // в моем тз не было указания на protected. с этим вопросом в поддержку?
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText(){
        System.out.println("Текст либретто для " + title + ":" + librettoText);
    }
}
