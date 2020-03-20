package furniture.form;

import furniture.controller.ItemController;
import furniture.controller.UserController;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import model.Item;
import model.User;


public class AdminForm extends javax.swing.JFrame {
    
    private UserController userController = new UserController(); 
    private ItemController itemController = new ItemController();
   
    public AdminForm() {
        initComponents();
        initCombobox();
        initRadioButton();
        setUserTableData(userController.getData());
        setItemTableData(itemController.getData());
    }
    
    private void initRadioButton(){
        ButtonGroup group = new ButtonGroup();
        group.add(radio_man);
        group.add(radio_woman);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        base = new javax.swing.JPanel();
        user_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_name_user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        radio_man = new javax.swing.JRadioButton();
        radio_woman = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        txt_search_user = new javax.swing.JTextField();
        btn_search_user = new javax.swing.JButton();
        btn_edit_user = new javax.swing.JButton();
        btn_delete_user = new javax.swing.JButton();
        btn_add_user = new javax.swing.JButton();
        btn_clear_user = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btn_refresh_user = new javax.swing.JButton();
        combo_job_user = new javax.swing.JComboBox<>();
        item_panel = new javax.swing.JPanel();
        txt_name_item = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_price_item = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_search_user1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_edit_item = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        item_table = new javax.swing.JTable();
        btn_delete_item = new javax.swing.JButton();
        btn_add_item = new javax.swing.JButton();
        btn_clear_item = new javax.swing.JButton();
        txt_stock_item = new javax.swing.JTextField();
        btn_search_items = new javax.swing.JButton();
        btn_refresh_items = new javax.swing.JButton();
        Furniture = new javax.swing.JLabel();
        Furniture1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_user = new javax.swing.JButton();
        btn_job = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_items = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Furniture - Admin");
        setBackground(java.awt.Color.red);
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(242, 209, 132));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setPreferredSize(new java.awt.Dimension(1210, 580));

        user_panel.setBackground(new java.awt.Color(255, 255, 255));
        user_panel.setPreferredSize(new java.awt.Dimension(1000, 580));

