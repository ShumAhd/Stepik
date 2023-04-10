package ru.shum;
import java.util.Scanner;

public class String_6 {

  /**
   * На вход подаётся строка текста, затем слово. Выведите на печать true, если слово содержится в
   * строке, и false - если не содержится.
   *
   * @param args
   */
  public static void main(String[] args) {
    st();
    scan();
  }

  /**
   * Без ввода данных
   */
  public static void st() {
    String st1 = "My name is John";
    String st2 = "name";
    String st3 = "john";
    boolean value1 = st1.contains(st2);
    boolean value2 = st1.contains(st3);
    System.out.println(value1);
    System.out.println(value2);
  }

  /**
   * С вводом данных
   */
  public static void scan() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Введите предложение: My name is John");
    String str = sc.nextLine();
    System.out.println("Введите: name или john");
    String word = sc.nextLine();
    boolean value3 = str.contains(word);

    if (value3 == true) {
      System.out.println("Такое слов есть в предложении)");
    } else {
      System.out.println("Такого слова нет в предложении(");
    }
    System.out.println(value3);

    System.out.println("Хочешь продолжить нажми y или n");
    String decision = sc.next();

    if (decision.equals("y")) {
      scan();
    } else {
      System.out.println("Ладно закончим");
    }
  }
}



