package application;

import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int quantity = sc.nextInt();
        Person[] people = new Person[quantity];

        sc.nextLine();
        for (int i = 0; i < quantity; i++) {
            System.out.printf("Dados da %dª pessoa: \n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();

            people[i] = new Person(name, age, height);
        }

        double averageHeight = Person.averageHeight(people);
        System.out.printf("\nAltura média das pessoas: %.2f%n", averageHeight);
        System.out.printf("Porcentagem das pessoas menores de 16 anos: %.1f%%\n", Person.percentMinor(people));



        sc.close();
    }
}