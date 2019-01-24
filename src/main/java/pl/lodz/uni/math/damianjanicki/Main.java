
package pl.lodz.uni.math.damianjanicki;

        import org.apache.log4j.BasicConfigurator;
        import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        DaoFactory daof = new DaoFactory();
        daof.setSource(FactorySource.XML);

        Person personFromSource = daof.getPersonById(1);
        logger.debug(personFromSource.show());

        daof.setSource(FactorySource.DATABASE);
        personFromSource = daof.getPersonById(2);
        logger.debug(personFromSource.show());
    }
}
