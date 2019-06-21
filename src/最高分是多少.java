import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/6/21 18:27
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class 最高分是多少 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int students = input.nextInt();
            int n = input.nextInt();
            int[] arr = new int[students];
            for (int i = 0; i < students; i++) {
                arr[i] = input.nextInt();
            }
            while (n-- != 0) {
                String str = input.next();
                if (str.equals("Q")) {
                    int left = input.nextInt();
                    int right = input.nextInt();
                    int[] newArr = Arrays.copyOfRange(arr,left - 1,right);
                    Arrays.sort(newArr);
                    System.out.println(newArr[newArr.length - 1]);
                } else {
                    int index = input.nextInt();
                    int data = input.nextInt();
                    arr[index - 1] = data;
                }
            }
        }
    }
}
