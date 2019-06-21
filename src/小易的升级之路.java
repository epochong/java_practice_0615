import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/6/21 18:13
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class 小易的升级之路 {
    public static int gcd(int a,int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b,a % b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            int power = input.nextInt();
            ArrayList<Integer> arrayList = new ArrayList <>();
            for (int i = 0; i < n; i++) {
                int tem = input.nextInt();
                arrayList.add(tem);
            }
            int res = power;
            for (int i = 0; i < n; i++) {
                if (arrayList.get(i) <= res) {
                    res += arrayList.get(i);
                } else {
                    res += gcd(arrayList.get(i),res);
                }
            }
            System.out.println(res);
        }
    }
}
