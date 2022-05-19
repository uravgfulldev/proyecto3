/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intefaces;

import entidades.Chat;
import entidades.Usuario;
import implementaciones.RelacionChatMensajesDTO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Hugo Rivera
 */
public interface IChatDAO {
    boolean agregar(Chat chat);
    List<Chat> consultarTodos();
    Chat consultar(ObjectId idChat);

    List<Chat> consultarTodos(Usuario usuario);
    
}
