package entities;

public class Pessoas {
    private String name;
    private int age;
    private double height;

    public Pessoas(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double averageHeight(Pessoas[] pessoas) {
        double sumHeight = 0;
        for (Pessoas p : pessoas) {
            sumHeight += p.getHeight();
        }
        return sumHeight / pessoas.length;
    }

    public static double percent(Pessoas[] pessoas) {
        int menores = 0;

        System.out.println("Pessoas com menos de 16 anos:");

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAge() < 16) {
                System.out.println(pessoas[i].getName());
                menores++;
            }
        }

        double percent = (double) menores / pessoas.length * 100;
        return percent;
    }
}
