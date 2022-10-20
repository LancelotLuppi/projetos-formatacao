public class Fatorial {

public static void main(String[] args) {
    double num = 7;
    double temp = num;

    while (num > 1) {
        temp = temp*(num-1);
        num--;
    }

    System.out.println(temp);
}

}