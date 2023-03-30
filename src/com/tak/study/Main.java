package com.tak.study;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        sc.close();

        //StringTokenizer st = new StringTokenizer(문자열, 구분자)
        StringTokenizer st = new StringTokenizer(S," ");

        //countTokens() -> 총 토큰의 개수 리턴! 자세한 설명은 내 노션에 적어뒀다.
        System.out.println(st.countTokens());

    }

}
