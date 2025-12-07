package tn.esprit.examen.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.entities.Etudiant;
import tn.esprit.examen.services.IExamenService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class ExamenController {

    IExamenService examenService;

    // http://localhost:8089/examen/projet/add-etudiant
    @PostMapping("/add-etudiant")
    @ResponseBody
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= examenService.addEtudiant(e);
        return etudiant;
    }

    // READ – Récupérer tous les étudiants
    // GET http://localhost:8089/examen/projet/etudiants
    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiants() {
        return examenService.getAllEtudiants();
    }
    // READ – Récupérer un étudiant par ID
    // GET http://localhost:8089/examen/projet/etudiants/{id}
    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long id) {
        return examenService.getEtudiantById(id);
    }
    // UPDATE – Modifier un étudiant
    // PUT http://localhost:8089/examen/projet/etudiants/{id}
    @PutMapping("/etudiants/{id}")
    public Etudiant updateEtudiant(@PathVariable("id") Long id,
                                   @RequestBody Etudiant e) {
        return examenService.updateEtudiant(id, e);
    }
    // DELETE – Supprimer un étudiant
    // DELETE http://localhost:8089/examen/projet/etudiants/{id}
    @DeleteMapping("/etudiants/{id}")
    public void deleteEtudiant(@PathVariable("id") Long id) {
        examenService.deleteEtudiant(id);
    }
}
