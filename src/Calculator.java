import javafx.util.Pair;

/**
 * Created by Cooper Gilliland on 6/11/2017.
 */
public class Calculator {
    //This Function uses earlier input to determine how tax is calculated
    public void runStatus(Person p)
    {
        //Local size 6 array of pairs
        Pair<Integer, Integer>[] fileStat = new Pair[6];
        //Switch based on class value gathered by earlier input
        switch (p.get$filingStatus())
        {
            //For each case, assign the items in the array to the
            //value pairs associated with the switch variable
            //Then, pass both the local array, and the Person class Object
            //to the function that handles calculation
            case 0:
                fileStat[0] = FilingStatus.Single.$bracketOne;
                fileStat[1] = FilingStatus.Single.$bracketTwo;
                fileStat[2] = FilingStatus.Single.$bracketThree;
                fileStat[3] = FilingStatus.Single.$bracketFour;
                fileStat[4] = FilingStatus.Single.$bracketFive;
                fileStat[5] = FilingStatus.Single.$bracketSix;
                calculate(fileStat, p);
                break;
            case 1:
                fileStat[0] = FilingStatus.MarriedJoint.$bracketOne;
                fileStat[1] = FilingStatus.MarriedJoint.$bracketTwo;
                fileStat[2] = FilingStatus.MarriedJoint.$bracketThree;
                fileStat[3] = FilingStatus.MarriedJoint.$bracketFour;
                fileStat[4] = FilingStatus.MarriedJoint.$bracketFive;
                fileStat[5] = FilingStatus.MarriedJoint.$bracketSix;
                calculate(fileStat, p);
                break;
            case 2:
                fileStat[0] = FilingStatus.MarriedSeparate.$bracketOne;
                fileStat[1] = FilingStatus.MarriedSeparate.$bracketTwo;
                fileStat[2] = FilingStatus.MarriedSeparate.$bracketThree;
                fileStat[3] = FilingStatus.MarriedSeparate.$bracketFour;
                fileStat[4] = FilingStatus.MarriedSeparate.$bracketFive;
                fileStat[5] = FilingStatus.MarriedSeparate.$bracketSix;
                calculate(fileStat, p);

                break;
            case 3:
                fileStat[0] = FilingStatus.HeadOfHouse.$bracketOne;
                fileStat[1] = FilingStatus.HeadOfHouse.$bracketTwo;
                fileStat[2] = FilingStatus.HeadOfHouse.$bracketThree;
                fileStat[3] = FilingStatus.HeadOfHouse.$bracketFour;
                fileStat[4] = FilingStatus.HeadOfHouse.$bracketFive;
                fileStat[5] = FilingStatus.HeadOfHouse.$bracketSix;
                calculate(fileStat, p);
                break;
                //if criterion is not met, output error statement
            default:
                System.out.println("Unrecognized filing status");
                break;
        }
    }
    //this function takes an array of pairs, and a Person class object
    //It will then use the values from the Person, as well as the values
    //from the array associated with the current tax bracket, to calculate
    //the taxes owed by the person
    public  void calculate(Pair<Integer,Integer>[] arrayPair, Person p)
    {
        //Create local variable to handle the changes in the total
        float total = 0;
        float comparisonVar = p.get$taxableIncome();
        //Make sure the total is positive
        if (p.get$taxableIncome() > 0)
        {
            //Check if the total is less than the max for the first bracket
            if (p.get$taxableIncome() < arrayPair[0].getValue()) {
                //if so, calculate based on the total
                total += comparisonVar * (arrayPair[0].getKey() * .01);
            }
            else {
                //if not, only calculate for the maximum bracket value
                total += arrayPair[0].getValue() * (arrayPair[0].getKey() * .01);

            }
            //Remove the calculated value from the running comparison variable
            comparisonVar = comparisonVar - (arrayPair[0].getValue() + 1);

        }
        //check if the total falls into the next bracket
        if (p.get$taxableIncome() > arrayPair[0].getValue())
        {
            //if it falls into the bracket, but does not fall through
            if (p.get$taxableIncome() < arrayPair[1].getValue()) {
                //Add the remainder to the total owed
                total += comparisonVar * (arrayPair[1].getKey() * .01);

            }
            else {
                //Calculate the difference in bracket value and apply the appropriate amount to the running total
                total += (arrayPair[1].getValue() -  (arrayPair[0].getValue() + 1))* (arrayPair[1].getKey() * .01);

            }
            //Remove the calculated value from the running comparison variable
            comparisonVar = comparisonVar - ((arrayPair[1].getValue() -  (arrayPair[0].getValue() + 1)));
        }
        //check if the total falls into the next bracket
        if (p.get$taxableIncome() > arrayPair[1].getValue())
        {
            //if it falls into the bracket, but does not fall through
            if (p.get$taxableIncome() < arrayPair[2].getValue()) {
                //Add the remainder to the total owed
                total += comparisonVar * (arrayPair[2].getKey() * .01);

            }
            else {
                //Calculate the difference in bracket value and apply the appropriate amount to the running total
                total +=  (arrayPair[2].getValue() - (arrayPair[1].getValue() + 1)) * (arrayPair[2].getKey() * .01);

            }
            //Remove the calculated value from the running comparison variable
            comparisonVar = comparisonVar - ((arrayPair[2].getValue() - (arrayPair[1].getValue() + 1)));

        }
        //check if the total falls into the next bracket
        if (p.get$taxableIncome() > arrayPair[2].getValue())
        {
            //if it falls into the bracket, but does not fall through
            if (p.get$taxableIncome() < arrayPair[3].getValue()) {
                //Add the remainder to the total owed
                total += comparisonVar * (arrayPair[3].getKey() * .01);

            }
            else {
                //Calculate the difference in bracket value and apply the appropriate amount to the running total
                total += (arrayPair[3].getValue() - (arrayPair[2].getValue() + 1)) * (arrayPair[3].getKey() * .01);

            }
            //Remove the calculated value from the running comparison variable
            comparisonVar = comparisonVar - ((arrayPair[3].getValue() - (arrayPair[2].getValue() + 1)));


        }
        //check if the total falls into the next bracket
        if (p.get$taxableIncome() > arrayPair[3].getValue())
        {
            //if it falls into the bracket, but does not fall through
            if (p.get$taxableIncome() < arrayPair[4].getValue()) {
                //Add the remainder to the total owed
                total += comparisonVar * (arrayPair[4].getKey() * .01);

            }
            else {
                //Calculate the difference in bracket value and apply the appropriate amount to the running total
                total += (arrayPair[4].getValue() -  arrayPair[3].getValue() + 1) * (arrayPair[4].getKey() * .01);

            }
            //Remove the calculated value from the running comparison variable
            comparisonVar = comparisonVar - ((arrayPair[4].getValue() - (arrayPair[3].getValue() + 1)));

        }
        //check if the total falls into the next bracket
        if (p.get$taxableIncome() > arrayPair[4].getValue())
        {
            //Add the remainder to the total owed
            total += comparisonVar * (arrayPair[5].getKey() * .01);
        }
        p.set$taxOwed(total);
    }
}
