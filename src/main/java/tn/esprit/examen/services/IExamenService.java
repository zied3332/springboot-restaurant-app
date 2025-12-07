package tn.esprit.examen.services;

import tn.esprit.examen.entities.Etudiant;

import java.util.List;

public interface IExamenService {

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant(Long id, Etudiant e);

    void deleteEtudiant(Long id);

    Etudiant getEtudiantById(Long id);

    List<Etudiant> getAllEtudiants();
}
