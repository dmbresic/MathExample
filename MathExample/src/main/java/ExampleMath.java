import java.util.ArrayList;
import java.util.List;


public class ExampleMath {

    public ExampleMath(){}

    public int multiply(List<Integer> numbers){
        int total = 1;

        for(int num : numbers){
            total *= num;
        }

        System.out.println("Multiplying these numbers gives us: " + total  + "\n" + isItEven(total));

        return total;
    }

    public double average(List<Double> numbers){

        double divided = 0;

        for(int i = 0; i < numbers.size(); i++){
            divided += numbers.get(i);
            System.out.println(divided);
        }

        divided /= numbers.size();
        Math.floor(divided);



        return divided;
    }

    public int add(List<Integer> numbers){

        int total = 0;

        for(int num : numbers){
            total+=num;
        }

        System.out.println("Your numbers add to: " + total + "\n" + isItEven(total));
        return total;
    }

    public Integer subtract(List<Integer> numbers){

        int total = numbers.get(0);

        for(int i = 1; i < numbers.size(); i++){
            total-=numbers.get(i);
        }

        System.out.println("Your numbers subtracted returns: " + total + "\n" + isItEven(total));
        return total;
    }

    public String isItEven(Integer num){
        if(num%2 == 0){
            return "It's all Even-Steven over here!";
        }else{
            return "Not so Even-Steven!";
        }
    }
}
