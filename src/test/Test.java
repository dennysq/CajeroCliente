/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.teamj.distribuidas.corebancario.services.remote.RemoteInterface;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author Dennys
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InitialContext ctx = null;
        try {
            //Thread.currentThread().setContextClassLoader(Test.class.getClassLoader());

            Properties prop = new Properties();
            prop.put("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
            prop.put("org.omg.CORBA.ORBInitialPort", "3700");
            prop.put("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            prop.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            prop.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
            ctx = new InitialContext(prop);
            RemoteInterface bean = (RemoteInterface) ctx.lookup("java:global/CoreBancario-ear/CoreBancario-ejb-1/RemoteBean!com.teamj.distribuidas.corebancario.services.remote.RemoteInterface");
            System.out.println("The number of inserted values is: " + bean.addValue("new"));
        } catch (Exception ex) {

            System.out.println("FATAL ERROR: --- ");
            ex.printStackTrace();
        } finally {
            close_context(ctx);

        }
    }

    private static void close_context(Context ctx) {
        if (ctx != null) {
            try {
                ctx.close();
            } catch (Exception ex) {   //    
                ex.printStackTrace();
            }
        }
    }

}
