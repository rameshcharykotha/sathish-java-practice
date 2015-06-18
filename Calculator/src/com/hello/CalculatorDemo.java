package com.hello;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 * 
 * @author sathish.kotha
 *
 */
public class CalculatorDemo{
	double num1=0;
	double num2=0;	
	double result=0;
	String operator = null;
	 

	CalculatorDemo(){
		//make variables



		//make frame

		JFrame jframe = new JFrame("calculator");
		jframe.setSize(260, 260);
		jframe.setTitle("calculator Demo");

	//	JLabel jlable = new JLabel(" ");
	//	jframe.add(jlable);

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());

		//Grid layout
		 GridLayout experimentLayout = new GridLayout(0,4);
		 
		
		//make Textfield

		final JTextField jtfeild = new JTextField(" ",20);
		jtfeild.setHorizontalAlignment(JTextField.RIGHT);
		//change font size of jtfeild
		 Font font = new Font("Courier", Font.BOLD,20);
		  jtfeild.setFont(font);  
		  jframe.add(jtfeild);
		//Jpanel created
		  final JPanel compsToExperiment = new JPanel();
	        compsToExperiment.setLayout(experimentLayout);
	        
	       JPanel controls = new JPanel();
	      controls.setLayout(new GridLayout(0,1));

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
		JButton jexit  = new JButton("Exit");

		final JButton jsubmit= new JButton("submit");
		JButton jclear = new JButton("clear");

		jframe.setResizable(false);

        //Arrange buttons
		
		
		
		
		// Add ActionListeners
		jplus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				num2 = 0;
				num1 = Double.parseDouble(jtfeild.getText());
				operator = "+";
				jtfeild.setText("");
			}
		});
		jminus.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				num2 = 0;
				num1 = Double.parseDouble(jtfeild.getText());
				operator = "-";
				jtfeild.setText("");

			}
		});
		jmul.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				num2 = 0;
				num1 = Double.parseDouble(jtfeild.getText());
				operator = "*";
				jtfeild.setText("");

			}
		});
		jdivide.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				num2 = 0;
				num1 = Double.parseDouble(jtfeild.getText());
				operator = "/";
				jtfeild.setText("");

			}
		});
		jnine.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"9");

			}
		});
		jeight.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"8");

			}
		});
		jseven.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"7");

			}
		});
		jsix.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"6");

			}
		});
		jfive.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jtfeild.setText(jtfeild.getText()+"5");
			}
		});
		jfour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"4");

			}
		});
		jthree.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"3");

			}
		});
		jtwo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jtfeild.setText(jtfeild.getText()+"2");
			}
		});
		jone.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"1");
			}
		});
		jzero.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				jtfeild.setText(jtfeild.getText()+"0");

			}
		});
		
		jexit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//jtfeild.setText(jtfeild.getText()+"0");
                 System.exit(0);
			}
		});

		
		jsubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if(operator.equals("+")){
					num2 = Double.parseDouble(jtfeild.getText());
					jtfeild.setText(String.valueOf(num1+num2));
				}	
				else if(operator.equals("-")){
                    num2=Double.parseDouble(jtfeild.getText());
                    jtfeild.setText(String.valueOf(num1-num2));

				}
				else if(operator=="*"){
                  num2=Double.parseDouble(jtfeild.getText());
                   jtfeild.setText(String.valueOf(num1*num2));

				}
				else if(operator=="/"){
                  num2=Double.parseDouble(jtfeild.getText());
                   jtfeild.setText(String.valueOf(num1/num2));

				}

			}
		});
		jclear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				jtfeild.setText(null);
			}
		});
      //Add buttons to jpanel
		compsToExperiment.add(jnine);
		compsToExperiment.add(jeight);
		compsToExperiment.add(jseven);
		compsToExperiment.add(jplus);
		compsToExperiment.add(jsix);
		
		compsToExperiment.add(jfive);
		compsToExperiment.add(jfour);
		compsToExperiment.add(jminus);
		compsToExperiment.add(jthree);
		compsToExperiment.add(jtwo);
		compsToExperiment.add(jone);
		compsToExperiment.add(jmul);
		compsToExperiment.add(jzero);
		
		compsToExperiment.add(jsubmit);
		
		
		
		compsToExperiment.add(jclear);
		compsToExperiment.add(jdivide);
		
		
		controls.add(jexit);
		
		

		/*
		// Add Buttons to JFrame 
		jframe.add(jplus);
		jframe.add(jminus);
		jframe.add(jmul);
		jframe.add(jdivide);
		jframe.add(jnine);
		jframe.add(jeight);
		jframe.add(jseven);
		jframe.add(jsix);
		jframe.add(jfive);
		jframe.add(jfour);
		jframe.add(jthree);
		jframe.add(jtwo);
		jframe.add(jone);
		jframe.add(jzero);
		jframe.add(jsubmit);
		jframe.add(jclear);*/
		
		
		 jframe.add(compsToExperiment, BorderLayout.CENTER);
	    // jframe.add(controlcenter, BorderLayout.CENTER);
	     jframe.add(controls, BorderLayout.SOUTH);

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

