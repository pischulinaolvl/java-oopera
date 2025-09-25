import java.util.Objects;

public class Actor extends Person{
    public int height;      // Рост

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.setHeight(height);
    }

    @Override
    public String toString() {
        return super.toString() + "(" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height && name.equals(actor.getName()) && surname.equals(actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
