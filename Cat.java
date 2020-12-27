package part_02.prakticheskoe_zadanie_1;

//т.к. лекция была про интерфейсы, то, видимо именно их и надо использовать при выполнении домашнего задания
//создаём класс Cat(Кот), который умеет бегать и прыгать
//методы класса просто выводят информацию о действии в консоль
public class Cat implements Jump, Run {

    @Override
    public void doJump() {
        System.out.println("Кот умеет прыгать");
    }

    @Override
    public void doRun() {
        System.out.println("Кот умеет бегать");
    }

    public void ktoI() {
        System.out.println("Я Кот");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.doJump();
        cat.doRun();
    }
}
