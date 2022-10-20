public class Fatorial2 {
    static int Fatorial(int num) {
        if(num != 1) {
            return num*Fatorial(num - 1);
        }
        return num;
    }
    public static void main(String[] args) {

        System.out.println(Fatorial(7));

    }
}