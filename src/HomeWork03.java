public class HomeWork03 {
    public static void main(String[] args) {
        String name = "zhou jin yan";
        print(name);

    }
    public static void print(String str){
        if(str == null){
            System.out.println("不能为空");
            return;
        }

        String[] name = str.split(" ");
        if(name.length != 3){
            System.out.println("格式不对");
            return;
        }
        String format = String.format("%s,%s .%c", name[2], name[0], name[1].toUpperCase().charAt(0));
        System.out.println(format);

    }
}
