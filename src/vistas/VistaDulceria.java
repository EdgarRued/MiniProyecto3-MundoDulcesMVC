package vistas;

import java.util.ArrayList;

import controlador.Controlador;
import logica.Dulce;

public interface VistaDulceria {
    public void iniciar(Controlador controlador);
    public Dulce getDulceToInsert();
    public Dulce getNewDataFromDulceToActualice();
}
