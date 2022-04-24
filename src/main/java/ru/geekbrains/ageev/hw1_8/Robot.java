package ru.geekbrains.ageev.hw1_8;

// Класс Робот, который не наследуется от одного класса с остальными

public class Robot implements Participant {

    // Имя робота
    private String name;
    // Максимальная высота бега робота
    private int maxRun;
    // Максимальная высота прыжка робота
    private int maxJump;
    // "Флаг", показывающий сошел с дистанции робот или нет
    private boolean onChallenge;

    // Конструктор робота. "Флаг" по умолчанию true, поэтому его не передаем в конструктор
    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.onChallenge = true;
    }

    // Переопределенный метод прыжка с выполнением проверки и "Флагом"
    @Override
    public void jump(int distance) {
        if (maxJump >= distance){
            System.out.printf("Робот %s прыгнул на %d метра(ов)\n", name, distance);
        } else {
            System.out.printf("Робот %s не смог прыгнуть на %d метра(ов)\n", name, distance);
            onChallenge = false;
        }
    }

    // Переопределенный метод бега с выполнением проверки и "Флагом"
    @Override
    public void run(int distance) {
        if (maxRun >= distance){
            System.out.printf("Робот %s пробежал %d метра(ов)\n", name, distance);
        } else {
            System.out.printf("Робот %s не смог пробежать %d метра(ов)\n", name, distance);
            onChallenge = false;
        }
    }

    // Переопределенный метод проверки "Флага"
    @Override
    public boolean isOnChallenge() {
        return onChallenge;
    }

    // Переопределенный метод вывода информации выбыл робот или нет
    @Override
    public void info() {
        if (onChallenge){
            System.out.printf("Робот %s прошёл всю дистанцию!\n", name);
        } else {
            System.out.printf("Робот %s сошёл с дистанции...\n", name);
        }
    }
}
