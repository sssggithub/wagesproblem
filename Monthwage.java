package problem;

public class Monthwage {
	 public static final int Fulltime =1;
	 public static final int parttime=2;
	 public static final int wageperhr=20;
	 public static final int workingday=20;
	 public static final int hrsinmonth=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emphrs=0;
	     int empwage=0;
	     int totalempwage=0;
	     int totalemphrs=0;
	     int totalworkingdays=0;
	     while(totalemphrs<=hrsinmonth && totalworkingdays<workingday) {
	    	 totalworkingdays++;
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
	     
		totalempwage+=empwage;
		System.out.println("day: "+totalworkingdays + "emp hrs :"+emphrs);
	     }
	     totalempwage=totalemphrs*wageperhr;
	     System.out.println(" Total Emp wage: "+totalempwage);
	}

}
