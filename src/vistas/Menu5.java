package vistas;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.FlowLayout;


import java.awt.TextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import javax.swing.JScrollPane;


import controlador.Controlador;
import logica.Categoria;
import logica.Dulce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import java.util.ArrayList;
public class Menu5 extends JFrame implements ActionListener,VistaDulceria {
    ArrayList<Dulce> help;
    JButton action,Butonnes,volver;
    JScrollPane pane;
    JTextArea at;
    Container c2;
    TextField campo,camp2;
    Categoria dato;
    String n,Vcategoria;
    int p,values;
    int cont =0;
    int i=-1;

    JComboBox<String> combo;
    
    
    public Menu5(){
        c2= getContentPane();
        setResizable(false);
        setTitle("Lista de dulces");
        setSize(500, 300);
        setLocation(450,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        c2.setLayout(new FlowLayout(1,30,30));
        JLabel empty = new JLabel("Use el scroll de ser necario");
        c2.add(empty);
        at= new JTextArea(10, 10);
        at.setEditable(false);
        at.append("===============\n");
        
        pane = new JScrollPane(at);
        


        volver = new JButton("Volver");
       
        c2.add(pane); 
        c2.add(volver);

            
            
                
        
       
            
    }
    public void itemStateChanged(ItemEvent e) {
        
       
    }

    
    public void actionPerformed(ActionEvent e) {
        
    }
    @Override
    public void iniciar(Controlador controlador) {
        help= controlador.gettingArray();
        for (int i=0; i<help.size(); i++){
            Dulce obj = help.get(i);
            String nom = obj.getNombre();
            Categoria ctr=obj.getCatego();
            String msg="";
            int p = obj.getPrecio();
            if(ctr==Categoria.dulce){
                msg="Dulce";
            }
            if(ctr==Categoria.acido){
                msg="Acido";
            }
            if(ctr==Categoria.notdulce){
                msg="Sin Azucar";
            }
            at.append("Dulce N°"+(i+1)+"\n");
            at.append("Nombre: "+ nom+"\n");
            at.append("Tipo: "+msg+"\n");
            at.append("Precio: "+p+"\n");
            at.append("===============\n");

        }
             volver.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                VistaDulceria vista = new VistaGUI();
                
                
                
              
                dispose();
                
                
                vista.iniciar(controlador);
            }
            
        });
         setVisible(true);
    }
    
   
}
