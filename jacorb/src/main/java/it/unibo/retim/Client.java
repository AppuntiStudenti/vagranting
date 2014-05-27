package it.unibo.retim;

import org.omg.CORBA.ORB;
import org.omg.CORBA.UserException;
import retim.Calculator;
import retim.CalculatorHelper;

public class Client {
    public static void main(String args[]) throws UserException {
        ORB orb = ORB.init((String[]) null, null);

        org.omg.CORBA.Object obj = orb.string_to_object(args[0]);
        Calculator stub = CalculatorHelper.narrow(obj);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(String.format("%d + %d = %d", i, j, stub.sum(i, j)));
            }
        }
    }
}
