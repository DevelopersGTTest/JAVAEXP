/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv;


import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hackobo
 */
public class ControladorInventario {
    private static ControladorInventario instance;
    private ArrayList<Articulo> articulo = new ArrayList();

    public static ControladorInventario getInstance(){
        if( instance == null ){
            instance = new ControladorInventario();
        }
        return instance;
    }

    public void aArticulo(String nombreArticulo, float precioArtirulo, int stock){
        articulo.add( new Articulo( nombreArticulo, precioArtirulo, stock ));
        try {
            FileOutputStream db = new  FileOutputStream("articulos");
            ObjectOutputStream obj = new ObjectOutputStream(db);
            obj.writeObject( articulo);
            obj.close();
            db.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mArticulo(){
        
        try {
            FileInputStream db = new FileInputStream("articulos");
            ObjectInputStream obj = new ObjectInputStream(db);
            
            articulo = (ArrayList) obj.readObject();
            
            obj.close();
            db.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for( int i=0; i < articulo.size(); i++ ){
            System.out.println("id " + i );
            System.out.println("nombre A " + articulo.get(i).getNombreArticulo());
            System.out.println("precio A " + articulo.get(i).getPrecioArtirulo() );
            System.out.println("stock A " + articulo.get(i).getStock());
            System.out.println("=========================================");
        }
    }
    
    public boolean verificarStock(int idArticulo ){
        boolean respuesta = false;
        for(int i=0; i < articulo.size(); i++ ){
            if(i == idArticulo ){
                if( articulo.get(i).getStock() > 0 ){
                    return respuesta = true; //porque si ayock
                }else{
                    return respuesta = false;
                }
            }
        }
        return respuesta;
    }

}
