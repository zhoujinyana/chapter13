public class StringBuffer_ {
    public static void main(String[] args) {
        //1.StringBuffer的直接父类是 AbstractStringBuilder
        //2. StringBuffer实现了Serializable，即StringBuffer的对象可以串行化
        //3．在父类中 AbstractStringBuilder有属性 char[] value,不是final
        //存放在堆中，不能被继承
       // 因为StringBuffer字符内容是存在char[] value，
        // 所有在变化(增加/删除不用每次都更换地址(即创建新对象)|，所以效率高于string



                String str = "hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        String s = new String(stringBuffer1);



    }
}
