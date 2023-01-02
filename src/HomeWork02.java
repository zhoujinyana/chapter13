public class HomeWork02 {
    public static void main(String[] args) {
          String name = "jack";
          String pwd = "123456";
          String email = "jack@edu.com";
          userRegister(name,pwd,email);
        System.out.println("注册成功");

    }
    public static void userRegister(String name,String pwd,String email){
        int userLength = name.length();
        if(!(userLength >=2 && userLength <= 4)){
            throw new RuntimeException("用户名长度为2或3或4");
        }
        if(pwd.length() == 7 && isD(pwd)){
            throw new RuntimeException("密码不对");

        }

        int i = email.indexOf('@');
        int i1 = email.indexOf('.');
        if(!(i > 0 && i1 > i)){
            throw new RuntimeException("邮箱不对");
        }



    }
    public static boolean isD(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9'){
                return false;
            }

        }
        return true;
    }
}