        jLabel2.setFont(new java.awt.Font("Asap SemiBold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 1, 2));
        jLabel2.setText("Users");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Username :");

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Full Name :");

        txt_name_user.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_name_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_name_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_name_userActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Job :");

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        radio_man.setBackground(new java.awt.Color(255, 255, 255));
        radio_man.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radio_man.setText("Man");
        radio_man.setBorder(null);

        radio_woman.setBackground(new java.awt.Color(255, 255, 255));
        radio_woman.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radio_woman.setText("Woman");
        radio_woman.setBorder(null);

        user_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(user_table);
        if (user_table.getColumnModel().getColumnCount() > 0) {
            user_table.getColumnModel().getColumn(0).setResizable(false);
            user_table.getColumnModel().getColumn(0).setHeaderValue("Id");
            user_table.getColumnModel().getColumn(1).setResizable(false);
            user_table.getColumnModel().getColumn(1).setHeaderValue("Full Name");
            user_table.getColumnModel().getColumn(2).setResizable(false);
            user_table.getColumnModel().getColumn(2).setHeaderValue("Gender");
            user_table.getColumnModel().getColumn(3).setResizable(false);
            user_table.getColumnModel().getColumn(3).setHeaderValue("Job");
            user_table.getColumnModel().getColumn(4).setResizable(false);
            user_table.getColumnModel().getColumn(4).setHeaderValue("Username");
            user_table.getColumnModel().getColumn(5).setResizable(false);
            user_table.getColumnModel().getColumn(5).setHeaderValue("Password");
        }

        btn_search_user.setBackground(new java.awt.Color(167, 131, 57));
        btn_search_user.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_search_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_search_user.setText("Search");
        btn_search_user.setBorder(null);
        btn_search_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search_userMouseClicked(evt);
            }
        });

        btn_edit_user.setBackground(new java.awt.Color(167, 131, 57));
        btn_edit_user.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_edit_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit_user.setText("Edit");
        btn_edit_user.setBorder(null);
        btn_edit_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_userMouseClicked(evt);
            }
        });

        btn_delete_user.setBackground(new java.awt.Color(167, 131, 57));
        btn_delete_user.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_delete_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete_user.setText("Delete");
        btn_delete_user.setBorder(null);
        btn_delete_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_userActionPerformed(evt);
            }
        });

        btn_add_user.setBackground(new java.awt.Color(167, 131, 57));
        btn_add_user.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_add_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_add_user.setText("Add");
        btn_add_user.setBorder(null);
        btn_add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_userMouseClicked(evt);
            }
        });

        btn_clear_user.setBackground(new java.awt.Color(167, 131, 57));
        btn_clear_user.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_clear_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear_user.setText("Clear");
        btn_clear_user.setBorder(null);
        btn_clear_user.setPreferredSize(new java.awt.Dimension(24, 17));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Search :");

        btn_refresh_user.setBackground(new java.awt.Color(255, 255, 255));
        btn_refresh_user.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon feather-refresh-ccw.png")); // NOI18N
        btn_refresh_user.setBorder(null);
        btn_refresh_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refresh_userMouseClicked(evt);
            }
        });
        btn_refresh_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout user_panelLayout = new javax.swing.GroupLayout(user_panel);
        user_panel.setLayout(user_panelLayout);
        user_panelLayout.setHorizontalGroup(
            user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txt_username)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txt_name_user)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_job_user, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addComponent(radio_man)
                        .addGap(32, 32, 32)
                        .addComponent(radio_woman))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, user_panelLayout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel2)
                                .addGap(11, 11, 11))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_refresh_user, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        user_panelLayout.setVerticalGroup(
            user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btn_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_name_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6))
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit_user, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_clear_user, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_man)
                    .addComponent(radio_woman))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(16, 16, 16)
                .addComponent(combo_job_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(user_panelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btn_refresh_user, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
        );

        item_panel.setBackground(new java.awt.Color(255, 255, 255));
        item_panel.setMaximumSize(new java.awt.Dimension(1210, 580));
        item_panel.setPreferredSize(new java.awt.Dimension(1000, 580));
        item_panel.setRequestFocusEnabled(false);

        txt_name_item.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_name_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Stock :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setText("Price :");

        txt_price_item.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_price_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Item Name :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setText("Search :");

        jLabel13.setFont(new java.awt.Font("Asap SemiBold", 1, 36)); // NOI18N
        jLabel13.setText("Items");

        btn_edit_item.setText("Edit");
        btn_edit_item.setMargin(new java.awt.Insets(0, 14, 2, 14));
        btn_edit_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_itemMouseClicked(evt);
            }
        });

        item_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                item_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(item_table);
        if (item_table.getColumnModel().getColumnCount() > 0) {
            item_table.getColumnModel().getColumn(0).setResizable(false);
            item_table.getColumnModel().getColumn(0).setHeaderValue("Id");
            item_table.getColumnModel().getColumn(1).setResizable(false);
            item_table.getColumnModel().getColumn(1).setHeaderValue("Full Name");
            item_table.getColumnModel().getColumn(2).setResizable(false);
            item_table.getColumnModel().getColumn(2).setHeaderValue("Gender");
            item_table.getColumnModel().getColumn(3).setResizable(false);
            item_table.getColumnModel().getColumn(3).setHeaderValue("Job");
            item_table.getColumnModel().getColumn(4).setResizable(false);
            item_table.getColumnModel().getColumn(4).setHeaderValue("Username");
            item_table.getColumnModel().getColumn(5).setResizable(false);
            item_table.getColumnModel().getColumn(5).setHeaderValue("Password");
        }

        btn_delete_item.setText("Delete");

        btn_add_item.setText("Add");
        btn_add_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_itemMouseClicked(evt);
            }
        });

        btn_clear_item.setText("Clear");

        txt_stock_item.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_stock_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_stock_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stock_itemActionPerformed(evt);
            }
        });

        btn_search_items.setBackground(new java.awt.Color(167, 131, 57));
        btn_search_items.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_search_items.setForeground(new java.awt.Color(255, 255, 255));
        btn_search_items.setText("Search");
        btn_search_items.setBorder(null);
        btn_search_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search_itemsMouseClicked(evt);
            }
        });

        btn_refresh_items.setBackground(new java.awt.Color(255, 255, 255));
        btn_refresh_items.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon feather-refresh-ccw.png")); // NOI18N
        btn_refresh_items.setBorder(null);
        btn_refresh_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_refresh_itemsMouseClicked(evt);
            }
        });
        btn_refresh_items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh_itemsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout item_panelLayout = new javax.swing.GroupLayout(item_panel);
        item_panel.setLayout(item_panelLayout);
        item_panelLayout.setHorizontalGroup(
            item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(txt_name_item, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_stock_item, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price_item, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(item_panelLayout.createSequentialGroup()
                        .addComponent(btn_add_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn_delete_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_edit_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_clear_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addGroup(item_panelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(item_panelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search_items, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_refresh_items, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        item_panelLayout.setVerticalGroup(
            item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_search_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(btn_search_items, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_refresh_items, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(item_panelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_name_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_price_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_stock_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_add_item)
                            .addComponent(btn_delete_item)
                            .addComponent(btn_edit_item)
                            .addComponent(btn_clear_item))))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(item_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1179, Short.MAX_VALUE)
                    .addGroup(baseLayout.createSequentialGroup()
                        .addComponent(user_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addComponent(user_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Furniture.setBackground(new java.awt.Color(255, 255, 255));
        Furniture.setFont(new java.awt.Font("Asap Medium", 1, 24)); // NOI18N
        Furniture.setForeground(new java.awt.Color(134, 97, 24));
        Furniture.setText("Future");

        Furniture1.setBackground(new java.awt.Color(189, 174, 160));
        Furniture1.setFont(new java.awt.Font("Asap Medium", 1, 24)); // NOI18N
        Furniture1.setForeground(new java.awt.Color(134, 97, 24));
        Furniture1.setText("Furniture");

        jLabel1.setFont(new java.awt.Font("Gotham", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 97, 24));
        jLabel1.setText("Admin.");

        btn_user.setBackground(new java.awt.Color(242, 209, 132));
        btn_user.setFont(new java.awt.Font("Asap SemiBold", 0, 20)); // NOI18N
        btn_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_user.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon ionic-md-people.png")); // NOI18N
        btn_user.setText("users");
        btn_user.setBorder(null);
        btn_user.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_userMouseClicked(evt);
            }
        });
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });

        btn_job.setBackground(new java.awt.Color(242, 209, 132));
        btn_job.setFont(new java.awt.Font("Asap SemiBold", 0, 20)); // NOI18N
        btn_job.setForeground(new java.awt.Color(255, 255, 255));
        btn_job.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon material-work.png")); // NOI18N
        btn_job.setText("job");
        btn_job.setBorder(null);
        btn_job.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_job.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jobMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Asap SemiBold", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Log Out");

        btn_logout.setBackground(new java.awt.Color(242, 209, 132));
        btn_logout.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon feather-log-out.png")); // NOI18N
        btn_logout.setBorder(null);
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });

        btn_items.setBackground(new java.awt.Color(242, 209, 132));
        btn_items.setFont(new java.awt.Font("Asap SemiBold", 0, 20)); // NOI18N
        btn_items.setForeground(new java.awt.Color(255, 255, 255));
        btn_items.setIcon(new javax.swing.ImageIcon("G:\\res\\image\\Icon material-work.png")); // NOI18N
        btn_items.setText("items");
        btn_items.setBorder(null);
        btn_items.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_itemsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Furniture1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Furniture))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(406, 406, 406)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btn_job, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btn_items)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Furniture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Furniture1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_user)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_job)
                                .addComponent(btn_items))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)))
                .addGap(18, 18, 18)
                .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        LoginForm login = new LoginForm();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_userActionPerformed

    private void btn_add_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_itemMouseClicked
        itemController.insert(getItemInputData());
        setItemTableData(itemController.getData());
    }//GEN-LAST:event_btn_add_itemMouseClicked

    private void btn_edit_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_itemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_edit_itemMouseClicked

    private void item_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_item_tableMouseClicked

    private void btn_refresh_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_refresh_userActionPerformed

    private void btn_refresh_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refresh_userMouseClicked
        setUserTableData(userController.getData());
    }//GEN-LAST:event_btn_refresh_userMouseClicked

    private void btn_add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_userMouseClicked
        userController.insert(geUsertInputData());
        setUserTableData(userController.getData());
    }//GEN-LAST:event_btn_add_userMouseClicked

    private void btn_delete_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delete_userActionPerformed

    private void btn_edit_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_userMouseClicked
        int i = user_table.getSelectedRow();
        String id = user_table.getValueAt(i, 0).toString();
        userController.update(geUsertInputData(), id);
        setUserTableData(userController.getData());
    }//GEN-LAST:event_btn_edit_userMouseClicked

    private void btn_search_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_userMouseClicked
        String search = txt_search_user.getText();
        setUserTableData(userController.getDataByName(search));
    }//GEN-LAST:event_btn_search_userMouseClicked

    private void user_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMouseClicked
        getUserSelectedData();
    }//GEN-LAST:event_user_tableMouseClicked

    private void txt_name_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_name_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_name_userActionPerformed

    private void btn_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_userMouseClicked
        user_panel.setVisible(true);
        item_panel.setVisible(false);
    }//GEN-LAST:event_btn_userMouseClicked

    private void btn_jobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jobMouseClicked
        
    }//GEN-LAST:event_btn_jobMouseClicked

    private void btn_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_itemsMouseClicked
       user_panel.setVisible(false);
        item_panel.setVisible(true);
    }//GEN-LAST:event_btn_itemsMouseClicked

    private void txt_stock_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stock_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stock_itemActionPerformed

    private void btn_search_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_itemsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_search_itemsMouseClicked

    private void btn_refresh_itemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_refresh_itemsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_refresh_itemsMouseClicked

    private void btn_refresh_itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh_itemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_refresh_itemsActionPerformed
    
    private void getUserSelectedData(){
        int i = user_table.getSelectedRow();
        String id = user_table.getValueAt(i, 0).toString();
        String name = user_table.getValueAt(i, 1).toString();
        String gender = user_table.getValueAt(i, 4).toString();
        String job = user_table.getValueAt(i, 5).toString();
        String username = user_table.getValueAt(i, 2).toString();
        String password = user_table.getValueAt(i, 3).toString();
        
        txt_username.setText(username);
        txt_password.setText(password);
        txt_name_user.setText(name);
        
        if(gender.equals("Man")){
            radio_man.setSelected(true);
        }else{
            radio_woman.setSelected(true);
        }
        
        if(job.equals("Admin")){
            combo_job_user.setSelectedIndex(0);
        }else{
            combo_job_user.setSelectedIndex(1);
        }
    }
    
    private User geUsertInputData(){
        String name = txt_name_user.getText();
        String username = txt_username.getText();
        String password = txt_password.getText();
        String gender;
        if(radio_man.isSelected()){
            gender = "Man";
        }else{
            gender = "Woman";
        }
        String job = combo_job_user.getSelectedItem().toString();
        User u = new User(name,gender,job,username,password);
        return u;
    }
    
    private Item getItemInputData(){
        String name = txt_name_item.getText();
        int stock = Integer.parseInt(txt_stock_item.getText());
        int price = Integer.parseInt(txt_price_item.getText());
        Item item = new Item(name,stock,price);
        return item;
    }
    
    private void initCombobox(){
        combo_job_user.addItem("Admin");
        combo_job_user.addItem("Cashier");
    }
    
    private void setUserTableData(List<User> data){
         DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                new String[] {
                    "Id",
                    "Full Name",
                    "Username",
                    "Password",
                    "Gender",
                    "Job"
                }
            );
            for (User u : data) {
                Object[] o = new Object[6];
                o[0] = Integer.toString(u.getId());
               
                o[1] = u.getName();
                o[2] = u.getUsername();
                o[3] = u.getPassword();
                o[4] = u.getGender();
                o[5] = u.getJob();
               
                tableModel.addRow(o);
            }
         
            user_table.setModel(tableModel);
            user_table.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS );
    }
    
    private void setItemTableData(List<Item> data){
         DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                new String[] {
                    "Id",
                    "Name",
                    "Stock",
                    "Price"
                }
            );
            for (Item u : data) {
                Object[] o = new Object[6];
                o[0] = Integer.toString(u.getId());
               
                o[1] = u.getName();
                o[2] = u.getStock();
                o[3] = u.getPrice();
               
                tableModel.addRow(o);
            }
         
            item_table.setModel(tableModel);
            item_table.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS );
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Furniture;
    private javax.swing.JLabel Furniture1;
    private javax.swing.JPanel base;
    private javax.swing.JButton btn_add_item;
    private javax.swing.JButton btn_add_user;
    private javax.swing.JButton btn_clear_item;
    private javax.swing.JButton btn_clear_user;
    private javax.swing.JButton btn_delete_item;
    private javax.swing.JButton btn_delete_user;
    private javax.swing.JButton btn_edit_item;
    private javax.swing.JButton btn_edit_user;
    private javax.swing.JButton btn_items;
    private javax.swing.JButton btn_job;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_refresh_items;
    private javax.swing.JButton btn_refresh_user;
    private javax.swing.JButton btn_search_items;
    private javax.swing.JButton btn_search_user;
    private javax.swing.JButton btn_user;
    private javax.swing.JComboBox<String> combo_job_user;
    private javax.swing.JPanel item_panel;
    private javax.swing.JTable item_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radio_man;
    private javax.swing.JRadioButton radio_woman;
    public javax.swing.JTextField txt_name_item;
    private javax.swing.JTextField txt_name_user;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_price_item;
    private javax.swing.JTextField txt_search_user;
    private javax.swing.JTextField txt_search_user1;
    public javax.swing.JTextField txt_stock_item;
    public javax.swing.JTextField txt_username;
    private javax.swing.JPanel user_panel;
    private javax.swing.JTable user_table;
    // End of variables declaration//GEN-END:variables
}
