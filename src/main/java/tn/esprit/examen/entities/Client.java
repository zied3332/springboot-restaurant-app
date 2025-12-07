package tn.esprit.examen.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    private String identifiant;

    // Dans le diagramme: Date. Tu peux utiliser LocalDate ou java.util.Date.
    private LocalDate datePremiereVisite;
}
