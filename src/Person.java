/** CS300: Project 3
    Author: Austin Gray
    Date: 05/05/2020
 */

public class Person {
    private int id;
    private int age;
    private String firstName;
    private String lastName;

    /** Default Constructor*/
    public Person() {
        id = 0;
        age = 0;
        firstName = "";
        lastName = "undeclared";
    }

    /** Constructor with parameters*/
    public Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "ID: " + id + "| Name: " + lastName + ", " + firstName + "| Age: " + age;
    }

    /** Method to retrieve first name field */
    public String getFirstName() {
        return firstName;
    }

    /** Method to retrieve last name field */
    public String getLastName() {
        return lastName;
    }
}
