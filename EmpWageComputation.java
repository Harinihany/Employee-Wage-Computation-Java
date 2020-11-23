


import java.util.Random;

public class EmpWageComputation  {




	public static void main(String[] args) {

		

		Random random=new Random();
		//int salary=0;
		int empRatePerHour=20;
		

		int randomNum=random.nextInt(2);

		System.out.println("Welcome to Employee Wage Computation Program");
		

		System.out.println("Random number: "+randomNum);

		

		 int workHour=8;
                 int salary=(empRatePerHour * workHour);

		if(randomNum==1)

		{

			System.out.println("Employee is Present");
			
			System.out.println("salary is:"+salary);
		}

		else

		{

			System.out.println("Employee is Absent");
	
			System.out.println("salary is:"+0);
		}




	}




}
