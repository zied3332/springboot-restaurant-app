package tn.esprit.examen.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examen.entities.Etudiant;
import tn.esprit.examen.repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ExamenService implements IExamenService{

    EtudiantRepository etudiantRepository;




    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }
    @Scheduled(fixedDelay = 60000)
    void scheduler() {
        log.info("test");
    }

    @Override
    public Etudiant updateEtudiant(Long id, Etudiant e) {
        // Option simple : on force l’ID et on save
        e.setIdEtudiant(id);
        return etudiantRepository.save(e);
    }
    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id)
                .orElse(null); // ou lancer une exception si tu veux
    }
    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
}
