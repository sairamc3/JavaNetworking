import java.net.*;
import java.io.*;
import java.util.*;

public class HttpUrlDemo {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://www.google.com");

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        System.out.println("Request method is -> " + urlConnection.getRequestMethod());
        System.out.println("Response Code is -> " + urlConnection.getResponseCode());
        System.out.println("Response Message is -> " + urlConnection.getResponseMessage());

        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
        Set<String> keys = headerFields.keySet();

        for(String key: keys) {
            System.out.println(key + ": " + headerFields.get(key));
        }


    }
}
