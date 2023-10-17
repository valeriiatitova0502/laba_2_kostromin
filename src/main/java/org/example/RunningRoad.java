package org.example;

public class RunningRoad implements Challenge {
    // Название дорожки
    String name;

    // Конструктор класса RunningRoad
    public RunningRoad(RoadLenght roadLenght) {
        this.name = roadLenght.getTitle();  // Получаем название дистанции из объекта roadLenght и сохраняем в переменную name
        this.roadLength = roadLenght.getLenght(); // Получаем длину дистанции из объекта roadLenght и сохраняем в переменную roadLength
    }

    // Длина дорожки
    int roadLength;

    // Реализация метода isCan интерфейса Challenge
    @Override
    public boolean isCan(Participant participant) {
        // Проверяем, может ли участник participant пробежать дорожку длиной roadLength
        if (participant.run(roadLength)) {
            return true; // Возвращаем true, если участник пробежал дорожку успешно
        } else {
            return false; // Возвращаем false, если участник не смог пробежать дорожку
        }
    }
}