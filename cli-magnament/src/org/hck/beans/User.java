/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.beans;

/**
 *
 * @author Hackobo
 */
public class User {
   private Integer idUser;
   private String nickname;
   private String password;

   public User(Integer idUser, String nickname, String password){
       this.idUser = idUser;
       this.nickname = nickname;
       this.password = password;
   }
   
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
}
