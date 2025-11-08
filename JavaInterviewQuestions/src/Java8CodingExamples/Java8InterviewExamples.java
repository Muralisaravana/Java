package Java8CodingExamples;

import java.time.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

// Demonstrates all core Java 8 features (Interview Essentials)
public class Java8InterviewExamples {

    public static void main(String[] args) {

        // --------------------------------------------------------------------
        // 1️⃣ Lambda Expression — Write a lambda for Runnable
        // --------------------------------------------------------------------
        System.out.println("1️⃣ Lambda Expression Example:");
        Runnable r = () -> System.out.println("Running thread using lambda!");
        new Thread(r).start();

        // --------------------------------------------------------------------
        // 2️⃣ Functional Interfaces — The Big Four
        // --------------------------------------------------------------------
        System.out.println("\n2️⃣ Functional Interfaces Example:");

        // Function<T,R> — takes input, returns output
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println("Length of 'Murali' = " + lengthFunc.apply("Murali"));

        // Predicate<T> — takes input, returns boolean
        Predicate<String> startsWithS = s -> s.startsWith("S");
        System.out.println("Does 'Saravanan' start with S? " + startsWithS.test("Saravanan"));

        // Consumer<T> — takes input, performs action
        Consumer<String> printer = s -> System.out.println("Hello, " + s);
        printer.accept("Selva");

        // Supplier<T> — no input, returns output
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());

        // --------------------------------------------------------------------
        // 3️⃣ Method Reference — System.out::println
        // --------------------------------------------------------------------
        System.out.println("\n3️⃣ Method Reference Example:");
        List<String> names = List.of("Murali", "Saravanan", "Selva");
        names.forEach(System.out::println); // same as s -> System.out.println(s)

        // --------------------------------------------------------------------
        // 4️⃣ Streams — Group Employees by Department
        // --------------------------------------------------------------------
        System.out.println("\n4️⃣ Stream API Example (Group Employees by Department):");

        List<Employee> employees = List.of(
            new Employee("Murali", "HR"),
            new Employee("Saravanan", "IT"),
            new Employee("Selva", "IT"),
            new Employee("Kumar", "Finance")
        );

        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        byDept.forEach((dept, empList) -> {
            System.out.println(dept + " : " +
                empList.stream().map(Employee::getName).collect(Collectors.toList()));
        });

        // --------------------------------------------------------------------
        // 5️⃣ Optional — Avoid NullPointerException
        // --------------------------------------------------------------------
        System.out.println("\n5️⃣ Optional Example:");
        String name = null;
        Optional<String> optName = Optional.ofNullable(name);

        // If name is null, use default value
        String finalName = optName.orElse("Guest");
        System.out.println("User name: " + finalName);

        // --------------------------------------------------------------------
        // 6️⃣ Default Method — Why introduced
        // --------------------------------------------------------------------
        System.out.println("\n6️⃣ Default Method Example:");
        Vehicle car = new Car();
        car.start();  // implemented in Car
        car.horn();   // default method in Vehicle interface

        // --------------------------------------------------------------------
        // 7️⃣ Date API — Find someone's age using LocalDate
        // --------------------------------------------------------------------
        System.out.println("\n7️⃣ Date & Time API Example:");
        LocalDate birthDate = LocalDate.of(1995, 5, 12);
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate, today);
        System.out.println("Age is: " + age.getYears() + " years");
    }
}

// --------------------------------------------------------------------
// Supporting classes for examples
// --------------------------------------------------------------------

// For Streams example
class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName() { return name; }
    public String getDepartment() { return department; }
}

// For Default Method example
interface Vehicle {
    void start();  // abstract method

    // default method introduced in Java 8
    default void horn() {
        System.out.println("Beep Beep! (Default horn sound)");
    }

    // static method also allowed in Java 8
    static void showType() {
        System.out.println("This is a Vehicle interface");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started!");
    }
}
