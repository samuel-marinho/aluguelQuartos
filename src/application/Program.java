package application;
import entities.Client;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
        Client[] vector = new Client[10];

        for (int i=0; i<n; i++){
            System.out.printf("RENT #%d: %n", i+1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vector[room]= new Client(name, email);
        }
        System.out.println("Busy rooms:");
        for (int i=0; i<10; i++){
            if (vector[i] != null){
                System.out.println(i + ": "+ vector[i]);
            }
        }
        sc.close();
    }
}
