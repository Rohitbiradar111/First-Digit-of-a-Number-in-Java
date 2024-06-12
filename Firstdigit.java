//This program prints the First Digit of a Number in Java

import java.util.Scanner;
public class Firstdigit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        System.out.print(firstdigit(num));
        sc.close();
    }

    public static int firstdigit(int num)
    {
        while(num > 9)
        {
            num = num / 10;
        }
        return num;
    }
}