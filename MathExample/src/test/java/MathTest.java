import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MathTest {
    private ExampleMath example = new ExampleMath();
    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> createList(List<Integer> nums){
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            Integer limit = random.nextInt(10) + 1;
            list.add(limit);
        }

        return list;
    }

    @Test
    void additionTest(){
        List<Integer> testList = createList(list);

        int expected = 0;

        for(int i = 0; i < testList.size(); i++){
            expected+=list.get(i);
        }

        int actual = example.add(testList);

        Assertions.assertEquals(expected, actual, "The totals are the same");
    }

    @Test
    void averageTest(){
        List<Double> testList = createList(list).stream().map(num -> Double.valueOf(num)).collect(Collectors.toList());

        int expected = 0;

        for(int i = 0; i < testList.size(); i++){
            expected += testList.get(i);
        }

        double expectedAns = expected / Double.valueOf(testList.size());

        double actual = example.average(testList);

        Assertions.assertEquals(expectedAns, actual, "The totals are the same");
    }

    @Test
    void subtratTest(){
        List<Integer> testList = createList(list);

        int expected = testList.get(0);

        for(int i = 1; i < testList.size(); i++){
            expected -= testList.get(i);
        }

        int actual = example.subtract(testList);

        Assertions.assertEquals(expected, actual, "The math appears to be correct");

    }

    @Test
    void multiplyTest(){
        List<Integer> testList = createList(list);

        int total = testList.get(0);

        for(int i = 1; i < testList.size(); i++){
            total*=testList.get(i);
        }

        int expected = example.multiply(testList);

        Assertions.assertEquals(expected, total, "The math appears to be correct");
    }
}
