import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class WhoIs {

    public static void main(String[] args) throws IOException {

        int c;

        try(Socket socket = new Socket("whois.internic.net", 43)){

            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            String str = "OraclePressBooks.com" + "\n";

            outputStream.write(str.getBytes());

            while( (c= inputStream.read()) != -1){
                System.out.print((char) c);
            }
        }

    }
}
