package Giris;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Heat giriniz: ");
        heat = input.nextInt();
        if (heat < 5) {
            System.out.println("kayak yapabilirsin");
        } else if (5 < heat && heat < 10) {
            System.out.println("sinemaya gidebilirsin");
        } else if (heat >= 10 && heat <= 15) {
            System.out.println("sinemaya veya piknige gidebilirsin");
        } else if (heat >= 15 && heat <= 25) {
            System.out.println("piknige gidebilirsin");
        } else {
            System.out.println("yuzmeye gidebilirsin");
        }

        }

    }



