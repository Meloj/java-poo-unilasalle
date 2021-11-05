import javax.print.event.PrintEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Calc implements ActionListener {

    private JFrame janela;
    private JPanel painel;

    //componentes da janela
    private JLabel lblTitulo;
    private JLabel lblNum1;
    private JLabel lblNum2;

    private JTextField txtNum1;
    private JTextField txtNum2;

    private JButton btnSomar;
    private JButton btnSubtrair;
    private JButton btnDividir;
    private JButton btnMultiplicar;

    private JLabel lblResultado;

    public Calc(){
        janela = new JFrame("Semana 9 - Calculadora");
        
        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 20, 30));
        painel.setLayout(new GridLayout(0,1));

        //desenhar na tela
        lblTitulo = new JLabel("Calculadora");
        lblTitulo.setFont(new Font("Verdana", Font.BOLD, 30));
        painel.add(lblTitulo);

        lblNum1 = new JLabel("Digite o primeiro termo:");
        painel.add(lblNum1);
        txtNum1 = new JTextField("0");
        painel.add(txtNum1);

        lblNum2 = new JLabel("Digite o segundo termo:");
        painel.add(lblNum2);
        txtNum2 = new JTextField("0");
        painel.add(txtNum2);

        btnSomar = new JButton("Somar");
        btnSomar.addActionListener(this);
        painel.add(btnSomar);

        btnSubtrair = new JButton("Subtrair");
        btnSubtrair.addActionListener(this);
        painel.add(btnSubtrair);

        btnDividir = new JButton("Dividir");
        btnDividir.addActionListener(this);
        painel.add(btnDividir);

        btnMultiplicar = new JButton("Multiplicar");
        btnMultiplicar.addActionListener(this);
        painel.add(btnMultiplicar);

        lblResultado = new JLabel("Resultado = ");
        painel.add(lblResultado);

        janela.add(painel, BorderLayout.CENTER);
        janela.setSize(500, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        try{

        Integer num1 = Integer.parseInt(txtNum1.getText());
        Integer num2 = Integer.parseInt(txtNum2.getText());

        
        if(evento.getActionCommand() == "Somar"){
            lblResultado.setText("Resultado = " + (num1 + num2));
        }
        else if(evento.getActionCommand() == "Subtrair"){
            lblResultado.setText("Resultado = " + (num1 - num2));
        }
        else if(evento.getActionCommand() == "Dividir"){
            lblResultado.setText("Resultado = " + (num1 / num2));
        }
        else if(evento.getActionCommand() == "Multiplicar"){
            lblResultado.setText("Resultado = " + (num1 * num2));
        }

        
    }
    catch(NumberFormatException e){
        lblResultado.setText("**Error** Entre apenas com números!");
        lblResultado.setForeground(Color.RED);
    }
    catch(Exception e){
        System.err.println("Erro não identificado" + e.getMessage());
    }
}

    public static void main(String[] args) {
        new Calc();
    }

}