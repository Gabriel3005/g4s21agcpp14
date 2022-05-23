/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21agcpp14;

import ConexionDAO.Conexion;
import DTO.Datos;
/**
 *
 * @author alexg
 */
public class G4S21AGCPP14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion conexion = new Conexion();
        conexion.Abrir();
        conexion.cerrar();        
        
        if(conexion.borrar(1)){
            System.out.println("se consultaron");
        }else{
            System.out.println("no se logro la consulta");
        }
        
       conexion.cerrar();
    }   
}
