
package pl.lodz.uni.math.damianjanicki;

public class FactoryXML implements IDaoFactory{

    @Override
    public Person getPersonById(int id) {
        return new Person(1,"Damian","FactoryXML");

    }

}
