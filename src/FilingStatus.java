import javafx.util.Pair;

/**
 * Created by Cooper on 6/7/2017.
 */
//this class holds all the filing status bracket data
    //it is only being used for storage
public class FilingStatus {
    //The following classes hold pairs associated with their relative bracket info
    //each pair has a key representative of percentage, and a value associated with
    //the maximum allowable value in the tax bracket
    public static class Single{
        public static Pair<Integer, Integer> $bracketOne = new Pair (10, 8350);
        public static Pair<Integer, Integer> $bracketTwo = new Pair (15, 33950);
        public static Pair<Integer, Integer> $bracketThree = new Pair (25, 82250);
        public static Pair<Integer, Integer> $bracketFour = new Pair (28, 171550);
        public static Pair<Integer, Integer> $bracketFive = new Pair (33, 372950);
        public static Pair<Integer, Integer> $bracketSix = new Pair (35, 372951);
    }
    public static class MarriedJoint{
        public static Pair<Integer, Integer> $bracketOne = new Pair (10, 16700);
        public static Pair<Integer, Integer> $bracketTwo = new Pair (15, 67900);
        public static Pair<Integer, Integer> $bracketThree = new Pair (25, 137050);
        public static Pair<Integer, Integer> $bracketFour = new Pair (28, 208850);
        public static Pair<Integer, Integer> $bracketFive = new Pair (33, 372950);
        public static Pair<Integer, Integer> $bracketSix = new Pair (35, 372951);
    }
    public static class MarriedSeparate {
        public static Pair<Integer, Integer> $bracketOne = new Pair (10, 8350);
        public static Pair<Integer, Integer> $bracketTwo = new Pair (15, 33950);
        public static Pair<Integer, Integer> $bracketThree = new Pair (25, 68525);
        public static Pair<Integer, Integer> $bracketFour = new Pair (28, 104425);
        public static Pair<Integer, Integer> $bracketFive = new Pair (33, 186475);
        public static Pair<Integer, Integer> $bracketSix = new Pair (35, 186476);
    }
    public static class HeadOfHouse{
        public static Pair<Integer, Integer> $bracketOne = new Pair (10, 11950);
        public static Pair<Integer, Integer> $bracketTwo = new Pair (15, 45500);
        public static Pair<Integer, Integer> $bracketThree = new Pair (25, 117450);
        public static Pair<Integer, Integer> $bracketFour = new Pair (28, 190200);
        public static Pair<Integer, Integer> $bracketFive = new Pair (33, 372950);
        public static Pair<Integer, Integer> $bracketSix = new Pair (35, 372951);
    }
}
