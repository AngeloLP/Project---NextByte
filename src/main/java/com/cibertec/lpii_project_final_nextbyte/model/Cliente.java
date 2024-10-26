package com.cibertec.lpii_project_final_nextbyte.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tb_componente")
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Integer id;

    @Column(name="num_documento", length = 50, nullable = false)
    private String numDocumento;

    @Column(name="nombre", length = 200, nullable = false)
    private String nombre;

    @Column(name="ape_pat", length = 200, nullable = false)
    private String apePat;

    @Column(name="ape_mat", length = 200, nullable = false)
    private String apeMat;

    @Column(name="fec_nacimiento")
    private Date fecNacimiento;

    @Column(name="email", length = 200, nullable = false)
    private String email;
}
