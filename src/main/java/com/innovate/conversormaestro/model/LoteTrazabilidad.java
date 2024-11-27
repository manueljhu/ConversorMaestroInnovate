package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;

public class LoteTrazabilidad {

    private String lot = "";
    private String art = "";
    private float pais = 1.0f;
    private float com = 0.000000f;
    private float ven = 0.000000f;
    private String pro = "";
    private String cad = "NULL";
    private float cos = 0.000000f;
    private String cosact = "";
    private String ffa = "NULL";
    private int alm = 1;
    private String v01 = "";
    private String v02 = "";
    private String v03 = "";
    private String v04 = "";
    private String v05 = "";
    private String v06 = "";
    private String v07 = "";
    private String v08 = "";
    private String v09 = "";
    private String v10 = "";
    private String v11 = "";
    private String v12 = "";

    private float dis_cac = 0.000000f;
    private float dis_cav = 0.000000f;
    private float dis_pic = 0.000000f;
    private float dis_piv = 0.000000f;
    private String dis_tra = "K";

    public String getLot() {
        return lot;
    }

    public String getArt() {
        return art;
    }

    public float getPais() {
        return pais;
    }

    public float getCom() {
        return com;
    }

    public float getVen() {
        return ven;
    }

    public String getPro() {
        return pro;
    }

    public String getCad() {
        return cad;
    }

    public float getCos() {
        return cos;
    }

    public String getCosact() {
        return cosact;
    }

    public String getFfa() {
        return ffa;
    }

    public int getAlm() {
        return alm;
    }

    public String getV01() {
        return v01;
    }

    public String getV02() {
        return v02;
    }

    public String getV03() {
        return v03;
    }

    public String getV04() {
        return v04;
    }

    public String getV05() {
        return v05;
    }

    public String getV06() {
        return v06;
    }

    public String getV07() {
        return v07;
    }

    public String getV08() {
        return v08;
    }

    public String getV09() {
        return v09;
    }

    public String getV10() {
        return v10;
    }

    public String getV11() {
        return v11;
    }

    public String getV12() {
        return v12;
    }

    public float getDis_cac() {
        return dis_cac;
    }

    public float getDis_cav() {
        return dis_cav;
    }

    public float getDis_pic() {
        return dis_pic;
    }

    public float getDis_piv() {
        return dis_piv;
    }

    public String getDis_tra() {
        return dis_tra;
    }

    public void setLot(String lot) {
        if (lot.length() > 50) {
            this.lot = lot.trim().substring(0, 50).replace("'", "");
        } else {
            this.lot = lot.replace("'", "");
        }
    }

    public void setArt(String art) {
        if (art.length() > 25) {
            this.art = art.trim().substring(0, 25).replace("'", "");
        } else {
            this.art = art.replace("'", "");
        }
    }

    public void setPais(float pais) {
        this.pais = pais;
    }

    public void setCom(float com) {
        this.com = com;
    }

    public void setVen(float ven) {
        this.ven = ven;
    }

    public void setPro(String pro) {
        if (pro.length() > 6) {
            this.pro = pro.trim().substring(0, 6).replace("'", "");
        } else {
            this.pro = pro.replace("'", "");
        }
    }

    public void setCad(String cad) {
        if (cad == null || cad.equals("NULL")) {
            this.cad = "NULL";
        } else {
            this.cad = "'" + cad + "'";
        }
    }

    public void setCos(float cos) {
        this.cos = cos;
    }

    public void setCosact(String cosact) {
        if (cosact.length() > 1) {
            this.cosact = cosact.trim().substring(0, 1).replace("'", "");
        } else {
            this.cosact = cosact.replace("'", "");
        }
    }

    public void setFfa(String ffa) {
        if (ffa == null || ffa.equals("NULL")) {
            this.ffa = "NULL";
        } else {
            this.ffa = "'" + ffa + "'";
        }
    }

