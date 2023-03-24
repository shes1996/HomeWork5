import java.sql.Array;
import java.util.*;

//Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности Имени.
public class task2 {
    public static void main(String[] args) {
        String[] worker = new String[]{"Иван Иванов",
        "Светлана Петрова",
        "Кристина Белова",
        "Анна Мусина",
        "Анна Крутова",
        "Иван Юрин",
        "Петр Лыков",
        "Павел Чернов",
        "Петр Чернышов",
        "Мария Федорова",
        "Марина Светлова",
        "Мария Савина",
        "Мария Рыкова",
        "Марина Лугова",
        "Анна Владимирова",
        "Иван Мечников",
        "Петр Петин",
        "Иван Ежов",
        "Иван Петров"};
        HashMap<String, Integer> workers = new HashMap<>();
        for (int i = 0; i < worker.length; i++) {
            String name = (worker[i].split(" "))[0];
            if (workers.containsKey(name)){
                workers.put(name, workers.get(name) + 1);
            }
            else workers.put(name, 1);
        }
        System.out.println(workers.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList());
    }
}
