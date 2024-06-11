package org.projectx.services.projects;

import org.projectx.entity.projects.Project;
import org.projectx.repository.projects.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class ProjectService {

    @Autowired
    public ProjectRepository projectRepository;

    public ArrayList<Project> findAll() {
        ArrayList<Project> projects;
        projects = (ArrayList<Project>) projectRepository.findAll();
        return projects;
    }

    public void save(Project project) {
        projectRepository.save(project);
    }

    public void remove(Project project) {
        projectRepository.deleteById(project.getId());
    }
}
