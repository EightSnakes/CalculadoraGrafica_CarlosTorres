import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class CalculadoraInterfaz extends JFrame implements ActionListener{
	
	JPanel panel = new JPanel();
	JTextField texto = new JTextField();
	JButton suma = new JButton("+");
	JButton resta = new JButton("-");
	JButton mult = new JButton("*");
	JButton div = new JButton("/");
	JButton igual = new JButton("=");
	JButton uno = new JButton("1");
	JButton dos = new JButton("2");
	JButton tres = new JButton("3");
	JButton cuatro = new JButton("4");
	JButton cinco = new JButton("5");
	JButton seis = new JButton("6");
	JButton siete = new JButton("7");
	JButton ocho = new JButton("8");
	JButton nueve = new JButton("9");
	JButton cero = new JButton("0");
	JButton punto = new JButton(".");
	JButton potencia = new JButton("^");
	JButton borrar = new JButton("D");
	static boolean calc=false;
	
	public CalculadoraInterfaz(){
		initComponents();
	}//CalculadoraInterfaz
	
	public void initComponents() {
		setSize(320, 290);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setTitle("Calculadora");
	
		panel.setLayout(null);
		texto.setEditable(false);
		texto.setBounds(10,10, 290, 30);
		texto.setText("");
		
		suma.setBounds(10, 50, 50, 40);
		suma.addActionListener(this);
		
		resta.setBounds(70, 50, 50, 40);
		resta.addActionListener(this);
		
		mult.setBounds(130, 50, 50, 40);
		mult.addActionListener(this);
		
		div.setBounds(190, 50, 50, 40);
		div.addActionListener(this);
		
		igual.setBounds(250, 50, 50, 40);
		igual.addActionListener(this);
		
		uno.setBounds(10, 100, 50, 40);
		uno.addActionListener(this);
		
		
		dos.setBounds(70, 100, 50, 40);
		dos.addActionListener(this);
		
		tres.setBounds(130, 100, 50, 40);
		tres.addActionListener(this);
		
		cuatro.setBounds(10, 150, 50, 40);
		cuatro.addActionListener(this);
		
		cinco.setBounds(70, 150, 50, 40);
		cinco.addActionListener(this);
		
		seis.setBounds(130, 150, 50, 40);
		seis.addActionListener(this);
		
		siete.setBounds(10, 200, 50, 40);
		siete.addActionListener(this);
		
		ocho.setBounds(70, 200, 50, 40);
		ocho.addActionListener(this);
		
		nueve.setBounds(130, 200, 50, 40);
		nueve.addActionListener(this);
		
		potencia.setBounds(190, 100, 50, 40);
		cero.addActionListener(this);
		
		punto.setBounds(250, 100, 50, 40);
		punto.addActionListener(this);
		
		cero.setBounds(190, 150, 50, 90);
		potencia.addActionListener(this);
		
		
		borrar.setBounds(250, 150, 50, 90);
		borrar.addActionListener(this);
		
		
		panel.add(suma);
		panel.add(resta);
		panel.add(resta);
		panel.add(mult);
		panel.add(div);
		panel.add(igual);
		panel.add(uno);
		panel.add(dos);
		panel.add(tres);
		panel.add(cuatro);
		panel.add(cinco);
		panel.add(seis);
		panel.add(siete);
		panel.add(ocho);
		panel.add(nueve);
		panel.add(cero);
		panel.add(punto);
		panel.add(potencia);
		panel.add(borrar);
		panel.add(texto);
		
		setResizable(false);
		setContentPane(panel);
		setVisible(true);
		
	}//initComponents

	public void actionPerformed(ActionEvent e) {
		String cadena;
		if(calc) {
			texto.setText(null);
			calc=false;
		}
		if(e.getSource() == uno)
			texto.setText(texto.getText()+ "1");
		if(e.getSource() == dos)
			texto.setText(texto.getText()+ "2");
		if(e.getSource() == tres)
			texto.setText(texto.getText()+ "3");
		if(e.getSource() == cuatro)
			texto.setText(texto.getText()+ "4");
		if(e.getSource() == cinco)
			texto.setText(texto.getText()+ "5");
		if(e.getSource() == seis)
			texto.setText(texto.getText()+ "6");
		if(e.getSource() == siete)
			texto.setText(texto.getText()+ "7");
		if(e.getSource() == ocho)
			texto.setText(texto.getText()+ "8");
		if(e.getSource() == nueve)
			texto.setText(texto.getText()+ "9");
		if(e.getSource() == cero)
			texto.setText(texto.getText()+ "0");
		if(e.getSource() == punto)
			texto.setText(texto.getText()+ ".");
		if(e.getSource() == borrar)
			texto.setText(null);
		if(e.getSource() == suma)
			texto.setText(texto.getText()+ "+"); 
		if(e.getSource() == resta)
			texto.setText(texto.getText()+ "-");
		if(e.getSource() == mult)
			texto.setText(texto.getText()+ "*");
		if(e.getSource() == div)
			texto.setText(texto.getText()+ "/");
		if(e.getSource() == potencia)
			texto.setText(texto.getText()+ "^");
		if(e.getSource() == igual) {
			cadena = texto.getText();
			if(operadores(cadena)) {
				JOptionPane.showMessageDialog(null, "Operacion no valida", "Error",JOptionPane.WARNING_MESSAGE);
				texto.setText(null);
			}//if
			else if(masPuntos(cadena)) {
				JOptionPane.showMessageDialog(null, "Operacion no valida", "Error",JOptionPane.WARNING_MESSAGE);
				texto.setText(null);
			}//if
			else if(cadena.charAt(0)=='/' ||cadena.charAt(0)=='*'||cadena.charAt(0)=='-'||cadena.charAt(0)=='+'||cadena.charAt(0)=='^') {
				JOptionPane.showMessageDialog(null, "Operacion no valida", "Error",JOptionPane.WARNING_MESSAGE);
				texto.setText(null);
			}//if
			else if(cadena.charAt(cadena.length()-1)=='+'||cadena.charAt(cadena.length()-1)=='*'||cadena.charAt(cadena.length()-1)=='/'||cadena.charAt(cadena.length()-1)=='^') {
				JOptionPane.showMessageDialog(null, "Operacion no valida", "Error",JOptionPane.WARNING_MESSAGE);
				texto.setText(null);
			}//if
			else {
				operaciones(cadena);
			}//else
		}//if
	}//actionPerformed
	
	private void operaciones(String cadena) {
		String num1, num2;
		double resultado;
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)=='+') {
				num1=cadena.substring(0,i);
				num2=cadena.substring(i+1,cadena.length());
				resultado =Double.parseDouble(num1)+Double.parseDouble(num2);
				texto.setText(Double.toString(resultado));
				calc=true;
			}//if mas
			if(cadena.charAt(i)=='-') {
				num1=cadena.substring(0,i);
				num2=cadena.substring(i+1,cadena.length());
				resultado =Double.parseDouble(num1)-Double.parseDouble(num2);
				texto.setText(Double.toString(resultado));
				calc=true;
			}//if menos
			if(cadena.charAt(i)=='*') {
				num1=cadena.substring(0,i);
				num2=cadena.substring(i+1,cadena.length());
				resultado =Double.parseDouble(num1)*Double.parseDouble(num2);
				texto.setText(Double.toString(resultado));
				calc=true;
			}//if multi
			if(cadena.charAt(i)=='^') {
				num1=cadena.substring(0,i);
				num2=cadena.substring(i+1,cadena.length());
				resultado =Math.pow(Double.parseDouble(num1), Double.parseDouble(num2));
				texto.setText(Double.toString(resultado));
				calc=true;
			}//if potencia
			if(cadena.charAt(i)=='/') {
				num1=cadena.substring(0,i);
				num2=cadena.substring(i+1,cadena.length());
				double cro=Double.parseDouble(num2);
				if(cro==0) {
					JOptionPane.showMessageDialog(null, "Operacion no valida", "Error",JOptionPane.WARNING_MESSAGE);
					texto.setText(null);
				}
				else {
					resultado = Double.parseDouble(num1)/Double.parseDouble(num2);
					texto.setText(Double.toString(resultado));
					calc=true;
				}//else
			}//if division
		}//for
	}//operaciones
	
	private static boolean operadores(String cadena){
		boolean flag = false;
		int cont=0;
		for(int i =0; i<cadena.length();i++) {
			if (cadena.charAt(i)=='+'||cadena.charAt(i)=='-'||cadena.charAt(i)=='*'||cadena.charAt(i)=='/'||cadena.charAt(i)=='^')
				cont++;
		}
		if(cont>1)
			flag = true;
		return flag;
	}//operadores
	
	private static boolean masPuntos(String cadena) {
		boolean flag=false;
		String num1="", num2=""; 
		int cont=0;
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)=='+'||cadena.charAt(i)=='-'||cadena.charAt(i)=='*'||cadena.charAt(i)=='/'||cadena.charAt(i)=='^') {
				num1=cadena.substring(0,i);
				num2=cadena.substring(i+1,cadena.length());
			}//if
		}//for
		for(int i=0;i<num1.length();i++) {
			if(num1.charAt(i)=='.')
				cont++;
		}
		if(cont>1)
			flag=true;
		cont=0;
		for(int i=0;i<num2.length();i++) {
			if(num2.charAt(i)=='.')
				cont++;
		}
		if(cont>1)
			flag=true;
		
		return flag;
		
	}
}//class
