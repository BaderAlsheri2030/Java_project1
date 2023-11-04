
import java.util.Scanner;

public class Main {

    //displays the array with numbers on positions for the user to understand where to place x
    public static void display(String [][] table ){
        int rows = 3;
        int columns =3;
        System.out.println("-------------");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns ; j++) {
                if (j ==0)
                    System.out.print("| ");
                System.out.print(table[i][j]+" | ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------");
    }

    //play method allow the user to place x in the board and check if the position valid or not.
    public static void play(String[][] table){
        Scanner input = new Scanner(System.in);
        int round =4;
        int counter = 0;
        String n;

        try {

            System.out.println("enter 1 to play one round or 3 to play three rounds");
            round = input.nextInt();
            if (round > 3 || round < 1){
            throw new Exception("Choose 1 round or 3 rounds to play");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        if (round > 3 || round < 1) {

            System.out.println("enter 1 to play one round or 3 to play three rounds");
            round = input.nextInt();
        }
        display(table);

            do {

                try {

                    System.out.println("place X in position number: ");
                    n = input.next();
                    System.out.println(" ");
                    if (!(n.matches("[1-9]"))) {
                        throw new Exception("only enter numbers from 1-9");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    display(table);
                    System.out.println("place X in position number: ");
                    n = input.next();
                    break;
                }
                if (n.matches("[1-9]")) {
                    switch (n) {

                        case "1":
                            if (table[0][0].equalsIgnoreCase("1") && !(table[0][0].equalsIgnoreCase("o"))) {
                                table[0][0] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "2":
                            if (table[0][1].equalsIgnoreCase("2") && !(table[0][1].equalsIgnoreCase("o"))) {
                                table[0][1] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "3":
                            if (table[0][2].equalsIgnoreCase("3") && !(table[0][2].equalsIgnoreCase("o"))) {
                                table[0][2] = "x";

                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "4":
                            if (table[1][0].equalsIgnoreCase("4") && !(table[1][0].equalsIgnoreCase("o"))) {
                                table[1][0] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "5":
                            if (table[1][1].equalsIgnoreCase("5") && !(table[1][1].equalsIgnoreCase("o"))) {
                                table[1][1] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "6":
                            if (table[1][2].equalsIgnoreCase("6") && !(table[1][2].equalsIgnoreCase("o"))) {
                                table[1][2] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "7":
                            if (table[2][0].equalsIgnoreCase("7") && !(table[2][0].equalsIgnoreCase("o"))) {
                                table[2][0] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "8":
                            if (table[2][1].equalsIgnoreCase("8") && !(table[2][1].equalsIgnoreCase("o"))) {
                                table[2][1] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                        case "9":
                            if (table[2][2].equalsIgnoreCase("9") && !(table[2][2].equalsIgnoreCase("o"))) {
                                table[2][2] = "x";
                            } else {
                                counter--;
                                System.out.println("invalid choose another position");
                                break;
                            }
                            botPlay(table);
                            break;
                    }

                }
                counter++;
                display(table);
            }while (counter < round) ;
            checkWinner(table);
        }

    //bot play make the computer place o in a random position after the user has placed x and check for the position if it's valid
    public static void botPlay(String[][] table) {
        int max,min,range;
        max =9;
        min = 1;
        range = max-min-1;
        String s =Integer.toString((int)((Math.random()*range)+min));
        int counter = 0;
        System.out.println("Computer turn to play");
        do {
            switch (s){
                case "1":
                    if (table[0][0].equalsIgnoreCase("1") && !(table[0][0].equalsIgnoreCase("X"))) {
                        table[0][0] = "o";

                } else{ counter--;
                    s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                }
                    break;
                case "2":
                    if (table[0][1].equalsIgnoreCase("2") && !(table[0][1].equalsIgnoreCase("x"))) {
                        table[0][1] = "o";
                    }
                    else { counter--;
                        s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                    }
                    break;
                case "3":
                    if (table[0][2].equalsIgnoreCase("3") && !(table[0][2].equalsIgnoreCase("x"))) {
                        table[0][2] = "o";
                    }
                    else { counter--;
                        s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                    }
                    break;
                case "4":
                    if (table[1][0].equalsIgnoreCase("4") && !(table[1][0].equalsIgnoreCase("x"))  ) {
                        table[1][0] = "o";
                    }
                    else{ counter--;
                        s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                    }
                    break;
                case "5":
                    if (table[1][1].equalsIgnoreCase("5") && !(table[1][1].equalsIgnoreCase("x"))) {
                        table[1][1] = "o";
                    }
                    else { counter--;
                        s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                    }
                    break;
                case "6":
                    if (table[1][2].equalsIgnoreCase("6") && !(table[1][2].equalsIgnoreCase("x"))) {
                        table[1][2] = "o";
                    }
                    else { counter--;
                        s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                    }
                    break;
                case "7":
                    if (table[2][0].equalsIgnoreCase("7") && !(table[2][0].equalsIgnoreCase("x"))) {
                        table[2][0] = "o";
                    }
                    else { counter--;
                        s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                    }
                    break;
                case "8":
                    if (table[2][1].equalsIgnoreCase("8") && !(table[2][1].equalsIgnoreCase("x"))) {
                        table[2][1] = "o";
                    }
                    else { counter--;
                        s =Integer.toString( (int)((Math.random()*range)+min));
                        break;
                    }
                    break;
                case "9":
                    if (table[2][2].equalsIgnoreCase("9") && !(table[2][2].equalsIgnoreCase("x"))) {
                        table[2][2] = "o";


                    }
                    else {
                        counter--;
                        s = Integer.toString((int) ((Math.random() * range) + min));
                        break;
                    }
                    break;
            }
            counter++;
        } while (counter < 1);
    }
    public static void checkWinner(String[][] table){
        int userScore = 0;
        int botScore = 0;
        for (int i = 0; i < table.length ; i++) {
            if (table[i][0].equals("x") && table[i][1].equals("x") && table[i][2].equals("x")){
                userScore++;
            }
            if (table[0][i].equals("x") && table[1][i].equals("x") && table[2][i].equals("x")){
                userScore++;
            }
            if (table[i][0].equals("o") && table[i][1].equals("o") && table[i][2].equals("o")){
                botScore++;
            }
            if (table[0][i].equals("o") && table[1][i].equals("o") && table[2][i].equals("o")){
                botScore++;
            }

            }
            if (table[0][0].equals("x") && table[1][1].equals("x") && table[2][2].equals("x")){
            userScore++;
            }
            if (table[0][2].equals("x") && table[1][1].equals("x") && table[2][0].equals("x")){
            userScore++;
            }
            if (table[0][0].equals("o") && table[1][1].equals("o") && table[2][2].equals("o")){
            botScore++;
            }
            if (table[0][2].equals("o") && table[1][1].equals("o") && table[2][0].equals("o")){
            botScore++;
            }
            if (botScore == userScore){
            System.out.println("Tie!");
            }
            else if (userScore > botScore) {
          System.out.println("You have won!");

            }
            else {
            System.out.println("The computer has won!");
        }

    }

    public static void main(String[] args) {
        int rows = 3;
        int columns =3;
        int num = 1;

        String [][] ticTacToe = new String[rows][columns];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < columns; j++) {
                ticTacToe[i][j] = Integer.toString(num);
                num++;

            }
        }

            play(ticTacToe);
    }
}
