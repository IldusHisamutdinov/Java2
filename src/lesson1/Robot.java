package lesson1;

public class Robot implements Rival{

    final String typeTreadmill = "Treadmill";   //Тип препятствия дорога
    final String typeWall = "Wall";             //Тип препятствия стена

    protected String name;                      //Имя участника
    protected double jump;                 //Предел прыжка участника
    protected double run;                  //Предел бега участника
    protected boolean isActive = true;          //Статус финиширования участника

    public Robot(String name, double jump, double run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }

    public void makeActive(Obstacle obstruction){
        boolean result = true;
        if (obstruction.getType().equals(typeTreadmill)){
            if (!run(obstruction.getSize())){
                System.out.println("Робот " + this.name + " выбывает !");
                result = false;
            }
        }
        else if (obstruction.getType().equals(typeWall)){
            if (!jump(obstruction.getSize())){
                System.out.println("Робот " + this.name + " выбывает !");
                result = false;
            }
        }
        this.isActive = result;
    }

    private boolean run (double size) {
        boolean result = false;
        if (size < this.run){
            System.out.println("Робот " + this.name + " пробежал: " + size);
            result = true;
        } else {
            System.out.println("Робот " + this.name + " не может пробежать " + size + ". Предел: " + this.run);
        }
        return result;
    }

    private boolean jump (double size) {
        boolean result = false;
        if (size < this.jump){
            System.out.println("Робот " + this.name + " перепрыгнул: " + size);
            result = true;
        } else {
            System.out.println("Робот " + this.name + " не может перепрыгнуть: " + size + ". Предел: " + this.jump);
        }
        return result;
    }
}
