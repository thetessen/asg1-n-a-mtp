/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import xuly.IOFile;
import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import static java.lang.System.exit;
import java.util.Set;
import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JFrame;
import java.io.*;
import com.sun.speech.freetts.*;
import java.awt.Toolkit;
import java.util.TreeMap;

/**
 *
 * @author THE TESSEN
 */
public class TuDien extends javax.swing.JFrame {

    /**
     * Creates new form TuDien
     */
    private TreeMap<String ,String> listW;
    private IOFile file;
    public TuDien() {
        file= new IOFile();
        listW =  file.docTu();     
        setLocation(370,150);
        initComponents();
        InraList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextField1 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btModify = new javax.swing.JButton();
        btAdd = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btspeak = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T-P Dictionary");
        setBackground(new java.awt.Color(51, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(TuDien.class.getResource("/photo/logo.png")));
        setResizable(false);
        setSize(new java.awt.Dimension(650, 358));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setForeground(new java.awt.Color(0, 204, 204));

        btSearch.setBackground(new java.awt.Color(255, 255, 0));
        btSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btSearch.setForeground(new java.awt.Color(153, 0, 153));
        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/tìm.png"))); // NOI18N
        btSearch.setMnemonic('S');
        btSearch.setText("Search");
        btSearch.setToolTipText("Tìm kiếm một từ và các từ gần giống trong từ điển");
        btSearch.setName(""); // NOI18N
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        jList1.setBackground(new java.awt.Color(0, 153, 255));
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jList1.setToolTipText("");
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setDropMode(javax.swing.DropMode.ON);
        jList1.setSelectedIndex(0);
        jList1.setSelectedIndices(new int[] {0});

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jList1, org.jdesktop.beansbinding.ObjectProperty.create(), jList1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        btModify.setBackground(new java.awt.Color(255, 255, 0));
        btModify.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btModify.setForeground(new java.awt.Color(153, 0, 153));
        btModify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/sửa.png"))); // NOI18N
        btModify.setMnemonic('M');
        btModify.setText("Modify");
        btModify.setToolTipText("Sửa một từ đã có trong từ điển");
        btModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModifyActionPerformed(evt);
            }
        });

        btAdd.setBackground(new java.awt.Color(255, 255, 0));
        btAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btAdd.setForeground(new java.awt.Color(153, 0, 153));
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/thêm.png"))); // NOI18N
        btAdd.setMnemonic('A');
        btAdd.setText("   Add");
        btAdd.setToolTipText("Thêm một từ mới vào từ điển");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(255, 255, 0));
        btDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btDelete.setForeground(new java.awt.Color(153, 0, 153));
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/xóa.png"))); // NOI18N
        btDelete.setMnemonic('D');
        btDelete.setText("Delete");
        btDelete.setToolTipText("Xóa một từ đã có trong từ điển");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btExit.setBackground(new java.awt.Color(255, 255, 0));
        btExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btExit.setForeground(new java.awt.Color(153, 0, 153));
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/thoát.png"))); // NOI18N
        btExit.setMnemonic('E');
        btExit.setText("  Exit");
        btExit.setToolTipText("Thoát khỏi ứng dụng");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        tfSearch.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(204, 204, 204));
        tfSearch.setText("Search");
        tfSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSearchFocusLost(evt);
            }
        });
        tfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfSearchMouseClicked(evt);
            }
        });
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(255, 255, 233));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btspeak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo/loa.png"))); // NOI18N
        btspeak.setToolTipText("Phát âm");
        btspeak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btspeakActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btModify, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btAdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tfSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btspeak, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btModify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btspeak, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btspeak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btModify)
                        .addGap(44, 44, 44)
                        .addComponent(btAdd)
                        .addGap(40, 40, 40)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btExit))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        if(!tfSearch.getText().trim().equals(""))
        {
            jTextArea1.setText("");
           if(listW.get(tfSearch.getText().trim())==null)
               JOptionPane.showMessageDialog(null, "Xin lỗi, không tìm thấy từ bạn vừa nhập");
           else jTextArea1.setText(listW.get(tfSearch.getText().trim())); 
        } 
        else  JOptionPane.showMessageDialog(null, "Bạn phải nhập từ vào ô tìm kiếm","Error",NORMAL);
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        int click=JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát", "Exit", JOptionPane.YES_NO_OPTION);
        if(click==JOptionPane.YES_OPTION)   
            System.exit(1);
    }//GEN-LAST:event_btExitActionPerformed
    DefaultListModel<String> model = new DefaultListModel<>();
    public  void InraList(){
    Set<String> keySet = listW.keySet();
        for(String i:keySet){
            model.addElement(i);
            jList1.setModel(model);
    }
     jList1.setSelectedIndex(0);     
}
    
    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        boolean flag = false;
        model.removeAllElements();
        if(!tfSearch.getText().equals("")){
            jTextArea1.setText("");
            Set<String> keySet = listW.keySet();
            for(String i:keySet){
                if(i.contains(tfSearch.getText().toLowerCase())){
                    model.addElement(i);
                    jList1.setModel(model);
                    if(!flag){
                        jTextArea1.setText(listW.get(i));
                        flag = true;
                    }
                    check = true;
                }                      
            }
            jList1.setSelectedIndex(0);         
           if(!check)JOptionPane.showMessageDialog(null, "Không tìm thấy từ bạn vừa nhập");
        } 
        else  JOptionPane.showMessageDialog(null, "Bạn phải nhập từ vào ô tìm kiếm","Error",NORMAL);
    }//GEN-LAST:event_btSearchActionPerformed

    private void btModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModifyActionPerformed
        // TODO add your handling code here:
        String fix_Word = null;
        String meaning = null;
        try {
            do{
                fix_Word = JOptionPane.showInputDialog(null, "Nhập từ cần sửa", "Modify", WIDTH);
                if(fix_Word.equals(""))JOptionPane.showMessageDialog(null,"Bạn chưa nhập từ","Error",NORMAL);
            }
            while(fix_Word.equals(""));
            if(listW.get(fix_Word.toLowerCase().trim())==null) 
                JOptionPane.showMessageDialog(null, "Từ điển không có từ bạn vừa nhập","Error",NORMAL);
            else{
                do{
                meaning = JOptionPane.showInputDialog(null, "Nhập nghĩa mới", "Modify", WIDTH);
                if(meaning.equals(""))JOptionPane.showMessageDialog(null,"Bạn chưa nhập nghĩa","Error",NORMAL);
                }
                while(meaning.equals(""));
                listW.replace(fix_Word.trim().toLowerCase(), meaning);
                file.ghiTu(listW);
                JOptionPane.showMessageDialog(null,"Bàn đã sửa từ thành công!","Message",JOptionPane.YES_OPTION);
            }
        }
        catch (Exception e) {
        }         
    }//GEN-LAST:event_btModifyActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
       Themtu them = new Themtu();
        jDesktopPane1.add(them); 
        
        them.show();

      
    }//GEN-LAST:event_btAddActionPerformed

    private void tfSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseClicked
        // TODO add your handling code here:
        tfSearch.setText("");     
    }//GEN-LAST:event_tfSearchMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        try {
             String word = model.getElementAt(jList1.getSelectedIndex());
             jTextArea1.setText(listW.get(word));
        } catch (Exception e) {              
        }       
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_jList1MousePressed

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        // TODO add your handling code here:
        String word=null;
        try {
             if(evt.getKeyCode()==KeyEvent.VK_UP)         
                    word = model.getElementAt(jList1.getSelectedIndex()-1);
            else if(evt.getKeyCode()==KeyEvent.VK_DOWN)
                    word = model.getElementAt(jList1.getSelectedIndex()+1); 
                    jTextArea1.setText("");
                    jTextArea1.setText(listW.get(word));                                           
        } catch (Exception e) {
        }              
    }//GEN-LAST:event_jList1KeyPressed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        String delete_Word=null;
        try {
            do{
            delete_Word = JOptionPane.showInputDialog(null, "Nhập từ cần xóa", "Delete", WIDTH);
            if(delete_Word.equals(""))JOptionPane.showMessageDialog(null,"Bạn chưa nhập từ","Error",NORMAL);
            }
            while(delete_Word.equals(""));
            if(listW.get(delete_Word.toLowerCase().trim())==null)
                JOptionPane.showMessageDialog(null, "Từ điển không có từ bạn vừa nhập","Error",NORMAL);
            else{
                listW.remove(delete_Word.trim().toLowerCase());
                file.ghiTu(listW);             
                JOptionPane.showMessageDialog(null,"Bàn đã xóa từ thành công!","Message",JOptionPane.YES_OPTION);
            }
        } catch (Exception e) {          
        }      
    }//GEN-LAST:event_btDeleteActionPerformed
    private static final String VOICENAME="kevin16";//Sử dụng tiếng của tác giả
    private void btspeakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btspeakActionPerformed
        // TODO add your handling code here:
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try {
            voice.speak(tfSearch.getText());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btspeakActionPerformed

    private void tfSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchFocusGained
 //        TODO add your handling code here:                               
          if(tfSearch.getText().trim().toLowerCase().equals("search")){
            tfSearch.setText("");
            tfSearch.setForeground(Color.BLACK);
        }                                     
    }//GEN-LAST:event_tfSearchFocusGained

    private void tfSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchFocusLost
        // TODO add your handling code here:
    if(tfSearch.getText().trim().equals("")  ){
            tfSearch.setText("Search");
            tfSearch.setForeground(new Color(236, 240, 241));
        }
    }//GEN-LAST:event_tfSearchFocusLost
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
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TuDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TuDien().setVisible(true);       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btModify;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btspeak;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfSearch;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    //@Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
