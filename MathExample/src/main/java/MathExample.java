import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MathExample {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String userAns = "";

        System.out.println("Please enter some numbers that you would like to do an operation on.");


        do{
            try{
                Integer num = Integer.parseInt(sc.next());
                numbers.add(num);
                System.out.println(numbers);
                System.out.println("Do you want to add another number? Enter 'y' for yes or 'n' for no.");
                userAns = sc.next();
                if(userAns.equalsIgnoreCase("y")){
                    System.out.println("Enter another number: ");
                }
            }catch(Exception e){
                e.getMessage();
            }
        }while(userAns.equalsIgnoreCase("y"));


        ExampleMath mathCalc = new ExampleMath();
        System.out.println("Enter what kind of calcuation you want to do?");
        String calc = sc.next();

        switch(calc){
            case "multiply":
                mathCalc.multiply(numbers);
                break;
            case "average":
                mathCalc.average(numbers.stream().map(num -> Double.valueOf(num)).collect(Collectors.toList()));
                break;
            case "add":
                mathCalc.add(numbers);
                break;
            case "subtract":
                mathCalc.subtract(numbers);
                break;
            default:
                mathCalc.add(numbers);
                break;
        }
    }
}