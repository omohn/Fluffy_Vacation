package controller;

import org.apache.log4j.Logger;


/**
 * Die Klasse HelloWorld, nur damit mal was passiert
 *
 * @author Oliver Mohn
 *
 */
public class HelloWorld {
    static Logger logger = Logger.getLogger(HelloWorld.class);

    /**
     * Main Methode
     */
    public static void main(String[] args) {
        System.out.println("Hello Ant-World!");

        logger.info("Hello Ant-World!");
    }
}
