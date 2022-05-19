/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import eventos.PublicEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;


public class Chat_Bottom extends javax.swing.JPanel {

    
    public Chat_Bottom() {
        initComponents();
        init();
    }
    
    private void init(){
        
        setLayout(new MigLayout("fillx, filly", "", ""));
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        JIMSendTextPane txt = new JIMSendTextPane();
        txt.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent ke){
                refresh();
            }
        });
        scroll.setViewportView(txt);
        add(scroll,"w 100%");
        JPanel panel =new JPanel();
        panel.setLayout(new MigLayout("","",""));
        JButton cmd =new JButton();
        cmd.setBorder(null);
        cmd.setContentAreaFilled(false);
        cmd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmd.setText("Enviar");
        cmd.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              String text=txt.getText().trim();
              if(!text.equals("")){
                   PublicEvent.getInstance().getEventChat().sendMessage(text);
                  txt.setText("");
                  txt.grabFocus();
                  refresh();
              }else{
                  txt.grabFocus();
              }
            }
        });
        panel.add(cmd);
        add(panel);
    }
    
    private void refresh(){
      revalidate();  
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(242, 242, 242));
        setFocusTraversalPolicyProvider(true);
        setPreferredSize(new java.awt.Dimension(400, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
