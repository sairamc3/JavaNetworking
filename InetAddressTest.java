import java.net.*;
import java.util.Arrays;

public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        InetAddress byName = InetAddress.getByName("www.google.com");
        System.out.println(byName);

        InetAddress[] allByName = InetAddress.getAllByName("www.nba.com");

        Arrays.stream(allByName).forEach(System.out::println);
    }
}
