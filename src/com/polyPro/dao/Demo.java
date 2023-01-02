/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyPro.dao;
import com.polyPro.dao.HocVienDAO;
import com.polyPro.model.HocVien;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author duong
 */
public class Demo {
    public static void main(String[] args) {
        HocVienDAO dao = new HocVienDAO();
        List<HocVien> list = dao.select();
        for(HocVien x: list) {
            System.out.println(x.getMaHV());
        }
    }
}
