


import java.util.Random;

public class EmpWageComputation  {




	public static void main(String[] args) {

		

		Random random=new Random();
		
		int empRatePerHour=20;
		int isFullTime=1;
		int isPartTime=2;
		int numOfWorkingDays=20;
		int empHrs=0;
                int salary=0;
		int totalSalary=0;

		int randomNum=random.nextInt(3);

		System.out.println("Welcome to Employee Wage Computation Program");
		

		System.out.println("Random number: "+randomNum);
		for (int day=1; day<=20; day++)	{	
		switch (randomNum)
		{

		case 1: 
		
			System.out.println("Employee is Full-Time");
			empHrs=8;
			break;
		case 2: System.out.println("Employee is Part-Time");
			empHrs=4;
			break;
                default: System.out.println("Employee is Absent");
			empHrs=0;
		}

		perDaySalary=empRatePerHour*empHrs;
                System.out.println("Salary for the day is "+perDaySalary);
		totalSalary1=totalSalary+perDaySalary
		}

		 System.out.println("Salary for the month is "+totalSalary1);

		
}
