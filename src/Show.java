import java.util.ArrayList;

public class Show {
    public String title;                    // Название
    public int duration;                    // Длительность в минутах
    public Director director;               // Режиссер
    public ArrayList<Actor> listOfActors;   // Список актеров

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printInfoAboutDirector(){
        System.out.println("Режиссёр спектакля " + title + ": " + director);
    }

    public void printInfoAboutListOfActors(){
        if (!listOfActors.isEmpty()) {
            System.out.println("Список актеров спектакля " + title + ":");
            for (Actor a:listOfActors) {
                System.out.println(a);
            }
        }
    }

    public void addActor(Actor newActor){
        if (listOfActors.contains(newActor)) {
            System.out.println("Данный актер уже есть в списке.");
        }
        else {
            listOfActors.add(newActor);
            System.out.println("Актер добавлен в список актеров.");
        }
    }

    public void replaceActor(Actor newActor, String oldSurname){
        int index = -1;
        int count = 0;

        if (listOfActors.isEmpty()){
            System.out.println("Список актеров был пуст. Замена актера не была выполнена.");
        }
        else {
            for (int i = 0; i < listOfActors.size(); i++) {
                if (listOfActors.get(i).surname.equals(oldSurname)){
                    index = i;
                    count = count + 1;
                }
            }

            if (count == 0) {
                System.out.println("В списке актеров не найден актер с заданной фамилией. Замена актера не была выполнена.");
            }
            else if (count > 1) {
                System.out.println("Найдено несколько актеров с данной фамилией. Замена актера не была выполнена.");
            }
            else {
                listOfActors.remove(index);
                listOfActors.add(newActor);
                System.out.println("Произошла замена актера в списке  актеров");
            }
        }
    }
}
