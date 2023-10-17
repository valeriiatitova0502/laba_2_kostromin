package org.example;

public class Main {

    public static void main(String[] args) {
        Participant[] participants = {
                new Robot(7, 300, "Валли"),
                new Robot(9,200,"Ева"),
                new Robot(5,250,"Сатир"),
                new Cat(5, 350, "Путин"),
                new Human(2, 550, "Владимир"),




        };
        Challenge[] challenges = {
                new RunningRoad(RoadLenght.HIGH),
                new Wall(WallHeight.LOW),
                new RunningRoad(RoadLenght.MEDIUM),
                new Wall(WallHeight.MEDIUM),
                //new RunningRoad(RoadLenght.HIGH),
                //new Wall(WallHeight.HIGH),

        };

        for(Participant p: participants) {
            for (Challenge c: challenges) {
                if (!c.isCan(p)) break;
            }
        }
    }
}