package problem;

public class Emp_parttime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int Fulltime =1;
		 int parttime=2;
		 int wageperhr=20;
	      int emphrs=0;
	      int empwage=0;
	      double empcheck =Math.floor(Math.random()*10)%3;
		if (empcheck==Fulltime) {
	    	  emphrs=8;
	      }
		else if(empcheck==parttime){
			emphrs=4;
		}
	    	  else {
	    		  emphrs=0;
	    	  }
		empwage = emphrs*wageperhr;
		System.out.println("Emp wage: "+empwage);
	}

}
