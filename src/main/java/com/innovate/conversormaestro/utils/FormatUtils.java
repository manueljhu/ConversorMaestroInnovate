package com.innovate.conversormaestro.utils;

import java.sql.ResultSet;
import java.util.Scanner;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.utils.MyAlert;

import javafx.scene.control.Alert.AlertType;

public class FormatUtils {
    ConnectionController connectionController;
    Scanner scanner = new Scanner(System.in);
    private int last_num = 0;

    public String format6digits(String value) {
        String result = "";

        if (value.length() < 6) {
            int dif = 6 - value.length();
            for (int i = 0; i < dif; i++) {
                result = "0" + result;
            }
            result = result + value;
        } else if (value.length() > 6) {
            int temp = value.length() - 6;
            result = value.substring(temp, value.length());
        } else if (value.length() == 6) {
            result = value;
        }
        System.out.println("Result: " + result);
        return result;
    }

    public String formatDigitGroupAccount(String group, String account, String value) {
        String result = "";
        int groupInt = Integer.parseInt(group);
        int accountInt = Integer.parseInt(account);

        if (accountInt == value.length()){
            result = value;
        } else if (accountInt > value.length()){
            String temp = value.substring(0, groupInt);
            String temp2 = value.substring(groupInt, value.length());
            int dif = accountInt - groupInt - temp2.length();
            for (int i = 0; i < dif; i++) {
                result = "0" + temp2;
            }
            result = temp + result;
            System.out.println("Resto: "+temp2);
        } else if (accountInt < value.length()){
            String temp = value.substring(0, groupInt);
            System.out.println("Grupo: "+temp);
            String temp2 = value.substring(groupInt, value.length());
            System.out.println("Cuenta: "+temp2);
            int dif = temp2.length() - (accountInt - groupInt);
            temp2 = temp2.substring(0, dif);
            System.out.println("Resto: "+temp2);
            String temp3 = "";
            for (int i = 0; i < temp2.length(); i++) {
                temp3 = "0" + temp3;
            }
            System.out.println("Resto: "+temp3);
            if (temp2.equals(temp3)){
                dif = 0;
                temp2 = value.substring(groupInt, value.length());
                dif = temp2.length() - (accountInt - groupInt);
                System.out.println("Diferencia: "+dif);
                temp2 = temp2.substring(dif, temp2.length());
                System.out.println("Resto: "+temp2);
                result = temp + temp2;
            } else {
                MyAlert alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Error en el formato de la cuenta", "La cuenta no cumple con el formato requerido");
            }
        }
        System.out.println("Result: " + result);
        return result;
    }

    public String format2digits6(String table, String value) {
        String result = "";
        connectionController = ConnectionController.getConectionController();
        if (value.isEmpty()) {
            String query = "SELECT MAX(CAST(RIGHT(num, 6) AS INT)) AS LAST_NUM FROM " + table;
            System.out.println(connectionController);
            ResultSet rs = connectionController.getDataQuery(query);
            try {
                while (rs.next()) {
                    int temp = rs.getInt("LAST_NUM");
                    if (last_num == 0){
                        last_num = temp + 1;
                    } else {
                        last_num++;
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

            String temp = connectionController.getExerciseDestination();
            temp = temp.substring(2, 4);
            result = temp + "/" + format6digits(String.valueOf(last_num));
        } else {
            String temp = connectionController.getExerciseDestination();
            temp = temp.substring(2, 4);
            result = temp + "/" + format6digits(value);
        }
        

        
        System.out.println("Result: " + result);
        return result;
    }
}
