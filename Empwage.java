package problem;

public class Empwage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Fulltime =1;
		 int wageperhr=20;
	      double empcheck =Math.floor(Math.random()*10)%2;
	      int emphrs;
	      int empwage;
		if (empcheck==Fulltime) {
	    	  emphrs=8;
	      }
	    	  else {
	    		  emphrs=0;
	    	  }
		empwage = emphrs*wageperhr;
		System.out.println("Emp wage: "+empwage);
	}
}
