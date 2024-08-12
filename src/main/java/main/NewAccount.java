package main;
import java.util.Random;
import java.util.Scanner;

public class NewAccount {
    private String username;
    private String password;
    private int id;
    private float balance;

    public void newUserName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Create Username: max of 25 characters");
        username = input.nextLine();
        int size = username.length();
        while (size > 25) {
            System.out.println("Username greater then 25 characters. Try again.");
            username = input.nextLine();
            size = username.length();
        }
    }

    public void newPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Create Password: max of 25 characters and min of 8");
        password = input.nextLine();
        int size = password.length();
        System.out.println(password);
        while (size > 25 || size < 8) {
            if (size > 25){
                System.out.println("Password greater then 25 characters. Try again.");
                password = input.nextLine();
                size = password.length();
                System.out.println(password);
            }
            if (size < 8){
                System.out.println("Password less then 8 characters. Try again.");
                password = input.nextLine();
                size = password.length();
                System.out.println(password);
            }

        }
    }

    public void newId(){
        Random rand = new Random();
        id = rand.nextInt(1000);
    }

    public void accountCreate(){
    }
}
