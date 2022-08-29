/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.robotroot.Reto1.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Robot-Root
 */
@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempleado", columnDefinition = "number")
    private Integer idEmpleado;
    @Column(name = "name", columnDefinition = "varchar(250)")
    private String name;
    @Column(name = "email", unique = true, columnDefinition = "varchar(45)")
    private String email;
    @ManyToOne
    @JoinColumn(name = "idempresa")
    @Column(name = "company", columnDefinition = "varchar(100)")
    private Empresa company;
    @Column(name = "rol", columnDefinition = "varchar(45)")
    private String rol;
    @OneToMany
    @JoinColumn(name = "idmovimiento")
    @Column(name = "transaction", columnDefinition = "varchar(45)")
    private Movimiento transaction;

    @ManyToOne
    @JoinColumn(name = "idempleado")

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Empresa getCompany() {
        return company;
    }

    public void setCompany(Empresa company) {
        this.company = company;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
