package com.innovate.conversormaestro.datasource.ExcelSwitch;

import java.util.ArrayList;

import com.innovate.conversormaestro.model.Apunte;
import com.innovate.conversormaestro.model.Contacto;
import com.innovate.conversormaestro.model.Relacion;
import com.innovate.conversormaestro.utils.ExcelUtils;

public class ContactosClientesSwitch {
    private ArrayList<Relacion> relaciones;
    private ExcelUtils excelUtils = new ExcelUtils();
    private ArrayList<Contacto> contactos;

    public void ContactosClientes(ArrayList<Relacion> relaciones){
        this.relaciones = relaciones;
        int nFilas = excelUtils.devuelveNFilasExcel();
        int longitud = 0;

        contactos = new ArrayList<Contacto>();
        Contacto contacto;
        String cod;

        for (int i = 0; i < nFilas; i++) {
            contacto = new Contacto();
            for (int j = 0; j < relaciones.size(); j++) {
                contacto.setCla("CL");
                switch(relaciones.get(j).getCampoDestino()){
                    case "cod":
                        contacto.setCod(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "nom":
                        contacto.setNom(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "car":
                        contacto.setCar(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "tel":
                        contacto.setTel(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ext":
                        contacto.setExt(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob1":
                        contacto.setOb1(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob2":
                        contacto.setOb2(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "ob3":
                        contacto.setOb3(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "email":
                        contacto.setEmail(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "codcon":
                        contacto.setCodcon(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ori":
                        contacto.setLopd_Ori(Float.parseFloat(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen())));
                        break;
                    case "lopd_otr_o":
                        contacto.setLopd_Otr_O(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_ces":
                        contacto.setLopd_Ces(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                    case "lopd_otr_c":
                        contacto.setLopd_Otr_C(excelUtils.devuelveValorCelda(i, relaciones.get(j).getCampoOrigen()));
                        break;
                }
            }
            System.out.println(contacto);
            contactos.add(contacto);
        }
    }
}
