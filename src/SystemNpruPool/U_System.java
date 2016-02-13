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
public abstract class U_System {
 public abstract  void  InsertUser
        (String name
         ,String lastname
         ,String address
         ,String birthday
         ,String cardId
         ,int type
         ,String tel);
        public abstract void UpdateUser(String U_Id,String name
         ,String lastname
         ,String address
         ,String birthday
         ,String cardId
         ,int type
         ,String tel);
         public abstract void DeleteUser(int U_Id);
 //public abstract void ShowUser();
}
