/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.damianjanicki;


public class FactoryTest {
    
    public static void main(String[] args) {
        DaoFactory daof = new DaoFactory();
        daof.setSource(DaoFactory.XML);

        Person personFromSource = daof.getPersonById(1);

        System.out.println(personFromSource.show());

        daof.setSource(DaoFactory.DATABASE);
        personFromSource = daof.getPersonById(2);

        System.out.println(personFromSource.show());




    }
}
