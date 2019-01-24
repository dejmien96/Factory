
package pl.lodz.uni.math.damianjanicki;

public class FactoryDB implements IDaoFactory{

    @Override
    public Person getPersonById(int id) {
        return new Person(2,"Damian","FactoryDB");
    }
    
}