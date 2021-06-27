import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Long variable = 13l;

    private static void method() {
        System.out.println(variable);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое значение");
        String firstValue = reader.readLine();
        Long firstValueNum = Long.valueOf(firstValue);
        System.out.println("Введите второе значение");
        String secondValue = reader.readLine();
        Long secondValueNum = Long.valueOf(secondValue);
        String resultString = firstValue + secondValue;
        System.out.println("Результат конкатенации :" + resultString);
        Long resultLong = firstValueNum + secondValueNum;
        System.out.println("Результат сложения :" + resultLong);
    }
}
