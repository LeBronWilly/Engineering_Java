import java.util.*;

public class WordsGameLHS {

  public static void main(String args[]) {

    System.out.println("��r���s�C��, ���i�έ��ƪ���");
    System.out.print("�п�J�Ĥ@�ӵ��G");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    // �إ߶��X����
    LinkedHashSet<String> words = new LinkedHashSet<>();

    while (true) {
      if (!words.add(str)) {
        System.out.println("���ѡI�o�ӵ��w�ιL");
        break;
      }
      System.out.print("�п�J�U�@�ӵ��G");
      str = sc.next();
    }

    System.out.println("\n��J�L�����G" + words);
  }
}