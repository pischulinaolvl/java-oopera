public class Director extends Person {
    public int numberOfShows;  // Количество поставленных спектаклей

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }
}

