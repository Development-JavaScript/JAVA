package nested.anonymous.ex;

import nested.anonymous.AnonymousOuter;
import nested.local.Printer;

public class Ex0Main {
    public static void helloJava(){
        System.out.println("프로그램 시작");
        System.out.println("hello Java");
        System.out.println("프로그램 종료");
    }

    public static void helloString(){
        System.out.println("프로그램 시작");
        System.out.println("hello String");
        System.out.println("프로그램 종료");
    }

    public static void main(String[] ages){
        helloString();
        helloJava();
    }
}
