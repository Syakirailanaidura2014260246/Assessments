import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.*;

public class urlscrap {

    public static void main(String[] args) {
        
       try{
            
        Document doc = Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();  
        String title = doc.title();   
        
                                           
            Element tables = doc.getElementById("mytable");
            Elements rows = tables.getElementsByTag("tr");

            
            for (Element row : rows) {
                
                 Elements tds = row.getElementsByTag("td");
                   for (int i = 0; i < tds.size(); i++) {
                       
                      if (i == 1){
                          System.out.println(tds.get(i).text());
                        }
               
                    }
                }
                System.out.println("THE TITLE IS: " + title);
            
        }
        
    catch (IOException e) {
          
            e.printStackTrace();
        }
    }       
}