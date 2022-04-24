package ru.geekbrains.ageev.hw1_8;

interface Participant {
    // Метод для прыжка
    void jump(int distance);
    // Метод для бега
    void run(int distance);
    // Метод проверки участника выбыл или не выбыл из соревнования
    boolean isOnChallenge();
    // Метод для вывода в консоль итога соревнования (выбыл или прошел все препятствия)
    void info();
}
