/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package intefaces;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Hugo Rivera
 */
public interface IConexionBD {
  MongoDatabase crearConexion();  
}
