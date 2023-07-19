import java.util.*;
public class ModArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(findMode(arr, n, m));

    }

    static int findMode(int[] arr,int n,int m) {
        int x = 0;
        for(int i=0;i<n;i++) {
            x = (x*10) + arr[i];
        }
        return x%m;
    }
}