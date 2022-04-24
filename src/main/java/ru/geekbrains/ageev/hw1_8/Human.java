package ru.geekbrains.ageev.hw1_8;

// Класс Человек, который не наследуется от одного класса с остальными

public class Human implements Participant {

    // Имя человека
    private String name;
    // Максимальная дистанция бега человека
    private int maxRun;
    // Максимальная высота прыжка человека
    private int maxJump;
    // "Флаг", показывающий сошел с дистанции человек или нет
    private boolean onChallenge;

    // Конструктор человека. "Флаг" по умолчанию true, поэтому его не передаем в конструктор
    public Human(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onChallenge = true;
    }

    // Переопределенный метод прыжка с выполнением проверки и "Флагом"
    @Override
    public void jump(int distance) {
        if (maxJump >= distance){
            System.out.printf("%s прыгнул(а) на %d метра(ов)\n", name, distance);
        } else {
            System.out.printf("%s не смог(ла) прыгнуть на %d метра(ов)\n", name, distance);
            onChallenge = false;
        }
    }

    // Переопределенный метод бега с выполнением проверки и "Флагом"
    @Override
    public void run(int distance) {
        if (maxRun >= distance){
            System.out.printf("%s пробежал(а) %d метра(ов)\n", name, distance);
        } else {
            System.out.printf("%s не смог(ла) пробежать %d метра(ов)\n", name, distance);
            onChallenge = false;
        }
    }

    // Переопределенный метод проверки "Флага"
    @Override
    public boolean isOnChallenge() {
        return onChallenge;
    }

    // Переопределенный метод вывода информации выбыл человек или нет
    @Override
    public void info() {
        if (onChallenge){
            System.out.printf("%s прошёл(ла) всю дистанцию!\n", name);
        } else {
            System.out.printf("%s сошёл(ла) с дистанции...\n", name);
        }
    }
}
