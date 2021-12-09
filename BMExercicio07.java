import java.util.Scanner;
public class VariavelX
{
    public static void main(String[] args){
        int x, y;
        do {
            System.out.print("Digite o numero: ");
            x = new Scanner(System.in).nextInt();
            if(x%2==0){
                y = x/2;
                System.out.print("y=" +y);
                System.out.print("\n");
                System.out.print("x=" +x);
                System.out.print("\n");
            } else {
                y = 3 * x + 1;
                System.out.print("y=" +y);
                System.out.print("\n");
                System.out.print("x=" +x);
                System.out.print("\n");
            }
        } while (y != 1);
    }
}
