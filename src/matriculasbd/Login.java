package matriculasbd;

import java.sql.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bglogin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbcoordenador = new javax.swing.JRadioButton();
        rbaluno = new javax.swing.JRadioButton();
        btlogar = new javax.swing.JButton();
        pslogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login Usuário");

        bglogin.add(rbcoordenador);
        rbcoordenador.setText("Coordenador");

        bglogin.add(rbaluno);
        rbaluno.setText("Aluno");

        btlogar.setText("Logar");
        btlogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btlogar)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbcoordenador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbaluno))
                            .addComponent(pslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbcoordenador)
                    .addComponent(rbaluno))
                .addGap(18, 18, 18)
                .addComponent(pslogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btlogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogarActionPerformed
        String stringConnection;
        String selecao = "";
        //String consulta;
        for (Enumeration<AbstractButton> buttons = bglogin.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                selecao = button.getText();
            }
        }
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            stringConnection = "jdbc:mysql://localhost/trabalho?user=root";
            Connection conect = DriverManager.getConnection(stringConnection);
            Statement st = conect.createStatement();
            
            if ("Aluno".equals(selecao)) {
                
                st.execute("select ra_aluno from aluno where ra_aluno = '"+pslogin.getText()+"'");
                ResultSet result = st.getResultSet();
                String coluna_ra="";
                while(result.next()){
                    coluna_ra=result.getString(1);
                }

                String try_ra=pslogin.getText();
                
                if(coluna_ra.equals(try_ra)){
                    Matricula aluno = new Matricula();
                    new Matricula().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane,"Login Inválido!", "Aviso" ,JOptionPane.ERROR_MESSAGE);
                }
            } 
            else{
                st.execute("select siape_coordenador from coordenador where siape_coordenador = '"+pslogin.getText()+"'");
                ResultSet result = st.getResultSet();
                String coluna_siape="";
                
                while(result.next()){
                    coluna_siape = result.getString(1);
                }

                String try_ra=pslogin.getText();
                
                if(coluna_siape.equals(try_ra)){
                    Coordenador aluno = new Coordenador();
                    new Coordenador().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane,"Login Inválido!", "Aviso" ,JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btlogarActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bglogin;
    private javax.swing.JButton btlogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pslogin;
    private javax.swing.JRadioButton rbaluno;
    private javax.swing.JRadioButton rbcoordenador;
    // End of variables declaration//GEN-END:variables
}
