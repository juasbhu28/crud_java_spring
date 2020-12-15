package com.colfondos.crudjava.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;

@Entity
@Table(name = "student")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="id_customer")
    private String identificacion;

    @Column(name="type_id_customer")
    private String tipoIdentificacion;

    @Column(name="email")
    private String correo;

    @Column(name="cellphone")
    private String celular;

    @Column(name="datetime")
    private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", identificacion='" + identificacion + '\'' +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", correo='" + correo + '\'' +
                ", celular='" + celular + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
