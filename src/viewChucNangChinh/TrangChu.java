/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package viewChucNangChinh;

import Utils.Auth;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hoang
 */
public class TrangChu extends javax.swing.JFrame {

    CardLayout cardLayout;

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        cardLayout = (CardLayout) cards.getLayout();

        // Đăng ký listener cho ViewPhieuGiamGia
        viewPhieuGiamGia1.setPhieuGiamGiaUpdateListener(new PhieuGiamGiaUpdateListener() {
            @Override
            public void onPhieuGiamGiaUpdated() {
                SwingUtilities.invokeLater(() -> {
                    viewPhieuGiamGia1.refreshTableData(); // Cập nhật bảng trong ViewPhieuGiamGia
                    viewBanHang1.updatePhieuGiamGiaComboBox(); // Cập nhật combobox phiếu giảm giá trong ViewBanHang
                    System.out.println("Updated table in ViewPhieuGiamGia and combobox in ViewBanHang.");
                });
            }
        });

        // Đăng ký listener cho ViewBanHang
        viewBanHang1.setHoaDonUpdateListener(new HoaDonUpdateListener() {
            @Override
            public void onHoaDonUpdated() {
                viewHoaDon1.onHoaDonUpdated();
            }
        });

        viewBanHang1.registerNhanVienListener(viewNhanVien1);
        System.out.println("Registered NhanVienUpdateListener for ViewBanHang with viewNhanVien1: " + viewNhanVien1.hashCode());
        // Đăng ký listener cho ViewSanPham để cập nhật ViewBanHang
        viewSanPham2.setSanPhamUpdateListener(new SanPhamUpdateListener() {
            @Override
            public void onSanPhamUpdated() {
                SwingUtilities.invokeLater(() -> {
                    viewBanHang1.updateSanPhamList(); // Cập nhật danh sách sản phẩm trong ViewBanHang
                    System.out.println("Updated product list in ViewBanHang after product added.");
                });

            }
        });
        // Đăng ký listener từ ViewBanHang tới ViewSanPham
        viewBanHang1.setSanPhamUpdateListener(new SanPhamUpdateListener() {
            @Override
            public void onSanPhamUpdated() {
                SwingUtilities.invokeLater(() -> {
                    viewSanPham2.refreshTableData();
                    System.out.println("Updated table in ViewSanPham after product quantity changed.");
                });
            }
        });
        // Đăng ký listener từ ViewBanHang tới ViewPhieuGiamGia
        viewBanHang1.setPhieuGiamGiaUpdateListener(new PhieuGiamGiaUpdateListener() {
            @Override
            public void onPhieuGiamGiaUpdated() {
                SwingUtilities.invokeLater(() -> {
                    viewPhieuGiamGia1.refreshTableData(); // Cập nhật bảng trong ViewPhieuGiamGia
                    System.out.println("Updated table in ViewPhieuGiamGia.");
                });
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        Menu = new javax.swing.JPanel();
        btnViewSanPham = new javax.swing.JButton();
        btnViewTrangChu = new javax.swing.JButton();
        btnViewKhachHang = new javax.swing.JButton();
        btnViewPhieuGiamGia = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        btnViewThongKe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();
        btnViewHoaDon = new javax.swing.JButton();
        btnViewNhanVien = new javax.swing.JButton();
        cards = new javax.swing.JPanel();
        viewBanHang1 = new viewChucNangChinh.ViewBanHang();
        viewHoaDon1 = new viewChucNangChinh.ViewHoaDon();
        viewKhachHang1 = new viewChucNangChinh.ViewKhachHang();
        viewNhanVien1 = new viewChucNangChinh.ViewNhanVien();
        viewPhieuGiamGia1 = new viewChucNangChinh.ViewPhieuGiamGia();
        viewThongKe1 = new viewChucNangChinh.ViewThongKe();
        viewSanPham2 = new viewChucNangChinh.ViewSanPham();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu.setBackground(new java.awt.Color(49, 77, 100));

        btnViewSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book.png"))); // NOI18N
        btnViewSanPham.setText("Sản phẩm");
        btnViewSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSanPhamActionPerformed(evt);
            }
        });

        btnViewTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        btnViewTrangChu.setText("Trang Chủ");

