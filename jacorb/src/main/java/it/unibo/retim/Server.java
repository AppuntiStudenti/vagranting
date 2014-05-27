package it.unibo.retim;

import org.omg.CORBA.ORB;
import org.omg.CORBA.UserException;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

public class Server {
    public static void main(String args[]) throws UserException {
        ORB orb = ORB.init((String[]) null, null);

        CalculatorImpl servant = new CalculatorImpl();
        POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
        org.omg.CORBA.Object obj = poa.servant_to_reference(servant);
        poa.the_POAManager().activate();

        System.out.println(orb.object_to_string(obj));

        orb.run();
    }
}
