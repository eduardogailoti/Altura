package entities;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public static double averageHeight(Person[] people) {
        double sumHeight = 0;
        for (Person p : people) {
            sumHeight += p.getHeight();
        }
        return sumHeight / people.length;
    }

    public static double percentMinor(Person[] people) {
        int minor = 0;

        System.out.println("Pessoas com menos de 16 anos:");

        for (Person p : people) {
            if (p.getAge() < 16) {
                System.out.println(p.getName());
                minor++;
            }
        }

        double percent = (double) minor / people.length * 100;
        return percent;
    }
}
