/**
 * Codigo para descrever a tela de CADASTRO do projeto SISTEMA
 * @author Brygtany Lima
 * @Since 04/11/2024
 */

package Sistema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CLIENTE extends javax.swing.JFrame {

    //conexão com o banco de dados
    private static final String username = "root";
    private static final String password = "root";
    private static final String conn = "jdbc:mysql://localhost:3306/sistema";

    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    //Criação do JFRAME
    public CLIENTE() {
        initComponents();
    }
    
    //Atualizar informações da tabela
        public void updateDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn, username, password);
            pst = sqlConn.prepareStatement("SELECT * FROM produto");
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            int q = stData.getColumnCount();

            DefaultTableModel recordTable = new DefaultTableModel();

            for (int i = 1; i <= q; i++) {
                recordTable.addColumn(stData.getColumnName(i));
            }
                while (rs.next()) {
                    Vector<Object> columnData = new Vector<>();
                    for (int i = 1; i <= q; i++) {
                        columnData.add(rs.getString(i));
                    }
                        recordTable.addRow(columnData);
                }
                
                tabelaBD.setModel(recordTable);
                
                    }catch (Exception e) {
                        JOptionPane. showMessageDialog(null, "Erro: " + e);
                    }finally {
                        try {
                            if (rs != null) rs.close();
                            if (pst != null) pst.close();
                            if (pst != null) pst.close();
                        } catch (SQLException ex) {
                        JOptionPane. showMessageDialog(null, "Erro ao fechar recursos: " + ex) ;
                        }
                    }
}
        
        public void limpar(){
     //limpar campos
        cadastroCod.setText("");
        cadastroNome.setText("");
        cadastroData.setText("");
        cadastroEstoque.setText("");
        cadastroDesc.setText("");
        cadastroEstoqMin.setText("");
        cadastroEstoqMax.setText("");
        cadastroCompra.setText("");
        cadastroVenda.setText("");
        cadastroLucro.setText("");
        cadastroNCM.setText("");
        cadastroCodBarras.setText("");
        cadastroStatus.setSelectedIndex(0);
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("SISTEMA?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        produtoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery.getResultList();
        produtoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cadastroEstoqMax = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cadastroVenda = new javax.swing.JTextField();
        cadastroLucro = new javax.swing.JTextField();
        cadastroNCM = new javax.swing.JTextField();
        cadastroCod = new javax.swing.JTextField();
        cadastroDesc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cadastroCodBarras = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cadastroEstoque = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cadastroNome = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cadastroEstoqMin = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cadastroData = new javax.swing.JTextField();
        cadastroCompra = new javax.swing.JTextField();
        cadastroStatus = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BInserir = new javax.swing.JButton();
        BLimpar = new javax.swing.JButton();
        BAlterar = new javax.swing.JButton();
        BRemover = new javax.swing.JButton();
        BImprimir = new javax.swing.JButton();
        BSair = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaBD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("SISTEMA | CADASTRO DE PRODUTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel4)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setText("Preço de venda");

        cadastroEstoqMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEstoqMaxActionPerformed(evt);
            }
        });

        jLabel16.setText("Preço de compra");

        jLabel17.setText("Fator lucro");

        jLabel18.setText("NCM");

        cadastroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroVendaActionPerformed(evt);
            }
        });

        cadastroLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroLucroActionPerformed(evt);
            }
        });

        cadastroNCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroNCMActionPerformed(evt);
            }
        });

        cadastroCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastroCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCodActionPerformed(evt);
            }
        });

        cadastroDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDescActionPerformed(evt);
            }
        });

        jLabel19.setText("Nome");

        jLabel20.setText("Codigo de barras");

        cadastroCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCodBarrasActionPerformed(evt);
            }
        });

        jLabel21.setText("Quantidade em estoque");

        cadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEstoqueActionPerformed(evt);
            }
        });

        jLabel22.setText("Descrição");

        cadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroNomeActionPerformed(evt);
            }
        });

        jLabel23.setText("Estoque minimo");

        cadastroEstoqMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEstoqMinActionPerformed(evt);
            }
        });

        jLabel24.setText("Estoque maximo");

        jLabel25.setText("Código");

        jLabel26.setText("Status");

        jLabel27.setText("Data de cadastro");

        cadastroData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroDataActionPerformed(evt);
            }
        });

        cadastroCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCompraActionPerformed(evt);
            }
        });

        cadastroStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I - Inativo", "A - Ativo" }));
        cadastroStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroStatusActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Captura de tela 2024-11-29 220713.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cadastroCodBarras, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(cadastroLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cadastroNCM, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cadastroDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel24))
                    .addComponent(jLabel22)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroEstoqMin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(cadastroCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroEstoqMax, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(cadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(cadastroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(199, 199, 199))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cadastroCod, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel21)
                                .addComponent(cadastroEstoque)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(123, 123, 123)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel27)
                                        .addComponent(cadastroData, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(jLabel19))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastroDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroEstoqMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroEstoqMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadastroVenda)
                            .addComponent(cadastroCompra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadastroNCM)
                            .addComponent(cadastroLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addGap(14, 14, 14))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastroCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadastroData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel21))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(293, Short.MAX_VALUE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Captura de tela 2024-10-14 103224.png"))); // NOI18N
        BInserir.setText("INSERIR");
        BInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInserirActionPerformed(evt);
            }
        });

        BLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Captura de tela 2024-10-14 103058.png"))); // NOI18N
        BLimpar.setText("LIMPAR");
        BLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparActionPerformed(evt);
            }
        });

        BAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Captura de tela 2024-10-14 103239.png"))); // NOI18N
        BAlterar.setText("ALTERAR");
        BAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlterarActionPerformed(evt);
            }
        });

        BRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Captura de tela 2024-10-14 103307.png"))); // NOI18N
        BRemover.setText("REMOVER");
        BRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRemoverActionPerformed(evt);
            }
        });

        BImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Captura de tela 2024-10-14 103312.png"))); // NOI18N
        BImprimir.setText("IMPRIMIR");
        BImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BImprimirActionPerformed(evt);
            }
        });

        BSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Captura de tela 2024-10-14 103245.png"))); // NOI18N
        BSair.setText("SAIR");
        BSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(BSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, produtoList1, tabelaBD);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod}"));
        columnBinding.setColumnName("Cod");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${status}"));
        columnBinding.setColumnName("Status");
        columnBinding.setColumnClass(Character.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${qtdEstoque}"));
        columnBinding.setColumnName("Qtd Estoque");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoqueMinimo}"));
        columnBinding.setColumnName("Estoque Minimo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoqueMaximo}"));
        columnBinding.setColumnName("Estoque Maximo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precoCompra}"));
        columnBinding.setColumnName("Preco Compra");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precoVenda}"));
        columnBinding.setColumnName("Preco Venda");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${barCode}"));
        columnBinding.setColumnName("Bar Code");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ncm}"));
        columnBinding.setColumnName("Ncm");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fator}"));
        columnBinding.setColumnName("Fator");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataCadastro}"));
        columnBinding.setColumnName("Data Cadastro");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${imagem}"));
        columnBinding.setColumnName("Imagem");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);

        tabelaBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaBDMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelaBD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroEstoqMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEstoqMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroEstoqMaxActionPerformed

    private void cadastroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroVendaActionPerformed

    private void cadastroLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroLucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroLucroActionPerformed

    private void cadastroNCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroNCMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroNCMActionPerformed

    private void cadastroCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroCodActionPerformed

    private void cadastroDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroDescActionPerformed

    private void BInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInserirActionPerformed
        //Inserir
        String codigo = cadastroCod.getText();
        String nome = cadastroNome.getText();
        String estoque = cadastroEstoque.getText();
        String desc = cadastroDesc.getText();
        String estMin = cadastroEstoqMin.getText();
        String estMax = cadastroEstoqMax.getText();
        String compra = cadastroCompra.getText();
        String venda = cadastroVenda.getText();
        String NCM = cadastroNCM.getText();
        String codBarras = cadastroCodBarras.getText();
        
        String statusChar = (String) cadastroStatus.getSelectedItem();
        
        if(codigo.isEmpty() || nome.isEmpty() || estoque.isEmpty() || desc.isEmpty() || estMin.isEmpty() || estMax.isEmpty() || compra.isEmpty() || venda.isEmpty() || NCM.isEmpty() || codBarras.isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos para essa operação!");
        } else {
            try {
                double precoCompra = Double.parseDouble(compra);
                double precoVenda = Double.parseDouble(venda);
            
                // Calcula o lucro em %
                double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(conn, username, password);
                pst = sqlConn.prepareStatement("INSERT INTO produto (cod, nome, qtd_estoque, descricao, estoque_minimo, estoque_maximo, preco_compra, preco_venda, fator, ncm, bar_code, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                pst.setString(1, codigo);
                pst.setString(2, nome);
                pst.setString(3, estoque);
                pst.setString(4, desc);
                pst.setString(5, estMin);
                pst.setString(6, estMax);
                pst.setDouble(7, precoCompra);
                pst.setDouble(8, precoVenda);
                pst.setDouble(9, lucroPercentual);
                pst.setString(10, NCM);
                pst.setString(11, codBarras);
                pst.setString(12, statusChar == "I - Inativo" ? "I" : "A");
                
                pst.execute();

                JOptionPane.showMessageDialog(this, "Registro adicionado com sucesso!");
                updateDB();
                limpar();
            }catch (ClassNotFoundException | SQLException e) {
                java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }
        }  
                  
    }//GEN-LAST:event_BInserirActionPerformed

    private void BLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparActionPerformed
       limpar();
    }//GEN-LAST:event_BLimparActionPerformed

    private void BAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlterarActionPerformed
        //Alterar
        TableModel RecordTable = tabelaBD.getModel();
        int selectRows = tabelaBD.getSelectedRow();
        
        String codigo = cadastroCod.getText();
        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um registro para atualizar!");
        } else {
            try {
                
                // Recupera os valores de compra e venda
                double precoCompra = Double.parseDouble(cadastroCompra.getText());
                double precoVenda = Double.parseDouble(cadastroVenda.getText());

                // Calcula o fator lucro (%)
                double fator = ((precoVenda - precoCompra) / precoCompra) * 100;
                
                String statusSelecionado = cadastroStatus.getSelectedItem().toString().substring(0, 1); 

            
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn = DriverManager.getConnection(conn, username, password);
                    pst = sqlConn.prepareStatement("UPDATE produto SET cod = ?, nome = ?, qtd_estoque = ?, descricao = ?, estoque_minimo = ?, estoque_maximo = ?, preco_compra = ?, preco_venda = ?, fator = ?, ncm = ?, bar_code = ?, status = ? WHERE id = ?");

                    // Configure os parâmetros na ordem correta
                    pst.setInt(1, Integer.parseInt(cadastroCod.getText()));      // cod
                    pst.setString(2, cadastroNome.getText());                   // nome
                    pst.setString(3, cadastroEstoque.getText());                // qtd_estoque
                    pst.setString(4, cadastroDesc.getText());                   // descricao
                    pst.setString(5, cadastroEstoqMin.getText());               // estoque_minimo
                    pst.setString(6, cadastroEstoqMax.getText());               // estoque_maximo
                    pst.setDouble(7, precoCompra);                 // preco_compra
                    pst.setDouble(8, precoVenda);                  // preco_venda
                    pst.setDouble(9, fator);                 // fator
                    pst.setString(10, cadastroNCM.getText());                   // ncm
                    pst.setString(11, cadastroCodBarras.getText());             // cadastroCodBarras
                    pst.setString(12, statusSelecionado);                       // status (A ou I)
                    pst.setInt(13, Integer.parseInt(RecordTable.getValueAt(selectRows, 0).toString())); // id (último parâmetro na cláusula WHERE)
                    
                    
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Registro atualizado com sucesso!");

                updateDB();

                limpar();

            } catch (ClassNotFoundException e) {
                java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null, e);

            } catch (SQLException e) {
                java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(
                    java.util.logging.Level.SEVERE,
                    null, e);
            }
        }
    }//GEN-LAST:event_BAlterarActionPerformed

    private void BRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRemoverActionPerformed
        //Deletar
        TableModel RecordTable = tabelaBD.getModel();
        int selectRows = tabelaBD.getSelectedRow();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn, username, password);
            pst = sqlConn.prepareStatement("DELETE FROM `SISTEMA`.`produto` WHERE (`id` = ?);");
            pst.setInt(1, Integer.parseInt(RecordTable.getValueAt(selectRows, 0).toString())); // id
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");

            updateDB();

            limpar();
        } catch (ClassNotFoundException e) {
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(
                java.util.logging.Level.SEVERE,
                null, e);
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(
                java.util.logging.Level.SEVERE,
                null, e);
        }
    }//GEN-LAST:event_BRemoverActionPerformed

    private void BImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BImprimirActionPerformed
        //Imprimir
        MessageFormat header = new MessageFormat("Impressão Padrão");
        MessageFormat footer = new MessageFormat("Página{0, number, integer}");
        
        try {
            tabelaBD.print(JTable.PrintMode.NORMAL, header, footer);
        } catch(java.awt.print.PrinterException e ){
            System.err.format("Impressão não encontrada ", e.getMessage());
        }         
    }//GEN-LAST:event_BImprimirActionPerformed

    private void BSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSairActionPerformed
        //Sair
        this.dispose();
    }//GEN-LAST:event_BSairActionPerformed

    private void cadastroCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroCodBarrasActionPerformed

    private void cadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroEstoqueActionPerformed

    private void cadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroNomeActionPerformed

    private void cadastroEstoqMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEstoqMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroEstoqMinActionPerformed

    private void cadastroDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroDataActionPerformed

    private void cadastroCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroCompraActionPerformed

    private void tabelaBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaBDMouseClicked
        //Exibir registro
        TableModel model = tabelaBD.getModel();
        int selectedRow = tabelaBD.getSelectedRow();
        
        if (selectedRow != -1) {
            cadastroCod.setText(model.getValueAt(selectedRow, 1).toString());
            cadastroStatus.getEditor().getItem().toString();
            cadastroNome.setText(model.getValueAt(selectedRow, 3).toString());
            cadastroDesc.setText(model.getValueAt(selectedRow, 4).toString());
            cadastroEstoque.setText(model.getValueAt(selectedRow, 5).toString());
            cadastroEstoqMin.setText(model.getValueAt(selectedRow, 6).toString());
            cadastroEstoqMax.setText(model.getValueAt(selectedRow, 7).toString());
            cadastroCompra.setText(model.getValueAt(selectedRow, 8).toString());
            cadastroVenda.setText(model.getValueAt(selectedRow, 9).toString());
            cadastroCodBarras.setText(model.getValueAt(selectedRow, 10).toString());
            cadastroNCM.setText(model.getValueAt(selectedRow, 11).toString());
            cadastroLucro.setText(model.getValueAt(selectedRow, 12).toString());
            cadastroData.setText(model.getValueAt(selectedRow, 13).toString());
            
            String statusString = model.getValueAt(selectedRow, 2).toString();
            cadastroStatus.setSelectedItem(statusString.equals("I") ? "I - Inativo" : "A - Ativo");
            
            // Formata lucro com porcentagem
            double lucro = Double.parseDouble(model.getValueAt(selectedRow, 12).toString());
            cadastroLucro.setText(String.format("%.2f%%", lucro));
            
        } else {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada.");
        }
           
    }//GEN-LAST:event_tabelaBDMouseClicked

    private void cadastroStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroStatusActionPerformed
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(conn, username, password);
            String query = "SELECT status FROM produto WHERE id = 1"; // {
                    String status = rs.getString("status");
                    
                    // Seleciona o item da JComboBox com base no valor de 'status' do banco
                    if ("I".equals(status)) {
                        cadastroStatus.setSelectedItem("I - Inativo");
                    } else if ("A".equals(status)) {
                        cadastroStatus.setSelectedItem("A - Ativo");
                    }
        }
        catch (ClassNotFoundException e) {
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(
                java.util.logging.Level.SEVERE,
                null, e);
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(
                java.util.logging.Level.SEVERE,
                null, e);
        }
    }//GEN-LAST:event_cadastroStatusActionPerformed

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
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLIENTE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLIENTE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAlterar;
    private javax.swing.JButton BImprimir;
    private javax.swing.JButton BInserir;
    private javax.swing.JButton BLimpar;
    private javax.swing.JButton BRemover;
    private javax.swing.JButton BSair;
    private javax.swing.JTextField cadastroCod;
    private javax.swing.JTextField cadastroCodBarras;
    private javax.swing.JTextField cadastroCompra;
    private javax.swing.JTextField cadastroData;
    private javax.swing.JTextField cadastroDesc;
    private javax.swing.JTextField cadastroEstoqMax;
    private javax.swing.JTextField cadastroEstoqMin;
    private javax.swing.JTextField cadastroEstoque;
    private javax.swing.JTextField cadastroLucro;
    private javax.swing.JTextField cadastroNCM;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JComboBox<String> cadastroStatus;
    private javax.swing.JTextField cadastroVenda;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private java.util.List<Sistema.Produto> produtoList;
    private java.util.List<Sistema.Produto> produtoList1;
    private javax.persistence.Query produtoQuery;
    private javax.persistence.Query produtoQuery1;
    private javax.swing.JTable tabelaBD;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
