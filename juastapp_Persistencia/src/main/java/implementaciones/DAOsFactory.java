/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import intefaces.IChatDAO;
import intefaces.IConexionBD;
import intefaces.IMensajeDAO;
import intefaces.IUsuarioDAO;

/**
 *
 * @author Hugo Rivera
 */
public class DAOsFactory {
    private final static IConexionBD conexion=new ConexionBD();
    
    public static IUsuarioDAO crearUsuarioDAO(){
        return new UsuarioDAO(conexion);
    }
    
    public static IChatDAO crearChatDAO(){
        return new ChatDAO(conexion);
    }
    
    public static IMensajeDAO crearMensajeDAO(){
        return new MensajeDAO(conexion);
    }
    
    
}
