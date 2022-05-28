/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api.porfolio.servicios;

import com.api.porfolio.Interface.ISkillsService;
import com.api.porfolio.models.Skills;
import com.api.porfolio.repositorios.IskillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author herna
 */
@Service
public class ImpSkillsService implements ISkillsService {

    @Autowired
    IskillsRepository skillsRepo;

    @Override
    public List<Skills> getSkills() {
        List<Skills> skills = skillsRepo.findAll();
        return skills;

    }

    @Override
    public void saveSkills(Skills skills) {
        skillsRepo.save(skills);

    }

    @Override
    public Skills findSkills(Long id) {
        Skills skills = skillsRepo.findById(id).orElse(null);
        return skills;

    }

    @Override
    public void deleteSkills(Long id) {
        skillsRepo.deleteById(id);

    }
}
