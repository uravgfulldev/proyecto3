/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package implementaciones;

import entidades.Chat;
import entidades.Mensaje;
import entidades.Usuario;
import intefaces.IChatDAO;
import intefaces.IConexionBD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo Rivera
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IConexionBD conexion=new ConexionBD();
        IChatDAO chatDAO=new ChatDAO(conexion);
        Usuario usuario1=new Usuario();
        Usuario usuario2=new Usuario();
        List<Mensaje>mensajes=new ArrayList<>();
        Chat chat=new Chat(usuario1,usuario2,mensajes);
        chatDAO.agregar(chat);
        
    }
    
}
