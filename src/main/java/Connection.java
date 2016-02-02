/**
 * Created by chuckH on 2/2/16.
 */
public interface Connection {

    String getIP();


    int getPort();


    Protocol getProtocol();


    String connect();


    void close();


}
