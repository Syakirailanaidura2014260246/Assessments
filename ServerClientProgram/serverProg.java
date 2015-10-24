
/**
 * This is server program
 * 
 * Nur Syakira Binti Ab Halim 
 * 24/10/2015
 */

import java.net.*;
import java.util.*;
import java.io.*;

public class serverProg
{
public static void main(String[] args)
{
int port = 1234; 

try
{
    System.out.println("Server:");
    System.out.println("Listening on port " + port);
    ServerSocket ss; 
    ss = new ServerSocket(port);
    Socket s; 
    s = ss.accept();
    String client;
    client = s.getInetAddress().toString(); 
    System.out.println("Connected to " + client);
    Scanner in;
    in = new Scanner(s.getInputStream());
    PrintWriter out;
    out = new PrintWriter(s.getOutputStream(),true); 
    out.println("Welcome to Server"); 
    out.println("Enter GET to get a quote " + "or BYE to exit.");
    while (true) 
    {
        String input = in.nextLine(); 
        if (input.equalsIgnoreCase("bye"))
        break;
    else if (input.equalsIgnoreCase("get"))
    {
        
        System.out.println("Serving " + client);
    }
    else
    out.println("Huh?");
}       
out.println("So long, suckers!");
s.close(); 
System.out.println("Closed connection to " + client);
}
catch (Exception e) 
{
    e.printStackTrace();
}
}
}
