/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Master Kaizen - MK
 */
public class c_login {

    
    //Variables
    private Integer a1; // ID de Usuario
    private String  a2; // Usuario
    private String  a3; // Clave
    private String  a4; // Tipo ADMINISTRADOR u USUARIO
    
    //Constructor vacio
    public c_login(){
        this.a1 = null;
        this.a2 = null;
        this.a3 = null;
        this.a4 = null;
    }
    
    // Constructor para creaciones
    public c_login(Integer a1, String a2, String a3, String a4){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }
    


    // SETs
    public void setA1(Integer a1) {
        this.a1 = a1;
    }
    
    public void setA2(String a2) {
        this.a2 = a2;
    }
    
    public void setA3(String a3) {
        this.a3 = a3;
    }
    
    public void setA4(String a4) {
        this.a4 = a4;
    }
    
    // GETs
    public Integer getA1() {
        return a1;
    }
    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public String getA4() {
        return a4;
    }  
    
    
}
