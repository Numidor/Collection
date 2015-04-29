/*
* Pull the HTML page for a specified search query
*/
package googlequery;

import java.net.*;
import java.io.*;
import java.util.*;

public class GoogleQuery {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the query: ");
        String query = s.nextLine();
        query = query.replaceAll("\\s+", "+");
        
        String request = "https://www.google.com/search?q=" + query + "&num=20";
        //String request = "http://www.oracle.com/";
        URL google = new URL(request);
        URLConnection yc = google.openConnection();;
        yc.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();

    }
}
