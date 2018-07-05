/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailapp;

import java.util.Scanner;

/**
 *
 * @author JWALA
 */
public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength=8;
    private String department;
    private String alternateEmail;
    private int mailBoxCapacity=500;
    private String companySuffix="company.com";
    private String email;
    
    
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Name:"+this.firstName+" "+this.lastName);
        this.department=setDepartment();
        System.out.println("Department:"+this.department);
        this.password=randomPassword(defaultPasswordLength);
        
        
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        
        System.out.println("your email id:"+email);
        System.out.println("your password: "+this.password);
        
    }
    
    private String setDepartment(){
        System.out.print("DEPARTMENT CODE\n0 for none\n1 for Sales\n2 for Development\n3 for Accounting\nEnter department code: ");
        Scanner in=new Scanner(System.in);
        int choice=in.nextInt();
        if(choice==1)return "sales";
        else if(choice==2)return "development";
        else if(choice==3)return "accounting";
        else return "";
    }
    
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZqwertyuioplkjhgfdsazxcvbnm@#$0123456789";
        char[] password=new char[length];
        for(int i=0;i<length;++i){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity=capacity;
    }
    
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    
    public void changePassword(String password){
        this.password=password;
    }
    
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "DISPLAY NAME:"+firstName+" "+lastName+"\nCOMPANY EMAIL:"+email+"\nMAILBOXCAPACITY:"+mailBoxCapacity+"mb";
    }
    
}
    
    
    

