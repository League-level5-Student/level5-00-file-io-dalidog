
package _03_To_Do_List;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements MouseListener {
	public static void main(String[] args) {
		new ToDoList().createButtons();
		
	
	}
	ArrayList<String> tasks = new ArrayList<String>();
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	public  void createButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 100);
		 button1 = new JButton("add task");
		button1.addMouseListener(this);
		button2 = new JButton("view tasks");
		button2.addMouseListener(this);
		button3 = new JButton("remove task");
		button3.addMouseListener(this);
		button4 = new JButton("save list");
		button4.addMouseListener(this);
		button5 = new JButton("load list");
		button5.addMouseListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==button1) {
			String useranswer=JOptionPane.showInputDialog("give me a task");
			tasks.add(useranswer);
		}
		else if(e.getSource()==button2) {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println(tasks.get(i));
			}
		}
		else if(e.getSource()==button3) {
		String useranswer=JOptionPane.showInputDialog("which task to remove?");
		int useranswer2=Integer.parseInt(useranswer);
		tasks.remove(useranswer2);
		
	}
		else if(e.getSource()==button4) {
			System.out.println(tasks.size());
			try {
				BufferedWriter fw = new BufferedWriter(new FileWriter("src/_03_To_Do_List/saveList",true));
				FileWriter d = new FileWriter("src/_03_To_Do_List/saveList");
				d.write("");
				for (int i = 0; i < tasks.size(); i++) {
					fw.write(tasks.get(i)+"\n");
				}
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==button5) {
			tasks=new ArrayList<String>();
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/_03_To_Do_List/saveList"));
				String line = br.readLine();
				while(line != null){
					tasks.add(line);
					line = br.readLine();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
}
