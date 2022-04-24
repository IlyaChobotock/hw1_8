package ru.geekbrains.ageev.hw1_8;

public class Wall implements Challenge {

    // Название стены для перепрыгивания
    private String nameChallenge;
    // Высота стены для перепрыгивания
    private int distance;

    // Конструктор стены для перепрыгивания
    public Wall(String nameChallenge, int distance) {
        this.nameChallenge = nameChallenge;
        this.distance = distance;
    }

    // Метод, через который просим участника перепрыгнуть через стену
    // Таким образом связываем участника с препятствием
    @Override
    public void letsGo(Participant p) {
        p.jump(distance);
    }
}
