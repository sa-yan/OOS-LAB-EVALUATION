/*
 * Create a class Convert to BinToDec(N) that will take a decimal number and convert it to binary. Use scanner class to take input.
 */

import java.util.*;

class Convert {
    public static int binToDec(int binary) {
        int i = 0, dec = 0;
        while (binary > 0) {
            int digits = binary % 10;
            dec += digits * Math.pow(2, i);
            binary /= 10;
            i++;
        }
        return dec;
    }

    public static int deciToBin(int decimal) {
        int i = 1, binary = 0;
        while (decimal > 0) {
            int digits = decimal % 2;
            binary += digits * i;
            decimal /= 2;
            i *= 10;
        }
        return binary;
    }

    public static boolean checkWhetherBinary(int binary) {
        int i = 0;
        while (binary > 0) {
            int digits = binary % 10;
            if (digits != 0 || digits != 1) {
                return false;
            }
            binary /= 10;
        }
        return true;
    }
}

class Q9_lab_oos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter binary Number: ");
        int binary = sc.nextInt();

        if (!Convert.checkWhetherBinary(binary)) {
            System.out.println("The decimal equivalent of " + binary + " is: " + Convert.binToDec(binary));
        } else {
            System.out.println("NOT A BINARY NUMBER!");
        }
        sc.close();
    }
}
