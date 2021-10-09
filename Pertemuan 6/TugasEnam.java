import java.util.Scanner; 
    public class TugasEnam {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Masukan bilangan deret maksimal yang ingin dimasukkan : ");
            int n = s.nextInt();
            
            int i = 0;
            int num = 0; 
            while (i != n) {
                if (Math.pow(5, num) == i) {
                    System.out.println(i);
                    num++;
                }
            i++;
            }
        }
    }
