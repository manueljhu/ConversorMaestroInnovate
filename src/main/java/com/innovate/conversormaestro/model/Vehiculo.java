package com.innovate.conversormaestro.model;

import com.innovate.conversormaestro.datasource.ConnectionController;
import com.innovate.conversormaestro.datasource.DBFController;
import com.innovate.conversormaestro.datasource.ExcelController;
import com.innovate.conversormaestro.datasource.SQLController;

public class Vehiculo {

    private String mat = "";
    private String mar = "";
    private String mod = "";
    private String anno = "";
    private String motor = "";
    private String bast = "";
    private String col = "";
    private String cha = "";
    private float klm = 0.00f;
    private int tran = 0;
    private int tveh = 0;
    private int tcom = 0;
    private int scom = 0;
    private int tdir = 0;
    private String cli = "";
    private String ase = "";
    private String poli = "";
    private String tseg = "";
    private float fran = 0.000000f;
    private int cro = 0;
    private String obs = "";
    private String fict = "";
    private String compro = "";
    private float compre = 0.000000f;
    private String comtip = "A";
    private String comdoc = "/";
    private String comfec = "NULL";
    private String vencli = "";
    private float venpre = 0.000000f;
    private String ventip = "A";
    private String vendoc = "/";
    private String venfec = "NULL";
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
    private String historia = "";
    private String fec_mat = "NULL";
    private String parti = "N";

    public String getMat() {
        return mat;
    }

    public String getMar() {
        return mar;
    }

    public String getMod() {
        return mod;
    }

    public String getAnno() {
        return anno;
    }

    public String getMotor() {
        return motor;
    }

    public String getBast() {
        return bast;
    }

    public String getCol() {
        return col;
    }

    public String getCha() {
        return cha;
    }

    public float getKlm() {
        return klm;
    }

    public int getTran() {
        return tran;
    }

    public int getTveh() {
        return tveh;
    }

    public int getTcom() {
        return tcom;
    }

    public int getScom() {
        return scom;
    }

    public int getTdir() {
        return tdir;
    }

    public String getCli() {
        return cli;
    }

    public String getAse() {
        return ase;
    }

    public String getPoli() {
        return poli;
    }

    public String getTseg() {
        return tseg;
    }

    public float getFran() {
        return fran;
    }

    public int getCro() {
        return cro;
    }

    public String getObs() {
        return obs;
    }

    public String getFict() {
        return fict;
    }

    public String getCompro() {
        return compro;
    }

    public float getCompre() {
        return compre;
    }

    public String getComtip() {
        return comtip;
    }

    public String getComdoc() {
        return comdoc;
    }

    public String getComfec() {
        return comfec;
    }

    public String getVencli() {
        return vencli;
    }

    public float getVenpre() {
        return venpre;
    }

    public String getVentip() {
        return ventip;
    }

    public String getVendoc() {
        return vendoc;
    }

