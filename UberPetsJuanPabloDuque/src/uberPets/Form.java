package UberPets;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan-
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form Form
     */
    public Form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        conductoresDisponibles = new javax.swing.JTextArea();
        clientes = new javax.swing.JComboBox<>();
        dir2 = new javax.swing.JTextField();
        dir1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        solUber = new javax.swing.JButton();
        dataUber = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newCliente = new javax.swing.JMenuItem();
        newUber = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        conductoresDisponibles.setEditable(false);
        conductoresDisponibles.setColumns(20);
        conductoresDisponibles.setRows(5);
        jScrollPane1.setViewportView(conductoresDisponibles);

        clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona" }));
        clientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clientesItemStateChanged(evt);
            }
        });

        dir2.setEnabled(false);

        dir1.setEnabled(false);

        jLabel1.setText("Direccion actual");

        jLabel2.setText("Direccion de destino");

        solUber.setText("Solicitar Uber");
        solUber.setEnabled(false);
        solUber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solUberMouseClicked(evt);
            }
        });

        dataUber.setText("Datos Conductor");
        dataUber.setEnabled(false);
        dataUber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataUberMouseClicked(evt);
            }
        });

        pagar.setText("Pagar");
        pagar.setEnabled(false);
        pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagarMouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Conductores Disponibles");

        jMenu1.setText("Nuevo");

        newCliente.setText("Cliente");
        newCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteActionPerformed(evt);
            }
        });
        jMenu1.add(newCliente);

        newUber.setText("Uber");
        newUber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUberActionPerformed(evt);
            }
        });
        jMenu1.add(newUber);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dir2)
                    .addComponent(dir1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addComponent(solUber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dataUber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pagar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dir1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dir2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(solUber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(dataUber, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                        .addComponent(pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clientesItemStateChanged
        // TODO add your handling code here:
        if(clientes.getSelectedIndex() > 0){
            dir1.setEnabled(true);
            dir2.setEnabled(true);
            solUber.setEnabled(true);
            dataUber.setEnabled(true);
            pagar.setEnabled(true);
        }
        else{
            dir1.setEnabled(false);
            dir2.setEnabled(false);
            solUber.setEnabled(false);
            dataUber.setEnabled(false);
            pagar.setEnabled(false);
        }
        if(clientes.getSelectedIndex() > 0 && clientesAux.get(clientes.getSelectedIndex()-1).moving == true){
            solUber.setEnabled(false);
        }
        dir1.setText("");
        dir2.setText("");
    }//GEN-LAST:event_clientesItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        UberPets platform = new UberPets();
        //SE NECESITA ARREGLAR LOS PATH ABSOLUTOS A RELATIVOS
        File archivo = new File("C:\\Users\\juan-\\Desktop\\TempGit\\UberPetsJPD\\src\\resources\\clientes.txt");
        FileReader fr;
        try {
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            linea = br.readLine();
            while(linea != null){
                String[] newline = linea.split(",");
                platform.NuevoCliente(Integer.parseInt(newline[0]), newline[1], newline[2]);
                linea = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        archivo = new File ("C:\\Users\\juan-\\Desktop\\TempGit\\UberPetsJPD\\src\\resources\\conductores.txt");
        try {
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            linea = br.readLine();
            while(linea != null){
                String[] newline = linea.split(",");
                platform.NuevoUber(newline[0], Integer.parseInt(newline[1]), newline[2]);
                linea = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        fetchClientes(platform.clientes);
        fetchUber(platform.conductores);
        setClientes();
        setConductores();
    }//GEN-LAST:event_formWindowOpened

    private void solUberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solUberMouseClicked
        // TODO add your handling code here:
        String direcciones = dir1.getText() + ", " + dir2.getText();
        if(solicitarUber(clientesAux.get((clientes.getSelectedIndex()) - 1), direcciones, clientesAux.get(clientes.getSelectedIndex()-1).getTamaño()) == true){
            showMessageDialog(null, "Carrera solicitada con exito, en unos minutos pasaran a recoger a su mascota");
        }
        solUber.setEnabled(false);
        setConductores();
    }//GEN-LAST:event_solUberMouseClicked

    private void dataUberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataUberMouseClicked
        // TODO add your handling code here:
        datosConductor(clientesAux.get(clientes.getSelectedIndex()-1));
    }//GEN-LAST:event_dataUberMouseClicked

    private void pagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagarMouseClicked
        // TODO add your handling code here:
        pagar(clientesAux.get(clientes.getSelectedIndex()-1));
        setConductores();
        solUber.setEnabled(true);
    }//GEN-LAST:event_pagarMouseClicked

    private void newClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteActionPerformed
        // TODO add your handling code here:
        uberPets.Ventana1 abrir = new uberPets.Ventana1();
        abrir.setVisible(true); 
        System.out.println("works?");
    }//GEN-LAST:event_newClienteActionPerformed

    private void newUberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
    
    public void setClientes(){
        for(Client c: clientesAux){
            this.clientes.addItem(c.getNombre()); 
        }
    }
    
    public void setConductores(){
        conductoresDisponibles.setText("");
        for(Uber u: uberAux){
            if(u.getDisponible() == true){
                conductoresDisponibles.setText(conductoresDisponibles.getText() + u.GetNumCarro()+ ", " + u.getNombre() + ", " + u.getModelo() + "\n");
            }
        }
    }
    
    public boolean solicitarUber(Client c, String direcciones, int tamanoPerro){
        if(c.moving == false){
            for(Uber u: uberAux){
                if (u.getDisponible() == true) {
                    if (tamanoPerro <= u.GetSize()) {
                            u.toggleDisponible();
                            c.toggleMoving();
                            c.setLink(u);
                            c.setDirecciones(direcciones);
                            u.setClient(c);
                            dir1.setText("");
                            dir2.setText("");
                            return true;
                    }
                }
            }
            showMessageDialog(null, "No se encontraron conductores disponibles, intente de nuevo mas tarde");
            return false;
        }
        else{
            showMessageDialog(null, "Tiene una carrera actualmente asignada");
            return false;
        }
    }
    
    public void datosConductor(Client c){
        if(c.getLink() == null){
            showMessageDialog(null, "No tiene una carrera actualmente asignada");
        }
        else{
            showMessageDialog(null, "Numero de auto: " + c.getLink().GetNumCarro() + "\n" + "Nombre del conductor: " + c.getLink().getNombre() + "\n" + "Nombre del perro: " + c.getNombrePet() + "\n" + "Modelo del auto: " + c.getLink().getModelo() + "\n" + "Direccion: " + c.getDirecciones());
        }
    }
    
    ArrayList<Client> clientesAux = new ArrayList<Client>();
    ArrayList<Uber> uberAux = new ArrayList<Uber>();
    
    void fetchClientes(ArrayList<Client> c){
        for(Client cl : c){
            this.clientesAux.add(cl);
        }
    }
    void fetchUber(ArrayList<Uber> uber){
        for(Uber ub : uber){
            this.uberAux.add(ub);
        }
    }
    
    void pagar(Client c){
        if(c.moving == true){
            showMessageDialog(null, "Pago efectuado satisfactoriamente");
            c.toggleMoving();
            c.getLink().toggleDisponible();
        }
        else{
            showMessageDialog(null, "No hay cuentas pendientes");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> clientes;
    private javax.swing.JTextArea conductoresDisponibles;
    private javax.swing.JButton dataUber;
    private javax.swing.JTextField dir1;
    private javax.swing.JTextField dir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newCliente;
    private javax.swing.JMenuItem newUber;
    private javax.swing.JButton pagar;
    private javax.swing.JButton solUber;
    // End of variables declaration//GEN-END:variables
}