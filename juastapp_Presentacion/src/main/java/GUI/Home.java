/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entidades.Usuario;
import eventos.EventChat;
import eventos.EventUser;
import eventos.PublicEvent;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Hugo Rivera
 */
public class Home extends javax.swing.JFrame {
    private Usuario usuario;
    public Home() {
        initComponents();
        init();
    }
    
    public Home(Usuario usuario) {
        this.usuario=usuario;
        
        initComponents();
        init();
    }

    private void init(){
        ComponentResizer com =new ComponentResizer();
        com.registerComponent(this);
        com.setMinimumSize(new Dimension(800,500));
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();        
        com.setMaximumSize(new Dimension(screen.width-100,screen.height-500));
        com.setSnapSize(new Dimension(10,10));
  
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border = new javax.swing.JPanel();
        body = new javax.swing.JLayeredPane();
        home_Body1 = new GUI.Home_Body();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setLayout(new java.awt.BorderLayout());
        body.add(home_Body1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane body;
    private javax.swing.JPanel border;
    private GUI.Home_Body home_Body1;
    // End of variables declaration//GEN-END:variables
}
