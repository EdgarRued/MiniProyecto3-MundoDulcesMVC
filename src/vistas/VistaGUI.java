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
    Controlador ctrlAux;
    Dulce gotchu;
    Container contenedor,c2,c3,c4,c5,c6;
        JTextArea kasd= new JTextArea();
        String nameToUp;
        JPanel panelmain;
        FlowLayout FlowLayout;
        GridLayout gridLayout;
        JLabel labelL, labelR, labelMain;
        
        
        ArrayList <JButton> lista;
        JButton  b1,b2,b3,b4,b5,b6;
        
        public VistaGUI(){
            contenedor= getContentPane();
            setResizable(false);
        setLocation(400,200);
        setTitle("Mundo Dulces");
       gridLayout= new GridLayout(1,3, 30,30);
       contenedor.setLayout(gridLayout);
       panelmain = new JPanel();
       
       labelL = new JLabel("");
       contenedor.add(labelL);
       labelR = new JLabel("");
       panelmain.setLayout(new FlowLayout(1, 5,10));
       labelMain = new JLabel("De click en la opcion deseada...");
       panelmain.add(labelMain);

       
       
       b1= new JButton("Ingresar Dulces");
       panelmain.add(b1);
       b2=new JButton("Actualizar Dulce", null);
       panelmain.add(b2);
       b3=new JButton("Eliminar Dulce", null);
       panelmain.add(b3);
       b4=new JButton("Buscar Dulce", null);
       panelmain.add(b4);
       b5=new JButton("Listar Dulces", null);
       panelmain.add(b5);
        b6= new JButton("Resumen de dulces", null);
        panelmain.add(b6);
        contenedor.add(panelmain);
        contenedor.add(labelR);
       setSize(650, 300);
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       
    }
        
    @Override
    public void iniciar(Controlador controlador) {
        b1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            Menu1 vista = new Menu1();
            controlador.newVista(vista);
            dispose();
            vista.iniciar(controlador);
            }
        
       });
       b2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            nameToUp=JOptionPane.showInputDialog(contenedor,"Ingrese el nombre del Dulce a actualizar");
            if(controlador.checkName(nameToUp)==true){
                Menu2 vista2 = new Menu2();
                controlador.newVista(vista2);
                dispose();
                vista2.iniciar(controlador,nameToUp);
            }else{
                JOptionPane.showMessageDialog(contenedor, "no se encontro el dulce","Error",0);
            }
            
            }
        
       });
        
        
        
        
        
        
        setVisible(true);
    }

    @Override
    public Dulce getDulceToInsert() {
         return gotchu;
    }

    public Dulce getNewDataFromDulceToActualice(){
        
        return null;
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }


}