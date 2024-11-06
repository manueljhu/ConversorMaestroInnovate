package com.innovate.conversormaestro.utils;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.innovate.conversormaestro.datasource.ConnectionController;

import javafx.scene.control.Alert.AlertType;

public class FormatUtils {
    MyAlert alert;
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
        // System.out.println("Result: " + result);
        return result;
    }

    public String formatDigitGroupAccount(String group, String account, String value) {
        String result = "";
        int groupInt = Integer.parseInt(group);
        int accountInt = Integer.parseInt(account);
        // System.out.println("Value" + value.length());
        if (accountInt == value.length()) {
            result = value;
        } else if (accountInt > value.length()) {
            String temp = value.substring(0, groupInt);
            String temp2 = value.substring(groupInt, value.length());
            int dif = accountInt - groupInt - temp2.length();
            for (int i = 0; i < dif; i++) {
                result = "0" + temp2;
            }
            result = temp + result;
            // System.out.println("Resto: " + temp2);
        } else if (accountInt < value.length()) {
            String temp = value.substring(0, groupInt);
            // System.out.println("Grupo: " + temp);
            String temp2 = value.substring(groupInt, value.length());
            // System.out.println("Cuenta: " + temp2);
            int dif = temp2.length() - (accountInt - groupInt);
            temp2 = temp2.substring(0, dif);
            // System.out.println("Resto: " + temp2);
            String temp3 = "";
            for (int i = 0; i < temp2.length(); i++) {
                temp3 = "0" + temp3;
            }
            // System.out.println("Resto: " + temp3);
            if (temp2.equals(temp3)) {
                dif = 0;
                temp2 = value.substring(groupInt, value.length());
                dif = temp2.length() - (accountInt - groupInt);
                // System.out.println("Diferencia: " + dif);
                temp2 = temp2.substring(dif, temp2.length());
                // System.out.println("Resto: " + temp2);
                result = temp + temp2;
            } else {
                alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Error en el formato de la cuenta",
                        "La cuenta no cumple con el formato requerido");
            }
        }
        // System.out.println("Result: " + result);
        return result;
    }

    public String format2digits6(String table, String value) {
        String result = "";
        int rs = 0;
        connectionController = ConnectionController.getConectionController();
        if (value.isEmpty()) {
            String query = "SELECT MAX(CAST(RIGHT(num, 6) AS INT)) AS LAST_NUM FROM " + table;

            rs = connectionController.getDataQuery(query);

            // System.out.println("Last rs: " + rs);
            if (last_num == 0) {
                last_num = rs + 1;
            } else {
                last_num++;
            }

            String temp = connectionController.getExerciseDestination();
            temp = temp.substring(2, 4);
            result = temp + "/" + format6digits(String.valueOf(last_num));
        } else {
            String temp = connectionController.getExerciseDestination();
            temp = temp.substring(2, 4);
            result = temp + "/" + format6digits(value);
        }

        // System.out.println("Result: " + result);
        return result;
    }

    public String formatDigitFacEmi(String group, String account, String value) {
        String result = "";
        int groupInt = Integer.parseInt(group);
        int accountInt = Integer.parseInt(account);

        if (accountInt == value.length()) {
            result = value;
        } else if (accountInt > value.length()) {
            if (groupInt > value.length()) {
                String temp = "43";
                String temp2 = value;
                int dif = groupInt - temp.length();
                for (int i = 0; i < dif; i++) {
                    temp = temp + "0";
                }
                int dif2 = accountInt - groupInt - temp2.length();
                for (int i = 0; i < dif2; i++) {
                    temp2 = "0" + temp2;
                }
                result = temp + temp2;
                // System.out.println("Result: " + result);
            } else if (groupInt < value.length()) {
                String temp = "43";
                String temp2 = value;
                int dif = groupInt - temp.length();
                for (int i = 0; i < dif; i++) {
                    temp = temp + "0";
                }
                int dif2 = accountInt - groupInt - temp2.length();
                for (int i = 0; i < dif2; i++) {
                    temp2 = "0" + temp2;
                }
                result = temp + temp2;
                // System.out.println("Result: " + result);
            }
        } else if (accountInt < value.length()) {
            String temp = value.substring(0, groupInt);
            // System.out.println("Grupo: " + temp);
            String temp2 = value.substring(groupInt, value.length());
            // System.out.println("Cuenta: " + temp2);
            int dif = temp2.length() - (accountInt - groupInt);
            temp2 = temp2.substring(0, dif);
            // System.out.println("Resto: " + temp2);
            String temp3 = "";
            for (int i = 0; i < temp2.length(); i++) {
                temp3 = "0" + temp3;
            }
            // System.out.println("Resto: " + temp3);
            if (temp2.equals(temp3)) {
                dif = 0;
                temp2 = value.substring(groupInt, value.length());
                dif = temp2.length() - (accountInt - groupInt);
                // System.out.println("Diferencia: " + dif);
                temp2 = temp2.substring(dif, temp2.length());
                // System.out.println("Resto: " + temp2);
                result = temp + temp2;
            } else {
                alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Error en el formato de la cuenta",
                        "La cuenta no cumple con el formato requerido");
            }
        }
        // System.out.println("Result: " + result);
        return result;
    }

    public String formatDigitFacRec(String group, String account, String value) {
        String result = "";
        int groupInt = Integer.parseInt(group);
        int accountInt = Integer.parseInt(account);

        if (accountInt == value.length()) {
            result = value;
        } else if (accountInt > value.length()) {
            if (groupInt > value.length()) {
                String temp = "40";
                String temp2 = value;
                int dif = groupInt - temp.length();
                for (int i = 0; i < dif; i++) {
                    temp = temp + "0";
                }
                int dif2 = accountInt - groupInt - temp2.length();
                for (int i = 0; i < dif2; i++) {
                    temp2 = "0" + temp2;
                }
                result = temp + temp2;
                // System.out.println("Result: " + result);
            } else if (groupInt < value.length()) {
                String temp = "40";
                String temp2 = value;
                int dif = groupInt - temp.length();
                for (int i = 0; i < dif; i++) {
                    temp = temp + "0";
                }
                int dif2 = accountInt - groupInt - temp2.length();
                for (int i = 0; i < dif2; i++) {
                    temp2 = "0" + temp2;
                }
                result = temp + temp2;
                // System.out.println("Result: " + result);
            }
        } else if (accountInt < value.length()) {
            String temp = value.substring(0, groupInt);
            // System.out.println("Grupo: " + temp);
            String temp2 = value.substring(groupInt, value.length());
            // System.out.println("Cuenta: " + temp2);
            int dif = temp2.length() - (accountInt - groupInt);
            temp2 = temp2.substring(0, dif);
            // System.out.println("Resto: " + temp2);
            String temp3 = "";
            for (int i = 0; i < temp2.length(); i++) {
                temp3 = "0" + temp3;
            }
            // System.out.println("Resto: " + temp3);
            if (temp2.equals(temp3)) {
                dif = 0;
                temp2 = value.substring(groupInt, value.length());
                dif = temp2.length() - (accountInt - groupInt);
                // System.out.println("Diferencia: " + dif);
                temp2 = temp2.substring(dif, temp2.length());
                // System.out.println("Resto: " + temp2);
                result = temp + temp2;
            } else {
                alert = new MyAlert();
                alert.showAlert(AlertType.ERROR, "Error en el formato de la cuenta",
                        "La cuenta no cumple con el formato requerido");
            }
        }
        // System.out.println("Result: " + result);
        return result;
    }

    public String formatDigitPlanCon(String group, String account, String value) {
        String result = "";
        int groupInt = Integer.parseInt(group);
        int accountInt = Integer.parseInt(account);

        if (value.length() <= groupInt) {
            result = value;
        } else if (groupInt < value.length()) {
            if (accountInt == value.length()) {
                result = value;
            } else if (accountInt > value.length()) {
                String temp = value.substring(0, groupInt);
                String temp2 = value.substring(groupInt, value.length());
                int dif = accountInt - groupInt - temp2.length();
                ;
                for (int i = 0; i < dif; i++) {
                    temp2 = "0" + temp2;
                }
                result = temp + temp2;
                // System.out.println("Result: " + result);
            } else if (accountInt < value.length()) {
                String temp = value.substring(0, groupInt);
                String temp2 = value.substring(groupInt, value.length());
                int dif = temp2.length() - (accountInt - groupInt);
                temp2 = temp2.substring(0, dif);
                // System.out.println("Resto: " + temp2);
                String temp3 = "";
                for (int i = 0; i < temp2.length(); i++) {
                    temp3 = "0" + temp3;
                }
                // System.out.println("Resto: " + temp3);
                if (temp2.equals(temp3)) {
                    dif = 0;
                    temp2 = value.substring(groupInt, value.length());
                    dif = temp2.length() - (accountInt - groupInt);
                    // System.out.println("Diferencia: " + dif);
                    temp2 = temp2.substring(dif, temp2.length());
                    // System.out.println("Resto: " + temp2);
                    result = temp + temp2;
                } else {
                    alert = new MyAlert();
                    alert.showAlert(AlertType.ERROR, "Error en el formato de la cuenta",
                            "La cuenta no cumple con el formato requerido");
                }
            }
        }
        // System.out.println("Result: " + result);
        return result;
    }

    public String formatEfectFac(String factura, String type) {
        String result = "0";
        /*
         * String year = Date.valueOf(java.time.LocalDate.now()).toString().substring(2,
         * 4);
         */
        String year = "23";
        // System.out.println("Year: " + year);
        if (factura.length() == 6) {
            result = year + "/" + factura;
        } else if (factura.length() < 6) {
            int dif = 6 - factura.length();
            for (int i = 1; i < dif; i++) {
                result = "0" + result;
            }
            result = year + "/" + result + factura;
        } else if (factura.length() > 6) {
            int temp = factura.length() - 6;
            result = year + "/" + factura.substring(temp, factura.length());
        }
        if (type.equals("E")) {
            result = "E" + result;
        } else if (type.equals("R")) {
            result = "R" + result;
        }
        // System.out.println("Result: " + result);
        return result;
    }

    public String formatEfectCon(String factura, String type, String source, int rowint) {
        // System.out.println("Factura: " + factura + "Type: " + type + "Source: " + source + "rowint: " + rowint);
        String result = "0";
        List<Integer> temp = null;
        int pos = 1;

        switch (source) {
            case "SQL":

                break;
            case "DBF":

                break;
            case "Excel":
                ExcelUtils excelUtils = new ExcelUtils();
                temp = excelUtils.buscarDatosIgualesEnColumna("fac", factura);
                // System.out.println("Fac: " + temp);
                break;
            default:
                break;
        }

        String fac = formatEfectFac(factura, type);
        // System.out.println("Fac: " + fac);

        if (temp != null) {
            if (temp.size() > 1) {
                for (int i = 0; i < temp.size(); i++) {
                    if (temp.get(i) == rowint) {
                        pos = i + 1;
                        break;
                    }
                }
            } 
        }

        int rs = 0;
        connectionController = ConnectionController.getConectionController();
        String query = "SELECT COUNT(*) AS LAST_NUM FROM EFECTO WHERE fac = '" + fac + "'";
        // System.out.println("Query: " + query);

        rs = connectionController.getDataQuery(query);

        if (rs == 0 && pos == 1) {
            result = "NºFAC. " + fac + "/01";
        } else {
            int temp2 = rs + pos;
            if (temp2 < 10) {
                result = "NºFAC. " + fac + "/0" + temp2;
            } else {
                result = "NºFAC. " + fac + "/" + temp2;
            }
        }

        // System.out.println("Result: " + result);
        return result;
    }

    public int formatUpdate(String table){
        int result = 1;
        connectionController = ConnectionController.getConectionController();
        String query = "SELECT TOP 1 id AS LAST_NUM FROM " + table + " WHERE nom = ''";
        result = connectionController.getDataQuery(query);
        // System.out.println("RS: " + result);
        return result;
    }
}
