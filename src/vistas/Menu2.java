package vistas;
import javax.swing.JButton;
import javax.swing.JFrame;



import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.TextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controlador.Controlador;
import logica.Categoria;
import logica.Dulce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;


public class Menu2 extends JFrame implements ActionListener,ItemListener,VistaDulceria{
    Controlador ctrAux;
    JButton action;
    Container c2;
    Dulce gotDulce;
    TextField campo,camp2;
    Categoria dato;
    String n;
    int p;
    GridLayout newgrid1,grid;
    JComboBox<String> combo;
    JPanel panelsi,Panel2;
    JLabel empty,ms1,ms2,leibol;
    
      GridLayout pru;
    public Menu2(){
         c2= getContentPane();
         setResizable(false);
            setLocation(450,200);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setTitle("Actualizar dulce");
        newgrid1= new GridLayout(1,3,30,30);
            c2.setLayout(new FlowLayout(1));
            empty= new JLabel("");
            c2.add(empty);
            pru= new GridLayout(6,2,30,30);
            panelsi= new JPanel(pru);
//
            panelsi.add(empty);
            panelsi.add(empty);
            ms1 = new JLabel("Nombre del dulce ");
            panelsi.add(ms1);
            campo = new TextField(10);
            panelsi.add(campo);
            
            
//
            
            ms2= new JLabel("Tipo de dulce");
            panelsi.add(ms2);
            String lista [] = {"Seleccione un tipo","Dulce","Acido","Sin azucar"};
            combo = new JComboBox<>(lista);
            combo.addItemListener(this);
            panelsi.add(combo);
            
//
            
            leibol= new JLabel("Precio");
            panelsi.add(leibol);
            camp2= new TextField(10);
            panelsi.add(camp2);
            

            
            grid = new GridLayout(1,3,30,30);
            Panel2= new JPanel(grid);
            Panel2.add(empty);
            action= new JButton("Agregar Dulce");
            
            
            Panel2.add(action);
            Panel2.add(empty);
            panelsi.add(Panel2);
            panelsi.add(empty);
            
            panelsi.add(empty);
            panelsi.add(empty);

            c2.add(panelsi);
            c2.add(empty);

            setSize(500, 300);
            
    }
    public void iniciar(Controlador controlador,String na){
        ctrAux=controlador;
        controlador.setOperacion("Actualizar");
        action.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                VistaGUI vista = new VistaGUI();
                n=campo.getText();
                p=Integer.parseInt(camp2.getText());
                
                controlador.actualice(na,n,dato,p);
                dispose();
                
                
                controlador.newVista(vista);
                controlador.iniciar();
            }
            
        });
        
        
        
        setVisible(true);
        
        
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
       if(e.getSource()==combo){
            if(e.getStateChange()==1){
                if(e.getItem()=="Dulce"){
                    dato = Categoria.dulce;
                }
                if(e.getItem()=="Acido"){
                    dato = Categoria.acido;
                }
                if(e.getItem()=="Sin azucar"){
                    dato = Categoria.notdulce;
                }
                if(e.getItem()=="Seleccione un tipo"){
                    dato = null;
                }
            }
                
            
          }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
    @Override
    public Dulce getDulceToInsert() {
        return gotDulce;
    }
    @Override
    public Dulce getNewDataFromDulceToActualice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNewDataFromDulceToActualice'");
    }
    @Override
    public void iniciar(Controlador controlador) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciar'");
    }
}