    public String getVenfec() {
        return venfec;
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

    public String getHistoria() {
        return historia;
    }

    public String getFec_mat() {
        return fec_mat;
    }

    public String getParti() {
        return parti;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public void setMar(String mar) {
        if (mar.length() > 10) {
            this.mar = mar.trim().substring(0, 10).replace("'", "");
        } else {
            this.mar = mar.replace("'", "");
        }
    }

    public void setMod(String mod) {
        if (mod.length() > 50) {
            this.mod = mod.trim().substring(0, 50).replace("'", "");
        } else {
            this.mod = mod.replace("'", "");
        }
    }

    public void setAnno(String anno) {
        if (anno.length() > 50) {
            this.anno = anno.trim().substring(0, 50).replace("'", "");
        } else {
            this.anno = anno.replace("'", "");
        }
    }

    public void setMotor(String motor) {
        if (motor.length() > 30) {
            this.motor = motor.trim().substring(0, 30).replace("'", "");
        } else {
            this.motor = motor.replace("'", "");
        }
    }

    public void setBast(String bast) {
        if (bast.length() > 30) {
            this.bast = bast.trim().substring(0, 30).replace("'", "");
        } else {
            this.bast = bast.replace("'", "");
        }
    }

    public void setCol(String col) {
        if (col.length() > 30) {
            this.col = col.trim().substring(0, 30).replace("'", "");
        } else {
            this.col = col.replace("'", "");
        }
    }

    public void setCha(String cha) {
        if (cha.length() > 30) {
            this.cha = cha.trim().substring(0, 30).replace("'", "");
        } else {
            this.cha = cha.replace("'", "");
        }
    }

    public void setKlm(float klm) {
        this.klm = klm;
    }

    public void setTran(int tran) {
        this.tran = tran;
    }

    public void setTveh(int tveh) {
        this.tveh = tveh;
    }

    public void setTcom(int tcom) {
        this.tcom = tcom;
    }

    public void setScom(int scom) {
        this.scom = scom;
    }

    public void setTdir(int tdir) {
        this.tdir = tdir;
    }

    public void setCli(String cli) {
        if (cli.length() > 6) {
            this.cli = cli.trim().substring(0, 6).replace("'", "");
        } else {
            this.cli = cli.replace("'", "");
        }
    }

    public void setAse(String ase) {
        if (ase.length() > 6) {
            this.ase = ase.trim().substring(0, 6).replace("'", "");
        } else {
            this.ase = ase.replace("'", "");
        }
    }

    public void setPoli(String poli) {
        if (poli.length() > 30) {
            this.poli = poli.trim().substring(0, 30).replace("'", "");
        } else {
            this.poli = poli.replace("'", "");
        }
    }

    public void setTseg(String tseg) {
        if (tseg.length() > 30) {
            this.tseg = tseg.trim().substring(0, 30).replace("'", "");
        } else {
            this.tseg = tseg.replace("'", "");
        }
    }

    public void setFran(float fran) {
        this.fran = fran;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public void setObs(String obs) {
        if (obs.length() > 16) {
            this.obs = obs.trim().substring(0, 16).replace("'", "");
        } else {
            this.obs = obs.replace("'", "");
        }
    }

    public void setFict(String fict) {
        if (fict.length() > 30) {
            this.fict = fict.trim().substring(0, 30).replace("'", "");
        } else {
            this.fict = fict.replace("'", "");
        }
    }

    public void setCompro(String compro) {
        if (compro.length() > 6) {
            this.compro = compro.trim().substring(0, 6).replace("'", "");
        } else {
            this.compro = compro.replace("'", "");
        }
    }

    public void setCompre(float compre) {
        this.compre = compre;
    }

    public void setComtip(String comtip) {
        if (comtip.length() > 1) {
            this.comtip = comtip.trim().substring(0, 1).replace("'", "");
        } else {
            this.comtip = comtip.replace("'", "");
        }
    }

    public void setComdoc(String comdoc) {
        if (comdoc == null || comdoc.equals("NULL")) {
            this.comdoc = "NULL";
        } else {
            this.comdoc = "'" + comdoc + "'";
        }
    }

    public void setComfec(String comfec) {
        if (comfec == null || comfec.equals("NULL")) {
            this.comfec = "NULL";
        } else {
            this.comfec = "'" + comfec + "'";
        }
    }

    public void setVencli(String vencli) {
        if (vencli.length() > 6) {
            this.vencli = vencli.trim().substring(0, 6).replace("'", "");
        } else {
            this.vencli = vencli.replace("'", "");
        }
    }

    public void setVenpre(float venpre) {
        this.venpre = venpre;
    }

    public void setVentip(String ventip) {
        if (ventip.length() > 1) {
            this.ventip = ventip.trim().substring(0, 1).replace("'", "");
        } else {
            this.ventip = ventip.replace("'", "");
        }
    }

    public void setVendoc(String vendoc) {
        if (vendoc.length() > 9) {
            this.vendoc = vendoc.trim().substring(0, 9).replace("'", "");
        } else {
            this.vendoc = vendoc.replace("'", "");
        }
    }

    public void setVenfec(String venfec) {
        if (venfec == null || venfec.equals("NULL")) {
            this.venfec = "NULL";
        } else {
            this.venfec = "'" + venfec + "'";
        }
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

    public void setHistoria(String historia) {
        if (historia.length() > 16) {
            this.historia = historia.trim().substring(0, 16).replace("'", "");
        } else {
            this.historia = historia.replace("'", "");
        }
    }

    public void setFec_mat(String fec_mat) {
        if (fec_mat == null || fec_mat.equals("NULL")) {
            this.fec_mat = "NULL";
        } else {
            this.fec_mat = "'" + fec_mat + "'";
        }
    }

    public void setParti(String parti) {
        if (parti.length() > 1) {
            this.parti = parti.trim().substring(0, 1).replace("'", "");
        } else {
            this.parti = parti.replace("'", "");
        }
    }

    @Override
    public String toString() {
        String type = "";
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

        if (type.equals("Insert")) {
            return toInsert();
        } else if (type.equals("Update")) {
            return toUpdate();
        } else {
            return "";
        }
    }

    public String toInsert() {
        return "INSERT INTO TAL_VEHCLI (mat, mar, mod, anno, motor, bast, col, cha, klm, tran,"
                + "tveh, tcom, scom, tdir, cli, ase, poli, tseg, fran, cro, obs, fict, compro, compre, comtip,"
                + "comdoc, comfec, vencli, venpre, ventip, vendoc, venfec, v01, v02, v03, v04, v05, v06, v07,"
                + "v08, v09, v10, v11, v12, historia, fec_mat, parti) VALUES ('" + mat + "', '" + mar + "', '" + mod
                + "', '" + anno + "', '" + motor + "', '" + bast + "', '" + col + "', '" + cha + "', " + klm + ", "
                + tran + ", " + tveh + ", " + tcom + ", " + scom + ", " + tdir + ", '" + cli + "', '" + ase + "', '"
                + poli + "', '" + tseg + "', " + fran + ", " + cro + ", '" + obs + "', '" + fict + "', '" + compro
                + "', " + compre + ", '" + comtip + "', '" + comdoc + "', " + comfec + ", '" + vencli + "', " + venpre
                + ", '" + ventip + "', '" + vendoc + "', " + venfec + ", '" + v01 + "', '" + v02 + "', '" + v03 + "', '"
                + v04 + "', '" + v05 + "', '" + v06 + "', '" + v07 + "', '" + v08 + "', '" + v09 + "', '" + v10 + "', '"
                + v11 + "', '" + v12 + "', '" + historia + "', " + fec_mat + ", '" + parti + "')";
    }

    public String toUpdate() {
        return "UPDATE TAL_VEHCLI SET mar='" + mar + "', mod='" + mod + "', anno='" + anno + "', motor='" + motor
                + "', bast='" + bast + "', col='" + col + "', cha='" + cha + "', klm=" + klm + ", tran=" + tran
                + ", tveh=" + tveh + ", tcom=" + tcom + ", scom=" + scom + ", tdir=" + tdir + ", cli='" + cli
                + "', ase='" + ase + "', poli='" + poli + "', tseg='" + tseg + "', fran=" + fran + ", cro=" + cro
                + ", obs='" + obs + "', fict='" + fict + "', compro='" + compro + "', compre=" + compre + ", comtip='"
                + comtip + "', comdoc='" + comdoc + "', comfec=" + comfec + ", vencli='" + vencli + "', venpre=" + venpre
                + ", ventip='" + ventip + "', vendoc='" + vendoc + "', venfec=" + venfec + ", v01='" + v01 + "', v02='"
                + v02 + "', v03='" + v03 + "', v04='" + v04 + "', v05='" + v05 + "', v06='" + v06 + "', v07='" + v07
                + "', v08='" + v08 + "', v09='" + v09 + "', v10='" + v10 + "', v11='" + v11 + "', v12='" + v12
                + "', historia='" + historia + "', fec_mat=" + fec_mat + ", parti='" + parti + "' WHERE mat='" + mat + "'";
    }
}
