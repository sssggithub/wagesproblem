package problem;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final int Fulltime =1;
		 final int parttime=2;
		 final int wageperhr=20;
	      int emphrs=0;
	      int empwage=0;
	      double empcheck =Math.floor(Math.random()*10)%3;
		switch((int)empcheck) {
		case Fulltime :
	    	  emphrs=8;
	      break;
		case parttime:
			emphrs=4;
		break;
	    	  default:
	    		  emphrs=0;
	    	  }
		empwage = emphrs*wageperhr;
		System.out.println("Emp wage: "+empwage);
	}

}
