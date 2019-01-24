
package pl.lodz.uni.math.damianjanicki;

class Person {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String show(){
        return id + " " + firstName + " " + lastName;
    }
}
