import java.util.ArrayList;
import java.util.List;

public class ReplaceWithRIghtMax {

    public static int[] replaceElements(int[] arr) {
        List<Integer> temp = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, arr[j]);

            }
            temp.add(max);

        }
        int res[] = new int[n];
        res[n - 1] = -1;
        int i = 0;
        for (int val : temp) {
            res[i++] = val;
        }
        return res;

    }

    public static void main(String[] args) {
        int res[] = replaceElements(new int[] { 3, 3 });
        for (int res2 : res) {
            System.out.println(res2);
        }
    }
}