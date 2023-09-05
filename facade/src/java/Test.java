package src.java;

import src.java.facade.Facade;

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Maria", "95150000");
    }
}
