import java.util.ArrayList;


public class ConnectionManager {

    int currentConnections = 0;

    int maxConnections = 3;


    public Connection findConnectionFromIP(String IP) {
        if(currentConnections >= maxConnections) {
            return null;
        }

        ManagedConnection managedConnection = new ManagedConnection(IP, 1000, Protocol.FTP);
            currentConnections++;
            return managedConnection;


    }

    public Connection findConnectionFromProtocol(Protocol protocol) {
        if(currentConnections>= maxConnections) {
            return null;
        }
        ManagedConnection managedConnection = new ManagedConnection("192.168.1.2", 1000, protocol);
            currentConnections++;
            return  managedConnection;
    }



    private class ManagedConnection implements Connection{

        private String IP;
        private int port;
        private Protocol protocol;
        private String connectionStatus = "connection open";

        ManagedConnection(String IP, int port, Protocol protocol) {

            this.IP = IP;
            this.port = port;
            this.protocol = protocol;

        }




        public String connect() {
            return connectionStatus;
        }

        public void close() {
            currentConnections--;
            connectionStatus = "connection close";
        }


        public String getIP() {
            return IP;
        }

        public int getPort() {
            return port;
        }

        public Protocol getProtocol() {
            return protocol;
        }
    }
}
