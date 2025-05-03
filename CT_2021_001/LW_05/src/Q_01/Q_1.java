package Q_01;

public class Q_1 {
    public static void main(String[] args) {
    int i = 10;
    while (i <= 49) {
        int j = 0;
        while (j < 10 && i <= 49) {
            System.out.print(i + " ");
            i++;
            j++;
        }
        System.out.println();
    }
}
}
