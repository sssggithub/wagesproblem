package problem;

public class Refactor {
	 public static final int Fulltime =1;
	 public static final int parttime=2;
	 public static final int rateperhr=20;
	 public static final int workingday=20;
	 public static final int hrsinmonth=100;
	public static int Empwage() {
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
		totalemphrs+=emphrs;
		System.out.println("day: "+totalworkingdays + "emp hrs :"+emphrs);
	     }
	     totalempwage=totalemphrs*rateperhr;
	     System.out.println("Total Employee Wage:"+totalempwage);
	     return totalempwage;
	}
	public static void main(String[] args) {
		Empwage();
	}

}
