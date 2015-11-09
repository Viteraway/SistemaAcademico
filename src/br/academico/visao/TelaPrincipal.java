package br.academico.visao;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JMenu();
        jDesktopPanel = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAlunos = new javax.swing.JMenuItem();
        jMenuItemCursos = new javax.swing.JMenuItem();
        jMenuItemMaterias = new javax.swing.JMenuItem();
        jMenuItemProfessores = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        jMenu.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemAlunos.setText("Alunos");
        jMenuItemAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlunosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAlunos);

        jMenuItemCursos.setText("Cursos");
        jMenuItemCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCursosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCursos);

        jMenuItemMaterias.setText("Matérias");
        jMenuItemMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMateriasActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMaterias);

        jMenuItemProfessores.setText("Professores");
        jMenuItemProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessoresActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemProfessores);

        jMenuItemUsuarios.setText("Usuários");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuarios);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemSair);

        jMenuBar.add(jMenuCadastro);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar.add(jMenuAjuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlunosActionPerformed
        AlunosPanel aluno = new AlunosPanel();
        aluno.setVisible(true);
        jDesktopPanel.add(aluno);
    }//GEN-LAST:event_jMenuItemAlunosActionPerformed

    private void jMenuItemProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessoresActionPerformed
        ProfessoresPanel prof = new ProfessoresPanel();
        prof.setVisible(true);
        jDesktopPanel.add(prof);
    }//GEN-LAST:event_jMenuItemProfessoresActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        this.dispose();
        new LoginPanel().setVisible(true);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Desenvolvido por: \nHumberto Macosso \nJosé Vitor Morona Souza \nWilliam Machado \n\nProjetado para Tópicos Especiais I");
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCursosActionPerformed
        CursosPanel cursosPanel = new CursosPanel();
        cursosPanel.setVisible(true);
        jDesktopPanel.add(cursosPanel);
    }//GEN-LAST:event_jMenuItemCursosActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        UsuariosPanel usuariosPanel = new UsuariosPanel();
        usuariosPanel.setVisible(true);
        jDesktopPanel.add(usuariosPanel);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMateriasActionPerformed
        MateriasPanel panel = new MateriasPanel();
        panel.setVisible(true);
        jDesktopPanel.add(panel);
    }//GEN-LAST:event_jMenuItemMateriasActionPerformed

    public JDesktopPane getDDesktopPane() {
        return jDesktopPanel;
    }

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanel;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAlunos;
    private javax.swing.JMenuItem jMenuItemCursos;
    private javax.swing.JMenuItem jMenuItemMaterias;
    private javax.swing.JMenuItem jMenuItemProfessores;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    // End of variables declaration//GEN-END:variables
}
