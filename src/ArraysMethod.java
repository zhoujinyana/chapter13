import java.util.Arrays;
import java.util.List;

public class ArraysMethod {
    public static void main(String[] args) {
        Integer[] arr = {1,2,20,123,567};
        int index = Arrays.binarySearch(arr,20);
        //无序则不能用二叉排序法
        System.out.println(index);

        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));
        Integer[] num = new Integer[]{9,3,2};
        //数组填充
        Arrays.fill(num,99);
        System.out.println(Arrays.toString(num));

        List asList = Arrays.asList(2,3,4,5,6);
        System.out.println(asList);


    }
}
