public class HomeWorkApp2 {
    public static void main(String[] args) {
        CheckSum(2,12); // 1 задание
        CheckPositiveNumb(-10); // 2 задание
        BooleanCheck(2); // 3 задание
        ReString("I love JAVA and GB", 5); // 4 задание
        CheckLeapYear(1800); // 5 задание, делал самостоятельно, без помощи интернета
    }

    private static boolean CheckLeapYear(int i) {
        boolean b = false;
        if (i % 4 == 0) {
            if (i % 100 == 0 & i % 400 == 0) {
                b = true;
                System.out.println("Високосный год");
                return b;
            }
            if (i % 100 == 0) {
                b = false;
                System.out.println("Невисокосный год");
                return b;
            }
            System.out.println("Високосный год");
        }
        else
            System.out.println("Невисокосный год");
        return b;
    }

    private static void ReString(String a, int b) {
        for (int i = 0; i < b; i++)
            System.out.println(a);
    }

    private static boolean BooleanCheck(int a) {
        boolean b;
        if (a >= 0)
            b = false;
        else
            b = true;
//      System.out.println(b);
        return b;
    }

    private static void CheckPositiveNumb(int a) {
        if (a >= 0)
            System.out.println("Число " + a +" положительное");
        else
            System.out.println("Число " + a +" отрицательное");
    }

    private static boolean CheckSum(int a, int b) {
        boolean c;
        if (a+b >= 10 && a+b<= 20)
            c = true;
        else
            c = false;
//      System.out.println(c);
        return c;
    }
}
