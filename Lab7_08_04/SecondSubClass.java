package Lab7_08_04;

//на основе суперкласса создается подкласс
public class SecondSubClass extends FirstSupClass {
    SecondSubClass(int int1) {
        super(int1);
    }
    //Во втором классе появляется открытое символьное поле
    public String str1;
    //метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
    public void setInt1Str1(int int1, String str1) {
        super.int1 = int1;
        this.str1 = str1;
    }
    //конструктор с двумя параметрами
    SecondSubClass(int int1, String str1) {
        super(int1);
        this.setInt1Str1(int1, str1);
        }


    public String toString() {
        String SecondFieldValue =
                "\n str 1 = " + this.getStr1();
        return super.toString()+SecondFieldValue;
    }
    public String getStr1() {
        return str1;
    }
}
