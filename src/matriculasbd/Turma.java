package matriculasbd;

import java.sql.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

public class Turma extends javax.swing.JFrame {

    public Turma() {
        initComponents();
        //String stringConnection;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/trabalho?user=root");
            Statement st = conect.createStatement();

            st.execute("select nome_disciplina from disciplina");

            ResultSet result = st.getResultSet();
            while (result.next()) {
                cbdisciplinas.addItem(result.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String idturma;
    public int cont = 0;

    public void limpar() {
        txtdia.setText("");
        txtinicio.setText("");
        txtfim.setText("");
        txtsala.setText("");
        txtdocente.setText("");
    }

    public void travar() {
        txtdia.enable(false);
        txtinicio.enable(false);
        txtfim.enable(false);
        txtsala.enable(false);
        txtdocente.enable(false);
        cont = 0;
        btaulas.setEnabled(false);//Não desabilitou!!!
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgaulas = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();
        jb3 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdocente = new javax.swing.JTextField();
        txtdia = new javax.swing.JTextField();
        txtinicio = new javax.swing.JTextField();
        txtfim = new javax.swing.JTextField();
        txtsala = new javax.swing.JTextField();
        btaulas = new javax.swing.JButton();
        cbdisciplinas = new javax.swing.JComboBox();
        txtcodigo = new javax.swing.JTextField();
        btturma = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtvagas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Turma");

        jLabel2.setText("Nome da Disciplina");

        jLabel3.setText("Código da Turma");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Quantidade de Aulas por Semana");

        bgaulas.add(jb1);
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        bgaulas.add(jb2);
        jb2.setText("2");

        bgaulas.add(jb3);
        jb3.setText("3");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Docente");

        jLabel6.setText("Dia");

        jLabel7.setText("Horário de Início");

        jLabel8.setText("Horário de Término");

        jLabel9.setText("Sala");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdocente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtsala, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txtfim))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtfim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btaulas.setText("Cadastrar");
        btaulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaulasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jb1)
                                .addGap(18, 18, 18)
                                .addComponent(jb2)
                                .addGap(18, 18, 18)
                                .addComponent(jb3)
                                .addGap(120, 120, 120))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btaulas)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1)
                    .addComponent(jb2)
                    .addComponent(jb3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btaulas)
                .addGap(7, 7, 7))
        );

        cbdisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdisciplinasActionPerformed(evt);
            }
        });

        btturma.setText("Cadastrar");
        btturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btturmaActionPerformed(evt);
            }
        });

        jLabel10.setText("Vagas da Turma");

        txtvagas.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbdisciplinas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtvagas, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btturma)
                                .addGap(46, 46, 46))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbdisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtvagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btturma)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb1ActionPerformed

    private void cbdisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdisciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdisciplinasActionPerformed

    private void btaulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaulasActionPerformed
        String selecao = "";
        String dia = "";
        String inicio = "";
        String fim = "";
        String sala = "";
        String docente = "";
        String id = "";
        
        for (Enumeration<AbstractButton> buttons = bgaulas.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                selecao = button.getText();
            }
        }

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/trabalho?user=root");
            Statement st = conect.createStatement();
            //Contagem das tuplas de aula para fazer o id_aula
            st.execute("select count(*) from aula");
            ResultSet result = st.getResultSet();
            while (result.next()) {
                id = result.getString(1);
            }

            //Insert em aula
            st.executeUpdate("insert into aula (id_aula, dia, hini, hfim, sala, nome_docente, id_turma) values('" + id + "','"
                    + txtdia.getText() + "','" + txtinicio.getText() + "','" + txtfim.getText() + "','" + txtsala.getText() + "','"
                    + txtdocente.getText() + "','" + idturma + "')");
            //Busca dos valores de aula
            st.execute("select dia, hini, hfim, sala, nome_docente from aula where dia = '" + txtdia.getText() + "' and hini = '"
                    + txtinicio.getText() + "' and hfim = '" + txtfim.getText() + "' and sala =  '" + txtsala.getText()
                    + "' and nome_docente = '" + txtdocente.getText() + "'");

            result = st.getResultSet();
            while (result.next()) {
                dia = result.getString("dia");
                inicio = result.getString("hini");
                fim = result.getString("hfim");
                sala = result.getString("sala");
                docente = result.getString("nome_docente");
            }
            //Verificação dos valores das textbox com os valores de aula
            if (dia.equals(txtdia.getText()) && inicio.equals(txtinicio.getText()) && fim.equals(txtfim.getText())
                    && sala.equals(txtsala.getText()) && docente.equals(txtdocente.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Cadastro feito com Sucesso", "Informativo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falha ao Cadastrar Aula", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            //Limpar textbox e incrementar cont para número de aulas
            limpar();
            cont++;
            
            if ("1".equals(selecao)) {
                if(cont > 0){
                    travar();
                }
            }
            else if("2".equals(selecao)){
                if(cont > 1){
                    travar();
                }
            }
            else if("3".equals(selecao)){
                if(cont > 2){
                    travar();
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btaulasActionPerformed

    private void btturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btturmaActionPerformed
        String selecao = "";
        selecao = cbdisciplinas.getSelectedItem().toString();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/trabalho?user=root");
            Statement st = conect.createStatement();
            //Buscar código da disciplina escolhida
            st.execute("select cod_disciplina from disciplina where nome_disciplina = '" + selecao + "'");
            ResultSet result = st.getResultSet();
            String coddisciplina = "";
            while (result.next()) {
                coddisciplina = result.getString(1);
            }
            //System.out.printf(coddisciplina);
            //Conta quantos registros existem em turma
            st.execute("select count(*) from turma");
            result = st.getResultSet();
            String cont = "";
            while (result.next()) {
                cont = result.getString(1);
            }
            //Insere os dados novos em turma
            st.executeUpdate("insert into turma (id_turma, cod_turma, cod_disciplina, vagas) values('" + cont + "','" + txtcodigo.getText()
                    + "','" + coddisciplina + "','" + txtvagas.getText() + "')");
            //Consulta para verificar se o insert foi bem sucedido
            st.execute("select cod_turma from turma where cod_turma = '" + txtcodigo.getText() + "'");

            result = st.getResultSet();
            String nome = "";

            while (result.next()) {
                nome = result.getString(1);
            }
            if (nome.equals(txtcodigo.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Cadastro feito com Sucesso", "Informativo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Falha ao Cadastrar Turma", "Aviso", JOptionPane.ERROR_MESSAGE);
            }

            idturma = cont;
            //System.out.println(idturma);
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtcodigo.setText("");
        txtvagas.setText("");
        txtcodigo.enable(false);
        txtvagas.enable(false);
        btturma.setEnabled(false); //Não desabilitou!!!
    }//GEN-LAST:event_btturmaActionPerformed

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
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Turma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgaulas;
    private javax.swing.JButton btaulas;
    private javax.swing.JButton btturma;
    private javax.swing.JComboBox cbdisciplinas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JRadioButton jb3;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdia;
    private javax.swing.JTextField txtdocente;
    private javax.swing.JTextField txtfim;
    private javax.swing.JTextField txtinicio;
    private javax.swing.JTextField txtsala;
    private javax.swing.JTextField txtvagas;
    // End of variables declaration//GEN-END:variables
}
