/*
 * Write a java class “GCD” having  cal_gcd(M,N) that will take 2 int M and N as input from users and calculate the gcd.Hence find the LCM of the 2 numbers.Use BufferedReader class for taking the M and N as input.
 */

import java.util.*;

class FindGcdLcm {
    public static int findGcd(int m, int n) {
        int gcd = 1;
        for (int i = 1; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int findLcm(int m, int n) {
        int lcm = (m * n) / findGcd(m, n);
        return lcm;
    }
}

class Q6_lab_oos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int gcd = FindGcdLcm.findGcd(m, n);
        int lcm = FindGcdLcm.findLcm(m, n);

        System.out.println("The GCD of " + m + " and " + n + " is:" + gcd);
        System.out.println("The LCM of " + m + " and " + n + " is:" + lcm);

    }
}