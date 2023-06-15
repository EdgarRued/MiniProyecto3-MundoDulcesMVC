package vistas;

import controlador.Controlador;
import logica.Dulce;

public interface VistaDulceria {
    public void iniciar(Controlador controlador);
    public Dulce getDulce();
    public void insertarDulce();
}
