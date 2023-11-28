
import java.util.*;

    class UC12_Wage
    {
        public static void main (String[] args)
        {

            String[] geeks = {"Rahul", "Utkarsh",
                    "Shubham", "Neelam"};

            // Conversion of array to ArrayList
            // using Arrays.asList
            List al = Arrays.asList(geeks);
            System.out.println(al);

            // Adding some more values to the List.
            al.add("Shashank");
            al.add("Nishant");

            System.out.println(al);
        }
    }