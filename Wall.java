package part_02.prakticheskoe_zadanie_1;

//Класс стена
public class Wall {

    protected int height = 2;//У стены есть высота

    public Wall(int height) {
        this.height = height;
    }

    //Это конструктор по-умолчанию(пустой конструктор)
    public Wall() {

    }

    void printPereprignul(int nakolkomojetprignul) {
        if (nakolkomojetprignul < height) {
            System.out.println("Не смог перепрыгнуть");
        } else {
            System.out.println("Успешно перепрыгнул");
        }
    }

}
