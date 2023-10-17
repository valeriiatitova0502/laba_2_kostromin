package org.example;

public class Wall implements Challenge{
    private int wallHeight;

    // Конструктор класса Wall
    public Wall(WallHeight wallHeight) {
        this.height = wallHeight.getHeight(); // Получаем высоту стены из объекта wallHeight и сохраняем в переменную height
        this.title = wallHeight.getTitle(); // Получаем название стены из объекта wallHeight и сохраняем в переменную title
    }

    int height;
    String title;

    @Override
    public boolean isCan(Participant participant) {
        // Проверяем, может ли участник participant перепрыгнуть стену высотой height
        if (participant.jump(height)) {
            return true; // Возвращаем true, если участник успешно перепрыгнул стену
        } else {
            return false; // Возвращаем false, если участник не смог перепрыгнуть стену
        }
    }
}