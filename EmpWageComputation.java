


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

		

		 //int workHour=8;
                 //int salary=(empRatePerHour * workHour);

		if(randomNum==isFullTime)

		{

			System.out.println("Employee is Full-Time");
			int workHour=8;
			int salary=(empRatePerHour * workHour);

			System.out.println("salary is:"+salary);
		}
		else if(randomNum==isPartTime)
		//int workHour=4;

                {

                        System.out.println("Employee is Part-Time");
			int workHour=4;
			int salary=(empRatePerHour * workHour);

                        System.out.println("salary is:"+salary);
                }

		else

		{

			System.out.println("Employee is Absent");
	
			System.out.println("salary is:"+0);
		}




	}




}
