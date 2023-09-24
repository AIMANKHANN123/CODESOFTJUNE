import java.util.Random;
import java.util.Scanner;

class Game{

    public int number;
    public int userinput_no;
    public int noOfGuesses = 0; /*gusses initialize 0 because it can be increment when user take inputs  */

    /*Getter and setter method */
    public int getGuesses(){
        return noOfGuesses;
    }
    public void setGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    /*Constructor */
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    
    /*Metod to takae input by user whch return type is none */
    void takeUserInput(){
        
        Scanner sc = new Scanner(System.in);
        userinput_no = sc.nextInt();
    }

    /*Method to check number which is true or not  */
    boolean isCorrectNumber(){
        noOfGuesses ++;
        if (userinput_no == number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            System.out.println("\n\t\t=====FINISHED GAME=======");
            return true;
        }
        else if(userinput_no < number){
            System.out.println("Your Guess is Lower then Actual Number ");

        }
        else if(userinput_no > number){
            System.out.println("Your Guess is Higher then Actual Number");
        }
        return false;

    }
}

/*class GuessGame */
public class GuesssGame{

    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t==========START GAME NOW===========\n\nGuess the Number from 1 to 100");
        Game out = new Game(); /*create a object of Game class */
        boolean b = false;
        while(!b){     /*make loop which iterate until when no of gusses equal to number */
        out.takeUserInput();
        b = out.isCorrectNumber();
        }
        
}
}
