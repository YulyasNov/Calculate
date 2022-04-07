import java.util.Locale;

public class numberRoam {

    private static int num;
    private static int[] numbers = {100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static String[] letters = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public numberRoam(int arabic){
        if (arabic < 1) throw new NumberFormatException("Ошибка! В римской системе нет отрицательных чисел!");
        num = arabic;
    }

    public numberRoam(String roam){
        if (roam.length() == 0) throw new NumberFormatException("Ошибка! Пустая строка");
        roam = roam.toUpperCase();// Римские цифры пишутся заглавными.

        int i = 0;
        int arabic = 0;

        while (i < roam.length()) {

            char letter = roam.charAt(i);
            int number = letterToNumber (letter);

            if (number < 0) throw new NumberFormatException ("Что-то пошло не так");
            i++;

            if (i == roam.length()){
                arabic += number;
            }
            else{
                int nextNumber = letterToNumber (roam.charAt(i));
                if (nextNumber > number){
                    arabic += (nextNumber - number);
                    i++;
                }
                else {
                    arabic += number;
                }
            }
        }
        if (arabic > 100) throw new NumberFormatException("Ошибка! Попробуйте число поменьше");
        num = arabic;
    }

    private int letterToNumber(char letter){
        switch (letter){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            default: return -1;
        }
    }

    public String toString(){
        String roam = "";
        int N = num;
        for (int i = 0; i < numbers.length; i++){
            while (N >= numbers[i]){
                roam += letters[i];
                N -= numbers[i];
            }
        }
        return roam;
    }
    public int toInt(){
        return num;
    }
}