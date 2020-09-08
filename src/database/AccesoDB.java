/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ARCRODINPC-02
 */
public class AccesoDB {

    public String LeerTexto(String direccion) { //direccion del archivo

        String texto = "";
        BufferedReader bf = null;
        FileReader fr =null;
        try {
            fr = new FileReader(direccion);
            bf = new BufferedReader(fr);
            String temp = "";
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
            }
            texto = temp;

        } catch (IOException e) {
            System.err.println("No se encontro archivo");
        } finally {
            System.out.println("Fin");
        }

        return texto;

    }

    public static Connection obtener() throws SQLException, ClassNotFoundException {

        Connection cn = null;
        AccesoDB a = new AccesoDB();
        String s1;
        s1 = a.LeerTexto("C:\\sonarq\\ProyectoARC-FE\\acceso.txt");

        try {
            // Parámetros de Connexión
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/prueba";
            // Proceso
            Class.forName(driver).newInstance();
            cn = DriverManager.getConnection(url, s1, s1);
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            throw new SQLException("No se encontró el driver de la base de datos.");
        } catch (InstantiationException | IllegalAccessException e) {
            throw new SQLException("No se puede acceder a la base de datos.");
        }finally {
            System.out.println("Fin");
        }
        System.out.println("Prueba v2");
        System.out.println("Prueba v3");
        return cn;
    }
    

    
}
