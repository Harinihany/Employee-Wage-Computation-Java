


import java.util.Random;

public class EmpWageComputation  {




	public static void main(String[] args) {

		

		Random random=new Random();
		
		
		int isFullTime=1;
		int isPartTime=2;
		int numOfWorkingDays=20;
		int empHrs=0;
                int salary=0;
		int totalSalary=0;
		int maxHrs=1000;
		int randomNum=random.nextInt(3);
		int totalWorkingDays=0
		
		System.out.println("Welcome to Employee Wage Computation Program");
		

		System.out.println("Random number: "+randomNum);
		while( empHrs < maxHrs && totalWorkingDays < numOfWorkingDays ) { 
		(totalWorkingDays++)
		
		System.out.println("total working days is"+totalWorkingDays);

		switch(randomNum)
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

		totalEmpHrs=maxHrs*empHrs;
                System.out.println("total employee hours is "+totalEmpHrs);
		
		}
		totalSalary1=totalWorkHours*empHrs
		 System.out.println("Salary for the month is "+totalSalary1);

		
}
