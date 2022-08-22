//Importação da biblioteca referente ao uso da inteface JOption:
import javax.swing.JOptionPane;

//Classe "Principal" herdará os atributos e métodos exitentes na 
//biblioteca java.swing.JFrame:
public class Principal extends javax.swing.JFrame 
{
    //Método construtor: 
    public Principal() 
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

        lbl_title = new javax.swing.JLabel();
        cbox_1 = new javax.swing.JCheckBox();
        cbox_2 = new javax.swing.JCheckBox();
        cbox_3 = new javax.swing.JCheckBox();
        cbox_4 = new javax.swing.JCheckBox();
        cbox_5 = new javax.swing.JCheckBox();
        cbox_6 = new javax.swing.JCheckBox();
        cbox_7 = new javax.swing.JCheckBox();
        btn_ok = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_title.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        lbl_title.setText("Seleção de Filmes");

        cbox_1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbox_1.setText("AÇÃO");

        cbox_2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbox_2.setText("COMÉDIA");

        cbox_3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbox_3.setText("COMÉDIA ROMÂNTICA");

        cbox_4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbox_4.setText("FICÇÃO");

        cbox_5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbox_5.setText("ROMANCE");

        cbox_6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbox_6.setText("SUSPENSE");

        cbox_7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbox_7.setText("TERROR");

        btn_ok.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btn_ok)
                        .addGap(91, 91, 91)
                        .addComponent(btn_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(lbl_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_2)
                            .addComponent(cbox_3)
                            .addComponent(cbox_1)
                            .addComponent(cbox_4)
                            .addComponent(cbox_5)
                            .addComponent(cbox_6)
                            .addComponent(cbox_7))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(cbox_1)
                .addGap(18, 18, 18)
                .addComponent(cbox_2)
                .addGap(18, 18, 18)
                .addComponent(cbox_3)
                .addGap(18, 18, 18)
                .addComponent(cbox_4)
                .addGap(18, 18, 18)
                .addComponent(cbox_5)
                .addGap(18, 18, 18)
                .addComponent(cbox_6)
                .addGap(18, 18, 18)
                .addComponent(cbox_7)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok)
                    .addComponent(btn_cancelar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Atribuição de funcionalidade ao botão "ok":
    //Método utilizado para "ouvir" ações realizadas no botão
    //Ação realizada -> clicar
    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        //Bloco condicional onde, a janela que aparecerá a seguir será definida 
        //a partir da seleção de um dos checkBox:

        //Condição: "Se a seleção do checkBox cbox1 estiver verdadeira,
        //(ou seja, se o cbox1 for selecionado),
        //a janela que se abrirá será a construída na classe Acao":
        if (cbox_1.isSelected() == true)
            new Acao( ).setVisible(true);
            //Atribuindo dispose para que a primeira janela (Classe Principal) 
            //se feche e a segunda janela (Classe Acao) abra em
            //seu lugar:
            dispose();
            
        //Condição: "Se a seleção do checkBox cbox2 estiver verdadeira,
        //(ou seja, se o cbox2 for selecionado),
        //a janela que se abrirá será a construída na classe Comedia":    
        if (cbox_2.isSelected() == true)
            new Comedia( ).setVisible(true);
            //Atribuindo dispose para que a primeira janela (Classe Principal) 
            //se feche e a segunda janela (Classe Comedia) abra em
            //seu lugar:
            dispose(); 
            
        //Condição: "Se a seleção do checkBox cbox3 estiver verdadeira,
        //(ou seja, se o cbox3 for selecionado),
        //a janela que se abrirá será a construída na classe ComediaRomantica":    
        if (cbox_3.isSelected() == true)
            new ComediaRomantica( ).setVisible(true);
            //Atribuindo dispose para que a primeira janela (Classe Principal) 
            //se feche e a segunda janela (Classe ComediaRomantica) abra em
            //seu lugar:
            dispose(); 
            
        //Condição: "Se a seleção do checkBox cbox4 estiver verdadeira,
        //(ou seja, se o cbox4 for selecionado),
        //a janela que se abrirá será a construída na classe Ficcao":    
        if (cbox_4.isSelected() == true)
            new Ficcao( ).setVisible(true);
            //Atribuindo dispose para que a primeira janela (Classe Principal) 
            //se feche e a segunda janela (Classe Ficcao) abra em
            //seu lugar:
            dispose(); 
         
        //Condição: "Se a seleção do checkBox cbox5 estiver verdadeira,
        //(ou seja, se o cbox5 for selecionado),
        //a janela que se abrirá será a construída na classe Romance":   
        if (cbox_5.isSelected() == true)
            new Romance( ).setVisible(true);
            //Atribuindo dispose para que a primeira janela (Classe Principal) 
            //se feche e a segunda janela (Classe Romance) abra em
            //seu lugar:
            dispose();   
        
        //Condição: "Se a seleção do checkBox cbox6 estiver verdadeira,
        //(ou seja, se o cbox6 for selecionado),
        //a janela que se abrirá será a construída na classe Suspense":    
        if (cbox_6.isSelected() == true)
            new Suspense( ).setVisible(true);
            //Atribuindo dispose para que a primeira janela (Classe Principal) 
            //se feche e a segunda janela (Classe Suspense) abra em
            //seu lugar:
            dispose();   
            
        //Condição: "Se a seleção do checkBox cbox7 estiver verdadeira,
        //(ou seja, se o cbox7for selecionado),
        //a janela que se abrirá será a construída na classe Terror":    
        if (cbox_7.isSelected() == true)
            new Terror( ).setVisible(true);
            //Atribuindo dispose para que a primeira janela (Classe Principal) 
            //se feche e a segunda janela (Classe Terror) abra em
            //seu lugar:
            dispose();                  
    }//GEN-LAST:event_btn_okActionPerformed
    //Atribuição de funcionalidade ao botão "cancelar":
    //Método utilizado para "ouvir" ações realizadas no botão
    //Ação realizada -> clicar
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        //Criando uma variável para que seja possível imprimir uma mensagem:
        //A variável ser int não causará problemas, pois em JOption, tudo é 
        //considerado string:
        int opcao;
        //Atribuindo a mensagem que será exibida na caixa pela variável criada:
        //Será atribuido para que, como resposta, a caixa de texto possua as 
        //opções de botão yes or no:
        opcao=JOptionPane.showConfirmDialog(null, 
            "Deseja mesmo cancelar a seleção de filmes?",
            "Cancelar",JOptionPane.YES_NO_OPTION);
            //Condição: "Se o botão "yes" dentre as duas opções for selecionado,
            //o programa irá fechar"
            if (opcao==JOptionPane.YES_OPTION)
                System.exit(0);
    }//GEN-LAST:event_btn_cancelarActionPerformed
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
                //Principal:
                new Principal().setVisible(true);
            }
        });
    }
    
    //Variáveis declaradas e seus tipos:
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ok;
    private javax.swing.JCheckBox cbox_1;
    private javax.swing.JCheckBox cbox_2;
    private javax.swing.JCheckBox cbox_3;
    private javax.swing.JCheckBox cbox_4;
    private javax.swing.JCheckBox cbox_5;
    private javax.swing.JCheckBox cbox_6;
    private javax.swing.JCheckBox cbox_7;
    private javax.swing.JLabel lbl_title;
    // End of variables declaration//GEN-END:variables
}
