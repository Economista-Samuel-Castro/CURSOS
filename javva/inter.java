import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class inter extends JFrame implements ActionListener{
// Se declaran las etiquetas (Label)
	public JLabel saludo, version;

// se declaran los botones
	public JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bs,br,bm,bd,bi,bb;
	
// Se agregan las variables
    int n1,n2;
    String signo;

//Se declara textfield
	public JTextField tex;

//Se crea el constructor
	public inter(){

// se hace mendion de la superclase
	super("Calculadora");

// Se hace uno de setLayout (null) para que no exista sobre posición de las etiquetas y botones
	setLayout(null);

// Se declara el tamaño de la calculadora
	setBounds(0,0,400,600);

// Hace referencia de que la calculadora aparesca en el centro de la pantalla
	setLocationRelativeTo(null);

// Ecita que el usuario pueda cambiar el tamaño de la ventana
	setResizable(false);

//accion de boton de cerrado
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//Se agrega la ventana de texto
	tex = new JTextField("0");
		tex.setBounds(10,10,355,100);
		tex.setFont(new Font("Arial",Font.BOLD,40));
		add(tex);
		
// Evita que el usuario pueda escribir en el campo de texto	
	tex.setEditable(false);
		
//Se agrega el boton 0
	b0= new JButton("0");
	b0.setBounds(280,450,90,90);
	b0.setFont(new Font("Arial",Font.BOLD,30));
	b0.setBackground(new Color(251, 203, 112));
	b0.setForeground(Color.white);
	add(b0);
	b0.addActionListener(this);	

//Se agrega el boton 1
	b1= new JButton("1");
	b1.setBounds(10,340,90,90);
	b1.setFont(new Font("Arial",Font.BOLD,30));
	b1.setBackground(new Color(251, 203, 112));
	b1.setForeground(Color.white);
	add(b1);
	b1.addActionListener(this);

//Se agrega el boton 2
	b2= new JButton("2");
	b2.setBounds(100,340,90,90);
	b2.setFont(new Font("Arial",Font.BOLD,30));
	b2.setBackground(new Color(251, 203, 112));
	b2.setForeground(Color.white);
	add(b2);
	b2.addActionListener(this);

//Se agrega el boton 3
	b3= new JButton("3");
	b3.setBounds(190,340,90,90);
	b3.setFont(new Font("Arial",Font.BOLD,30));
	b3.setBackground(new Color(251, 203, 112));
	b3.setForeground(Color.white);
	add(b3);
	b3.addActionListener(this);

//Se agrega el boton 4
	b4= new JButton("4");
	b4.setBounds(10,230,90,90);
	b4.setFont(new Font("Arial",Font.BOLD,30));
	b4.setBackground(new Color(251, 203, 112));
	b4.setForeground(Color.white);
	add(b4);
	b4.addActionListener(this);

//Se agrega el boton 5
	b5= new JButton("5");
	b5.setBounds(100,230,90,90);
	b5.setFont(new Font("Arial",Font.BOLD,30));
	b5.setBackground(new Color(251, 203, 112));
	b5.setForeground(Color.white);
	add(b5);
	b5.addActionListener(this);

//Se agrega el boton 6
	b6= new JButton("6");
	b6.setBounds(190,230,90,90);
	b6.setFont(new Font("Arial",Font.BOLD,30));
	b6.setBackground(new Color(251, 203, 112));
	b6.setForeground(Color.white);
	add(b6);
	b6.addActionListener(this);
	
//Se agrega el boton 7
	b7= new JButton("7");
	b7.setBounds(10,120,90,90);
	b7.setFont(new Font("Arial",Font.BOLD,30));
	b7.setBackground(new Color(251, 203, 112));
	b7.setForeground(Color.white);
	add(b7);
	b7.addActionListener(this);
	
//Se agrega el boton 8
	b8= new JButton("8");
	b8.setBounds(100,120,90,90);
	b8.setFont(new Font("Arial",Font.BOLD,30));
	b8.setBackground(new Color(251, 203, 112));
	b8.setForeground(Color.white);
	add(b8);
	b8.addActionListener(this);
	
//Se agrega el boton 9
	b9= new JButton("9");
	b9.setBounds(190,120,90,90);
	b9.setFont(new Font("Arial",Font.BOLD,30));
	b9.setBackground(new Color(251, 203, 112));
	b9.setForeground(Color.white);
	add(b9);
	b9.addActionListener(this);

//Se agrega el boton C	
	bb= new JButton("C");
	bb.setBounds(280,120,90,90);
	bb.setFont(new Font("Arial",Font.BOLD,30));
	bb.setBackground(new Color(251, 112, 112));
	bb.setForeground(Color.white);
	add(bb);
	bb.addActionListener(this);
	
//Se agrega el boton +	
	bs= new JButton("+");
	bs.setBounds(280,230,90,90);
	bs.setFont(new Font("Arial",Font.BOLD,30));
	bs.setBackground(new Color(251, 112, 112));
	bs.setForeground(Color.white);
	add(bs);
	bs.addActionListener(this);
	
	//Se agrega el boton -	
	br= new JButton("-");
	br.setBounds(280,340,90,90);
	br.setFont(new Font("Arial",Font.BOLD,30));
	br.setBackground(new Color(251, 112, 112));
	br.setForeground(Color.white);
	add(br);
	br.addActionListener(this);
	
	//Se agrega el boton *
	bm= new JButton("x");
	bm.setBounds(10,450,90,90);
	bm.setFont(new Font("Arial",Font.BOLD,30));
	bm.setBackground(new Color(251, 112, 112));
	bm.setForeground(Color.white);
	add(bm);
	bm.addActionListener(this);
	
	//Se agrega el boton /	
	bd= new JButton("/");
	bd.setBounds(100,450,90,90);
	bd.setFont(new Font("Arial",Font.BOLD,30));
	bd.setBackground(new Color(251, 112, 112));
	bd.setForeground(Color.white);
	add(bd);
	bd.addActionListener(this);
	
	//Se agrega el boton =	
	bi= new JButton("=");
	bi.setBounds(190,450,90,90);
	bi.setFont(new Font("Arial",Font.BOLD,30));
	bi.setBackground(new Color(251, 112, 112));
	bi.setForeground(Color.white);
	add(bi);
	bi.addActionListener(this);

	Container fondo = this.getContentPane();
    	fondo.setBackground(new Color(112, 146, 251 ));
	}
	public void actionPerformed(ActionEvent e){
	    Object source = e.getSource();
	if(source==b0){
            if(tex.getText()==" "){
                tex.setText("0");
    		}
    		else if(tex.getText().equals("0")){
                return;
    		}
    		else{
                tex.setText(tex.getText()+"0");
    		}
    	}else if(source==b1){
           if(tex.getText().equals("0")){
                tex.setText("1");
    		}
    		else{
            tex.setText(tex.getText()+"1");
    	    }
	    }else if(source==b2){
           if(tex.getText().equals("0")){
                tex.setText("2");
    		}
    		else{
            tex.setText(tex.getText()+"2");
    	    }
	    }else if(source==b3){
           if(tex.getText().equals("0")){
                tex.setText("3");
    		}
    		else{
            tex.setText(tex.getText()+"3");
    	    }
	    }else if(source==b4){
           if(tex.getText().equals("0")){
                tex.setText("4");
    		}
    		else{
            tex.setText(tex.getText()+"4");
    	    }
	    }else if(source==b5){
           if(tex.getText().equals("0")){
                tex.setText("5");
    		}
    		else{
            tex.setText(tex.getText()+"5");
    	    }
	    }else if(source==b6){
           if(tex.getText().equals("0")){
                tex.setText("6");
    		}
    		else{
            tex.setText(tex.getText()+"6");
    	    }
	    }else if(source==b7){
           if(tex.getText().equals("0")){
                tex.setText("7");
    		}
    		else{
            tex.setText(tex.getText()+"7");
    	    }
	    }else if(source==b8){
           if(tex.getText().equals("0")){
                tex.setText("8");
    		}
    		else{
            tex.setText(tex.getText()+"8");
    	    }
	    }else if(source==b9){
           if(tex.getText().equals("0")){
                tex.setText("9");
    		}
    		else{
            tex.setText(tex.getText()+"9");
    	    }
	    }else if(source==bb){
                tex.setText("0");
    	}else if(source==bs){
        	n1=Integer.parseInt(tex.getText());
            signo="+";
            tex.setText("0");
	   }else if(source==br){
        	n1=Integer.parseInt(tex.getText());
            signo="-";
            tex.setText("0");
	   }else if(source==bm){
        	n1=Integer.parseInt(tex.getText());
            signo="x";
            tex.setText("0");
	   }else if(source==bd){
        	n1=Integer.parseInt(tex.getText());
            signo="/";
            tex.setText("0");
	   }else if(source==bi){
        	n2=Integer.parseInt(tex.getText());
            switch(signo){
            case "+":
            tex.setText(Integer.toString(n1+n2));
            break;
            case "-":
            tex.setText(Integer.toString(n1-n2));
            break;
            case "x":
            tex.setText(Integer.toString(n1*n2));
            break;
            case "/":
            tex.setText(Integer.toString(n1/n2));
            break;
            }
	   }
    }
}