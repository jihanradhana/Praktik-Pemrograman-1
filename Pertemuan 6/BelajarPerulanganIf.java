import java.util.Scanner; 
    public class BelajarPerulanganIf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan bilangan ganjil minimal yang akan ditampilkan : ");

        int n = s.nextInt();
        int i = 20;
        while ( i != n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        i--;
        }
    }
}
