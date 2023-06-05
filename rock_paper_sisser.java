import java.util.Random;
import java.util.Scanner;

public class rock_paper_sisser {
    public static void main(String[] args) {

        String[] rps = new String[]{"r", "p", "s"};
        String com_move = rps[(new Random()).nextInt(rps.length)];
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("please enter your move (r , p , s)");
            String playermove = sc.nextLine();

            if (playermove.equals("r") || playermove.equals("p") || playermove.equals("s")) {

                System.out.println("computer move :" + com_move);

                if (playermove.equals(com_move)) {

                    System.out.println("the game was a tie");

                } else if (playermove.equals("r")) {

                    if (com_move.equals("s")) {
                        System.out.println("you win");
                    } else {
                        System.out.println("you lose");
                    }

                } else if (playermove.equals("p")) {

                    if (com_move.equals("r")) {
                        System.out.println("you win");
                    } else {
                        System.out.println("you lose");
                    }

                } else if (playermove.equals("s")) {

                    if (com_move.equals("p")) {
                        System.out.println("you win");
                    } else {
                        System.out.println("you lose");
                    }
                }
                return;
            }
            sc.close();
            System.out.println(playermove + "  is not a valid move");
        }
    }
}