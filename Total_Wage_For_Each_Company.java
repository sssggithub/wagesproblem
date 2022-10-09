package problem;

public class Total_Wage_For_Each_Company {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRateperHour;
	private final int maxHourInMonth;
	private final int numOfWorkingDay;
	private int totalEmpWage;

	public Total_Wage_For_Each_Company(String company, int maxHourInMonth, int numOfWorkingDay, int empRateperHour) {
		this.company = company;
		this.empRateperHour = empRateperHour;
		this.maxHourInMonth = maxHourInMonth;
		this.numOfWorkingDay = numOfWorkingDay;

	}

	public void EmpWage() {
		int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;
		while (totalEmpHour <= maxHourInMonth && totalWorkingDays < numOfWorkingDay) {
			totalWorkingDays++;
			int empcheck = (int) (Math.random() * 10) % 3;
			switch (empcheck) {
			case IS_FULL_TIME:
				empHour = 8;
				break;
			case IS_PART_TIME:
				empHour = 4;
				break;
			default:
				empHour = 0;
			}
			totalEmpHour += empHour;
			System.out.println("Day#:" + totalWorkingDays + " Emp Hr: " + empHour);
		}
		totalEmpWage = totalEmpHour * empRateperHour;
	}

	public String toString() {
		return "Toatl wage for company " + company + " is = " + totalEmpWage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total_Wage_For_Each_Company Dell = new Total_Wage_For_Each_Company("Dell", 100, 20, 20);
		Total_Wage_For_Each_Company Wipro = new Total_Wage_For_Each_Company("Wipro", 100, 24, 30);
		Dell.EmpWage();
		System.out.println(Dell);
		Wipro.EmpWage();
		System.out.println(Wipro);
	}

}
