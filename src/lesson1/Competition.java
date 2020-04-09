package lesson1;

public class Competition {

    public void startCompetition() {

        Obstacle[] obstacles = {
                new Wall(1.2),
                new Treadmill(5.8),
                new Wall(2.7),
                new Treadmill(6.8),
                new Wall(3.6),
                new Treadmill(7.8)};

        Rival[] rivals = {
                new Robot("JВ", 1.5, 5.9),
                new Man("Толик", 2.9, 6.9),
                new Cat("Мурзик", 3.7, 7.9)};

        for (Rival rival : rivals) {     //Цикл участников
            for (Obstacle obstacle : obstacles) {    //Цикл препятствий
                //Участник робот
                if (rival instanceof Robot) {
                    if (((Robot) rival).isActive) {
                        rival.makeActive(obstacle);
                    } else {
                        break;
                    }
                }
                //Участник человек
                if (rival instanceof Man) {
                    if (((Man) rival).isActive) {
                        rival.makeActive(obstacle);
                    } else {
                        break;
                    }
                }
                //Участник Кот
                if (rival instanceof Cat) {
                    if (((Cat) rival).isActive) {
                        rival.makeActive(obstacle);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}