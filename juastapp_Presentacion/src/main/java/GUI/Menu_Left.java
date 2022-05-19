/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import entidades.Usuario;
import eventos.EventUser;
import eventos.PublicEvent;
import implementaciones.DAOsFactory;
import intefaces.IChatDAO;
import java.util.List;
import javax.swing.Icon;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Hugo Rivera
 */
public class Menu_Left extends javax.swing.JPanel {

    /**
     * Creates new form Menu_Left
     */
    IChatDAO chatDAO;
    Usuario usuario;
    public Menu_Left() {
        chatDAO=DAOsFactory.crearChatDAO();
       
           
        initComponents();
        init();
        mostrarContactos();
    }
    
    public Menu_Left(Usuario usuario) {
        chatDAO=DAOsFactory.crearChatDAO();
        this.usuario=usuario;
           
        initComponents();
        init();
        mostrarContactos();
    }

    private void init(){
        sp.setVerticalScrollBar(new ScrollBar());
        listaContactos.setLayout(new MigLayout("fillx","0[]0","1[]1"));
    }
    
    private void mostrarContactos(){
        //List<entidades.Chat>chats=chatDAO.consultarTodos(this.usuario);
        for (int i = 0; i < 10; i++) {
            listaContactos.add(new Contacto("mike"),"wrap");
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_menu = new javax.swing.JLayeredPane();
        btnAgregar = new GUI.MenuButton();
        btnConfiguracion = new GUI.MenuButton();
        sp = new javax.swing.JScrollPane();
        listaContactos = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(255, 255, 255));

        user_menu.setBackground(new java.awt.Color(242, 242, 242));
        user_menu.setLayout(new java.awt.GridLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("");
        btnAgregar.setBorderPainted(false);
        user_menu.add(btnAgregar);

        btnConfiguracion.setText("Configuracion");
        btnConfiguracion.setToolTipText("");
        btnConfiguracion.setBorderPainted(false);
        user_menu.add(btnConfiguracion);

        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout listaContactosLayout = new javax.swing.GroupLayout(listaContactos);
        listaContactos.setLayout(listaContactosLayout);
        listaContactosLayout.setHorizontalGroup(
            listaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        listaContactosLayout.setVerticalGroup(
            listaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 548, Short.MAX_VALUE)
        );

        sp.setViewportView(listaContactos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(user_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(user_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.MenuButton btnAgregar;
    private GUI.MenuButton btnConfiguracion;
    private javax.swing.JLayeredPane listaContactos;
    private javax.swing.JScrollPane sp;
    private javax.swing.JLayeredPane user_menu;
    // End of variables declaration//GEN-END:variables
}
