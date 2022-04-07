import java.util.Scanner;

public class CalculYG {
    public static void main(String[] args) {
        int a1, c1;
        String a2, b, c2;
        int resultant;
        System.out.println("Привет! Я калькулятор, который умеет выполнять действия\n" +
                "сложение, вичитание, деление и умножение чисел от 1 до 10. Для этого просто введи два числа\n" +
                " и знак действия между ними через пробелы.");


        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            a1 = scan.nextInt();
            b = scan.next();
            if (scan.hasNextInt()) c1 = scan.nextInt();
            else throw new IllegalArgumentException("Необходимо вводить: ЦЕЛОЕ ЧИСЛО ДЕЙСТВИЕ ЦЕЛОЕ ЧИСЛО");
            resultant = Resul.calcul(a1, c1, b);
            System.out.println(resultant);
        }else {
            a2 = scan.next();
            c2 = scan.next();
            b = scan.next();
            numberRoam a = new numberRoam(a2);
            numberRoam c = new numberRoam(c2);

            resultant = Resul.calcul(a.toInt(), c.toInt(), b);
            numberRoam res = new numberRoam(resultant);
            System.out.println(res.toString());
        }
        scan.close();
    }
}
