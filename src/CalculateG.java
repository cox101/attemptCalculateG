public class CalculateG {
    // Earth's gravity in m/s^2
    public static double gravity =-9.81;
    public static double fallingTime = 30;
    public static double initialVelocity = 0.0;
    public static double finalVelocity ;
    public static double initialPosition = 0.0;
    public static double finalPosition ;
   public static double calculateFinalPosition(){
       double finalPosition=((0.5*gravity*Math.pow(fallingTime,2))+initialVelocity*fallingTime+initialPosition)/fallingTime;
   return finalPosition;
   }
    public static double calculateFinalVelocity() {
        double finalVelocity = (gravity * fallingTime + initialVelocity) / fallingTime;
        return finalVelocity;
    }
    public static double multiplication(double firstDigit,double secondDigit){
        return firstDigit*secondDigit;
   }
    public static double square(double value){
        return Math.pow(value,2);
    }
    public static double summation(double firstNumber,double secondNumber){
        return firstNumber*secondNumber;
    }
    public static double outline(String message,double result) {
        System.out.println(message + "" + result);
        return result;
    }
    public static void main(String[] arguments){
       finalPosition=calculateFinalPosition();
       finalVelocity=calculateFinalVelocity();
       System.out.println("The object's position after " + fallingTime + " seconds is "+ finalPosition +  "m.");
       System.out.println("The object's velocity after "+fallingTime+ "seconds is "+ finalVelocity +"m/s.");
       double result= multiplication(square(finalVelocity),summation(finalPosition,finalVelocity));

       double firstDigit=12;
       double secondDigit=14;
       double firstNumber=15;
       double secondNumber=30;
       double value=10;


        double multiplicationResult = multiplication(firstDigit,secondDigit);
        double summationResult = summation(firstNumber, secondNumber);
        double squareResult = square(value);

        outline("Multiplication: ", multiplicationResult);
        outline("Summation: ", summationResult);
        outline("Square: ", squareResult);
    }

}
