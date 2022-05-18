/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poetask2;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Ayanda Dlamini
 */
public class POETask2 {

            private static final String Tn = null;
            private static final String Last3 = null;
            
    public static void main(String[] args) {
        
        String[] Options = { "Add Task", "Show Report(Coming Soon)", "Cancel" };

		int Val = JOptionPane.showOptionDialog(null, // ignore
				"Please Select an Option", "Welcome to EasyKanban", // Title
				JOptionPane.YES_NO_CANCEL_OPTION, // Allows us the 3 button option
				JOptionPane.PLAIN_MESSAGE, // OptionPane
				null, // ignore
				Options, // Array
				0);
//        System.out.println(Val);

		while (Val != 1) {

			if (Val == 0) {

				TaskNum();
				break;

			}
			if (Val == 2) {
				// This closes the app
				break;

			}
			if (Val == 1) {

			}
		}
        
}
            
        public static boolean TaskNum() {
		
		String Number = JOptionPane.showInputDialog("Please Add Number of Tasks:");
		int a = Integer.parseInt(Number);
		
		for(int i=0;i<a;i++) {
			
			TaskMaker();
			
		}
		
		return true;
	}
	
	public static boolean TaskMaker() {
		
		String TName = JOptionPane.showInputDialog("Enter Task Name:");
		
		String TNum = JOptionPane.showInputDialog("Add Task Number:");
		
		///////////////////////////////////////////////////
		
//		This line of code allows us to input a description and the character limit is 50.
		String Desc = JOptionPane.showInputDialog("Task Description:");
		
		Pattern P = Pattern.compile("((?=.*[a-z]).{0,50})");
		Matcher M = P.matcher(Desc);
		
		if(M.matches()) {
			
			JOptionPane.showMessageDialog(null, "Task successfully captured");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
			
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String DevDet = JOptionPane.showInputDialog("Developer Details (First Name and Last Name)");
		
		String Dur = JOptionPane.showInputDialog("Task Duration (hrs)");
		
//		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		//ID that contains the first 2 letters of Task Name, Task Number, last 3 letters of the Developer's Name
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String[] Status = {"To Do","Doing","Done"};
		
		int Stat = JOptionPane.showOptionDialog(
				null, 
				"Please Select Task Status", 
				"Status", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				Status, 
				0);
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		

		
		JOptionPane.showMessageDialog(null, 
				"Task Status : " + Stat + "\n" + 
				"Developer Details : " + DevDet + "\n" +
				"Task Number :" + TNum + "\n" +
				"Task Description :" + Desc + "\n" +
				"Task ID - " + ((Tn + ":" + TNum + ":" + Last3).toUpperCase()) + "\n" + 
				"Duration : " + Dur + "hrs"
				);
		
		
//		the following order: Task Status, Developer Details, Task Number, Task Name, Task Description, Task ID and Duration;
		
		return true;
	}
	
}

