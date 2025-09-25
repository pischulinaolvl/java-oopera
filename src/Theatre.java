import java.util.ArrayList;

public class Theatre {

    /*Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
    Создать три спектакля: обычный, оперный и балет
    Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль. Один актёр может участвовать в нескольких спектаклях.
    Для каждого спектакля выведите на экран список актёров.
    Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров.
    Попробуйте заменить в другом спектакле несуществующего актёра
    Для оперного и балетного спектакля выведите на экран текст либретто.*/
    public static void mainTheatre(){
        Actor act1 = new Actor("Владимир", "Петров", Gender.MALE, 185);
        Actor act2 = new Actor("Екатерина", "Климова", Gender.FEMALE, 175);
        Actor act3 = new Actor("Гоша", "Куценко", Gender.MALE, 190);

        Director dir1 = new Director("Антонио", "Рыбаков", Gender.MALE, 5);
        Director dir2 = new Director("Алексей", "Балабанов", Gender.MALE, 13);

        Person author = new Person("Полина", "Гагарина", Gender.FEMALE);
        Person choreographer = new Person("Ольга", "Попова", Gender.FEMALE);

        Show show = new Show("Love letters", 90,dir2,new ArrayList<>());
        show.addActor(act2);
        show.addActor(act3);

        Opera opera = new Opera("Травиатта", 120, dir1,new ArrayList<>(), author, "Text 11111111111", 13);
        opera.addActor(act1);
        opera.addActor(act2);
        opera.addActor(act3);
        opera.addActor(act3);

        Ballet ballet = new Ballet("Травиатта", 120, dir1,new ArrayList<>(), author, "Text 2222222222", choreographer);

        show.printInfoAboutListOfActors();
        opera.printInfoAboutListOfActors();
        ballet.printInfoAboutListOfActors();

        show.replaceActor(act1, "Куценко");
        ballet.replaceActor(act1, "Куценко");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
