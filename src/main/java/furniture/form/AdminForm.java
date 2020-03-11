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
        title = new javax.swing.JLabel();
        btn_user = new javax.swing.JButton();
        btn_item = new javax.swing.JButton();
        base = new javax.swing.JPanel();
        item_panel = new javax.swing.JPanel();
        txt_name_item = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_price_item = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_search_user1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        item_table = new javax.swing.JTable();
        btn_edit_item = new javax.swing.JButton();
        btn_delete_item = new javax.swing.JButton();
        btn_add_item = new javax.swing.JButton();
        btn_clear_item = new javax.swing.JButton();
        txt_stock_item = new javax.swing.JTextField();
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
        jButton6 = new javax.swing.JButton();
        combo_job_user = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Furniture - Admin");
        setBackground(java.awt.Color.red);
        setForeground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(237, 28, 36));
        jPanel1.setPreferredSize(new java.awt.Dimension(13768, 720));

        title.setFont(new java.awt.Font("Futura Hv BT", 2, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Admin");

        btn_user.setBackground(new java.awt.Color(102, 204, 255));
        btn_user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_user.setForeground(new java.awt.Color(255, 255, 255));
        btn_user.setIcon(new javax.swing.ImageIcon("G:\\1x\\baseline_supervised_user_circle_black_18dp.png")); // NOI18N
        btn_user.setText("User");
        btn_user.setBorder(null);
        btn_user.setName(""); // NOI18N
        btn_user.setOpaque(false);
        btn_user.setPreferredSize(new java.awt.Dimension(150, 39));
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_userMouseClicked(evt);
            }
        });

        btn_item.setBackground(new java.awt.Color(102, 204, 255));
        btn_item.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btn_item.setForeground(new java.awt.Color(176, 23, 29));
        btn_item.setIcon(new javax.swing.ImageIcon("G:\\1x\\baseline_supervised_user_circle_black_18dp.png")); // NOI18N
        btn_item.setText("Item");
        btn_item.setBorder(null);
        btn_item.setName(""); // NOI18N
        btn_item.setOpaque(false);
        btn_item.setPreferredSize(new java.awt.Dimension(150, 39));
        btn_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_itemMouseClicked(evt);
            }
        });

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 23, 29), 2));

        item_panel.setBackground(new java.awt.Color(255, 255, 255));

        txt_name_item.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_name_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 23, 29)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(237, 28, 36));
        jLabel9.setText("Stock :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 28, 36));
        jLabel10.setText("Price :");

        txt_price_item.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_price_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 23, 29)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(237, 28, 36));
        jLabel11.setText("Item Name :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 28, 36));
        jLabel12.setText("Search :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(237, 28, 36));
        jLabel13.setText("Items");

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

        btn_edit_item.setText("Edit");
        btn_edit_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_itemMouseClicked(evt);
            }
        });

        btn_delete_item.setText("Delete");

        btn_add_item.setText("Add");
        btn_add_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_itemMouseClicked(evt);
            }
        });

        btn_clear_item.setText("Clear");

        txt_stock_item.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_stock_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 23, 29)));

        javax.swing.GroupLayout item_panelLayout = new javax.swing.GroupLayout(item_panel);
        item_panel.setLayout(item_panelLayout);
        item_panelLayout.setHorizontalGroup(
            item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_panelLayout.createSequentialGroup()
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(item_panelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(txt_name_item, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txt_price_item)
                            .addComponent(txt_stock_item, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                    .addGroup(item_panelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(item_panelLayout.createSequentialGroup()
                                .addComponent(btn_delete_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_clear_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(item_panelLayout.createSequentialGroup()
                                .addComponent(btn_add_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_edit_item, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_panelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(item_panelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel13))
                            .addGroup(item_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_search_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(368, 368, 368))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, item_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        item_panelLayout.setVerticalGroup(
            item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(item_panelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_name_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_stock_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_price_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_item)
                    .addComponent(btn_edit_item))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clear_item)
                    .addComponent(btn_delete_item))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(item_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search_user1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        user_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(237, 28, 36));
        jLabel2.setText("Users");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(237, 28, 36));
        jLabel3.setText("Username :");

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 23, 29)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(237, 28, 36));
        jLabel4.setText("Password :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 28, 36));
        jLabel5.setText("Full Name :");

        txt_name_user.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_name_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 23, 29)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(237, 28, 36));
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(237, 28, 36));
        jLabel7.setText("Job :");

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 23, 29)));

        radio_man.setBackground(new java.awt.Color(255, 255, 255));
        radio_man.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radio_man.setForeground(new java.awt.Color(237, 28, 36));
        radio_man.setText("Man");
        radio_man.setBorder(null);

        radio_woman.setBackground(new java.awt.Color(255, 255, 255));
        radio_woman.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        radio_woman.setForeground(new java.awt.Color(237, 28, 36));
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

        btn_search_user.setText("Search");
        btn_search_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_search_userMouseClicked(evt);
            }
        });

        btn_edit_user.setText("Edit");
        btn_edit_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_edit_userMouseClicked(evt);
            }
        });

        btn_delete_user.setText("Delete");

        btn_add_user.setText("Add");
        btn_add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_add_userMouseClicked(evt);
            }
        });

        btn_clear_user.setText("Clear");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(237, 28, 36));
        jLabel8.setText("Search :");

        jButton6.setText("Refresh");

        javax.swing.GroupLayout user_panelLayout = new javax.swing.GroupLayout(user_panel);
        user_panel.setLayout(user_panelLayout);
        user_panelLayout.setHorizontalGroup(
            user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_panelLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(user_panelLayout.createSequentialGroup()
                            .addComponent(radio_man)
                            .addGap(32, 32, 32)
                            .addComponent(radio_woman))
                        .addComponent(jLabel3)
                        .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(txt_name_user)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(txt_password))
                    .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(user_panelLayout.createSequentialGroup()
                            .addComponent(btn_delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_clear_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(user_panelLayout.createSequentialGroup()
                            .addComponent(btn_add_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_edit_user, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(combo_job_user, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel8)
                        .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(user_panelLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addGroup(user_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search_user))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        user_panelLayout.setVerticalGroup(
            user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_name_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_man)
                            .addComponent(radio_woman))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(16, 16, 16)
                        .addComponent(combo_job_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_add_user)
                            .addComponent(btn_edit_user))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_clear_user)
                            .addComponent(btn_delete_user))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(user_panelLayout.createSequentialGroup()
                        .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search_user)
                            .addComponent(jLabel8))
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))))
        );

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(item_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(item_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(title)))
                .addContainerGap(13608, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addGap(186, 186, 186)
                .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 398, Short.MAX_VALUE)
                            .addComponent(btn_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(272, 272, 272))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_userMouseClicked
        item_panel.setVisible(false);
        user_panel.setVisible(true);
    }//GEN-LAST:event_btn_userMouseClicked

    private void btn_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_itemMouseClicked
       item_panel.setVisible(true);
       user_panel.setVisible(false);
    }//GEN-LAST:event_btn_itemMouseClicked

    private void btn_search_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_userMouseClicked
        String search = txt_search_user.getText();
        setUserTableData(userController.getDataByName(search));
    }//GEN-LAST:event_btn_search_userMouseClicked
    
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
    
    private void btn_add_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_userMouseClicked
       userController.insert(geUsertInputData());
       setUserTableData(userController.getData());
    }//GEN-LAST:event_btn_add_userMouseClicked

    private void btn_edit_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_userMouseClicked
        int i = user_table.getSelectedRow();
        String id = user_table.getValueAt(i, 0).toString();
        userController.update(geUsertInputData(), id);
        setUserTableData(userController.getData());
    }//GEN-LAST:event_btn_edit_userMouseClicked

    private void user_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMouseClicked
      getUserSelectedData();
    }//GEN-LAST:event_user_tableMouseClicked

    private void item_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_item_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_item_tableMouseClicked

    private void btn_edit_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_itemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_edit_itemMouseClicked

    private void btn_add_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_itemMouseClicked
      itemController.insert(getItemInputData());
      setItemTableData(itemController.getData());
    }//GEN-LAST:event_btn_add_itemMouseClicked

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
    private javax.swing.JPanel base;
    private javax.swing.JButton btn_add_item;
    private javax.swing.JButton btn_add_user;
    private javax.swing.JButton btn_clear_item;
    private javax.swing.JButton btn_clear_user;
    private javax.swing.JButton btn_delete_item;
    private javax.swing.JButton btn_delete_user;
    private javax.swing.JButton btn_edit_item;
    private javax.swing.JButton btn_edit_user;
    private javax.swing.JButton btn_item;
    private javax.swing.JButton btn_search_user;
    private javax.swing.JButton btn_user;
    private javax.swing.JComboBox<String> combo_job_user;
    private javax.swing.JPanel item_panel;
    private javax.swing.JTable item_table;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel title;
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