    public void setAlm(int alm) {
        this.alm = alm;
    }

    public void setV01(String v01) {
        if (v01.length() > 50) {
            this.v01 = v01.trim().substring(0, 50).replace("'", "");
        } else {
            this.v01 = v01.replace("'", "");
        }
    }

    public void setV02(String v02) {
        if (v02.length() > 50) {
            this.v02 = v02.trim().substring(0, 50).replace("'", "");
        } else {
            this.v02 = v02.replace("'", "");
        }
    }

    public void setV03(String v03) {
        if (v03.length() > 50) {
            this.v03 = v03.trim().substring(0, 50).replace("'", "");
        } else {
            this.v03 = v03.replace("'", "");
        }
    }

    public void setV04(String v04) {
        if (v04.length() > 50) {
            this.v04 = v04.trim().substring(0, 50).replace("'", "");
        } else {
            this.v04 = v04.replace("'", "");
        }
    }

    public void setV05(String v05) {
        if (v05.length() > 50) {
            this.v05 = v05.trim().substring(0, 50).replace("'", "");
        } else {
            this.v05 = v05.replace("'", "");
        }
    }

    public void setV06(String v06) {
        if (v06.length() > 50) {
            this.v06 = v06.trim().substring(0, 50).replace("'", "");
        } else {
            this.v06 = v06.replace("'", "");
        }
    }

    public void setV07(String v07) {
        if (v07.length() > 50) {
            this.v07 = v07.trim().substring(0, 50).replace("'", "");
        } else {
            this.v07 = v07.replace("'", "");
        }
    }

    public void setV08(String v08) {
        if (v08.length() > 50) {
            this.v08 = v08.trim().substring(0, 50).replace("'", "");
        } else {
            this.v08 = v08.replace("'", "");
        }
    }

    public void setV09(String v09) {
        if (v09.length() > 50) {
            this.v09 = v09.trim().substring(0, 50).replace("'", "");
        } else {
            this.v09 = v09.replace("'", "");
        }
    }

    public void setV10(String v10) {
        if (v10.length() > 50) {
            this.v10 = v10.trim().substring(0, 50).replace("'", "");
        } else {
            this.v10 = v10.replace("'", "");
        }
    }

    public void setV11(String v11) {
        if (v11.length() > 50) {
            this.v11 = v11.trim().substring(0, 50).replace("'", "");
        } else {
            this.v11 = v11.replace("'", "");
        }
    }

    public void setV12(String v12) {
        if (v12.length() > 50) {
            this.v12 = v12.trim().substring(0, 50).replace("'", "");
        } else {
            this.v12 = v12.replace("'", "");
        }
    }

    public void setDis_cac(float dis_cac) {
        this.dis_cac = dis_cac;
    }

    public void setDis_cav(float dis_cav) {
        this.dis_cav = dis_cav;
    }

    public void setDis_pic(float dis_pic) {
        this.dis_pic = dis_pic;
    }

    public void setDis_piv(float dis_piv) {
        this.dis_piv = dis_piv;
    }

    public void setDis_tra(String dis_tra) {
        if (dis_tra.length() > 1) {
            this.dis_tra = dis_tra.trim().substring(0, 1).replace("'", "");
        } else {
            this.dis_tra = dis_tra.replace("'", "");
        }
    }

    @Override
    public String toString() {
        String type = "";
        String GPVersion = "";
        ConnectionController connectionController = ConnectionController.getConectionController();
        if (connectionController.getSourceTab().equals("SQL")) {
            SQLController sqlController = SQLController.getSQLController();
            type = sqlController.getTypeTransfer();
        } else if (connectionController.getSourceTab().equals("DBF")) {
            DBFController dbfController = DBFController.getDBFController();
            type = dbfController.getTypeTransfer();
        } else if (connectionController.getSourceTab().equals("Excel")) {
            ExcelController excelController = ExcelController.getExcelController();
            type = excelController.getTypeTransfer();
        }

        GPVersion = connectionController.getGPVersionDestination();

        if (type.equals("Insert")) {
            if (GPVersion.equals("Distribucion")) {
                return toInsertDis();
            } else {
                return toInsert();
            }
        } else if (type.equals("Update")) {
            if (GPVersion.equals("Distribucion")) {
                return toUpdateDis();
            } else {
                return toUpdate();
            }
        } else {
            return "";
        }
    }

