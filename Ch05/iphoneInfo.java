import java.io.*;
import java.util.Scanner;

public class iphoneInfo {
    public static void main(String[] args) throws IOException {

        System.out.print("�п�J�Ǹ������ĥ|�X ->");
        Scanner sc = new Scanner(System.in);
        String year = sc.next();

        System.out.print("�z�� iPhone �s�y�~���O�b ");

        if ((year.equalsIgnoreCase("M")) ||
                (year.equalsIgnoreCase("N")))
            System.out.println("2014 �~");
        else if ((year.equalsIgnoreCase("P")) ||
                (year.equalsIgnoreCase("Q")))
            System.out.println("2015 �~");
        else if ((year.equalsIgnoreCase("R")) ||
                (year.equalsIgnoreCase("S")))
            System.out.println("2016 �~");
        else if ((year.equalsIgnoreCase("T")) ||
                (year.equalsIgnoreCase("V")))
            System.out.println("2017 �~");
        else if ((year.equalsIgnoreCase("W")) ||
                (year.equalsIgnoreCase("X")))
            System.out.println("2018 �~");
        else if ((year.equalsIgnoreCase("Y")) ||
                (year.equalsIgnoreCase("Z")))
            System.out.println("2019 �~");
        else
            System.out.println("�z��J���Ǹ����~");
    }
}
