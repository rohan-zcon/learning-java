import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOperation<T> {
    int operate(int a, int b);
}

public class Java8Demo {

    public static void main(String[] args) {
        /*
        Java8 brought few updates
        - Stream APIs
        - Minimal coding ways like lamba expression
        - Functional Programming
         */

        /** LAMBDA EXPRESSION & FUNCTIONAL Programming **/
        /*
        Functional Programming
        - Its defined in a class as a single abstract method
        - Can be implemented using Lambda Expression
         */
        Add add1 = new Add();
        add1.operate(2, 3);

        MathOperation<Integer> addOperation = (int a, int b) -> a + b;
        MathOperation<Integer> subOperation = (a, b) -> a - b;
        MathOperation<Integer> divOperation = (a, b) -> a / b;

        int addition = addOperation.operate(2, 3);
        int subtraction = subOperation.operate(3, 2);
        int divide = divOperation.operate(6, 2);

        /** PREDICATE-> Functional interface-> holds/returns a boolean valued function **/
        Predicate<Integer> checkIfEven = i -> i % 2 == 0;
        System.out.println("Using Predicate check if 4 is even: " + checkIfEven.test(4));

        Predicate<String> checkStartsWithR = s -> s.toLowerCase().startsWith("r");
        Predicate<String> checkEndsWithN = s -> s.toLowerCase().endsWith("n");
        Predicate<String> checkStartsRAndEndsN = checkStartsWithR.and(checkEndsWithN);
        System.out.println("Using Predicate check if string checkStartsRAndEndsN: " + checkStartsRAndEndsN.test("RohaN"));


        /** FUNCTION -> does some task **/
        Function<Integer, Integer> doubleIt = i -> i * 2;
        Function<Integer, Integer> tripleIt = i -> i * 3;
        System.out.println("Doubling the integer 20: " + doubleIt.apply(20));
        System.out.println("Doubling & then tripling the integer 20: " + doubleIt.andThen(tripleIt).apply(20));

        /** CONSUMER -> consumes something, returns nothing**/
        Consumer<Integer> integerConsumer = i -> System.out.println("Consuming passed integer: " + i);
        integerConsumer.accept(20);

        Consumer<List<Integer>> intListConsumer = x -> {
            for (int i : x) {
                System.out.println("Looping through intListConsumer: " + i);
            }
        };
        List<Integer> integerList = Arrays.asList(3, 90, 23, 42);
        intListConsumer.accept(integerList);

        /** SUPPLIER -> Only supply stuff **/
        Supplier<String> helloWorldSupplier = () -> "Hello World Supplier";
        String s = helloWorldSupplier.get();
        System.out.println(s);

        /** COMBINED EXAMPLE: pass a input number thru supplier, check if its even, if yes then square it, print its square **/
        Supplier<Integer> ipInteger = () -> 100; //pass a input number thru supplier
        Predicate<Integer> checkIfIntIsEven = i -> i % 2 == 0; //check if its even
        Function<Integer, Integer> squareOfInt = i -> i * i; //square it
        Consumer<Integer> consumeInt = i -> System.out.println("Consuming int: " + i); //print its square

        if (checkIfIntIsEven.test(ipInteger.get())) {
            Integer integerSquare = squareOfInt.apply(ipInteger.get());
            consumeInt.accept(integerSquare);
        }

        /** METHOD & CONSTRUCTOR REFERENCE -> pass the metho reference and use it without invoking **/
        Consumer<String> consumeName = n -> System.out.println("Consumed Name: " + n);
        Consumer<String> consumeNameUsingMethodRef = System.out::println;
        consumeName.accept("rohan");
        consumeNameUsingMethodRef.accept("shyan");

        List<String> list = Arrays.asList("Apple", "Samsung", "Oneplus");
        List<Phone> phoneList = list.stream().map(p -> new Phone(p)).collect(Collectors.toList());
        List<Phone> phoneListUsingConsRef = list.stream().map(Phone::new).toList();

    }
}

class Phone {
    String name;

    public Phone(String name) {
        this.name = name;
    }
}

// Ideally we can use the MathOperation interface by implementing it for each operation class like Add, Subtract etc
// This can be implemented using Functional Programming
class Add implements MathOperation {

    @Override
    public int operate(int a, int b) {
        return a + b;
    }

}
