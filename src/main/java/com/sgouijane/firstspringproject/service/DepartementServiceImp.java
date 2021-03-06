package com.sgouijane.firstspringproject.service;

import com.sgouijane.firstspringproject.entity.Departement;
import com.sgouijane.firstspringproject.exception.DepartementNotFoundException;
import com.sgouijane.firstspringproject.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartementServiceImp implements DepartementService{

    @Autowired
    DepartementRepository departementRepository;

    @Override
    public Departement saveDepartement(Departement departement)
    {
        return departementRepository.save(departement);
    }

    @Override
    public List<Departement> fetchDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement getDepartementById(Long id) throws DepartementNotFoundException {
        Optional<Departement> departement = departementRepository.findById(id);
        if(departement.isPresent()){
            return departement.get();
        }else{
            throw new DepartementNotFoundException("Département non trouvé");
        }
    }

    @Override
    public void deleteDepartementById(Long departementId) {
        departementRepository.deleteById(departementId);
    }

    @Override
    public Departement updateDepartementById(Long id, Departement departement) throws DepartementNotFoundException {
        Optional<Departement> departementFromDB = departementRepository.findById(id);
        if (!(departementFromDB.isPresent())){
            throw new DepartementNotFoundException("département non trouvée");
        }
        Departement depFromDB = departementFromDB.get();

        if(Objects.nonNull(departement.getDepartementCode()) && !"".equalsIgnoreCase(departement.getDepartementCode())){
            depFromDB.setDepartementCode(departement.getDepartementCode());
        }
        if(Objects.nonNull(departement.getDepartementAdress()) && !"".equalsIgnoreCase(departement.getDepartementAdress())){
            depFromDB.setDepartementAdress(departement.getDepartementAdress());
        }
        if(Objects.nonNull(departement.getDepartementName()) && !"".equalsIgnoreCase(departement.getDepartementName())){
            depFromDB.setDepartementName(departement.getDepartementName());
        }

        return departementRepository.save(depFromDB);
    }

    @Override
    public List<Departement> findDepartementByName(String name) {
        return departementRepository.findByDepartementName(name);
    }

    @Override
    public void deleteDepartementByName(String name) {
        departementRepository.deleteByDepartementName(name);
    }
}
