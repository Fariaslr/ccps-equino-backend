package com.br.ccps.model;

import com.br.ccps.enums.StatusValidacao;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sala")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_ccps", nullable = false)
    private CCPS ccps;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    private Tipo tipo;

    @Column(name = "planta")
    private String planta;
    
    private String foto1;
    private String foto2;
    private String foto3;

    @Column(name = "observacao_veterinario")
    private String observacaoVeterinario;

    @Column(name = "observacao_avaliador")
    private String observacaoAvaliador;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_validacao", nullable = false)
    private StatusValidacao statusValidacao;

    @Column(name = "codigo_aprovado", unique = true)
    private String codigoAprovado;
}
