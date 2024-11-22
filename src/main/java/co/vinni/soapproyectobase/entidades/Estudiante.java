package co.vinni.soapproyectobase.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ESTUDIANTES")
@ToString
@Builder
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EST_CODIGO", nullable = false)
    private Long id;

    @Column(name = "EST_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "EST_TALLA", nullable = false)
    private String talla;

    @Column(name = "EST_EDAD", nullable = false)
    private int edad;
}
