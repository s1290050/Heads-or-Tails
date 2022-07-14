import java.util.Random;
import java.util.Scanner;

public class s1290050ex4{
    public static void main(String[] args){
	
	String[] hts = {"Heads","Tails"} ;
	
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	int count=0;
	System.out.println("Who are you?");
	System.out.print(">");
	String name = sc.nexLine();
	System.out.println("Hello, "+name+"!");

	
	System.out.println("Tossing a coin...");
	
	for(int i = 0 ; i < 3 ; i++){
	    String ht = hts[r.nextInt(2)];
	    int x = i+1;
	    System.out.println("Round"+ x +":"+ ht);
	    if(ht == hts[0])count++;
	}
	
	int tcount = 3 - count;
	System.out.println("Heads:"+count+", Tails:"+tcount);
	
    }
}
