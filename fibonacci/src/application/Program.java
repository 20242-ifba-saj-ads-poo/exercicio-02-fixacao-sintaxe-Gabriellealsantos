package application;

public class Program {
    public static void main(String[] args) {
        int n = 30;
        int[] fi = new int[n];

        fi[0] = 0;
        fi[1] = 1;

        for (int i = 2; i < n; i++) {
            fi[i] = fi[i - 1] + fi[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(fi[i]);
        }
    }
}
