import java.io.IOException;
import java.util.Scanner;

public class iphoneInfoSwitch {
    public static void main(String[] args) throws IOException {

        System.out.print("請輸入序號中的第四碼 ->");
        Scanner sc = new Scanner(System.in);
        String year = sc.next();

        System.out.print("您的 iPhone 製造年份是在 ");

        switch (year){
            case "M": case "m": case "N": case "n":
                System.out.println("2014 年");
                break;
            case "P": case "p": case "Q": case "q":
                System.out.println("2015 年");
                break;
            case "R": case "r": case "S": case "s":
                System.out.println("2016 年");
                break;
            case "T": case "t": case "V": case "v":
                System.out.println("2017 年");
                break;
            case "W": case "w": case "X": case "x":
                System.out.println("2018 年");
                break;
            case "Y": case "y": case "Z": case "z":
                System.out.println("2019 年");
                break;
            default:
                System.out.println("您輸入的序號有誤");
        }
    }
}
