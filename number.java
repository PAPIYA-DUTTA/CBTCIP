import static java.lang.Math.*;
import java.util.Scanner;

public class number {
final int max_range=100;
final int min_range=1;
 
	public static void main(String[] args) {
		 
		System.out.println("Random number guesing game");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter maxround:");
        int maxround=sc.nextInt();
        int tscore=0;
        
        for(int i=1;i<=maxround;i++) {
			int number=(int)(Math.random()*100);
        int attempt=0;
        System.out.println("enter maxattempt:");
        int maxattempt=sc.nextInt();
       
        while(attempt<maxattempt) {
        		System.out.println("Guess the number between 1 to 100:");
        	int usernumber=sc.nextInt();
        	attempt =attempt+1;
        	int leftattempt=maxattempt-attempt;
        	
        	if(number==usernumber) {
        		int score=maxattempt-attempt;
        	    tscore=tscore+score;
        	   System.out.printf("yah successfully guessed;attempt=%d,score=%d\n",attempt,score);
               break;
               
			
        	   
        	}
        	else if(number<usernumber) {
        		System.out.printf("number is less than usernumber;lefteftattempt=%d \n",leftattempt);
        		
        	}
        	else if(number>usernumber){
        		System.out.printf("number is greater than usernumber;lefteftattempt=%d \n",leftattempt);
        	}
        }
        if(attempt==maxattempt){
        
        System.out.println("score=0,\nleftattempt=0");
        System.out.printf("random number\n:");
        System.out.println(number);

        }
	}
	System.out.println("gameover");
	System.out.println("total score:"+tscore);
	}

}