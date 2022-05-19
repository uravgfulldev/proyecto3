/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intefaces;

import entidades.Usuario;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Hugo Rivera
 */
public interface IUsuarioDAO {
    boolean agregar(Usuario usuario);
    List<Usuario> consultarTodos();
    Usuario consultar(ObjectId idUsuario);
    Usuario consultar(String correo);
}
