package com.basesdedatos;

import java.sql.SQLException;

import com.basesdedatos.view.SwingApp;

public class Main {
    public static void main(String[] args)throws SQLException {
      
      SwingApp app = new SwingApp();
      app.setVisible(true);
    }
}