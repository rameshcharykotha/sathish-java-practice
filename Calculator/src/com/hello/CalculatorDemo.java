package com.hello;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
/**
 * 
 * @author sathish.kotha
 *
 */
public class CalculatorDemo{

	CalculatorDemo(){

		//make frame	

		JFrame jframe = new JFrame("calculator");
		jframe.setSize(300, 400);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());

		//make Textfield

		JTextField jtfeild = new JTextField(" ",15);

		jframe.add(jtfeild);

		//make buttons

		JButton jplus  = new JButton("+");
		JButton jminus = new JButton("-");
		JButton jmul   = new JButton("*");
		JButton jdivide= new JButton("/");
		JButton jnine  = new JButton("9");
		JButton jeight = new JButton("8");
		JButton jseven = new JButton("7");
		JButton jsix   = new JButton("6");
		JButton jfive  = new JButton("5");
		JButton jfour  = new JButton("4");
		JButton jthree = new JButton("3");
		JButton jtwo   = new JButton("2");
		JButton jone   = new JButton("1");
		JButton jzero  = new JButton("0");

		JButton jsubmit= new JButton("submit");
		JButton jclear = new JButton("clear");

		// Add ActionListeners
		jplus.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
				
				
			}
		});

		// Add Buttons to JFrame 
		jframe.add(jplus,0);
		jframe.add(jminus,1);
		jframe.add(jmul,2);
		jframe.add(jdivide,3);
		jframe.add(jnine,4);
		jframe.add(jeight,5);
		jframe.add(jseven,6);
		jframe.add(jsix,7);
		jframe.add(jfive,8);
		jframe.add(jfour,9);
		jframe.add(jthree,10);
		jframe.add(jtwo,11);
		jframe.add(jone,12);
		jframe.add(jzero,13);
		jframe.add(jsubmit,14);
		jframe.add(jclear,15);

		jframe.setVisible(true);
	}

	//main method
	public static void main(String []args){

		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new CalculatorDemo();
			}
		});
	}

}

