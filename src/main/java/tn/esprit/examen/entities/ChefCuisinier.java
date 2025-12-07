package tn.esprit.examen.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChefCuisinier implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;

    private String nom;

    private String prenom;

    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
}
