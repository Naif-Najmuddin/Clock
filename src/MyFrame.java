import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
//import java.awt.flowlayout;
//import java.util.Calander;
//import javax.swing.JFrame;
//java.text.simpledate format;
//import java.util.calender;
//import javax.swing.JFrame;
//import javax.swing.JLabel;

//---- https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html#text

public class MyFrame extends JFrame{ //extends JFrame to act as a frame
	
	
	 Calendar calendar; //instance of calendar don't really need it because we directly call it from the calendar class
	 SimpleDateFormat timeFormat; // lets us customize the time format (24hr,12hr type clock)
	 SimpleDateFormat dayFormat;
	 SimpleDateFormat dateFormat;
	 JLabel timeLabel; //// display the current time
	 JLabel dayLabel; // display the current day
	 JLabel dateLabel; // display the current date
	 String time;
	 String day;
	 String date;

	 MyFrame(){ //Constructor
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the window when x is clicked
	  this.setTitle("My Clock Program");//sets the title
	  this.setLayout(new FlowLayout());//sets the layout of the frame
	  this.setSize(350,200);//sets the size of the frame
	  this.setResizable(false);//stops the user from resizing the window
	  
	  timeFormat = new SimpleDateFormat("hh:mm:ss a"); //hours ,minutes,seconds,am/pm
	  dayFormat = new SimpleDateFormat("EEEE");//day of the week
	  dateFormat = new SimpleDateFormat("MMMMM dd, yyyy"); //month,day,year
	  
	  timeLabel = new JLabel();
	  timeLabel.setFont(new Font("Verdana",Font.PLAIN,50)); //styles the time(font and type)
	  timeLabel.setForeground(Color.green); //styles the time
	  timeLabel.setBackground(Color.black); //styles the time (color)
	  timeLabel.setOpaque(true); //Displays the background must be true
	  
	  dayLabel = new JLabel();
	  dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
	  
	  dateLabel = new JLabel();
	  dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
	  
	  
	  this.add(timeLabel); //adds the label to the frame
	  this.add(dayLabel);  //adds the day label to the screen(frame)
	  this.add(dateLabel); //adds the date label to the screen(frame)
	  
	  this.setVisible(true);//makes the window appear (visible to the user)
	  
	  setTime();
	 }
	 
	 public void setTime() { //method : updates the time every 1 second
	  while(true) { //Continue to update time until the program is closed
	  time = timeFormat.format(Calendar.getInstance().getTime()); //takes the current time and store it in String time
	  timeLabel.setText(time); //sets the text of the label time
	  
	  day = dayFormat.format(Calendar.getInstance().getTime());  //takes the current day and store it in String day
	  dayLabel.setText(day); //sets the text of the label day
	  
	  date = dateFormat.format(Calendar.getInstance().getTime());
	  dateLabel.setText(date); //sets the text of the label date
	  
	  try {
	   Thread.sleep(1000); //sleeps for one second that updates the time for 1 second (acts like a counter)
	  } catch (InterruptedException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	  }
	 }
	}
	
	


