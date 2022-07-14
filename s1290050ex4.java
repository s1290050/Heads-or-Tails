import java.util.Random;

public class s1290050ex4{
    public static void main(String[] args){
	
	String[] hts = {"Heads","Tails"} ;
	
	Random r = new Random();
	int count=0;
	System.out.println("Tossing a coin...");
	
	for(int i = 0 ; i < 3 ; i++){
	    String ht = hts[r.nextInt(2)];
	    int x = i+1;
	    System.out.println("Round"+ x +":"+ ht);
	    if(ht == hts[0])count++;
	}
	
	int tcount = 3 - count;
	System.out.println("Heads:"+count+", Tails:"+tcount);
	if(count>tcount)System.out.println("You won.");
	else System.out.println("You lost.");
	
    }
}
