import java.util.LinkedList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer>numbers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("podaj liczbę");
            int number = scan.nextInt();
            numbers.offer(number);
            int sum = sum + number;
        }
        System.out.println("suma= " + sum);
    }
}
