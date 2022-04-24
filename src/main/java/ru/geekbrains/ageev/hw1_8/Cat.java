package ru.geekbrains.ageev.hw1_8;

// Класс Кот, который не наследуется от одного класса с остальными

public class Cat implements Participant {

    // Имя кота
    private String name;
    // Максимальная дистанция бега кота
    private int maxRun;
    // Максимальная высота прыжка кота
    private int maxJump;
    // "Флаг", показывающий сошел с дистанции кот или нет
    private boolean onChallenge;

    // Конструктор кота. "Флаг" по умолчанию true, поэтому его не передаем в конструктор
    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onChallenge = true;
    }

    // Переопределенный метод прыжка с выполнением проверки и "Флагом"
    @Override
    public void jump(int distance) {
        if (maxJump >= distance){
            System.out.printf("Кот %s прыгнул на %d метра(ов)\n", name, distance);
        } else {
            System.out.printf("Кот %s не смог прыгнуть на %d метра(ов)\n", name, distance);
            onChallenge = false;
        }
    }

    // Переопределенный метод бега с выполнением проверки и "Флагом"
    @Override
    public void run(int distance) {
        if (maxRun >= distance){
            System.out.printf("Кот %s пробежал %d метра(ов)\n", name, distance);
        } else {
            System.out.printf("Кот %s не смог пробежать %d метра(ов)\n", name, distance);
            onChallenge = false;
        }
    }

    // Переопределенный метод проверки "Флага"
    @Override
    public boolean isOnChallenge() {
        return onChallenge;
    }

    // Переопределенный метод вывода информации выбыл кот или нет
    @Override
    public void info() {
        if (onChallenge){
            System.out.printf("Кот %s прошёл всю дистанцию!\n", name);
        } else {
            System.out.printf("Кот %s сошёл с дистанции...\n", name);
        }
    }
}
