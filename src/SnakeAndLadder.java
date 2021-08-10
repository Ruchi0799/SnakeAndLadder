public class SnakeAndLadder {
    //public static final int START_POSITION = 0;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        double position1 = 0;
        double position2=0;
        String Player1 = "Ruchi";
        int count=0;
        int chance=0;

        //System.out.println("The die number is" + DieNumber);
        //double currentposition = 0;
        while (position1 < 100 && position2<100) {
            double Action = Math.floor(Math.random() * 10) % 3;
            double DieNumber = Math.floor(Math.random() * 10) % 6;
            count++;
            chance++;
            switch ((int) Action) {
                case 0:
                    if (chance%2==0)
                    {
                        position1 = position1;
                        System.out.println("PLAYER1:"+position1);
                    }
                    else if(chance%2==1)
                    {
                        position2=position2;
                        System.out.println("PLAYER2:"+position2);
                    }

                    break;

                case 1:
                    if(chance%2==0)
                    {
                        if (position1 + DieNumber <= 100)
                        {
                            position1 = position1 + DieNumber;
                            System.out.println("PLAYER1:"+position1);
                        }
                        else
                        {
                            position1 = position1;
                        }
                    }
                    else if(chance%2==1)
                    {
                        if (position2 + DieNumber <= 100)
                        {
                            position2 = position2 + DieNumber;
                            System.out.println("PLAYER2:"+position2);
                        }
                        else
                        {
                            position2 = position2;
                        }
                    }

                    break;

                case 2:
                    if (chance%2==0) {
                        if (position1 > DieNumber) {
                            position1 = position1 - DieNumber;
                        } else {
                            position1 = 0;
                        }
                        System.out.println("PLAYER1:"+position1);
                    }
                    else if(chance%2==1)
                    {
                        if (position2 > DieNumber) {
                            position2 = position2 - DieNumber;
                        } else {
                            position2 = 0;
                        }
                        System.out.println("PLAYER2:"+position2);
                    }
                    break;


            }

        }
        System.out.println("End Position of player 1:" +position1);
        System.out.println("End Position of player 2:" +position2);
        if (position1==100) {
            System.out.println(" PLAYER1 Won after rolling die for " + count + " Times");
        }
        else if(position2==100)
        {
            System.out.println(" PLAYER2 Won after rolling die for " + count + " Times");
        }
    }
}