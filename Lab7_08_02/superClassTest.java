/*
суперкласс с приватным текстовым полем.
В базовом классе должен быть метод для присваивания значения полю:
без параметров и с одним текстовым параметром.
Объект суперкласса создается передачей одного текстового аргумента конструктору.
Доступное только для чтения свойство результатом возвращает длину текстовой строки.
 */
package Lab7_08_02;

public class superClassTest {
    //приватным текстовым полем.
    private String str1;
    //метод для присваивания значения полю без параметров
    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String s){
        this.str1 = s;
    }
    public String getStr1(){
        System.out.println(str1);
        return str1;
    }

    //Доступное только для чтения свойство результатом возвращает длину текстовой строки.
    public int getStr1length(){
        System.out.println(str1.length());
        return str1.length();
    }

    //Объект суперкласса создается передачей одного текстового аргумента конструктору.
    public superClassTest(String s){
        this.str1 = s;
    }
    @Override
    public String toString() {
        return "superClassTest{" +
                "str1='" + str1 + '\'' +
                '}';
    }
}
