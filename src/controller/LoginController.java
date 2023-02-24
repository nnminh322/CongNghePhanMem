/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UserDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.User;
import view.Login;
import view.QuanLy;
import view.QuanLySinhHoat;

public class LoginController implements ActionListener {

    private Login login;
    private UserDAO userDao;
    private QuanLy quanLy;
    private QuanLySinhHoat quanLySinhHoat;

    public LoginController(Login login) {
        this.login = login;
        userDao = new UserDAO();
        login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Login")) {
            String username = login.getjTextField_Username().getText();
            String password = login.getjPasswordField_Password().getText();
            User user = userDao.getUser(username, password);
            if (user == null) {
                JOptionPane.showMessageDialog(login, "Tên tài khoản hoặc mật khẩu không chính xác!");
            } else {
                if (user.getRole().equals("cán bộ hành chính")) {
                    quanLySinhHoat = new QuanLySinhHoat();
                    quanLySinhHoat.setVisible(true);
                } else {
                    // mở màn hình cho tổ trưởng hoặc tổ phó
                    quanLy = new QuanLy();
                    quanLy.setVisible(true);
                }
                this.login.dispose();
            }
        }
        if (actionCommand.equals("Clear")) {
            login.getjPasswordField_Password().setText("");
            login.getjTextField_Username().setText("");
        }

    }

}
