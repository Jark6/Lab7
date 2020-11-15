package Lab7_08_04;

public class Lab7_08_04 {
    public static void main(String[] args) {
        FirstSupClass superClassTest = new FirstSupClass('A');
        String className1 = superClassTest.toString();
        System.out.println(className1);

        SecondSubClass FirstSubClassTest = new SecondSubClass(1024,"килобайт");
        String className2 = FirstSubClassTest.toString();
        System.out.println(className2);

        ThirdSubClass SecondSubClassTest = new ThirdSubClass(1024,"килобайт","кибибайт");
        String className3 = SecondSubClassTest.toString();
        System.out.println(className3);
    }
}
