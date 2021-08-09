public class SnakeAndLadder {
    //public static final int START_POSITION = 0;
    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args) {
        double position=0;
        String Player1="Ruchi";
        double DieNumber = Math.floor(Math.random() * 10) % 6;
        System.out.println("The die number is" + DieNumber);
        double Action = Math.floor(Math.random() * 10) % 3;
        System.out.println("The Action is" + Action);

        switch ((int)Action)
        {
            case 0:
                position=position;
                break;

            case 1:
                position=position+DieNumber;
                break;

            case 2:
                position=position-DieNumber;
                break;


        }
        System.out.println("The current position" + position);
    }
}
