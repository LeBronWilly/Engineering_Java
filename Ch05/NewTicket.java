import java.util.Scanner;

public class NewTicket {
    public static void main(String[] argv) { //�Q��else �B�z��l���p
        System.out.print("�п�J�����Ӭd�߲��� (���G����)�G");

        Scanner sc = new Scanner(System.in); // ����J��ƥ[�W���{��
        int height = sc.nextInt();  // �N��J����ন���

        if ( height < 115 ) { // if ���� 1
            System.out.println("�����K�O");
        }
        else if ( height < 150 ) { // if ���� 2
            System.out.println("�����b��");
        }
        else if (250 > height )  { // if ���� 3
            System.out.println("����");
        }
        else { // �e 4 �ӱ��󳣤����ߪ���
            System.out.println("�п�J���T�������I");
        }
    }
}
