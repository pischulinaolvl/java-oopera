import java.util.Objects;

public class Person {
    protected String name;     // Имя
    protected String surname;  // Фамилия
    protected Gender gender;   // Пол

    public Person(String name, String surname, Gender gender) {
        this.setName(name);
        this.setSurname(surname);
        this.setGender(gender);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.getName()) && Objects.equals(surname, person.getSurname()) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
