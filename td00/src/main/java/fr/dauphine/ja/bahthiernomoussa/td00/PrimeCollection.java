package fr.dauphine.ja.bahthiernomoussa.td00;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	ArrayList<Integer> numbers;
	
	public PrimeCollection() {
		numbers = new ArrayList<>();
	}
	
	public ArrayList<Integer> initRandom(int n, int m){
		for(int i=0; i<n; i++) {
			int nombre = (int)(Math.random()*(m+1));
				numbers.add(nombre);
		}
		return numbers;
		
	}
	
	public boolean isPrime(int p) {
		if(p<=1) return false;
		for(int x=2; x<=(int)Math.sqrt(p); x++) {
			if(p%x==0)return false;
		}
		return true;
	}
	
	public void printPrimes() {
		for(int i=0; i<numbers.size();i++) {
			if(isPrime(numbers.get(i))) System.out.println(numbers.get(i));
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Bonjour!" );
        
       PrimeCollection pc = new PrimeCollection();
       pc.initRandom(100, 2000);
       
       pc.printPrimes();
    }
}
