/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool;

import java.util.Date;

/**
 *
 * @author Godonlyknows
 */
public class TestClass {
    public static void main(String[] args) {
  
        User us = new User();
        CheckConnetDB cc = new CheckConnetDB();
        cc.CheckConnect();
       // us.InsertUser("j","ปิยวัตร์", "add", "1994-02-02","1103701451963",1, "0914250644");
        System.out.print("1");
        us.ShowUser();
        us.DeleteUser(4);
          us.ShowUser();
    }
}
