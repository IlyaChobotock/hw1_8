package ru.geekbrains.ageev.hw1_8;

public class HomeWork1_8 {

    public static void main(String[] args) {

        // Массив участников соревнования
        Participant[] participants = {
                new Human("Петя", 1500, 2),
                new Cat("Пушок", 2000, 3),
                new Robot("Т1000", 5000, 6),
                new Human("Зоя", 1800, 1),
                new Cat("Барсик", 2500, 4),
                new Robot("Т2222", 6300, 8)
        };

        // Массив препятствий
        Challenge[] challenges = {
                new Wall("Стена 1", 2),
                new Track("Беговая дорожка 2", 1000),
                new Wall("Стена 2", 1),
                new Track("Беговая дорожка 1", 2200)
        };

        // Каждого участника просим пройти все препятствия. Если не может пройти - break
        for (Participant p : participants) {
            for (Challenge c : challenges) {
                c.letsGo(p); // Здесь просим конкретного участника пройти конкретное препятствие
                if (!p.isOnChallenge()){
                    break;
                }
            }
        }

        // Немного "красоты" для вывода итоговой информации о прохождении препятствий
        System.out.println("=====================================");
        System.out.println("Итоги соревнования:");
        System.out.println("=====================================");

        // Сам вывод информации о прохождении препятствий всеми участниками
        for (Participant p : participants) {
            p.info();
        }
    }
}
