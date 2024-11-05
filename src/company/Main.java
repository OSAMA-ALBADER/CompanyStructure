package company;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Engineer engineer = new Engineer("osama", "digital forensics", 5000000000.0, new String[]{
                "fast typer","slow learner","smart"
        });
        Director director = new Director("salim", "malware analysis",45000.0, 3000000.5);
        SalesPerson person = new SalesPerson("fjri", "CLE",300.0, 230 );

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(engineer);
        System.out.println(director);
        System.out.println(person);
    }
}