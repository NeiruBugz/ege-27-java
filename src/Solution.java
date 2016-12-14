import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aMax = 10000; // Ограничение
        int n = 6; // Количество пар чисел
        int a, b; // Пара чисел
        int max; // Максимум в паре
        int min; // Минимум в паре
        int d; // Минимальная разница максимума и минимума не кратная трем
        int s; // Сумма

        s = 0;
        d = aMax - 1;

        for (int i = 0; i < n; i++) { /* Считываем пару чисел пока i меньше количества пар и прибавляем максимальное число*/
            a = sc.nextInt();           к s */
            b = sc.nextInt();
            max = Math.max(a, b);
            min = Math.min(a, b);
            s+= max;
            if (((max - min) % 3 !=0) && (max - min < d)) {
                d = max - min;
            }
        }

        if (s % 3 == 0) {
            if (d > aMax) {
                s = 0;
            }
            else {
                s = s - d;
            }
        }

        System.out.println(s);
    }
}