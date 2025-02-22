import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ındıs = 0;

        System.out.print("Dizinin Boyutunu Giriniz :");
        int a =input.nextInt();
        int[] list =new int[a];
        System.out.println(" Dizinin Elemanlarını giriniz :");

        for (int i=1; i<=a; i++, ındıs++){
            System.out.print(i + ". Elemanı");
            int eleman =input.nextInt();
            list[ındıs]=eleman;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}