package main;

import controlador.Controlador;
import logica.Dulce;
import vistas.VistaConsole;
import vistas.VistaDulceria;
import vistas.VistaGUI;

public class Main {
    public static void main(String[] args){
        System.out.println("hello wo");
        Dulce dulce = new Dulce();
        VistaDulceria vista = new VistaConsole();
        Controlador ctrl = new Controlador(vista, dulce);
        ctrl.iniciar();
    }
}
