import java.io.IOException;
import java.util.Scanner;

public class iphoneInfoSwitch {
    public static void main(String[] args) throws IOException {

        System.out.print("�п�J�Ǹ������ĥ|�X ->");
        Scanner sc = new Scanner(System.in);
        String year = sc.next();

        System.out.print("�z�� iPhone �s�y�~���O�b ");

        switch (year){
            case "M": case "m": case "N": case "n":
                System.out.println("2014 �~");
                break;
            case "P": case "p": case "Q": case "q":
                System.out.println("2015 �~");
                break;
            case "R": case "r": case "S": case "s":
                System.out.println("2016 �~");
                break;
            case "T": case "t": case "V": case "v":
                System.out.println("2017 �~");
                break;
            case "W": case "w": case "X": case "x":
                System.out.println("2018 �~");
                break;
            case "Y": case "y": case "Z": case "z":
                System.out.println("2019 �~");
                break;
            default:
                System.out.println("�z��J���Ǹ����~");
        }
    }
}
