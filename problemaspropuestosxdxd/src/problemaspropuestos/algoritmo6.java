/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemaspropuestos;

/**
 *
 * @author Liceo Compu-Market
 */
public class algoritmo6 extends javax.swing.JFrame {

    /**
     * Creates new form algoritmo2
     */
    public algoritmo6() {
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

        pesos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        VariableIngresada = new javax.swing.JTextField();
        peso1 = new javax.swing.JRadioButton();
        peso2 = new javax.swing.JRadioButton();
        peso3 = new javax.swing.JRadioButton();
        peso4 = new javax.swing.JRadioButton();
        peso5 = new javax.swing.JRadioButton();
        peso6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 210, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dolares");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 60, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pesos a convertir");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 30));

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));
        getContentPane().add(VariableIngresada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 180, 30));

        peso1.setBackground(new java.awt.Color(255, 255, 255));
        pesos.add(peso1);
        peso1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        peso1.setForeground(new java.awt.Color(255, 255, 255));
        peso1.setText("Argentino");
        getContentPane().add(peso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        peso2.setBackground(new java.awt.Color(255, 255, 255));
        pesos.add(peso2);
        peso2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        peso2.setForeground(new java.awt.Color(255, 255, 255));
        peso2.setText("Chileno");
        getContentPane().add(peso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        peso3.setBackground(new java.awt.Color(255, 255, 255));
        pesos.add(peso3);
        peso3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        peso3.setForeground(new java.awt.Color(255, 255, 255));
        peso3.setText("Colombiano");
        getContentPane().add(peso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        peso4.setBackground(new java.awt.Color(255, 255, 255));
        pesos.add(peso4);
        peso4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        peso4.setForeground(new java.awt.Color(255, 255, 255));
        peso4.setText("Filipino");
        getContentPane().add(peso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        peso5.setBackground(new java.awt.Color(255, 255, 255));
        pesos.add(peso5);
        peso5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        peso5.setForeground(new java.awt.Color(255, 255, 255));
        peso5.setText("Mexicano");
        getContentPane().add(peso5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        peso6.setBackground(new java.awt.Color(255, 255, 255));
        pesos.add(peso6);
        peso6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        peso6.setForeground(new java.awt.Color(255, 255, 255));
        peso6.setText("Urugayo");
        getContentPane().add(peso6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Liceo Compu-Market\\Desktop\\Fondos-de-pantalla-Android.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String VariableString = VariableIngresada.getText();
        double VariableAConvertir = Double.parseDouble(VariableString);
        
        
        if (peso1.isSelected()){
            double VariableAOperar = VariableAConvertir * 0.022;
            String VariabledeTotal = Double.toString(VariableAOperar);
            total.setText(VariabledeTotal);
        }else if(peso2.isSelected()){
            double VariableAOperar = VariableAConvertir * 0.0015;
            String VariabledeTotal = Double.toString(VariableAOperar);
            total.setText(VariabledeTotal);
        }else if(peso3.isSelected()){
            double VariableAOperar = VariableAConvertir * 0.00031;
            String VariabledeTotal = Double.toString(VariableAOperar);
            total.setText(VariabledeTotal);
        }else if(peso4.isSelected()){
            double VariableAOperar = VariableAConvertir * 0.019;
            String VariabledeTotal = Double.toString(VariableAOperar);
            total.setText(VariabledeTotal);
        }else if(peso5.isSelected()){
            double VariableAOperar = VariableAConvertir * 0.052;
            String VariabledeTotal = Double.toString(VariableAOperar);
            total.setText(VariabledeTotal);
        }else if(peso6.isSelected()){
            double VariableAOperar = VariableAConvertir * 0.028;
            String VariabledeTotal = Double.toString(VariableAOperar);
            total.setText(VariabledeTotal);
      
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(algoritmo6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(algoritmo6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(algoritmo6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(algoritmo6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new algoritmo6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField VariableIngresada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton peso1;
    private javax.swing.JRadioButton peso2;
    private javax.swing.JRadioButton peso3;
    private javax.swing.JRadioButton peso4;
    private javax.swing.JRadioButton peso5;
    private javax.swing.JRadioButton peso6;
    private javax.swing.ButtonGroup pesos;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
