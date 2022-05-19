/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import entidades.Usuario;
import implementaciones.DAOsFactory;
import intefaces.IUsuarioDAO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Rivera
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    IUsuarioDAO UsuarioDAO;
    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        UsuarioDAO=DAOsFactory.crearUsuarioDAO();
        llenarCbEdad();
        llenarCbSexo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBoxNombre = new javax.swing.JTextField();
        txtBoxCorreo = new javax.swing.JTextField();
        comboBoxSexo = new javax.swing.JComboBox<>();
        comboBoxEdad = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtBoxPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Completo:");

        jLabel2.setText("Password:");

        jLabel3.setText("Correo:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Sexo:");

        txtBoxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxNombreActionPerformed(evt);
            }
        });

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBoxEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboBoxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnRegistrar)
                                    .addGap(81, 81, 81)
                                    .addComponent(btnCancelar)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBoxCorreo)
                            .addComponent(txtBoxPassword))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBoxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBoxCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtBoxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxNombreActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtBoxNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       if(validarCampos()){
            this.agregar();
            Login login = new Login();
            login.setVisible(true);
            dispose();
       }
       
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void llenarCbEdad(){
        String [] edades=new String[100];
        for (int i = 0; i < edades.length; i++) {
            edades[i]=Integer.toString(i+1);
        }
       
        DefaultComboBoxModel<String> cmbmEdad = new DefaultComboBoxModel<>(edades);
        
        this.comboBoxEdad.setModel(cmbmEdad);
    }
    
    private void llenarCbSexo(){
        String [] edades=new String[] {"MASCULINO","FEMENINO","ROBOT"};
       
        DefaultComboBoxModel<String> cmbmSexo = new DefaultComboBoxModel<>(edades);
        
        this.comboBoxSexo.setModel(cmbmSexo);
        
    }
    private void agregar(){
        String nombre=this.txtBoxNombre.getText();
        String correo=this.txtBoxCorreo.getText();
        String password=this.txtBoxPassword.getText();
        int edad=Integer.parseInt((String)this.comboBoxEdad.getSelectedItem());
        String sexo=(String)this.comboBoxSexo.getSelectedItem();
        Usuario usuario=new Usuario(nombre,password,correo,edad,sexo);
   
        boolean seAgregaUsuario = this.UsuarioDAO.agregar(usuario);
        
        if(seAgregaUsuario){
            
            JOptionPane.showMessageDialog(this, "Se registro con exito al usuario", 
                "Información", JOptionPane.INFORMATION_MESSAGE);
           
            this.limpiarFormulario();
            
        }else{
            JOptionPane.showMessageDialog(this, "No fue posible registrar el usuario", 
                "Información", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private boolean validarCampos() {

        StringBuffer mensaje = new StringBuffer();
        Pattern patronCorreo = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        String nombre=txtBoxNombre.getText();
        String password=txtBoxPassword.getText();
        String correo=txtBoxCorreo.getText();
        if (nombre.isEmpty()) {
            mensaje.append("Nombre vacio\n");
        }
        
        if (nombre.length() > 60) {
            mensaje.append("Nombre debe contener menos de 60 caracteres\n");
        }
        
        if (password.isEmpty()) {
            mensaje.append("Contraseña vacia\n");
        }
        
        if (password.length() < 8) {
            mensaje.append("Contraseña debe contener mas o igual a 8 caracteres\n");
        }
        
        if (correo.isEmpty()) {
            mensaje.append("Correo vacio\n");
        }
        
        Matcher mather=patronCorreo.matcher(correo);
        if (mather.find()==false) {
            mensaje.append("Correo invalido\n");
        }
        
        //Validar existencia 
        if(existsCorreo(correo)){
            mensaje.append("Correo se encuantra en uso en otra cuenta\n");
        }
        
        if (mensaje.length() == 0) {
            return true;
        }
        JOptionPane.showMessageDialog(this, mensaje, "Información invalida", JOptionPane.INFORMATION_MESSAGE);
        return false;
        
      }
    
    public boolean existsCorreo(String correo){
        Usuario usuario=UsuarioDAO.consultar(correo);
        if(usuario!= null){
            System.out.println("Not Null");
            System.out.println(usuario);
            return true;
        }else{
            System.out.println("Null");
            System.out.println(usuario);
            return false;
        }
    }
    public void limpiarFormulario(){
        this.txtBoxNombre.setText("");
        this.txtBoxCorreo.setText("");
        this.txtBoxPassword.setText("");
        this.comboBoxEdad.setSelectedIndex(0);
        this.comboBoxSexo.setSelectedIndex(0);
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboBoxEdad;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtBoxCorreo;
    private javax.swing.JTextField txtBoxNombre;
    private javax.swing.JTextField txtBoxPassword;
    // End of variables declaration//GEN-END:variables
}
