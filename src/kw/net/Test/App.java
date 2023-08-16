package kw.net.Test;
import com.beust.ah.A;
import kw.java.math.MathUtils;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.jmdns.impl.JmDNSImpl;
import javax.jmdns.impl.constants.DNSConstants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class App {
    String SERVICE_NAME = "Lightblocks";

    String LIGHTBLOCKS_TYPE_NAME = "_lightblocks._tcp";
    private JmDNS jmdns;

    final Map<String, InetAddress> currentServices = new ConcurrentHashMap<>();

//    final Map<String, ServerAddress> multiplayerServers = new ConcurrentHashMap<>();
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.registerService();
    }

    public static final String HTTP = "_http._tcp.local.";
    public void registerService() throws Exception {
        try {
            // Create a JmDNS instance
            if (jmdns == null)
                jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
//            ServiceInfo serviceInfo = ServiceInfo.create(HTTP, SERVICE_NAME + "-" + "Desktop-" + MathUtils.random(100, 999), 8080, "");
//            jmdns.registerService(serviceInfo);

            startDiscovery(true);
//            Gdx.app.log("Server", "Registered for service discovery " + jmdns.getInetAddress());
        } catch (Exception e) {
//            Gdx.app.error("Server", "Could not register for service discovery.", e);
        }
    }

    private MyListener listener = new MyListener();

    public void startDiscovery(boolean legacy) {
        try {
            if (jmdns == null) {
                try {
                    jmdns = JmDNS.create(InetAddress.getLocalHost());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            // Add a service listener
            if (legacy)
                jmdns.addServiceListener(HTTP, listener);
            else
                jmdns.addServiceListener(LIGHTBLOCKS_TYPE_NAME + ".local.", listener);
        } catch (Exception e) {
//            Gdx.app.error("Client", "Could not start service discovery.", e);
        }
    }




    private class MyListener implements ServiceListener {
        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("----add-------------------------");
        }

        @Override
        public void serviceRemoved(ServiceEvent event) {
            ServiceInfo info = event.getInfo();
            System.out.println("------remove-------------");
            if (info!=null) {
                System.out.println(info.getName());
            }
//            if (info != null && info.getName().startsWith(SERVICE_NAME)) {
//                synchronized (currentServices) {
//                    currentServices.remove(info.getName().substring(SERVICE_NAME.length() + 1));
//                }
//            }
//            if (info != null && info.getType().startsWith(LIGHTBLOCKS_TYPE_NAME)) {
//                synchronized (multiplayerServers) {
//                    multiplayerServers.remove(info.getName());
//                }
//            }
        }

        @Override
        public void serviceResolved(ServiceEvent event) {
            ServiceInfo info = event.getInfo();
            System.out.println("service---------------------");
            if (info!=null){
                System.out.println(info.getName());
            }
//            if (info != null && info.getName().startsWith(SERVICE_NAME)) {
//                try {
//                    synchronized (currentServices) {
//                        currentServices.put(info.getName().substring(SERVICE_NAME.length() + 1), InetAddress.getByName
//                                (info.getInetAddress().getHostName()));
//                    }
//                } catch (UnknownHostException e) {
//                    // eat
//                }
//            }
//            if (info != null && info.getType().startsWith(LIGHTBLOCKS_TYPE_NAME)) {
//                synchronized (multiplayerServers) {
//                    multiplayerServers.put(info.getName(), new ServerAddress(info.getName(), info.getHostAddress(), info.getPort(), false));
//                }
//            }
        }
    }

}
