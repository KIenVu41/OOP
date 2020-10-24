/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form2;


import form2.Form2.Student;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QuanLiSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form quanLiNhanVien
     */
    ArrayList<Student> dssv = new ArrayList<>();
    public QuanLiSinhVien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lb_ten = new javax.swing.JLabel();
        ten = new javax.swing.JTextField();
        lb_ngaySinh = new javax.swing.JLabel();
        ngaySinh = new javax.swing.JTextField();
        lb_diaChi = new javax.swing.JLabel();
        diaChi = new javax.swing.JTextField();
        lb_gioiTinh = new javax.swing.JLabel();
        gtNam = new javax.swing.JRadioButton();
        gtNu = new javax.swing.JRadioButton();
        lb_ma = new javax.swing.JLabel();
        ma = new javax.swing.JTextField();
        lb_email = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lb_diemTK = new javax.swing.JLabel();
        diemTK = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("  QUẢN LÍ SINH VIÊN");

        lb_ten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_ten.setText("Họ Tên");

        lb_ngaySinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_ngaySinh.setText("Ngày sinh");

        lb_diaChi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_diaChi.setText("Địa chỉ");

        lb_gioiTinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_gioiTinh.setText("Giới tính");

        buttonGroup1.add(gtNam);
        gtNam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gtNam.setSelected(true);
        gtNam.setText("Nam");

        buttonGroup1.add(gtNu);
        gtNu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gtNu.setText("Nữ");

        lb_ma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_ma.setText("Mã SV");

        lb_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_email.setText("Email");

        lb_diemTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_diemTK.setText("Điểm TK");

        btn_them.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_luu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_luu.setText("Lưu dữ liệu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_reset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_reset.setText("reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_ten)
                    .addComponent(lb_ngaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_diaChi)
                    .addComponent(lb_gioiTinh)
                    .addComponent(lb_ma)
                    .addComponent(lb_email)
                    .addComponent(lb_diemTK))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(gtNam)
                                .addGap(18, 18, 18)
                                .addComponent(gtNu))
                            .addComponent(ten)
                            .addComponent(ngaySinh)
                            .addComponent(diaChi)
                            .addComponent(ma)
                            .addComponent(email)
                            .addComponent(diemTK, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_luu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_ten)
                    .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_ngaySinh)
                    .addComponent(ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_diaChi)
                    .addComponent(diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_gioiTinh)
                    .addComponent(gtNam)
                    .addComponent(gtNu))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_ma)
                    .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_email)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_diemTK)
                    .addComponent(diemTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_them)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_luu)
                        .addComponent(btn_reset)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void resetForm(){
        ten.setText("");
        diaChi.setText("");
        ngaySinh.setText("");
        ma.setText("");
        email.setText("");
        diemTK.setText("");
    }
    public boolean KiemTraRong()
    {
        if (ten.getText().equals("")||ngaySinh.getText().equals("")||diaChi.getText().equals("")||ma.getText().equals("")||email.getText().equals("")||(!gtNam.isSelected()&&!gtNu.isSelected())||diemTK.getText().equals("")){
            return true;
        }
        return false;
    }
    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
       if(KiemTraRong() == false){
           Student sv = new Student();
        sv.setTen(ma.getText());
        sv.setDiaChi(diaChi.getText());
        sv.setNgaySinh(ngaySinh.getText());
        if(gtNam.isSelected()){
            sv.setGioiTinh("Nam");
        }else{
            sv.setGioiTinh("Nữ");
        }
        sv.setMaSV(ma.getText());
        sv.setEmail(email.getText());
        sv.setDiemTK(Float.parseFloat(diemTK.getText()));
        dssv.add(sv);
        System.out.println(sv.toString());
        JOptionPane.showMessageDialog(this,"Thêm thành công");
       }else{
           JOptionPane.showMessageDialog(this,"Các trường không được rỗnG","Error",JOptionPane.ERROR_MESSAGE);
       }
        
    }//GEN-LAST:event_btn_themActionPerformed
    public void luuFile(ArrayList<Student> ds, String path){
        try{
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for(Student st: ds){
                bw.write(st.toString());
            }
            bw.close();
            fw.close();
        }catch(IOException e){
        }
    }
    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
       
        // TODO add your handling code here:
       luuFile(dssv,"sinhvien.txt");
    }//GEN-LAST:event_btn_luuActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btn_resetActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField diaChi;
    private javax.swing.JTextField diemTK;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton gtNam;
    private javax.swing.JRadioButton gtNu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_diaChi;
    private javax.swing.JLabel lb_diemTK;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_gioiTinh;
    private javax.swing.JLabel lb_ma;
    private javax.swing.JLabel lb_ngaySinh;
    private javax.swing.JLabel lb_ten;
    private javax.swing.JTextField ma;
    private javax.swing.JTextField ngaySinh;
    private javax.swing.JTextField ten;
    // End of variables declaration//GEN-END:variables
}