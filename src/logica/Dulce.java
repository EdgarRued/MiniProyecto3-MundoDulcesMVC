//Esta clase es el MODELO
package logica;
import java.util.ArrayList;
public class Dulce {
    
    static ArrayList<Dulce> listaDulce = new ArrayList<Dulce>();
    private String nombre;
    boolean Encout;
    Categoria catego;
    int precio;
    public Dulce(String nombre, Categoria catego, int precio) {
        this.nombre = nombre;
        this.catego = catego;
        this.precio = precio;
    }
    public Dulce(){
        
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Categoria getCatego() {
        return catego;
    }
    public void setCatego(Categoria catego) {
        this.catego = catego;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void insertarDulce(Dulce mascota){
        
        listaDulce.add(mascota);

        for( Dulce dulce : listaDulce){
            System.out.println(dulce.getNombre());
            System.out.println(dulce.getPrecio());
            System.out.println(dulce.getCatego()+"");
        }           
    }

    public void elimination(String g){

        for(int i = 0; i < listaDulce.size(); i++){
            if(listaDulce.get(i).getNombre().equals(g)){
                listaDulce.remove(i);
            }
        }
        System.out.println("Imprimir lista"+listaDulce.size());
        for(Dulce dulce : listaDulce){
            System.out.println(dulce.getNombre());
        }           
    }
    public void actualization(String n,String d, Categoria sharp,int p){
        for(int i = 0; i < listaDulce.size(); i++){
            if(listaDulce.get(i).getNombre().equals(n)){
                listaDulce.get(i).setNombre(d);
                listaDulce.get(i).setCatego(sharp);
                listaDulce.get(i).setPrecio(p);
            }
        }
        System.out.println("Imprimir lista"+listaDulce.size());
        for(Dulce dulce : listaDulce){
            System.out.println(dulce.getNombre());
        } 
    }
    

    public boolean VoidChecker (){
        if(listaDulce.isEmpty()==true){
            return true;
        }else{
            return false;
        }
    }
    public boolean nameChecker(String nombre){
         for(int i = 0; i < listaDulce.size(); i++){
            if(listaDulce.get(i).getNombre().equals(nombre)){
                Encout=true;
            }else{
                Encout=false;
            }
        }
        
        return Encout;
            
    }
    public ArrayList<Dulce> getArray(){
        return listaDulce;
    }
    
     
}
