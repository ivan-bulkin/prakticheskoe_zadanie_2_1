package part_02.prakticheskoe_zadanie_1;

//Класс беговая дорожка
public class RunningTrack {

    protected int length = 100;//У беговой дорожки есть длина

    /*    public class Probejit extends RunningTrack {
            public void running() {

            }
        }*/
    public RunningTrack(int length) {
        this.length = length;
    }

    //Это конструктор по-умолчанию(пустой конструктор)
    public RunningTrack() {

    }

    void printProbejal(int skolkomojetbejat) {
        if (skolkomojetbejat < length) {
            System.out.println("Не смог пробежать");
        } else {
            System.out.println("Успешно пробежал");
        }
    }
}
