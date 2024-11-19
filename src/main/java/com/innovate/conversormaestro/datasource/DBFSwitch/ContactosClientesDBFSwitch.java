package com.innovate.conversormaestro.datasource.DBFSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Contacto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.DBFUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class ContactosClientesDBFSwitch {
    private FinalList<Contacto> lista;
    private DBFUtils DBFUtils = new DBFUtils();
    private ArrayList<Contacto> contactos;
    private FormatUtils formatUtils = new FormatUtils();

    public void Contactos(ArrayList<Relacion> relaciones) {
        int nFilas = DBFUtils.devuelveNFilasDBF();
        lista = FinalList.getFinalList();
        contactos = new ArrayList<Contacto>();
        Contacto contacto;

        for (int i = 0; i < nFilas; i++) {
            contacto = new Contacto();
            for (int j = 0; j < relaciones.size(); j++) {
                contacto.setCla("CL");
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        contacto.setCod(formatUtils
                                .format6digits(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        contacto.setNom(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "car":
                        contacto.setCar(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tel":
                        contacto.setTel(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ext":
                        contacto.setExt(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob1":
                        contacto.setOb1(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob2":
                        contacto.setOb2(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob3":
                        contacto.setOb3(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "email":
                        contacto.setEmail(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "codcon":
                        contacto.setCodcon(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ori":
                        contacto.setLopd_Ori(
                                Float.parseFloat(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_otr_o":
                        contacto.setLopd_Otr_O(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ces":
                        contacto.setLopd_Ces(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_otr_c":
                        contacto.setLopd_Otr_C(DBFUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(contacto);
            contactos.add(contacto);
        }
        lista.setLista(contactos);
    }
}
