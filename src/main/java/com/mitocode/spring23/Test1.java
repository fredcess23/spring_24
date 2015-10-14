package com.mitocode.spring23;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonas
 */

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mitocode.modelo.Usuario;

public class Test1 {


    public static void main(String[] args) {
    
        System.out.println("Se esta configurando la conexion y mapeo...");
        Configuration cfg= new Configuration();
        cfg.configure("com/mitocode/xml/hibernate.cfg.xml");
        
        System.out.println("Se creara el objeto creador de sesion...");
        SessionFactory sessionfactory= cfg.buildSessionFactory();
        
        System.out.println("Se crea una session para persistir..");
        Session session= sessionfactory.openSession();
        
        System.out.println("Se crea el objeto de transaccion...");
        Transaction tr= session.beginTransaction();
        
        
        System.out.println("Creamos el objeto a persistir...");
        Usuario unUsuario= new Usuario("Cesar", "Cruz", "kobebryant");
      
        System.out.println("guardamos el objeto...");
        session.save(unUsuario);
        
        System.out.println("Cerramos la transaccion...");
        tr.commit();
        
    }
    
}
