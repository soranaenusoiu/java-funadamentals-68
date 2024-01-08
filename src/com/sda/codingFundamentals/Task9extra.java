
import java.util.Scanner;
public class Task9extra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti indexul: ");
        int lenght = scanner.nextInt();
        desenamWave(lenght);
    }

    private static void desenamWave(int lenght)
    {
        System.out.println(desenamLinie(0,lenght));
        System.out.println(desenamLinie(1,lenght));
        System.out.println(desenamLinie(2,lenght));
        System.out.println(desenamLinie(3,lenght));
    }
    private static String desenamLinie(int pozitie, int lenght)
    {
        StringBuilder linie = new StringBuilder();
        for(int i = 0; i < lenght; i++)
        {
            if(i%8 == pozitie)
            {
                linie.append("*");
            }
            else if(i%8 == 7-pozitie)
            {
                linie.append("*");
            }
            else {
                linie.append(" ");
            }
        }
        return linie.toString();
    }
}