package in.ineuron.main;
import java.util.Scanner;


class Guesser{
	int guessnum;
	int guess(){
		Scanner input = new Scanner(System.in);
		System.out.println("Guesser guess the number");
		guessnum = input.nextInt();
	    return guessnum;
	}
}
class Player{
	int guessNum;
	int guess(){
		Scanner input = new Scanner(System.in);
		guessNum = input.nextInt();
		return guessNum;
	}
}
class Umpire{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	void collectnumfromguesser(){
		Guesser g = new Guesser();
	    numfromguesser=g.guess();
	    if(numfromguesser<0 || numfromguesser>100) {
	    	System.out.println("Guesser please guess the number Greater than 0 and Lesser than 100");
	    	numfromguesser=g.guess();
	    }
	}
	void collectnumfromplayer()
	{
		System.out.println("player 1 guess the number");
		Player p1 = new Player();
		numfromplayer1=p1.guess();
		if(numfromplayer1<0 || numfromplayer1>100) {
			System.out.println("Player 1 please guess the number Greater than 0 and Lesser than 100");
			numfromplayer1=p1.guess();
		}
		System.out.println("player 2 guess the number");
		Player p2 = new Player();
		numfromplayer2=p2.guess();
		if(numfromplayer2<0 || numfromplayer2>100) {
			System.out.println("Player 2 please guess the number Greater than 0 and Lesser than 100");
			numfromplayer2=p2.guess();
		}
		System.out.println("player 3 guess the number");
		Player p3 = new Player();
		numfromplayer3=p3.guess();
		if(numfromplayer3<0 || numfromplayer3>100) {
			System.out.println("Player 3 please guess the number Greater than 0 and Lesser than 100");
			numfromplayer3=p3.guess();
		}
	}
	int min=0;
	
	void firstRound() {
		
		
		if((numfromplayer1==numfromguesser)&&(numfromplayer2!=numfromguesser)&&(numfromplayer3!=numfromguesser))
		{
			System.out.println("player 1 won the match in first round");
			
			min=Math.min(numfromplayer2, numfromplayer1);
		}
		else if((numfromplayer2==numfromguesser)&&(numfromplayer1!=numfromguesser)&&(numfromplayer3!=numfromguesser))
		{
			System.out.println("player 2 won the match in first round");
			
			min=Math.min(numfromplayer1, numfromplayer3);
		}
		else if((numfromplayer3==numfromguesser)&&(numfromplayer1!=numfromguesser)&&(numfromplayer2!=numfromguesser))
		{
			System.out.println("player 3 won the match in first round");
			
			min = Math.min(numfromplayer1, numfromplayer2);
		}
		
		else {
			System.out.println("All guessed the wrong number so least number guessed person gets eliminated");
		}
		
		if(min==numfromplayer1) {
			System.out.println("player 1 got eliminated in first round");
			
		}
		else if(min==numfromplayer2)
		{
			System.out.println("player 2 got eliminated in first round");
		}
		else {
			System.out.println("player 3 got eliminated in first round");
		}
		
	}
	
	
	void secondRound() {
		
	
		collectnumfromguesser();
		
		if(numfromplayer1==min)
		{
			int data1,data2;
			System.out.println("player 2 guess the Number");
			Player p2 = new Player();
			data1=p2.guess();
			if(data1<0 || data1>100) {
				System.out.println("Player 2 please guess the number Greater than 0 and Lesser than 100");
				data1=p2.guess();
			}
			
			System.out.println("player 3 guess the Number");
			Player p3 = new Player();
			data2=p3.guess();
			if(data2<0 ||data2>100) {
				System.out.println("Player 3 please guess the number Greater than 0 and Lesser than 100");
				data2=p3.guess();
			}
			if(data1==numfromguesser && data2!=numfromguesser) {
				System.out.println("player 2 won the finals");
				System.out.println("player 3 Runner-Up");
			}
			else {
				System.out.println("player 3 won the finals");
				System.out.println("Player 2 Runner-up");
			}
		}
		
		
		
		else if(numfromplayer2 == min)
		{
			int data1,data2;
			System.out.println("player 1 guess the Number");
			Player p1 = new Player();
			data1=p1.guess();
			if(data1<0 || data1>100) {
				System.out.println("Player 1 please guess the number Greater than 0 and Lesser than 100");
				data1=p1.guess();
			}
			
			System.out.println("player 3 guess the Number");
			Player p3 = new Player();
			data2=p3.guess();
			if(data2<0 ||data2>100) {
				System.out.println("Player 3 please guess the number Greater than 0 and Lesser than 100");
				data2=p3.guess();
			}
			
			if(data1==numfromguesser && data2!=numfromguesser) {
				System.out.println("player 1 won the finals");
				System.out.println("player 3 Runner-up");
			}
			else {
				System.out.println("player 3 won the finals");
				System.out.println("player 1 Runner-Up");
			}
		}
		else {
			
			int data1,data2;
			System.out.println("player 1 guess the Number");
			Player p1 = new Player();
			data1=p1.guess();
			if(data1<0 || data1>100) {
				System.out.println("Player 1 please guess the number Greater than 0 and Lesser than 100");
				data1=p1.guess();
			}
			System.out.println("player 2 guess the Number");
			Player p2 = new Player();
			data2=p2.guess();
			if(data1<0 || data1>100) {
				System.out.println("Player 2 please guess the number Greater than 0 and Lesser than 100");
				data2=p2.guess();
			}
			
			
			if(data1==numfromguesser && data2!=numfromguesser) {
				System.out.println("player 1 won the finals");
				System.out.println("player 2 Runner-up");
			}
			else {
				System.out.println("player 2 won the finals");
				System.out.println("player 1 Runner-Up");
			}
		}
	}
}
public class Guessergame {

	public static void main(String[] args) {
		System.out.println("!!!WELCOME TO NUMBER GUESSER COMPETITION!!!");
		Umpire u = new Umpire();
		u.collectnumfromguesser();
		u.collectnumfromplayer();
		System.out.println();
		System.out.println("!!!PLAYERS WELCOME TO FIRST ROUND!!!");
		u.firstRound();
		System.out.println();
		System.out.println("!!!PLAYERS WELCOME TO FINAL ROUND!!!");
		u.secondRound();
		
		System.out.println("!!!!END OF THE GUESSER GAME!!!!");
		
		

	}

}
