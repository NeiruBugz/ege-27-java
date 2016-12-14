import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int aMax = 10000;
        int n = 6;
        int a, b, max, min, d, s;

        s = 0;
        d = aMax - 1;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
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