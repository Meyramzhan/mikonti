package calculator;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class calculator extends JFrame{   
   
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private JMenuBar MenuBar = new JMenuBar();
    
    
    private GridLayout Layout = new GridLayout(6, 4, 4, 4);
    private Font Fonte_Visor = new Font("Consolas", Font.PLAIN, 35);
    private JPanel Geral = new JPanel();
    private JPanel Panel_B = new JPanel();
    private JPanel Panel = new JPanel();
    private JLabel Visor = new JLabel("0");
    private JButton C = new JButton("C");
    private JButton B_B = new JButton("<<<");
    private JButton B1 = new JButton("1");
    private JButton B2 = new JButton("2");
    private JButton B3 = new JButton("3");
    private JButton B4 = new JButton("4");
    private JButton B5 = new JButton("5");
    private JButton B6 = new JButton("6");
    private JButton B7 = new JButton("7");
    private JButton B8 = new JButton("8");
    private JButton B9 = new JButton("9");
    private JButton B0 = new JButton("0");
    private JButton B_I = new JButton("=");
    private JButton B_Ad = new JButton("+");
    private JButton B_Sb = new JButton("-");
    private JButton B_Mt = new JButton("X");
    private JButton B_Dv = new JButton("/");
    private JButton B00 = new JButton("00");
    private JButton Bper =new  JButton("%");
    private JButton Bh =new  JButton("√");
    
    public calculator() {
    	
    	
    	
        super("Калькулятор");       
        Color operationsColor = new Color(0, 96, 255); 
       Color numbersColor = new Color(0, 192, 0);
       Color numsColor = new Color(255, 192, 0);
       Color numbsColor = new Color(0, 255, 192);
        B1.setMnemonic(KeyEvent.VK_NUMPAD1);
        B1.setBackground(numbersColor);
        B2.setMnemonic(KeyEvent.VK_NUMPAD2);
        B2.setBackground(numbersColor);
        B3.setMnemonic(KeyEvent.VK_NUMPAD3);
        B3.setBackground(numbersColor);
        B4.setMnemonic(KeyEvent.VK_NUMPAD4);
        B4.setBackground(numbersColor);
        B5.setMnemonic(KeyEvent.VK_NUMPAD5);
        B5.setBackground(numbersColor);
        B6.setMnemonic(KeyEvent.VK_NUMPAD6);
        B6.setBackground(numbersColor);
        B7.setMnemonic(KeyEvent.VK_NUMPAD7);
        B7.setBackground(numbersColor);
        B8.setMnemonic(KeyEvent.VK_NUMPAD8);
        B8.setBackground(numbersColor);
        B9.setMnemonic(KeyEvent.VK_NUMPAD9);
        B9.setBackground(numbersColor);
        B0.setMnemonic(KeyEvent.VK_NUMPAD0);
        B0.setBackground(numbersColor);
        Bper.setMnemonic(KeyEvent.VK_NUMPAD0);
        Bper.setBackground(numbersColor);
        Bh.setMnemonic(KeyEvent.VK_NUMPAD0);
        Bh.setBackground(numbersColor);
        B00.setMnemonic(KeyEvent.VK_NUMPAD0);
        B00.setBackground(numbersColor);
        
       
        B_Ad.setMnemonic(KeyEvent.VK_ADD);        
        B_Ad.setBackground(operationsColor);
        
        B_Sb.setMnemonic(KeyEvent.VK_SUBTRACT);
        B_Sb.setBackground(operationsColor);
        
        B_Mt.setMnemonic(KeyEvent.VK_MULTIPLY);
        B_Mt.setBackground(operationsColor);
        
        B_Dv.setMnemonic(KeyEvent.VK_DIVIDE);
        B_Dv.setBackground(operationsColor);
        
        B_I.setMnemonic(KeyEvent.VK_ENTER);
        B_I.setBackground(numsColor);
        B_B.setMnemonic(KeyEvent.VK_BACK_SPACE);
        B_B.setBackground(numbsColor);
        C.setMnemonic(KeyEvent.VK_DELETE);
        C.setBackground(numbsColor);
      
        this.setJMenuBar(MenuBar);
       
       
        Panel.add(B_B);
        Panel.add(B_Mt);
        Panel.add(B_Ad);
        Panel.add(C);
        Panel.add(B_Sb);
        Panel.add(B_Dv);
        Panel.add(B7);
        Panel.add(B8);
        Panel.add(B9); 
        Panel.add(B4);
        Panel.add(B5); 
        Panel.add(B6); 
        Panel.add(B1);
        Panel.add(B2);
        Panel.add(B3);
        Panel.add(B0);
        Panel.add(Bper); 
        Panel.add(Bh); 
        
        Panel.add(B00);
        Panel.add(B_I);
        Panel.setLayout(Layout);
        Visor.setFont(Fonte_Visor);
            
         Visor.setHorizontalAlignment(SwingConstants.RIGHT);
   
        Visor.setBorder(BorderFactory.createTitledBorder(""));
        Panel_B.add(Panel);
    
        Visor.setPreferredSize(new Dimension (230,80));
       
        Geral.add(Visor);
        Geral.add(Panel_B);
        add(Geral);
       
        ButtonHandler Handler = new ButtonHandler();
        B1.addActionListener(Handler);
        B2.addActionListener(Handler);
        B3.addActionListener(Handler);
        B4.addActionListener(Handler);
        B5.addActionListener(Handler);
        B6.addActionListener(Handler);
        B7.addActionListener(Handler);
        B8.addActionListener(Handler);
        B9.addActionListener(Handler);
        B0.addActionListener(Handler);
        Bper.addActionListener(Handler);
        Bh.addActionListener(Handler);
       
        C.addActionListener(Handler);
        B_B.addActionListener(Handler);
        B_Ad.addActionListener(Handler);
        B_Sb.addActionListener(Handler);
        B_Mt.addActionListener(Handler);
        B_Dv.addActionListener(Handler);
        B_I.addActionListener(Handler);
        
        B00.addActionListener(Handler);
 }
   
   
    private class ButtonHandler implements ActionListener{
       
        String cadeia = "0";
        String copiar = "";
        double Num1, Num2, resultado;
        char Operacao = 'n';
        int Achou, zerar;
       
         public void actionPerformed (ActionEvent event){
            
        	 	if (event.getSource() == B1){
                 
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "1";
                zerar = 0;
            }
           
           
            if (event.getSource() == B2){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "2";
                zerar = 0;
            }
           
           
            if (event.getSource() == B3){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "3";
                zerar = 0;
            }
           
           
            if (event.getSource() == B4){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "4";
                zerar = 0;
            }
           
           
            if (event.getSource() == B5){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "5";
                zerar = 0;
            }
           
           
            if (event.getSource() == B6){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "6";
                zerar = 0;
            }
           
           
            if (event.getSource() == B7){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "7";
                zerar = 0;
            }
           
           
            if (event.getSource() == B8){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "8";
                zerar = 0;
            }
           
           
            if (event.getSource() == B9){
                if (zerar ==1) cadeia = "";
                if (cadeia.equals("0")) cadeia = "";
                    cadeia = cadeia + "9";
                zerar = 0;
            }
   
           
           
           
           
            if (event.getSource() == B0){
                if (zerar ==1) cadeia = "";
               
                if (!cadeia.equals("0")){
                    cadeia = cadeia + "0";
                } else zerar = 1;
                
                zerar = 0;
            }
           
            if (event.getSource() == B00){
                if (zerar ==1) cadeia = "";
               
                if (!cadeia.equals("0")){
                    cadeia = cadeia + "00";
                } else zerar = 1;
               
                zerar = 0;
            }
            
            
            
            if (event.getSource() == C){
                cadeia = "0";
                zerar = 1;
            }
           
           
            if (event.getSource() == B_B){
                if (cadeia.length()  > 1) cadeia = cadeia.substring(0, cadeia.length()-1);
                   else{
                    cadeia = "0";
                    zerar = 1;
                   }
            }
           
           
            
           
           
            if (event.getSource() == B_Ad){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '+';
                zerar = 1;
            }
           
           
            if (event.getSource() == B_Sb){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '-';
                zerar = 1;
            }
           
           
            if (event.getSource() == B_Mt){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '*';
                zerar = 1;
            }
           
           
            if (event.getSource() == B_Dv){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '/';
                zerar = 1;
            }
            if (event.getSource() == Bper){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '%';
                zerar = 1;
            }
            
            if (event.getSource() == Bh){               
                Num1 = Double.parseDouble(Visor.getText());
                Operacao = '√';
                zerar = 1;
            }
           
            if (event.getSource() == B_I){
                           
                Num2 = Double.parseDouble(Visor.getText());
               
                 switch(Operacao) {
                    
                     case 'n': resultado = Num2;
                     break;
        
                     case '+': resultado = Num1 + Num2;
                     break; 
        
                     case '-': resultado = Num1 - Num2;
                     break;
        
                     case '*': resultado = Num1 * Num2;
                     break;
        
                     case '/': resultado = Num1 / Num2;
                     break;
                     
                     case '%': resultado = (Num1 * Num2)/100;
                     break;
                     case '√':resultado = Math.sqrt(Num1);
                     break;
                 }
                 if(resultado - (int)resultado == 0) {
                	 cadeia = String.valueOf((int)resultado);
                 } else {
                	 cadeia = String.valueOf(resultado);
                 }
                 
                  zerar = 1;
              }
             
                Visor.setText("" + cadeia);
            
         }
    }


    			public static void main(String [] args){
  
    	 calculator Propriedades_Calculadora = new calculator();
             
            Propriedades_Calculadora.setSize(238, 330);
          
            Propriedades_Calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            Propriedades_Calculadora.setVisible(true);
            
            Propriedades_Calculadora.setResizable(false);
           
            Propriedades_Calculadora.setLocationRelativeTo(null);
    }
} 