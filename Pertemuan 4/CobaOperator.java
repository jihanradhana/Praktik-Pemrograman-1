public class CobaOperator {
    public static void main(String[] args) {
        int x = 10 ;
        double y = 6;
        double hasil = x/y;
        System.out.println("Hasil dari pembagian x dan y adalah " + hasil);

        x = x + 1;
        System.out.println("Nilai x adalah " + x);
        ++x;
        System.out.println("Nilai x adalah " + x);
        x++;
        System.out.println("Nilai x adalah " + x);
        System.out.println("Nilai x adalah " + ++x);
        System.out.println("Nilai x adalah " + x++);
        System.out.println("Nilai x adalah " + x);
        x = x + 7;
        System.out.println("Nilai x adalah " + x);
        x += 7;
        System.out.println("Nilai x adalah " + x);
    }
}