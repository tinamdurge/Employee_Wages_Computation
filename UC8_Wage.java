public class UC8_Wage {
	public static final int IS_FULL_TIME = 1;
	   public static final int IS_PART_TIME = 2;

	    /*
	     * Creating calculate wage method
	     */
	    static void calculateWage(String company, int wageperhour, int dayPerMonth, int workHourPerMonth) {

	        int emphrs;
	        int totalhrs = 0;
	        int dailywage;
	        int day = 0;
	        int totalwage = 0;

	        while ((totalhrs < workHourPerMonth) && (day < dayPerMonth)) {
	            int attendance = (int) (Math.floor(Math.random() * 10)) % 3;

	            switch (attendance) {
	                case IS_FULL_TIME:
	                    emphrs = 8;
	                    break;
	                case IS_PART_TIME:
	                    emphrs = 4;
	                    break;
	                default:
	                    emphrs = 0;
	                    break;
	            }
	            totalhrs = totalhrs + emphrs;
	            dailywage = wageperhour * emphrs;
	            totalwage = totalwage + dailywage;
	            day++;
	            System.out.println("Day " + day + " Emp work hour " + emphrs + " wage is " + dailywage);
	        }
	        System.out.println("Total work hours is: " + totalhrs);
	        System.out.println("Total work days are: " + day);
	        System.out.println("Total wage of company " + company + " is " + totalwage);
	    }

	    public static void main(String[] args) {

	        calculateWage("Tata", 10, 20, 100);
	        System.out.println("--------------------------------");
	        calculateWage("Reliance", 20, 22, 90);
	        System.out.println("--------------------------------");
	        calculateWage("Mahindra", 15, 24, 95);
	    }
}