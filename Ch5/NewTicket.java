import java.util.Scanner;

public class NewTicket {
    public static void main(String[] argv) { //利用else 處理其餘狀況
        System.out.print("請輸入身高來查詢票價 (單位：公分)：");

        Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
        int height = sc.nextInt();  // 將輸入資料轉成整數

        if ( height < 115 ) { // if 條件 1
            System.out.println("門票免費");
        }
        else if ( height < 150 ) { // if 條件 2
            System.out.println("門票半價");
        }
        else if (250 > height )  { // if 條件 3
            System.out.println("全票");
        }
        else { // 前 4 個條件都不成立的話
            System.out.println("請輸入正確的身高！");
        }
    }
}
