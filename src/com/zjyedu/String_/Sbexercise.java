package com.zjyedu.String_;

public class Sbexercise {
    public static void main(String[] args) {
        String price = "18823564.65";
        StringBuffer stringBuffer = new StringBuffer(price);
        //int i = stringBuffer.lastIndexOf(".");
        //StringBuffer instr = stringBuffer.insert(i - 3,",");
        for(int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i-=3){
            StringBuffer instr = stringBuffer.insert(i ,",");
        }
        System.out.println(stringBuffer);

    }
}
