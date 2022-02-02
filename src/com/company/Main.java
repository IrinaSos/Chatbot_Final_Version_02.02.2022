package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Chatbot welcome!
        System.out.println("Sveiciens! Kā varu Tev palīdzēt?");

        Scanner in = new Scanner(System.in);

        // 5 questions that will test Chatbot
        String Q1 = "Sveiks! Vai Jums ir Java kursi?";
        String Q2 = "Vai cilvēks bez pieredzes var piedalīties kursos?";
        String Q3 = "Vai Jums ir izmēģinājuma nodarbības pirms kursa sākuma?";
        String Q4 = "Vai ir kaut kādas atlaides?";
        String Q5 = "Kur var dabūt vairāk informācijas?";

        // 3 options how to desible Chatbot
        String exit = "Kā iziet no šejienes?";
        String A1 = "Jā";
        String A2 = "Nē";

        while (true) {
            String Q = in.nextLine();

            if (Q.equals(Q1)) {
                System.out.println("Jā, mums ir Java kursi.");
            } else if (Q.equals(Q2)) {
                System.out.println("Jā, protams! Mūsu Java kursi ir no nulles!");
            } else if (Q.equals(Q3)) {
                System.out.println("Nē, izmēģinājuma nodarbības nav paredzētas!");
            } else if (Q.equals(Q4)) {
                System.out.println("Jā, ir! Samaksājot visu summu uzreiz, būs 10% atlaide.");
            } else if (Q.equals(Q5)) {
                System.out.println("Vairāk informācijas par Java kursiem atradīsiem mūsu mājaslapā sadaļā APMĀCĪBAS. Aiziet uz mājaslapu?");
            }else if (Q.equals(exit)) {
                System.out.println("Iziet? Nav problēmu! Lai veicas! :) ");
                break;
            }else if (Q.equals(A1)) {
                System.out.println("https://rigacoding.lv/ Paldies par sarunu! Ata! :) ");
                break;
            }else if (Q.equals(A2)){
                System.out.println("Tad diemžēl es vairs nekā nevaru palīdzēt :(");
                break;
            }else {
                System.out.println("Atvainojiet! Es nesapratu. Mēģiniet ievadīt kaut ko citu.");
            }
        }
    }
}
