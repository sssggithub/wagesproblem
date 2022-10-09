package problem;

public class Empwage_for_Multiple_Company {
	public static final int Fulltime =1;
	 public static final int parttime=2;
	 public static int Empwage(String company,int rateperhr,int numofworkingday,int emphrsinmonth) {
			// TODO Auto-generated method stub
			int emphrs=0;
		     int empwage=0;
		     int totalempwage=0;
		     int totalemphrs=0;
		     int totalworkingdays=0;
		     while(totalemphrs<=emphrsinmonth && totalworkingdays<numofworkingday) {
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
		     System.out.println("Total Employee Wage For Company:"+company +"is:"+totalempwage);
		     return totalempwage;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empwage("Infosys", 20, 20, 100);
Empwage("Wipro", 50, 30, 200);
	}

}
