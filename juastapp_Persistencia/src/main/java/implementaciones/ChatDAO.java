/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import entidades.Chat;
import entidades.Usuario;
import intefaces.IChatDAO;
import intefaces.IConexionBD;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Hugo Rivera
 */
public class ChatDAO implements IChatDAO{
    
    private IConexionBD conexion;
    private MongoDatabase baseDatos;
    
    public ChatDAO(IConexionBD conexion){
        this.conexion=conexion;
        this.baseDatos=this.conexion.crearConexion();
    }
    
    private MongoCollection<Chat> getColeccion(){
        return this.baseDatos.getCollection("chats", Chat.class); 
    }
    @Override
    public boolean agregar(Chat chat) {
        MongoCollection<Chat> coleccion =this.getColeccion();
        coleccion.insertOne(chat);
        return true;
    }

    @Override
    public List<Chat> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Chat> coleccion = this.getColeccion();
        List<Chat> listaChats = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaChats);
        return listaChats;
    }
     public List<Chat> consultarTodos(Usuario usuario) {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Chat> coleccion = this.getColeccion();
        List<Chat> listaChats = new LinkedList<>();
        coleccion.find(
            Filters.or(
                Filters.eq("emisor", usuario.getId()), 
                Filters.eq("receptor", usuario.getId()))
        ).into(listaChats);
        return listaChats;
    }
    @Override
    public Chat consultar(ObjectId idChat) {
        MongoCollection<Chat> coleccion = this.getColeccion();
        List<Document> etapas = new ArrayList<>();
        etapas.add(new Document()
            .append("$match", new Document()
                .append("_id", idChat)));
//        etapas.add(new Document()
//            .append("$lookup", new Document()
//                .append("from", "")
//                .append("localField", "idsRepartidores")
//                .append("foreignField", "_id")
//                .append("as", "repartidores")));
        List<Chat> chats = new LinkedList<>();
        coleccion.aggregate(etapas).into(chats);
        return chats.get(0);
    }

//    @Override
//    public List<RelacionChatMensajesDTO> consultarRelacionChats() {
//        MongoCollection<Chat> coleccion = this.getColeccion();
//        List<Document> etapas = new ArrayList<>();
//        etapas.add(new Document()
//            .append("$lookup", new Document()
//                .append("from", "chats")
//                .append("localField", "idMensaje")
//                .append("foreignField", "_id")
//                .append("as", "mensajes")));
//        
//        etapas.add(new Document()
//            .append("$unwind",new Document()
//                .append("path","$mensajes")));
//        
//        etapas.add(new Document()
//            .append("$project",new Document()
//                .append("_id",0)
//                .append("idChat",1)
//                .append("idMensaje",1)));
//        List<RelacionChatMensajesDTO> chats = new LinkedList<>();
//        coleccion.aggregate(etapas).into(chats);
//        return chats.get(0);
//    }
    
    
}
