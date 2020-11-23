


import java.util.Random;

public class EmpWageComputation  {




	public static void main(String[] args) {

		

		Random random=new Random();
		
		int empRatePerHour=20;
		int isFullTime=1;
		int isPartTime=2;


		int randomNum=random.nextInt(3);

		System.out.println("Welcome to Employee Wage Computation Program");
		

		System.out.println("Random number: "+randomNum);

	

		
		switch (randomNum)
		{

		case 1: 
		
			System.out.println("Employee is Full-Time");
			break;
		case 2: System.out.println("Employee is Part-Time");
                	break;

		default: System.out.println("Employee is Absent");

		}




	}




}
