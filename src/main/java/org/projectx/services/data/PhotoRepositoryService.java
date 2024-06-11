package org.projectx.services.data;

import org.projectx.entity.data.Photo;
import org.projectx.repository.data.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PhotoRepositoryService {

    @Autowired
    private PhotoRepository photoRepository;

    public void save(Photo photo) {
        photoRepository.save(photo);
    }

    public void delete(Photo photo) {
        photoRepository.delete(photo);
    }

}
