/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Account;
import Model.Infouser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author win
 */
public class DreamStayDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
      public Account login(String user, String pass) {
        String query = "select * from Account\n"
                + "  where username = ?\n"
                + "                and password = ?";
        try {
            conn = new Connections().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if(rs.next()){
                Account acc = new Account();
                acc.setUser(rs.getString(1));
                acc.setPass(rs.getString(2));
                return acc;
            }
        } catch (Exception e) {
        }
        return null;
    }
      
      public Account checkMatchUser(String user) {
          Account a = new Account();
        String query = "select * from Account where username = ?";
        try {
            conn = new Connections().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            if(rs.next()){
                a.setUser(rs.getString(2));
                return a;
            }
        } catch (Exception e) {
        }
        return null;
    }
      
       public Infouser checkMatchPhone(String phone) {
        String query = "select phonenumber from InforUser where phonenumber = ?";
        try {
            conn = new Connections().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if(rs.next()){
                Infouser info = new Infouser();
                info.setPhoneNum(rs.getString(1));
                return info;
            }
        } catch (Exception e) {
        }
        return null;
    }
     
      
      public void insertAcc(String user, String pass) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);
        String query = " insert into Account(username ,password,acctype ,datesign)\n"
                + "values(?,?,?,?);";
        try {
            conn = new Connections().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, "0");
            ps.setString(4, formattedDate);
            ps.executeUpdate();
        } catch (Exception e) {
        } 
    }
      
      
      public String getAccId(String user,String pass){
          String query = "select accid from Account\n"
                + "  where username = ?\n"
                + "                and password = ?";
          try {
            conn = new Connections().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if(rs.next()){
               String id = rs.getString(1); 
               return id;
            }
        } catch (Exception e) {
        }
        return null;       
      }
      
      
     public void insertUserInfo(String fullname, String uAddress, String phoneNum, int age, String accId) {

        String query = " insert into InforUser\n"
                + "values \n"
                + "	(?,?,?,?,?);";
        try {
            conn = new Connections().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, fullname);
            ps.setString(2, uAddress);
            ps.setString(3, phoneNum);
            ps.setInt(4, age);
            ps.setString(5, accId);    
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
      
}
