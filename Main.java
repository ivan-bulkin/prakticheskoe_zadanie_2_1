package part_02.prakticheskoe_zadanie_1;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        privetstvieProgrammi();
        viborDeistvya();

        punkt1();
    }

    private static void punkt1() {
        //        System.out.println(Human.class);
        Human human = new Human("Иван");
        human.ktoI();
        human.doRun();
        human.doJump();
        System.out.println();
        Cat cat = new Cat();
        cat.ktoI();
        cat.doRun();
        cat.doJump();
        System.out.println();
        Robot robot = new Robot();
        robot.ktoI();
        robot.doRun();
        robot.doJump();
    }

    private static void punkt2() {
        RunningTrack p1 = new RunningTrack();
        p1.printProbejal(80);//длина дорожки задаётся в классе, передаём здесь возможности участника
        p1.printProbejal(110);//длина дорожки задаётся в классе, передаём здесь возможности участника
        Wall p2 = new Wall();
        p2.printPereprignul(1);//высота стены задаётся в классе, передаём здесь возможности участника
        p2.printPereprignul(4);//высота стены задаётся в классе, передаём здесь возможности участника
    }

    private static void punkt3() throws InterruptedException {
//создаём массив с участниками
//всего пять участников
//в первом столбце: номер участника
//значения второго столбца 1 - на сколько далеко может пробежать участник, 2 - на сколько высоко может подпрыгнуть, 0 - пока не используем
//мне было очень сложно понять, что же именно надо сделать в домашнем задании. Вожусь уже очень долго и почти дважды пересмотрел лекцию
//поэтому сделаю как-то и формально задание 3 и 4 выполнено. Ни где же в задании не бьыло сказано, как и что надо использовать для его выполнения
//3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий. - готово
//4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет. - готово
        int[][] uchastnikArray = new int[5][3];
        uchastnikArray[0][1] = 100;
        uchastnikArray[1][1] = 110;
        uchastnikArray[2][1] = 200;
        uchastnikArray[3][1] = 80;
        uchastnikArray[4][1] = 70;
        uchastnikArray[0][2] = 2;
        uchastnikArray[1][2] = 2;
        uchastnikArray[2][2] = 3;
        uchastnikArray[3][2] = 0;
        uchastnikArray[4][2] = 2;

//создаём массив с препятствиями
//всего два препятствия
//в первом столбце: номер препятствия
//значения второго столбца 1 - длина беговой дорожки, 2 - высота стены, 0 - пока не используем
        int[][] prepyatstvieArray = new int[2][3];
        prepyatstvieArray[0][1] = 50;
        prepyatstvieArray[1][1] = 150;
        prepyatstvieArray[0][2] = 1;
        prepyatstvieArray[1][2] = 2;

//Выводим на экран характеристики участников
        System.out.println("Характеристики участников:");
        for (int i = 0; i < uchastnikArray.length; i++) {
            System.out.println("Участник " + (i + 1) + ". Бег: " + uchastnikArray[i][1] + " м., Прыг: " + uchastnikArray[i][2] + " м. :-)");
        }
//Выводим на экран характеристики препятствий
        System.out.println("Характеристики препятствий:");
        for (int i = 0; i < prepyatstvieArray.length; i++) {
            System.out.println("Препятствие " + (i + 1) + ". Длина дорожки: " + uchastnikArray[i][1] + " м., Высота стены: " + uchastnikArray[i][2] + " м.");
        }
        boolean vsePrepyatsviayProideni;//переменная, которая отвечает за то, что пройдены или нет все препятствия
        System.out.println("\nЗапускаем участников через препятствия ....");
        Thread.sleep(1000);//Задержка в 1000 миллисекунд
        for (int i = 0; i < uchastnikArray.length; i++) {
            vsePrepyatsviayProideni = true;
            for (int j = 0; j < prepyatstvieArray.length; j++) {
                if (uchastnikArray[i][1] < prepyatstvieArray[j][1]) {
                    System.out.println("(Бег)Участник " + (i + 1) + ", может: " + uchastnikArray[i][1] + " м., а препятствие " + prepyatstvieArray[j][1] + " м., НЕ преодолел.");
                    System.out.println("Участник " + (i + 1) + " сошёл с дистанции.");
                    vsePrepyatsviayProideni = false;
                    break;
                } else {
                    System.out.println("(Бег)Участник " + (i + 1) + ", может: " + uchastnikArray[i][1] + " м., препятствие " + prepyatstvieArray[j][1] + " м., УСПЕШНО преодолел.");
                }
                if (uchastnikArray[i][2] < prepyatstvieArray[j][2]) {
                    System.out.println("(Прыг)Участник " + (i + 1) + ", может: " + uchastnikArray[i][2] + " м., а препятствие " + prepyatstvieArray[j][2] + " м., НЕ преодолел.");
                    System.out.println("Участник " + (i + 1) + " сошёл с дистанции.");
                    vsePrepyatsviayProideni = false;
                    break;
                } else {
                    System.out.println("(Прыг)Участник " + (i + 1) + ", может: " + uchastnikArray[i][2] + " м., препятствие " + prepyatstvieArray[j][2] + " м., УСПЕШНО преодолел.");
                }
            }
            if (vsePrepyatsviayProideni == true) {
                System.out.println("!!! Участник " + (i + 1) + " УСПЕШНО преодолел ВСЕ препятствия.");
            }
        }
    }

    private static void viborDeistvya() throws InterruptedException {
        int vibordeistviya;
        do {
            vibordeistviya = vvodTselogoCHhisla(1, 3, "Выберите какую информацию вывести в консоль");
            if (vibordeistviya != -100) {
            } else {
                System.out.print("Вы ошиблись. ");
            }
            if (vibordeistviya == 1) {
                System.out.println();
                System.out.println("Выполнение задания, пункт 1:");
                punkt1();
            }
            if (vibordeistviya == 2) {
                System.out.println();
                System.out.println("Выполнение задания, пункт 2:");
                punkt2();
            }
            if (vibordeistviya == 3) {
                System.out.println();
                System.out.println("Выполнение задания, пункт 3/4:");
                punkt3();
            }
        }
        while (vibordeistviya == -100);
        if (!vixodIzProgrammi()) {//надо будет привыкнуть к такому написанию
            privetstvieProgrammi();
            viborDeistvya();
        }
    }

    private static void privetstvieProgrammi() {
        System.out.println("\n---=== Практическое задание к уроку № 1 Объектно-ориентированное программирование Java ===---");
        System.out.println("                              Сделал Иван Булкин");
        System.out.println("1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).");
        System.out.println("2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).");
        System.out.println("3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.");
        System.out.println("4. У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.");
        System.out.println();
        System.out.println("1. Выполнение задания, пункт 1;");
        System.out.println("2. Выполнение задания, пункт 2;");
        System.out.println("3. Выполнение задания, пункт 3/4;");
    }

    //Универсальная процедура ввода целого числа, буду её использовать в других программах
    //На вход процедуры передаём от какого до какого числа пользовательо должен ввести число
    //min_znachenie - меньше этого числа вводить нельзя
    //max_znachenie - больше этого числа вводить нельзя
    //возвращает -100, если число введено не верно и возвращает целое число, если число введено верно и в нужном интервале
    //message - сообщение пользователю о том, что именно надо вводить
    private static int vvodTselogoCHhisla(int minZnachenie, int maxZnachenie, String message) {
        System.out.print(message + ", введите число от " + minZnachenie + " до " + maxZnachenie + ": ");
        int vvedennoechislo = -100;
        if (in.hasNextInt()) {
            vvedennoechislo = in.nextInt();
            if (vvedennoechislo < minZnachenie || vvedennoechislo > maxZnachenie) {
                vvedennoechislo = -100;
            }
        } else {
            in.next();
        }
        return vvedennoechislo;
    }

    //Универсальная процедура выхода из программы, буду её использовать в других программах
    //Выходит из программы, если пользователь выбирает "y", "yes", "д", "да", "+", "торжественно подтверждаю"
    //Возвращает false, если пользователь выбирает "n", "н", "-", "играть, так играть, продолжаем"
    //продолжает спрашивать о выходе, если пользователь ввёл любое другое значение
    private static boolean vixodIzProgrammi() {
        System.out.println("\nВыходим из программы, Вы уверены? y/n (д/н)");
        String n = in.next();
        switch (n) {
            case "y", "yes", "д", "да", "+", "торжественно подтверждаю" -> {
                System.out.println("\nДо новых встреч, ждём Вас снова.");
                in.close();//Необходимо закрыть объект in
                System.exit(0);
            }
            case "n", "н", "-", "играть, так играть, продолжаем" -> {
                System.out.println();
                return false;
            }
            default -> {
                System.out.printf("Вы ввели: " + n + ", такого значения нет в списке%n" + "Выберите y/n или д/н и попробуйте ещё разик.");
                vixodIzProgrammi();
            }
        }
        return false;
    }
}
