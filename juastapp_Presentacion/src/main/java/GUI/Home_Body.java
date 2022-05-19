/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import entidades.Usuario;
import eventos.EventChat;
import eventos.EventUser;
import eventos.PublicEvent;
import net.miginfocom.swing.MigLayout;

public class Home_Body extends javax.swing.JLayeredPane {

  
    private Usuario usuario;
    public Home_Body() {
        initComponents();
        init();
    }

    private void init(){
        setLayout(new MigLayout("fillx, filly","0[250!]0[fill,100%]5","0[fill]10"));
        //setLayout(new MigLayout());
       this.add(new Menu_Left());      
        //this.add(new Menu_Left(this.usuario));     
        this.add(new Chat());
    
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