        btnViewKhachHang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer.png"))); // NOI18N
        btnViewKhachHang.setText("Khách Hàng");
        btnViewKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewKhachHangActionPerformed(evt);
            }
        });

        btnViewPhieuGiamGia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewPhieuGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/coupon.png"))); // NOI18N
        btnViewPhieuGiamGia.setText("Phiếu giảm giá");
        btnViewPhieuGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPhieuGiamGiaActionPerformed(evt);
            }
        });

        btnBanHang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money.png"))); // NOI18N
        btnBanHang.setText("Bán Hàng");
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        btnViewThongKe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thongke.png"))); // NOI18N
        btnViewThongKe.setText("Thống kê");
        btnViewThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewThongKeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LitZone.png"))); // NOI18N

        lblDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thoat.png"))); // NOI18N
        lblDangXuat.setText("Đăng xuất");
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseExited(evt);
            }
        });

        btnViewHoaDon.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hoadon.png"))); // NOI18N
        btnViewHoaDon.setText("Hoá Đơn");
        btnViewHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHoaDonActionPerformed(evt);
            }
        });

        btnViewNhanVien.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        btnViewNhanVien.setText("Nhân Viên");
        btnViewNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewPhieuGiamGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBanHang, btnViewKhachHang, btnViewPhieuGiamGia, btnViewSanPham, btnViewThongKe, btnViewTrangChu});

        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnViewTrangChu)
                .addGap(18, 18, 18)
                .addComponent(btnBanHang)
                .addGap(18, 18, 18)
                .addComponent(btnViewKhachHang)
                .addGap(18, 18, 18)
                .addComponent(btnViewPhieuGiamGia)
                .addGap(18, 18, 18)
                .addComponent(btnViewSanPham)
                .addGap(18, 18, 18)
                .addComponent(btnViewNhanVien)
                .addGap(18, 18, 18)
                .addComponent(btnViewHoaDon)
                .addGap(18, 18, 18)
                .addComponent(btnViewThongKe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(lblDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jSplitPane2.setLeftComponent(Menu);

        cards.setMinimumSize(new java.awt.Dimension(965, 750));
        cards.setPreferredSize(new java.awt.Dimension(1060, 900));
        cards.setLayout(new java.awt.CardLayout());
        cards.add(viewBanHang1, "cardBanHang");
        cards.add(viewHoaDon1, "cardHoaDon");
        cards.add(viewKhachHang1, "cardKhachHang");
        cards.add(viewNhanVien1, "cardNhanVien");
        cards.add(viewPhieuGiamGia1, "cardPhieuGiamGia");
        cards.add(viewThongKe1, "cardThongKe");
        cards.add(viewSanPham2, "cardSanPham");

        jSplitPane2.setRightComponent(cards);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1255, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSanPhamActionPerformed
        if (Auth.isLogin() && Auth.isManager()) {
            cardLayout.show(cards, "cardSanPham");
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền dùng chức năng này.");
        }
    }//GEN-LAST:event_btnViewSanPhamActionPerformed

    private void btnViewKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewKhachHangActionPerformed
        if (Auth.isLogin()) {
            cardLayout.show(cards, "cardKhachHang");
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập");
        }
    }//GEN-LAST:event_btnViewKhachHangActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        if (Auth.isLogin()) {
            cardLayout.show(cards, "cardBanHang");
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng đăng nhập");
        }
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Auth.user = null; // Xóa thông tin người dùng đã đăng nhập
            this.dispose(); // Đóng cửa sổ TrangChu
            new DangNhap().setVisible(true); // Mở lại cửa sổ đăng nhập
        }
    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseEntered

    }//GEN-LAST:event_lblDangXuatMouseEntered

    private void lblDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseExited

    }//GEN-LAST:event_lblDangXuatMouseExited

    private void btnViewPhieuGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPhieuGiamGiaActionPerformed
        if (Auth.isLogin() && Auth.isManager()) {
            cardLayout.show(cards, "cardPhieuGiamGia");
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền dùng chức năng này.");
        }
    }//GEN-LAST:event_btnViewPhieuGiamGiaActionPerformed

    private void btnViewHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHoaDonActionPerformed
        if (Auth.isLogin() && Auth.isManager()) {
            cardLayout.show(cards, "cardHoaDon");
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền dùng chức năng này.");
        }
    }//GEN-LAST:event_btnViewHoaDonActionPerformed

    private void btnViewNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewNhanVienActionPerformed
        if (Auth.isLogin() && Auth.isManager()) {
            cardLayout.show(cards, "cardNhanVien");
            System.out.println("Showing ViewNhanVien instance: " + viewNhanVien1.hashCode()); // Kiểm tra viewNhanVien1

        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền dùng chức năng này.");
        }
    }//GEN-LAST:event_btnViewNhanVienActionPerformed

    private void btnViewThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewThongKeActionPerformed
        if (Auth.isLogin() && Auth.isManager()) {
            cardLayout.show(cards, "cardThongKe");
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không có quyền dùng chức năng này.");
        }
    }//GEN-LAST:event_btnViewThongKeActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnViewHoaDon;
    private javax.swing.JButton btnViewKhachHang;
    private javax.swing.JButton btnViewNhanVien;
    private javax.swing.JButton btnViewPhieuGiamGia;
    private javax.swing.JButton btnViewSanPham;
    private javax.swing.JButton btnViewThongKe;
    private javax.swing.JButton btnViewTrangChu;
    private javax.swing.JPanel cards;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JLabel lblDangXuat;
    private viewChucNangChinh.ViewBanHang viewBanHang1;
    private viewChucNangChinh.ViewHoaDon viewHoaDon1;
    private viewChucNangChinh.ViewKhachHang viewKhachHang1;
    private viewChucNangChinh.ViewNhanVien viewNhanVien1;
    private viewChucNangChinh.ViewPhieuGiamGia viewPhieuGiamGia1;
    private viewChucNangChinh.ViewSanPham viewSanPham2;
    private viewChucNangChinh.ViewThongKe viewThongKe1;
    // End of variables declaration//GEN-END:variables
}
