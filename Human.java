package part_02.prakticheskoe_zadanie_1;

//т.к. лекция была про интерфейсы, то, видимо именно их и надо использовать при выполнении домашнего задания
//создаём класс Human(Человек), который умеет бегать и прыгать
//методы класса просто выводят информацию о действии в консоль
public class Human implements Jump, Run {

    protected String name;

    @Override
    public void doJump() {
        System.out.println("Человек умеет прыгать");
    }

    @Override
    public void doRun() {
        System.out.println("Человек умеет бегать");
    }

    public void ktoI() {
        System.out.println("Я Человек: " + name);
    }

    public static void main(String[] args) {

        Human human = new Human("");
        human.doJump();
        human.doRun();
    }

    public Human(String name) {
        this.name = name;
    }

    //Это конструктор по-умолчанию
    public Human() {
    }

/*    public boolean run;
    public boolean jump;

    public Human(boolean run, boolean jump) {
        this.run = run;
        this.jump = jump;
    }*/
}
