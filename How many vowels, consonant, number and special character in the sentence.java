import java.util.*;

public class Word {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String sentence = input.nextLine().toLowerCase();
    int vowel = 0, consonant = 0, num = 0, others = 0;
    char s;

    for (int i = 0; i < sentence.length(); i++) {
      s = sentence.charAt(i);
      if (s >= 'a' && s <= 'z') {
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
          vowel++;
        } else {
          consonant++;
        }
      } else if (s >= '0' && s <= '9') {
        num++;
      } else if (s != ' ') {
        others++;
      }

    }

    System.out.println("Total Vowel: " + vowel);
    System.out.println("Total Consonant: " + consonant);
    System.out.println("Total Number: " + num);
    System.out.println("Total special characters:" + others);

    input.close();
  }
}
