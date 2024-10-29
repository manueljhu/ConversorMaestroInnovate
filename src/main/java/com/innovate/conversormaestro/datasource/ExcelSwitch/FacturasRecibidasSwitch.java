package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.FacturaRecibida;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class FacturasRecibidasSwitch {
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<FacturaRecibida> facturasRecibidas;
    private FormatUtils formatUtils = new FormatUtils();

    public void FacturasRecibidas(ArrayList<Relacion> relaciones) {
        int nFilas = excelUtils.devuelveNFilasExcel();

        facturasRecibidas = new ArrayList<FacturaRecibida>();
        FacturaRecibida facturaRecibida;

        for (int index = 0; index < nFilas; index++) {
            facturaRecibida = new FacturaRecibida();
            for (int j = 0; j < relaciones.size(); j++) {
                switch(relaciones.get(j).getCampoDestino()){
                    case "num":
                        facturaRecibida.setNum(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fea":
                        facturaRecibida.setFea(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "doc":
                        facturaRecibida.setDoc(formatUtils.format6digits(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nuf":
                        facturaRecibida.setNuf(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fee":
                        facturaRecibida.setFee(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "gas":
                        facturaRecibida.setGas(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cue":
                        facturaRecibida.setCue(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "li1":
                        facturaRecibida.setLi1(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "li2":
                        facturaRecibida.setLi2(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "dt1":
                        facturaRecibida.setDt1(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "dt2":
                        facturaRecibida.setDt2(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fuc":
                        facturaRecibida.setFuc(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "forpag":
                        facturaRecibida.setforpag(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "fin":
                        facturaRecibida.setFin(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "alm":
                        facturaRecibida.setAlm(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "com":
                        facturaRecibida.setCom(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        facturaRecibida.setNom(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nif":
                        facturaRecibida.setNif(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tra":
                        facturaRecibida.setTra(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ba1eu":
                        facturaRecibida.setBa1Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv1eu":
                        facturaRecibida.setIv1Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re1eu":
                        facturaRecibida.setRe1Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba2eu":
                        facturaRecibida.setBa2Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv2eu":
                        facturaRecibida.setIv2Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re2eu":
                        facturaRecibida.setRe2Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba3eu":
                        facturaRecibida.setBa3Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv3eu":
                        facturaRecibida.setIv3Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re3eu":
                        facturaRecibida.setRe3Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba4eu":
                        facturaRecibida.setBa4Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv4eu":
                        facturaRecibida.setIv4Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re4eu":
                        facturaRecibida.setRe4Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ba5eu":
                        facturaRecibida.setBa5Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iv5eu":
                        facturaRecibida.setIv5Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "re5eu":
                        facturaRecibida.setRe5Eu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "exeeu":
                        facturaRecibida.setExeeu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ulceu":
                        facturaRecibida.setUlceu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "toceu":
                        facturaRecibida.setToceu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "enteu":
                        facturaRecibida.setEnteu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imceu":
                        facturaRecibida.setImceu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "imreu":
                        facturaRecibida.setImreu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tre":
                        facturaRecibida.setTre(Integer.parseInt(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "pre":
                        facturaRecibida.setPre(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ireeu":
                        facturaRecibida.setIreeu(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "ivainc":
                        facturaRecibida.setIvainc(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "entped":
                        facturaRecibida.setEntped(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tip":
                        facturaRecibida.setTip(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aut":
                        facturaRecibida.setAut(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "negativa":
                        facturaRecibida.setNegativa(Integer.parseInt(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecope":
                        facturaRecibida.setFecope(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303":
                        facturaRecibida.setMod303(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303a":
                        facturaRecibida.setMod303A(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303b":
                        facturaRecibida.setMod303B(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod303c":
                        facturaRecibida.setMod303C(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "mod347":
                        facturaRecibida.setMod347(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "usuario_bloqueo":
                        facturaRecibida.setUsuario_Bloqueo(Integer.parseInt(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec_deb_pag":
                        facturaRecibida.setRec_Deb_Pag(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rec_incluir":
                        facturaRecibida.setRec_Incluir(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rec_antes_dto":
                        facturaRecibida.setRec_Antes_Dto(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "rec_iva_inc":
                        facturaRecibida.setRec_Iva_Inc(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "moneda":
                        facturaRecibida.setMoneda(Integer.parseInt(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "cotiza":
                        facturaRecibida.setCotiza(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "basmon":
                        facturaRecibida.setBasmon(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "totmon":
                        facturaRecibida.setTotmon(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "entmon":
                        facturaRecibida.setEntmon(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "obs_doc":
                        facturaRecibida.setObs_Doc(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "recargo":
                        facturaRecibida.setRecargo(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "diasmax":
                        facturaRecibida.setDiasmax(Integer.parseInt(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "fecini":
                        facturaRecibida.setFecini(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "suplidos":
                        facturaRecibida.setSuplidos(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva1":
                        facturaRecibida.setIva1(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva2":
                        facturaRecibida.setIva2(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva3":
                        facturaRecibida.setIva3(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva4":
                        facturaRecibida.setIva4(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "iva5":
                        facturaRecibida.setIva5(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec1":
                        facturaRecibida.setRec1(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec2":
                        facturaRecibida.setRec2(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec3":
                        facturaRecibida.setRec3(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec4":
                        facturaRecibida.setRec4(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "rec5":
                        facturaRecibida.setRec5(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "tipivaok":
                        facturaRecibida.setTipivaok(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "exento":
                        facturaRecibida.setExento(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "cri_caja":
                        facturaRecibida.setCri_Caja(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ded_cie":
                        facturaRecibida.setDed_Cie(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiest":
                        facturaRecibida.setSiiest(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiact":
                        facturaRecibida.setSiiact(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitipfra":
                        facturaRecibida.setSiitipfra(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifrarec":
                        facturaRecibida.setSiifrarec(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siitiprec":
                        facturaRecibida.setSiitiprec(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesfra":
                        facturaRecibida.setSiidesfra(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinifemi":
                        facturaRecibida.setSiinifemi(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siicuoded":
                        facturaRecibida.setSiicuoded(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siifecper":
                        facturaRecibida.setSiifecper(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatrec":
                        facturaRecibida.setSiidatrec(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatagr":
                        facturaRecibida.setSiidatagr(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siibasrec":
                        facturaRecibida.setSiibasrec(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siicuorec":
                        facturaRecibida.setSiicuorec(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siirecrec":
                        facturaRecibida.setSiirecrec(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siibascos":
                        facturaRecibida.setSiibascos(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "siiiss":
                        facturaRecibida.setSiiiss(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidatdes":
                        facturaRecibida.setSiidatdes(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifrarec1":
                        facturaRecibida.setSiifrarec1(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifrarec2":
                        facturaRecibida.setSiifrarec2(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinumacu":
                        facturaRecibida.setSiinumacu(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinumresf":
                        facturaRecibida.setSiinumresf(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siidesman":
                        facturaRecibida.setSiidesman(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "patron":
                        facturaRecibida.setPatron(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siirefext":
                        facturaRecibida.setSiirefext(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinomensu":
                        facturaRecibida.setSiinomensu(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siinifensu":
                        facturaRecibida.setSiinifensu(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siifraiden":
                        facturaRecibida.setSiifraiden(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siimacro":
                        facturaRecibida.setSiimacro(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "siiregprev":
                        facturaRecibida.setSiiregprev(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeattipfac":
                        facturaRecibida.setAeattipfac(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeattipgas":
                        facturaRecibida.setAeattipgas(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "aeatimpcon":
                        facturaRecibida.setAeatimpcon(Float.parseFloat(excelUtils.devuelveValorCelda(index, relaciones.get(j).getCampoOrigen())));
                        break;
                }
            }
            System.out.println(facturaRecibida);
            facturasRecibidas.add(facturaRecibida);
        }
    }
}
