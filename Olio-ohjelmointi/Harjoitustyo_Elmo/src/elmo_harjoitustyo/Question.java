package elmo_harjoitustyo;
import java.util.*;
//Rakentaja metodi Question
public class Question {
	
	//Esitell‰‰n j‰senmuuttujat
	Scanner input = new Scanner(System.in);
    boolean wrong = true;
    Random multiple = new Random();
    int num1 = 1 + multiple.nextInt(9);
    int num2 = 1 + multiple.nextInt(9);

    public void Ask() {
    	
    	//Kysyt‰‰n k‰ytt‰j‰lt‰ kertotauluja
        System.out.println(askQuestion(num1, num2));
        int answer = input.nextInt();
        //Tehd‰‰n looppi
        while(answer == num1 * num2) {    
	        //Luodaan if else looppi jossa testataan onko vastaus oikein
	        //ja jos on se palautuu ohjelman alkuun ja kysyy uudestaan
	        if(answer == num1 * num2) {
	            System.out.println("Oikea vastaus!");
	            wrong = false;
	            }
	
	        else {
	            System.out.println("V‰‰r‰ vastaus. Yrit‰ uudelleen");
	        }
        }
        //Suljetaan skanneri, jotta se ei herjaa turhaan
        input.close();
    }

    //metodi joka palauttaa kysymyksen
    public String askQuestion(int x, int y){
        return "Kuinka paljon on " + x + " kertaa " + y + "?";
    }

}