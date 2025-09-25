public class Person {
    public String name;     // Имя
    public String surname;  // Фамилия
    public Gender gender;   // Пол

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
