package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
    }
    // create a method called calcFeetAndInchesToCentimeters
    // needs two param
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        // validate taht the first param feet is >= 0
        // Validate that second param inces is >= 0 and <=12
        if(feet >= 0 || (inches >= 0 && inches <= 12)){
            // if the parameters ar valid, than calculate how many centimeters
            // comprise the feet and inches passed to this method are return that value
            double inchesToCentimeters = inches * 2.54;
            double feetToCentimeters = feet * 30.48;
            return (inchesToCentimeters + feetToCentimeters);
        }
        // return -1 ifrom the method if either is not true
        return -1d;
    }
    // Create a second method of the same name but iwth only one paramter
    // inches is the param
    public static double calcFeetAndInchesToCentimeters(double inches){


        // validate taht the first param feet is >= 0
        // Validate that second param inces is >= 0 and <=12
        if(inches >= 0){
            // if the parameters ar valid, than calculate how many centimeters
            // comprise the feet and inches passed to this method are return that value
            double Feet = inches / 12;
            calcFeetAndInchesToCentimeters(Feet, inches);
        }
        // return -1 ifrom the method if either is not true
        return -1d;
    }


    // validate that it is >=0
    // return -1 if it is not true
    // but if its valid, then calculate how many feet are in the inches
    // and then here is the tricky part
    // call the other overladed method passing the correct feet adn inches
    // calculated so that it can calculate correctly.
    // hints: Use double for yoru number datatypes
    // 1 inch = 2.54cm and one foot = 12 inches

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("Unnamed player and no score");
        return 0;
    }
//    public static void calculateScore(){
//        System.out.println("Unnamed player and no score");
//    }


}
