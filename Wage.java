package problem;

public class Wage {
	 public static final int Fulltime =1;
	 public static final int parttime=2;
	 public static final int wageperhr=20;
	 public static final int workingday=20;
	public static void main(String[] args) {
	 int emphrs=0;
     int empwage=0;
     int totalempwage=0;
     for(int day=0;day<workingday;day++) {
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
	totalempwage+=empwage;
	System.out.println("Emp wage: "+empwage);
     }
     System.out.println(" Total Emp wage: "+totalempwage);
	}
}