    public String toInsert() {
        return "INSERT INTO TABLOT (lot, art, pais, com, ven, pro, cad, cos, cosact, ffa,"
                + "alm, v01, v02, v03, v04, v05, v06, v07, v08, v09, v10, v11, v12"
                + ") VALUES ('" + lot + "', '" + art + "', " + pais + ", "
                + com + ", " + ven + ", '" + pro + "', " + cad + ", " + cos + ", '" + cosact + "', "
                + ffa + ", " + alm + ", '" + v01 + "', '" + v02 + "', '" + v03 + "', '" + v04 + "', '"
                + v05 + "', '" + v06 + "', '" + v07 + "', '" + v08 + "', '" + v09 + "', '" + v10 + "', '"
                + v11 + "', '" + v12 + "')";
    }

    public String toInsertDis() {
        return "INSERT INTO TABLOT (lot, art, pais, com, ven, pro, cad, cos, cosact, ffa,"
                + "alm, v01, v02, v03, v04, v05, v06, v07, v08, v09, v10, v11, v12, dis_cac,"
                + "dis_cav, dis_pic, dis_piv, dis_tra) VALUES ('" + lot + "', '" + art + "', " + pais + ", "
                + com + ", " + ven + ", '" + pro + "', " + cad + ", " + cos + ", '" + cosact + "', "
                + ffa + ", " + alm + ", '" + v01 + "', '" + v02 + "', '" + v03 + "', '" + v04 + "', '"
                + v05 + "', '" + v06 + "', '" + v07 + "', '" + v08 + "', '" + v09 + "', '" + v10 + "', '"
                + v11 + "', '" + v12 + "', " + dis_cac + ", " + dis_cav + ", " + dis_pic + ", " + dis_piv + ", '"
                + dis_tra + "')";
    }

    public String toUpdate() {
        return "UPDATE TABLOT SET lot='" + lot + "', art='" + art + "', pais=" + pais + ", com=" + com + ", ven=" + ven
                + ", pro='" + pro + "', cad=" + cad + ", cos=" + cos + ", cosact='" + cosact + "', ffa=" + ffa
                + ", alm=" + alm + ", v01='" + v01 + "', v02='" + v02 + "', v03='" + v03 + "', v04='" + v04 + "', v05='"
                + v05 + "', v06='" + v06 + "', v07='" + v07 + "', v08='" + v08 + "', v09='" + v09 + "', v10='" + v10
                + "', v11='" + v11 + "', v12='" + v12 + "'";
    }

    public String toUpdateDis() {
        return "UPDATE TABLOT SET lot='" + lot + "', art='" + art + "', pais=" + pais + ", com=" + com + ", ven=" + ven
                + ", pro='" + pro + "', cad=" + cad + ", cos=" + cos + ", cosact='" + cosact + "', ffa=" + ffa
                + ", alm=" + alm + ", v01='" + v01 + "', v02='" + v02 + "', v03='" + v03 + "', v04='" + v04 + "', v05='"
                + v05 + "', v06='" + v06 + "', v07='" + v07 + "', v08='" + v08 + "', v09='" + v09 + "', v10='" + v10
                + "', v11='" + v11 + "', v12='" + v12 + "', dis_cac=" + dis_cac + ", dis_cav=" + dis_cav + ", dis_pic="
                + dis_pic + ", dis_piv=" + dis_piv + ", dis_tra='" + dis_tra + "'";
    }
}