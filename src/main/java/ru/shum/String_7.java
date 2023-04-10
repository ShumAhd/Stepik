package ru.shum;

import java.util.Scanner;

public class String_7 {

  public static void main(String[] args) {
    registers();
    registersScan();
  }
  public static void registers(){
    String s = "This is new string";
    System.out.println(s.toLowerCase());
    System.out.println(s.toUpperCase());
  }
  public static void registersScan(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите текст: ");
    String str = sc.nextLine();
    System.out.println(str.toLowerCase());
    System.out.println(str.toUpperCase());
  }
}
