import java.util.Scanner;

public class Task3 {
    public static void addNumbers(){
        int a, b, c;
        double n1;
        Scanner input = new Scanner(System.in);

        System.out.print("A= ");
        a = input.nextInt();

        System.out.print("B= ");
        b = input.nextInt();

        System.out.print("C= ");
        c = input.nextInt();

        n1 = (a + b) / c;

        if (n1 < 10){
            System.out.println("a ile b-nin ceminin c -ye bolunmesi 10-dan kicikdir");
        } else if (n1 == 10) {
            System.out.println("a ile b-nin ceminin c -ye bolunmesi 10-a beraberdir");
        } else {
            System.out.println("a ile b-nin ceminin c -ye bolunmesi 10-dan boyukdur.");
        }

    }

    public static void main(String[] args) {
        addNumbers();
    }
}
