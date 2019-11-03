public class PowerOf2 {

    public static void main (String[] args){
        int num = 7;
        System.out.print(isPowOfTwo(num));

    }
    public static boolean isPowOfTwo(int num) {
        long i = 1;
        while ( i<num ) {
            i=i*2;
        }
        return i == num;
    }
}
