import java.util.Arrays;

/**
 * Created by sumeet
 * on 1/11/16.
 */
public class ArrayAddition {

    public static int[] add(int a[], int b[]) {
        int resultLength = Math.max(a.length, b.length) + 1;
        int result[] = new int[resultLength];

        if (a.length < b.length) {
            int temp[] = a;
            a = b;
            b = temp;
        }

        int carry = 0;
        int i = a.length - 1, k = resultLength - 1;
        for (int j = b.length - 1; j >= 0; i--, j--, k--) {
            int temp = a[i] + b[j] + carry;
            result[k] = temp % 10;
            carry = temp / 10;
        }

        while (i >= 0) {
            int temp = a[i] + carry;
            result[k] = temp % 10;
            carry = temp / 10;
            i--;
            k--;
        }

        result[0] = carry;
        return result;
    }

    public static void main(String[] args) {
        int a[] = {9,9};
        int b[] = {9,9,9};
        int[] result = add(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(result));
    }
}
