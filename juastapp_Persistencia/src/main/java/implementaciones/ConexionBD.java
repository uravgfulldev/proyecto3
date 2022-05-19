/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import intefaces.IConexionBD;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Hugo Rivera
 */
public class ConexionBD implements IConexionBD{
    private static final String HOST="localhost";
    private static final int PUERTO=27017;
    private static final String BASE_DATOS="Juatsapp";

    @Override
    public MongoDatabase crearConexion() {
        try{
            //CONFIGURACIÓN PARA QUE MONGODRIVE REALICE EL MAPEO DE POJOS AUMATICAMENTE
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
            
            CodecRegistry codecRegistry=fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),pojoCodecRegistry);
            
            ConnectionString cadenaConexion= new ConnectionString("mongodb://"+HOST+"/"+PUERTO);
            
            MongoClientSettings clientsSettings =MongoClientSettings.builder()
                    .applyConnectionString(cadenaConexion)
                    .codecRegistry(codecRegistry)
                    .build();
            
            MongoClient clienteMongo= MongoClients.create(clientsSettings);
            
            MongoDatabase baseDatos = clienteMongo.getDatabase(BASE_DATOS);
            
            return baseDatos;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return null;
        }
    }
    
    
}
