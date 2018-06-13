import java.util.Scanner;

/**
 * Created by Cooper on 6/7/2017.
 */
public class TaxComp {
    //main method
    public static void main (String [] args)
    {
        //provide error handling
        try {
            //Instantiate a Scanner, Person, and Calculator object;
            Scanner cin = new Scanner(System.in);
            Person $person = new Person();
            Calculator $calc = new Calculator();
            //Local variables to transfer user input
            int $fileStat;
            float $income;
            //Print query to console
            System.out.print("\nEnter the filing status: ");
            //Collect next integer input
            $fileStat = cin.nextInt();
            //Print query to console
            System.out.print("\nEnter the taxable income: ");
            //Collect next floating point input
            $income = cin.nextFloat();
            //Use class mutator to pass the input variables into the class object
            $person.set$filingStatus($fileStat);
            $person.set$taxableIncome($income);
            //call the Calculator method and pass the Person object to it
            $calc.runStatus($person);
            //Output the correct variable from Person using the associated accessor
            System.out.printf("\nTax is: %.2f", $person.get$taxOwed());

        }
        //Catch any exceptions
        catch(Throwable e)
        {
            //output error message
            System.out.println("Error detected. Terminating process.");
        }
    }

}
