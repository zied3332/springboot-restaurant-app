package tn.esprit.examen.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailComposant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailComposant;

    private Float imc;

    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;
}
