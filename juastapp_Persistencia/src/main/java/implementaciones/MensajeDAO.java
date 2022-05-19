/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoDatabase;
import intefaces.IConexionBD;
import intefaces.IMensajeDAO;

/**
 *
 * @author Hugo Rivera
 */
public class MensajeDAO implements IMensajeDAO{
    private MongoDatabase baseDatos;

    public MensajeDAO(IConexionBD conexion) {
        this.baseDatos=conexion.crearConexion();
    }
    
    
    
}
