import java.util.Random;

public class CompanyEmpWage {

	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
	}
	public static void main(String[] args) {
		EmpWageBuilderObject dMart=new EmpWageBuilderObject("DMart", 20, 2, 10);
		EmpWageBuilderObject reliance=new EmpWageBuilderObject("Reliance", 10, 4, 20);
	
		dMart.computeEmpWage();
		System.out.println(dMart);
		

		reliance.computeEmpWage();
		System.out.println(reliance);
	
	}



}
