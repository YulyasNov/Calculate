public class Resul {
    public static int calcul (int a, int b, String operate){
        int resultant;
        if (a < 1 || a > 10 || b< 1 || b >10) throw new IllegalArgumentException("Числа от 1 до 10!");
        switch (operate){
            case "+" : resultant = a + b; break;
            case "-" : resultant = a - b; break;
            case "*" : resultant = a * b; break;
            case "/" : if (b == 0){
                throw new ArithmeticException("Ошибка! Деление на 0 запрещено!");
            }else {
                resultant = a / b; break;
            }
            default: throw new IllegalArgumentException("Ошибка! Данное действие недоступно!");
        }
        return (resultant);
    }
}
