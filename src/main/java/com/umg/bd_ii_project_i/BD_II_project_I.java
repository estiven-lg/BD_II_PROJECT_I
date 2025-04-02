package com.umg.bd_ii_project_i;

import database.SQL;
import view.MainScreen;

public class BD_II_project_I {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String sql = "SELECT * FROM BANK.ATM";
        SQL.excecute(sql);
        new MainScreen();
    }
}
