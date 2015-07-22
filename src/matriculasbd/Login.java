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
        pss = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

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

        pslogin.setToolTipText("");

        pss.setToolTipText("");

        jButton1.setText("Novo Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pslogin, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btlogar)
                            .addGap(165, 165, 165))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pss, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbcoordenador)
                                    .addGap(37, 37, 37)
                                    .addComponent(rbaluno)))
                            .addGap(103, 103, 103)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pslogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlogar)
                .addContainerGap())
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
            stringConnection = "jdbc:mysql://localhost/trabalho?user=root&password=050893";
            Connection conect = DriverManager.getConnection(stringConnection);
            Statement st = conect.createStatement();
            Statement st2 = conect.createStatement();
            
            if ("Aluno".equals(selecao)) {
                
                st.execute("select ra_aluno from aluno where ra_aluno = '"+pslogin.getText()+"'");
                ResultSet result = st.getResultSet();
                String coluna_ra="",coluna_pss="";
                while(result.next()){
                    coluna_ra=result.getString(1);
                }
                st2.execute("select password_aluno from aluno where ra_aluno = '"+pslogin.getText()+"'");
                ResultSet resultpss = st2.getResultSet();
                
                while(resultpss.next()){
                    coluna_pss=resultpss.getString(1);
                }
                
                String try_ra=pslogin.getText();
                String try_pss=pss.getText();
                
                if(coluna_ra.equals(try_ra)&&coluna_pss.equals(try_pss)){
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
                String coluna_siape="",coluna_pss="";
                
                while(result.next()){
                    coluna_siape = result.getString(1);
                }
                st2.execute("select password_docente from coordenador,docente where coordenador.siape_coordenador=docente.siape_docente and siape_coordenador = '"+pslogin.getText()+"'");
                ResultSet resultpss = st2.getResultSet();
                
                while(resultpss.next()){
                    coluna_pss=resultpss.getString(1);
                }
                
                String try_siape=pslogin.getText();
                String try_pss=pss.getText();
                
                if(coluna_siape.equals(try_siape)&&coluna_pss.equals(try_pss)){
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pslogin;
    private javax.swing.JPasswordField pss;
    private javax.swing.JRadioButton rbaluno;
    private javax.swing.JRadioButton rbcoordenador;
    // End of variables declaration//GEN-END:variables
}
