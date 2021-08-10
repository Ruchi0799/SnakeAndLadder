public class SnakeAndLadder {
    //public static final int START_POSITION = 0;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        double position = 0;
        String Player1 = "Ruchi";
        int count=0;

        //System.out.println("The die number is" + DieNumber);
        //double currentposition = 0;
        while (position < 100) {
            double Action = Math.floor(Math.random() * 10) % 3;
            double DieNumber = Math.floor(Math.random() * 10) % 6;
            count++;
            switch ((int) Action) {
                case 0:
                    position = position;
                    //System.out.println(position);
                    break;

                case 1:
                    if(position+DieNumber<=100) {
                        position = position + DieNumber;
                        System.out.println(position);
                    }
                    else
                    {
                        position=position;
                    }

                    break;

                case 2:
                    if(position>DieNumber)
                    {
                        position = position - DieNumber;
                    }
                    else
                    {
                        position=0;
                    }
                    //System.out.println(position);
                    break;


            }

        }

        System.out.println("You Won after rolling die for " + count + " Times");
    }
}