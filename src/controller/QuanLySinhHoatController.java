/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.QuanLySinhHoat;

/**
 *
 * @author nnminh322
 */
public class QuanLySinhHoatController implements ActionListener {

    private QuanLySinhHoat quanLySinhHoat;

    public QuanLySinhHoatController(QuanLySinhHoat quanLySinhHoat) {
        this.quanLySinhHoat = quanLySinhHoat;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Lên lịch cuộc họp")) {
            
        }
    }

}
