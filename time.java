package inner;
//import java.time.format.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class time {


		// TODO Auto-generated method stub
		public static void main(String[] args) {
		    LocalDate myObj = LocalDate.now(); // Create a date object
		    System.out.println(myObj); // Display the current date
		    LocalTime obj=LocalTime.now();
		    System.out.println(obj);
		    LocalDateTime m=LocalDateTime.now();
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		    String formattedDate = m.format(myFormatObj);
		    System.out.println("After formatting: " + formattedDate);
		  }
		}