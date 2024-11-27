package com.innovate.conversormaestro.utils;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Locale;
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
        value = formatToDBF(value);
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

    public String formatToDBF(String value) {
        if (value.contains(".")) {
            int index = value.indexOf(".");
            value = value.substring(0, index);
        }

        return value;
    }

    public String formatDateDBF(String value) {
        try {
            // Definir los formatos de entrada
            DateTimeFormatter formatoDeEntrada1 = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);
            DateTimeFormatter formatoDeEntrada2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Intentar analizar con el primer formato
            try {
                ZonedDateTime zonedDateTime = ZonedDateTime.parse(value, formatoDeEntrada1);
                LocalDate localDate = zonedDateTime.toLocalDate();
                DateTimeFormatter formatoDeSalida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String dateString = localDate.format(formatoDeSalida);
                System.out.println(dateString);
                return dateString;
            } catch (DateTimeParseException e) {
                // Si falla, intentar analizar con el segundo formato
                LocalDate localDate = LocalDate.parse(value, formatoDeEntrada2);
                if (localDate == null) {
                    System.out.println(localDate);
                }
                return value; // No cambiar nada si ya está en el formato "dd/MM/yyyy"
            }
        } catch (DateTimeParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }

    public String formatDigitGroupAccount(String group, String account, String value) {
        String result = "";
        int groupInt = Integer.parseInt(group);
        int accountInt = Integer.parseInt(account);
        // System.out.println("Value" + value.length());
        value = formatToDBF(value);
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
        } else {
            result = "";
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
        System.out.println("Factura: " + factura + ", Type: " + type + ", Source: " +
                source + ", rowint: " + rowint);
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
                System.out.println("Fac: " + temp);
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

    public int formatUpdate(String table) {
        int result = 1;
        connectionController = ConnectionController.getConectionController();
        String query = "SELECT TOP 1 id AS LAST_NUM FROM " + table + " WHERE nom = ''";
        result = connectionController.getDataQuery(query);
        // System.out.println("RS: " + result);
        return result;
    }

    public String tableQueryDestination(String tablename) {
        connectionController = ConnectionController.getConectionController();
        String result = "";
        switch (tablename) {
            case "Agentes":
                result = "TRUNCATE TABLE AGENTG";
                break;
            case "Almacenes":
                result = "UPDATE ALMACE SET nom = '', ser = '', se2 = '', age = ''";
                break;
            case "Articulos":
                result = "TRUNCATE TABLE ARTICU";
                break;
            case "Asientos":
                String exercise = connectionController.getExerciseDestination();
                exercise = exercise.substring(exercise.length() - 2);
                System.out.println("Exercise: " + exercise);
                result = "TRUNCATE TABLE APUN" + exercise;
                System.out.println("Result: " + result);
                break;
            case "Bancos de la empresa":
                result = "TRUNCATE TABLE BANCOS";
                break;
            case "Clientes":
                result = "TRUNCATE TABLE CLIENT";
                break;
            case "Contactos de clientes":
                result = "DELETE FROM CONTAC WHERE cla = 'CL'";
                break;
            case "Contactos de proveedores":
                result = "DELETE FROM CONTAC WHERE cla = 'PR'";
                break;
            case "Datos bancarios clientes":
                result = "DELETE FROM DATBAN WHERE cla = 'CL'";
                break;
            case "Datos bancarios proveedores":
                result = "DELETE FROM DATBAN WHERE cla = 'PR'";
                break;
            case "Direcciones de clientes":
                result = "DELETE FROM DIRECC WHERE cla = 'CL'";
                break;
            case "Direcciones de proveedores":
                result = "DELETE FROM DIRECC WHERE cla = 'PR'";
                break;
            case "Existencias":
                result = "TRUNCATE TABLE ALMA" + connectionController.getWarehouseDestination();
                break;
            case "Facturas emitidas":
                result = "TRUNCATE TABLE FACEMI";
                break;
            case "Facturas recibidas":
                result = "TRUNCATE TABLE FACREC";
                break;
            case "Familias":
                result = "TRUNCATE TABLE FAMILI";
                break;
            case "Formas de pago":
                result = "UPDATE FORPAG SET nom = '', di1 = 0, di2 = 0, dir = 0, npa = 0, mes = 'S', vto = 1, inc = 0, cad = 0, "
                        +
                        "cob = 'N', car = 0, porcobdir = 100.00, inclib = 'N', reppro = 'S', cuecobdir = '' FROM FORPAG WHERE id > 7";
                break;
            case "Lotes de Trazabilidad":
                result = "TRUNCATE TABLE TABLOT";
                break;
            case "Marcas articulo":
                result = "TRUNCATE TABLE MARART";
                break;
            case "Plan contable":
                result = "TRUNCATE TABLE CUENTA";
                break;
            case "Previsiones de cobro":
                result = "DELETE FROM EFECTO WHERE tip = 'C'";
                break;
            case "Previsiones de pago":
                result = "DELETE FROM EFECTO WHERE tip = 'P'";
                break;
            case "Proveedores":
                result = "TRUNCATE TABLE PROVEE";
                break;
            case "Subfamilias":
                result = "TRUNCATE TABLE SUBFAM";
                break;
            case "Vehiculos":
                result = "TRUNCATE TABLE TAL_VEHCLI";
                break;
        }
        return result;
    }
}
