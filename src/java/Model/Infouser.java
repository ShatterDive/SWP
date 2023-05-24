/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author win
 */
public class Infouser {
    private int usid;
    private String fullname;
    private String uAddress;
    private String phoneNum;
    private int age;
    private String accid;

    public Infouser(int usid, String fullname, String uAddress, String phoneNum, int age, String accid) {
        this.usid = usid;
        this.fullname = fullname;
        this.uAddress = uAddress;
        this.phoneNum = phoneNum;
        this.age = age;
        this.accid = accid;
    }

    public Infouser(String fullname, String uAddress, String phoneNum, int age, String accid) {
        this.fullname = fullname;
        this.uAddress = uAddress;
        this.phoneNum = phoneNum;
        this.age = age;
        this.accid = accid;
    }

    public Infouser() {
    }

    public int getUsid() {
        return usid;
    }

    public void setUsid(int usid) {
        this.usid = usid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccid() {
        return accid;
    }

    public void setAccid(String accid) {
        this.accid = accid;
    }

    @Override
    public String toString() {
        return "Infouser{" + "usid=" + usid + ", fullname=" + fullname + ", uAddress=" + uAddress + ", phoneNum=" + phoneNum + ", age=" + age + ", accid=" + accid + '}';
    }

   
}
