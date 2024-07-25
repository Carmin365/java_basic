public class ExampleClasses {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Person person = new Person();
        person.name = "Celia";
        person.age = 40;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}

class Person {
    String name;
    int age;
}