package com.aisino.test;

/**
 * Created by zhukaishengy on 2018/3/21.
 */
public class MyTest {

    public static void main(String[] args) {
        String code = "21040219700121201X01.0";
        String codeTrans = code.substring(0, code.lastIndexOf('.'));
        System.out.println(codeTrans);

    }
}
