package controlador;

import logica.Dulce;
import vistas.VistaDulceria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{ 

    
    
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
                Dulce nuevoDulce = vista.getDulce();
                dulce.insertarDulce(nuevoDulce);
                break;
            case "eliminar":
                dulce.eliminarDulce(getNombre());
        }
    }

    


}
