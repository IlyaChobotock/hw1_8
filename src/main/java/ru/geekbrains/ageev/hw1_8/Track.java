package ru.geekbrains.ageev.hw1_8;

public class Track implements Challenge {
    // Название дистанции бега
    private String nameChallenge;
    // Длина дистанции бега
    private int distance;

    // Конструктор дистанции бега
    public Track(String nameChallenge, int distance) {
        this.nameChallenge = nameChallenge;
        this.distance = distance;
    }

    // Метод, через который просим участника пробежать дистанцию
    // Таким образом связываем участника с препятствием
    @Override
    public void letsGo(Participant p) {
        p.run(distance);
    }
}
