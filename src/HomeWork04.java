public class HomeWork04 {
    public static void main(String[] args) {
      String str = "asdfgHHJJ7889";
      count(str);
    }

    public static void count(String str){
        if(str == null){
            System.out.println("不能为空");
            return;
        }
        int strLen = str.length();
        int numCount = 0;
        int lowerconut = 0;
        int Uptercount = 0;
        for (int i = 0; i < strLen; i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                numCount++;
            }
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowerconut++;
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                Uptercount++;
            }


        }
        System.out.println(numCount);
        System.out.println(lowerconut);
        System.out.println(Uptercount);
    }
}
