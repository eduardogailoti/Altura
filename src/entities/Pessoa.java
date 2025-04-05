package entities;

public class Pessoa {
    private String name;
    private int age;
    private double height;

    public Pessoa(String name, int age, double height) {
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

    public static double averageHeight(Pessoa[] pessoas) {
        double sumHeight = 0;
        for (Pessoa p : pessoas) {
            sumHeight += p.getHeight();
        }
        return sumHeight / pessoas.length;
    }

    public static double percent(Pessoa[] pessoas) {
        int menores = 0;

        System.out.println("Pessoas com menos de 16 anos:");

        for (Pessoa p : pessoas) {
            if (p.getAge() < 16) {
                System.out.println(p.getName());
                menores++;
            }
        }

        double percent = (double) menores / pessoas.length * 100;
        return percent;
    }
}
