//Classe "Comedia" herdará os atributos e métodos exitentes na 
//biblioteca java.swing.JFrame:
public class Comedia extends javax.swing.JFrame 
{
    //Método construtor: 
    public Comedia() 
    {
        //Inicialização dos componentes com as configurações que foram
        //definidas no design:
        initComponents();
        //Atribuindo null ao modo relativo para que a janela do programa surja 
        //no centro da tela:
        setLocationRelativeTo(null);
    }

    //Notação que impede o compilador de emitir certas adventências:
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_movie = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();
        btn_fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_movie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.jpg"))); // NOI18N
        lbl_movie.setMaximumSize(new java.awt.Dimension(335, 488));
        lbl_movie.setMinimumSize(new java.awt.Dimension(335, 488));

        lbl_title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_title.setText("GÊNERO SELECIONADO: COMÉDIA ");

        btn_fechar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_fechar.setText("FECHAR");
        btn_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lbl_title)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(lbl_movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btn_fechar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_movie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_fechar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Atribuição de funcionalidade ao botão "fechar":
    //Método utilizado para "ouvir" ações realizadas no botão
    //Ação realizada -> clicar
    private void btn_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fecharActionPerformed
        //Código de status 0 para que a janela feche-se:
        System.exit(0);
    }//GEN-LAST:event_btn_fecharActionPerformed
    //Método principal, responsável pela execução 
    //e chamamento das outras classes do programa:
    public static void main(String args[]) 
    {
        //Evento que faz com que o "Runnable" tenha seu método "run" chamado
        //Evento ao qual o método run depende para poder ser chamado:
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            //Método de execução das atividades:
            public void run() 
            {
                //Atribuindo visibilidade à janela presente na classe
                //Comedia:
                new Comedia().setVisible(true);
            }
        });
    }

    //Variáveis declaradas e seus tipos:
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_fechar;
    private javax.swing.JLabel lbl_movie;
    private javax.swing.JLabel lbl_title;
    // End of variables declaration//GEN-END:variables
}
