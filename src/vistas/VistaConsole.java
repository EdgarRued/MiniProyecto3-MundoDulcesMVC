package vistas;

import java.util.ArrayList;
import java.util.Scanner;


import javax.swing.JOptionPane;

import controlador.Controlador;
import logica.Categoria;
import logica.Dulce;

public class VistaConsole implements VistaDulceria {
    ArrayList<Dulce> help;
    String name,nameDelete,nameAct,categShow,step;
    int price;
    byte decision;
    Categoria category;
    @Override
    public void iniciar(Controlador controlador) {
        help=controlador.gettingArray();
        System.out.println("--------------");
        System.out.println("- Bienvenido");
        System.out.println("--------------");
        
        boolean seguir = true;
        while(seguir){
            System.out.println("Digita el numero de la opción deseada: ");
            System.out.println("1 Insertar Dulce");
            System.out.println("2 Actualizar Dulce");
            System.out.println("3 Elminar Dulce" );
            System.out.println("4 Buscar Dulce" );
            System.out.println("5 Listar Dulces" );
            System.out.println("6 Resumen de dulces" );
            System.out.println("7 salir");
            System.out.print("R: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    clearscreen();
                    name=JOptionPane.showInputDialog(null,"Ingrese el nombre del dulce");
                    decision =Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese un tipo de dulce  \n1.Dulce\n2.Acido\n3.Sin Azucar")); 
                    if(decision==1){
                        category=Categoria.dulce;
                    }else if(decision==2){
                        category=Categoria.acido;
                    }else if (decision==3){
                        category=Categoria.notdulce;
                    }else{
                        JOptionPane.showMessageDialog(null,"Opcion invalida","error",0);
                    }
                    price = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el precio del Dulce"));
                    Dulce dolci= new Dulce(name,category,price);
                    controlador.insert(dolci);
                    break;
                case 2:
                clearscreen();
                    if(help.isEmpty()==true){
                        JOptionPane.showMessageDialog(null,"No hay dulces para actualizar","Error",0);
                    }else{
                    String nameAct = JOptionPane.showInputDialog(null,"Nombre del dulce a actualizar");
                    for(int i=0;i<help.size();i++){
                        if(help.get(i).getNombre().equals(nameAct)){
                            name= JOptionPane.showInputDialog(null,"Nuevo nombre del dulce");
                            decision =Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese el nuevo tipo de dulce  \n1.Dulce\n2.Acido\n3.Sin Azucar")); 
                    if(decision==1){
                        category=Categoria.dulce;
                    }else if(decision==2){
                        category=Categoria.acido;
                    }else if (decision==3){
                        category=Categoria.notdulce;
                    }else{
                        JOptionPane.showMessageDialog(null,"Opcion invalida","error",0);
                    }
                    price = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el nuevo precio"));
                    controlador.actualice(nameAct, name, category, price);
                    }
                }
                    
                    }
                    break;
                case 3:
                clearscreen();
                if(help.isEmpty()==true){
                        JOptionPane.showMessageDialog(null,"No hay dulces para eliminar","Error",0);
                    }else{
                    String nameDelete = JOptionPane.showInputDialog(null,"Nombre del dulce a eliminar");
                    for(int i=0;i<help.size();i++){
                        if(help.get(i).getNombre().equals(nameDelete)){
                            controlador.delete(nameDelete);
                        }
                    }
                    
                    }
                    break;
                case 4:
                    clearscreen();
                    if(help.isEmpty()==true){
                        JOptionPane.showMessageDialog(null,"No hay dulces para buscar ","Error",0);
                    }else{
                    String name = JOptionPane.showInputDialog(null,"Nombre del dulce a buscar");
                    System.out.println("=====================");
                    for(int i=0;i<help.size();i++){
                        if(help.get(i).getNombre().equals(name)){
                            System.out.println("Datos del dulce");
                            System.out.println("=====================");
                            System.out.println("Nombre: "+help.get(i).getNombre());
                            if(help.get(i).getCatego()==Categoria.dulce){
                                categShow="Dulce";
                            }else if(help.get(i).getCatego()==Categoria.acido){
                                categShow="Acido";
                            }else if(help.get(i).getCatego()==Categoria.notdulce){
                                categShow="Sin azucar";
                            }
                            System.out.println("Tipo: "+categShow);
                            System.out.println("Precio: "+help.get(i).getPrecio());
                            System.out.println("=====================");
                            if(i<help.size()){
                            System.out.print("");
                            step=scanner.nextLine();
                        }else if(i==help.size()){
                            System.out.println("presione enter");
                        }
                            if(i<help.size()){
                    System.out.print("presione otra vez para continuar");
                    String p= scanner.nextLine();
                }
                            
                        }
                    }
                    
                    }
                    break;
                case 5:
                    clearscreen();
                    if(help.isEmpty()==true){
                        JOptionPane.showMessageDialog(null,"No hay dulces para mostrar ","Error",0);
                    }else{
                    
                   
                    for(int i=0;i<help.size();i++){
                            clearscreen();
                            System.out.println("=====================");
                            System.out.println("Datos del dulce");
                            System.out.println("=====================");
                            System.out.println("Dulce N°: "+(i+1));
                            System.out.println("Nombre: "+help.get(i).getNombre());
                            if(help.get(i).getCatego()==Categoria.dulce){
                                categShow="Dulce";
                            }else if(help.get(i).getCatego()==Categoria.acido){
                                categShow="Acido";
                            }else if(help.get(i).getCatego()==Categoria.notdulce){
                                categShow="Sin azucar";
                            }
                            System.out.println("Tipo: "+categShow);
                            System.out.println("Precio: "+help.get(i).getPrecio());
                            System.out.println("=====================");
                            if(i<help.size()){
                            System.out.print("");
                            step=scanner.nextLine();
                        }else if(i==help.size()){
                            System.out.println("presione enter");
                        }
                            if(i<help.size()){
                    System.out.print("presione otra vez para continuar");
                    String p= scanner.nextLine();
                }
                    }
                    

                    }
                    break;
                case 6:
                    clearscreen();
                    if(help.isEmpty()==true){
                        JOptionPane.showMessageDialog(null,"No hay dulces para mostrar ","Error",0);
                    }else{
                    
                   System.out.println("=====================");
                   System.out.println("Nombres de dulces creados");
                    
                    for(int i=0;i<help.size();i++){
                            System.out.println("=====================");
                            
                            
                            System.out.println("Dulce N°: "+(i+1));
                            System.out.println("Nombre: "+help.get(i).getNombre());
                            System.out.println("=====================");
                            if(i<help.size()){
                            System.out.print("");
                            step=scanner.nextLine();
                        }
                            if(i<help.size()){
                    System.out.print("presione otra vez para continuar");
                    String p= scanner.nextLine();
                }
                    }
                    
                    
                    }
                    
                    break;
                default:
                    seguir = false;
                    break;
            }
            
        }
    }
      public void clearscreen(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }

   
    
}
