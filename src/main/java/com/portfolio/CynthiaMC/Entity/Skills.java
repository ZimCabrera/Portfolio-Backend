
package com.portfolio.CynthiaMC.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int idSkill;
    private String nombreE;
    private String imgSkill;
    private int porcentaje;

    public Skills() {
    }

    public Skills(String nombreE, String imgSkill, int porcentaje) {
        this.nombreE = nombreE;
        this.imgSkill = imgSkill;
        this.porcentaje = porcentaje;
    }

    public int getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getImgSkill() {
        return imgSkill;
    }

    public void setImgSkill(String imgSkill) {
        this.imgSkill = imgSkill;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    

}
