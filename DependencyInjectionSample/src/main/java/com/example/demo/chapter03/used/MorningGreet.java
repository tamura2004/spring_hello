package com.example.demo.chapter03.used;

/**
 * Greet実装クラス
 * 朝の挨拶を行う
 */
public class MorningGreet implements Greet {
  @Override
  public void greeting() {
    System.out.println("-------------");
    System.out.println("おはようございます");
    System.out.println("-------------");    
  }
}
