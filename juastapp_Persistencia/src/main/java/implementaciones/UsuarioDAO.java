/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Chat;
import entidades.Usuario;
import intefaces.IConexionBD;
import intefaces.IUsuarioDAO;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Hugo Rivera
 */
public class UsuarioDAO implements IUsuarioDAO{
    private MongoDatabase baseDatos;
   
    public UsuarioDAO(IConexionBD conexion){
        
        this.baseDatos=conexion.crearConexion();
    }
    
    private MongoCollection<Usuario> getColeccion(){
        return this.baseDatos.getCollection("usuarios", Usuario.class); 
    }
    @Override
    public boolean agregar(Usuario usuario) {
        MongoCollection<Usuario> coleccion =this.getColeccion();
        coleccion.insertOne(usuario);
        return true;
    }

    @Override
    public List<Usuario> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Usuario> coleccion = this.getColeccion();
        List<Usuario> listaUsuarios = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaUsuarios);
        return listaUsuarios;
    }

    @Override
    public Usuario consultar(ObjectId idUsuario) {
        MongoCollection<Usuario> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("_id", idUsuario)));
//        etapas.add(new Document()
//            .append("$lookup", new Document()
//                .append("from", "")
//                .append("localField", "idsRepartidores")
//                .append("foreignField", "_id")
//                .append("as", "repartidores")));
        List<Usuario> usuarios = new LinkedList<>();
        coleccion.aggregate(etapas).into(usuarios);
       if(usuarios.size()>0){
            return usuarios.get(0);
        }else{
            return null;
        }
    }
    
    @Override
    public Usuario consultar(String correo) {
        MongoCollection<Usuario> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("correo", correo)));
//        etapas.add(new Document()
//            .append("$lookup", new Document()
//                .append("from", "")
//                .append("localField", "idsRepartidores")
//                .append("foreignField", "_id")
//                .append("as", "repartidores")));
        List<Usuario> usuarios = new LinkedList<>();
        coleccion.aggregate(etapas).into(usuarios);
        if(usuarios.size()>0){
            return usuarios.get(0);
        }else{
            return null;
        }
        
    }
   
    
}
