package AssignmentForInfant;

public class Calculator {
    public static void main(String[] args){
    }

    public static void openCalculator(){
        System.out.println("Opening the Calculator.....");
    }
    public static void addNumbers(int num1, int num2){
        int result1= num1+num2;
        System.out.println("Two Numbers added :" +num1+ "+" +num2+ "= " +result1 );
    }
    public static void deductNumbers(int num1, int num2) {
        int result2 = num1 - num2;
        System.out.println("Result of Deduction :" +num1+ "-"+num2+ "= " +result2);
    }
    public static void add3Numbers(int numb1, int numb2, int numb3){
            int result3 = numb1 + numb2 +numb3;
            System.out.println("Three Numbers added :" +numb1 + "+" +numb2+ "+"+numb3+ "= " + result3);
        }
}