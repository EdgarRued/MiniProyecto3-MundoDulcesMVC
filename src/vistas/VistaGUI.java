package vistas;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import controlador.Controlador;
import logica.Dulce;
public class VistaGUI extends JFrame implements VistaDulceria, ActionListener{
    Container contenedor,c2,c3,c4,c5,c6;
        JTextArea kasd= new JTextArea();
        
        FlowLayout flowLayout;
        GridLayout gridLayout;
        
        
        
        ArrayList <JButton> lista;
        JButton  b1,b2,b3,b4,b5,b6;
        
    @Override
    public void iniciar(Controlador controlador) {
        contenedor= getContentPane();
        setLocation(400,200);
        setTitle("Mundo Dulces");
       gridLayout= new GridLayout(1,3, 30,30);
       contenedor.setLayout(gridLayout);
       JPanel panelmain = new JPanel();
       JLabel labelL, labelR;
       labelL = new JLabel("");
       contenedor.add(labelL);
       labelR = new JLabel("");
       panelmain.setLayout(new FlowLayout(1, 5,10));
       JLabel labelMain = new JLabel("De click en la opcion deseada...");
       panelmain.add(labelMain);

       
       
       b1= new JButton("Ingresar Dulces");
       b1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            dispose();
            

            
            
        }
        
       });
    }

    @Override
    public Dulce getDulce() {
        Dulce dolci = new Dulce();
        return dolci;
    }

    @Override
    public void insertarDulce() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


}