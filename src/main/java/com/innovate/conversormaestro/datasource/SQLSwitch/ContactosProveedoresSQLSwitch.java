package com.innovate.conversormaestro.datasource.SQLSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Contacto;
import com.innovate.conversormaestro.model.FinalList;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.SQLUtils;
import com.innovate.conversormaestro.utils.FormatUtils;

public class ContactosProveedoresSQLSwitch {
    private FinalList<Contacto> lista;
    private SQLUtils SQLUtils = new SQLUtils();
    private ArrayList<Contacto> contactos;
    private FormatUtils formatUtils = new FormatUtils();

    public void Contactos(ArrayList<Relacion> relaciones) {
        int nFilas = SQLUtils.devuelveNFilasSQL();
        lista = FinalList.getFinalList();
        contactos = new ArrayList<Contacto>();
        Contacto contacto;

        for (int i = 0; i < nFilas; i++) {
            contacto = new Contacto();
            for (int j = 0; j < relaciones.size(); j++) {
                contacto.setCla("PR");
                switch (relaciones.get(j).getCampoDestino()) {
                    case "cod":
                        contacto.setCod(formatUtils.format6digits(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "nom":
                        contacto.setNom(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "car":
                        contacto.setCar(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tel":
                        contacto.setTel(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ext":
                        contacto.setExt(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob1":
                        contacto.setOb1(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob2":
                        contacto.setOb2(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob3":
                        contacto.setOb3(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "email":
                        contacto.setEmail(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "codcon":
                        contacto.setCodcon(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ori":
                        contacto.setLopd_Ori(
                                Float.parseFloat(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_otr_o":
                        contacto.setLopd_Otr_O(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ces":
                        contacto.setLopd_Ces(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_otr_c":
                        contacto.setLopd_Otr_C(SQLUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            //System.out.println(contacto);
            contactos.add(contacto);
        }
        lista.setLista(contactos);
    }
}
