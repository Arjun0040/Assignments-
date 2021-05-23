package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        ifStatementExample();
        whileLoopExample();
        forLoopExample();
        switchCaseExample();
    }

    static void ifStatementExample() {
        int num = (int) (Math.random() * 10);
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    static void whileLoopExample() {
        int i = 0;
        while (i < 10) {
            System.out.println("I have completed " + i + " iterations!");
            i += 1;
        }
    }

    static void forLoopExample() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + " iterations to go");
        }
    }

    static void switchCaseExample() {
        String[] val = {"Red", "Green", "Yellow"};
        int i = (int) (Math.random() * 3);
        switch (val[i]) {
            case "Red":
                System.out.println("STOP");
                break;
            case "Green":
                System.out.println("GO!");
                break;
            case "Yellow":
                System.out.println("WAIT!");
                break;
        }
    }
}
