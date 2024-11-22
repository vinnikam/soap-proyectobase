package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "GRUPOS")
@ToString
@Builder
public class Grupo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GRU_CODIGO", nullable = false)
    private Long id;

    @Column(name = "GRU_NOMBRE", nullable = false)
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estudiante> estudiantes = new ArrayList<>();
}
