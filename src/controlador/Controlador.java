package controlador;

import logica.Categoria;
import logica.Dulce;
import vistas.VistaDulceria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador implements ActionListener{ 

    
    ArrayList<Dulce> ayuda;
    VistaDulceria vista;
    Dulce dulce;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    String operacion;
    String nombre;
    public Controlador(VistaDulceria vista, Dulce dulce) {
        this.vista = vista;
        this.dulce = dulce;
    }

    public String getOperacion() {
        return operacion;
    }

    public void iniciar(){
        vista.iniciar(this);
    }



    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        switch(getOperacion()){
            case "insertar":
                Dulce nuevoDulce = vista.getDulceToInsert();
                dulce.insertarDulce(nuevoDulce);
                break;
            case "eliminar":
                
        }
    }
    
    public void newVista (VistaDulceria newvista){
        vista=newvista;
    }

    
    public void insert(Dulce dulcette){
        dulce.insertarDulce(dulcette);
    }
    public boolean checkName(String name){
        return dulce.nameChecker(name);
        
    }
    public void actualice(String n,String d, Categoria catego,int price){
        dulce.actualization(n, d, catego, price);
    }
    public void delete(String k){
        dulce.elimination(k);
    }
    public ArrayList<Dulce> gettingArray(){
        return dulce.getArray();
    }

}
