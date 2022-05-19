/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Hugo Rivera
 */
public class Chat {
    private ObjectId id;
    private String titulo;
    private Usuario emisior;
    private Usuario receptor;
    private List<Mensaje> mensajes;

    public Chat() {
    }

    public Chat(Usuario emisior, Usuario receptor, List<Mensaje> mensajes) {
        this.titulo=receptor.getUsername();
        this.emisior = emisior;
        this.receptor = receptor;
        this.mensajes = mensajes;
    }

    public Chat(ObjectId id, Usuario emisior, Usuario receptor, List<Mensaje> mensajes) {
        this.id = id;
        this.titulo=receptor.getUsername();
        this.emisior = emisior;
        this.receptor = receptor;
        this.mensajes = mensajes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
    public Usuario getEmisior() {
        return emisior;
    }

    public void setEmisior(Usuario emisior) {
        this.emisior = emisior;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.emisior);
        hash = 17 * hash + Objects.hashCode(this.receptor);
        hash = 17 * hash + Objects.hashCode(this.mensajes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chat other = (Chat) obj;
        if (!Objects.equals(this.emisior, other.emisior)) {
            return false;
        }
        if (!Objects.equals(this.receptor, other.receptor)) {
            return false;
        }
        if (!Objects.equals(this.mensajes, other.mensajes)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return "Chat{" + "emisior=" + emisior + ", receptor=" + receptor + ", mensajes=" + mensajes + '}';
    }
    
    
}
