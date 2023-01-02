public class String_ {
    public static void main(String[] args) {
        //包装类转为String
        Integer i = 100;
        String str1 = i + "";
        String str2 = i.toString();
        String str3 = String.valueOf(i);
        //String 转为 包装类
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);
        Integer i3 = new Integer(str4);

    }
}
