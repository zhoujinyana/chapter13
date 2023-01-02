package com.zjyedu.String_;

public class reverse_ {
    public static void main(String[] args) {
        String str = "abcdef";
        str  = reserve(str,1,4);
        System.out.println(str);

    }
    public static String reserve(String str,int start,int end){

        if(!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for(int i = start, j = end; i < j; i++,j--){
           temp = chars[i];
           chars[i] = chars[j];
           chars[j] = temp;
        }
        return new String(chars);


    }
}
