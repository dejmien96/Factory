
package pl.lodz.uni.math.damianjanicki;

import java.util.EnumMap;

public class DaoFactory {

    private IDaoFactory factory;
    private static final EnumMap<FactorySource, IDaoFactory> factoryEnumMap = new EnumMap<>(FactorySource.class);

    public void setSource(FactorySource source){ //funkcja ustawiajaca zrodlo, czyli pobiera obiekt z naszej enum mapy i przypisuje do zmiennej factory
       factory = factoryEnumMap.get(source);
    }

    static
    {
        factoryEnumMap.put(FactorySource.DATABASE, new FactoryDB());
        factoryEnumMap.put(FactorySource.XML, new FactoryXML());
    }

    public Person getPersonById(int id){
        return factory.getPersonById(id);
    }
}
