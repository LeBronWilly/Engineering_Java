import java.io.*;
import java.util.Scanner;

public class iphoneInfo {
    public static void main(String[] args) throws IOException {

        System.out.print("請輸入序號中的第四碼 ->");
        Scanner sc = new Scanner(System.in);
        String year = sc.next();

        System.out.print("您的 iPhone 製造年份是在 ");

        if ((year.equalsIgnoreCase("M")) ||
                (year.equalsIgnoreCase("N")))
            System.out.println("2014 年");
        else if ((year.equalsIgnoreCase("P")) ||
                (year.equalsIgnoreCase("Q")))
            System.out.println("2015 年");
        else if ((year.equalsIgnoreCase("R")) ||
                (year.equalsIgnoreCase("S")))
            System.out.println("2016 年");
        else if ((year.equalsIgnoreCase("T")) ||
                (year.equalsIgnoreCase("V")))
            System.out.println("2017 年");
        else if ((year.equalsIgnoreCase("W")) ||
                (year.equalsIgnoreCase("X")))
            System.out.println("2018 年");
        else if ((year.equalsIgnoreCase("Y")) ||
                (year.equalsIgnoreCase("Z")))
            System.out.println("2019 年");
        else
            System.out.println("您輸入的序號有誤");
    }
}
