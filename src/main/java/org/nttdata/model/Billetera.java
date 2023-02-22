package org.nttdata.model;


import jakarta.persistence.*;

@Entity
@Table(name = "billetera")
public class Billetera {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "nombre")
    public String nombre;
    @Column(name = "apellidos")
    public String apellidos;
    @Column(name = "numeroTarjeta")
    public String numeroTarjeta;
    @Column(name = "numeroCelular")
    public String numeroCelular;
    @Column(name = "clave")
    public String clave;
    @Column(name="fecha")
    public String fecha;
    @Column(name="estado")
    public String estado;


}
