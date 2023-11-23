public class UC7_Wage {

	 // Initialize class variables
	 public static int IS_FULL_TIME=0;
  	 public static int IS_PART_TIME=1;
  	 public static int emphrs=0;
  	 public static int wageperhour=20;
  	 public static int totalworkingdays=0;
  	 public static int totalworkinghrs=0;
  	 public static int Max_Hours=100;
  	 public static int Max_Working_Days=20;

	// Initialize class Method calculWageMonth
	public static int calculWageMonth () {

		while (totalworkinghrs < Max_Hours && totalworkingdays <= Max_Working_Days) {
   			totalworkingdays++;
  			int num = (int) Math.floor((Math.random() *10 ) % 2);
  			System.out.println(num);
  			if(num == IS_FULL_TIME)  // 0 -> Employee FullTime Present
  			{
				emphrs=8;
  			}
  			else if(num == IS_PART_TIME)  // 1 -> Employee PartTime Present
  			{
				emphrs=4;
  			}
  			else
				System.out.println("Went Wrong");
			totalworkinghrs += emphrs;
			System.out.println("TotalWorkingHours = "+totalworkinghrs);
  		}
                return totalworkinghrs;
 	}

 	public static void main(String[] args) {

		// Print the Employee Total Wage
  		calculWageMonth();
		int totalempwage=totalworkinghrs*wageperhour;
		System.out.println("TotalEmpWage = "+totalempwage);
  	}
}