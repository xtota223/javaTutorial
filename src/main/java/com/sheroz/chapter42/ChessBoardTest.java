package com.sheroz.chapter42;
import java.util.Scanner;

public class ChessBoardTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // String inp = sc.nextLine();
        new ChessBoard().findPoz(4, 4);
        String inp = sc.nextLine();

    }

    void findPoz(int x, int y) {
        canIjump(x - 2, y + 1);
        canIjump(x - 2, y - 1);
        canIjump(x + 2, y + 1);
        canIjump(x + 2, y - 1);
        canIjump(x + 1, y - 2);
        canIjump(x - 1, y - 2);
        canIjump(x + 1, y + 2);
        canIjump(x - 1, y + 2);

    }

    void canIjump(int x, int y) {
        if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) {
            String lt = "";
            switch (x) {
                case 0:
                    lt = "a";
                    break;
                case 1:
                    lt = "b";
                    break;
                case 2:
                    lt = "c";
                    break;
                case 3:
                    lt = "d";
                    break;
                case 4:
                    lt = "e";
                    break;
                case 5:
                    lt = "f";
                    break;
                case 6:
                    lt = "g";
                    break;
                case 7:
                    lt = "h";
                    break;

            }

            System.out.println(lt + y);
        }


    }
/*
    int convert(int x, int y) {
        if ((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) {

            switch (x) {
                case 'a':
                case 'A':
                    x = 0;
                    break;
                case 'b':
                case 'B':
                    x = 1;
                    break;
                case 'c':
                case 'C':
                    x = 2;
                    break;
                case 'd':
                case 'D':
                    x = 3;
                    break;
                case 'e':
                case 'E':
                    x = 4;
                    break;
                case 'f':
                case 'F':
                    x = 5;
                    break;
                case 'g':
                case 'G':
                    x = 6;
                    break;
                case 'h':
                case 'H':
                    x = 7;
                    break;
            }
        }
        return x;
    }*/
    int convert(int x, int y) {

        String inp = null;//delete

        if (inp.contains("a"))
        { inp = inp.replace("a", "0");
            x = 0;
        } else if (inp.contains("b")) {
            inp = inp.replace("b", "1");
            x = 1;
        } else if (inp.contains("c")) {
            inp = inp.replace("c", "2");
            x = 2;
        } else if (inp.contains("d")) {
            inp = inp.replace("d", "3");
            x = 3;
        } else if (inp.contains("e")) {
            inp = inp.replace("e", "4");
            x = 4;
        } else if (inp.contains("f")) {
            inp = inp.replace("f", "5");
            x = 5;
        } else if (inp.contains("g")) {
            inp = inp.replace("g", "6");
            x = 6;
        } else if (inp.contains("h")) {
            inp = inp.replace("h", "7");
            x = 7;
        }
        return x;
    }

}










