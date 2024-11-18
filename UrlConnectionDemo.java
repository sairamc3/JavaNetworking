import java.net.*;
import java.io.*;
import java.util.Date;

public class UrlConnectionDemo {

    public static void main(String[] args) throws IOException {

        int c;
        URL url = new URL("http://www.internic.net");

        URLConnection urlConnection = url.openConnection();

        long date = urlConnection.getDate();
        if(date != 0){
            System.out.println("The date is -> " + new Date(date));
        } else {
            System.out.println("No date information");
        }


        date = urlConnection.getExpiration();
        if(date != 0){
            System.out.println("The Expiration date is -> " + new Date(date));
        } else {
            System.out.println("No Expiration date information");
        }


        date = urlConnection.getLastModified();
        if(date != 0){
            System.out.println("The Last modified date is -> " + new Date(date));
        } else {
            System.out.println("No LastModified date information");
        }

        long contentLengthLong = urlConnection.getContentLengthLong();
        if(contentLengthLong != -1){
            System.out.println("Content Length -> " + contentLengthLong);
        } else {
            System.out.println("Conent-length unavailable");
        }

        if(contentLengthLong !=0){
            System.out.println("========Content========");
            InputStream inputStream = urlConnection.getInputStream();
            while( (c= inputStream.read()) != -1) {
                System.out.print((char)c);
            }
            inputStream.close();
        }

    }
}
