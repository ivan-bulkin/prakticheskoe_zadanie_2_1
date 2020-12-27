package part_02.prakticheskoe_zadanie_1;

//т.к. лекция была про интерфейсы, то, видимо именно их и надо использовать при выполнении домашнего задания
//создаём класс Robot(Робот), который умеет бегать и прыгать
//методы класса просто выводят информацию о действии в консоль
public class Robot implements Jump, Run {

    protected String serialNumber;

    @Override
    public void doJump() {
        System.out.println("Робот умеет прыгать");
    }

    @Override
    public void doRun() {
        System.out.println("Робот умеет бегать");
    }

    public void ktoI() {
        System.out.println("Я Робот, s/n: " + serialNumber);
    }

    public static void main(String[] args) {

        Robot robot = new Robot();
        robot.doJump();
        robot.doRun();
    }
}
