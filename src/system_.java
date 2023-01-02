import java.util.Arrays;

public class system_ {
    public static void main(String[] args) {
        System.out.println("ok1");
        //System.exit(0);
        int[] src = {1,2,3};
        int[] dest = new int[3];
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}
