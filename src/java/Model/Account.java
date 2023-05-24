/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author win
 */
public class Account {
    private int accId;
    private String user;
    private String pass;
    private String accType;
    private String createDate;

    public Account(int accId, String user, String pass, String accType, String createDate) {
        this.accId = accId;
        this.user = user;
        this.pass = pass;
        this.accType = accType;
        this.createDate = createDate;
    }

    public Account(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
    
    

    public Account() {
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Account{" + "accId=" + accId + ", user=" + user + ", pass=" + pass + ", accType=" + accType + ", createDate=" + createDate + '}';
    }
    
    
    
}
