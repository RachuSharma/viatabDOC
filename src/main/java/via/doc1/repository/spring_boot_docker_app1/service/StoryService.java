package via.doc1.repository.spring_boot_docker_app1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import via.doc1.repository.spring_boot_docker_app1.model.Story;
import via.doc1.repository.spring_boot_docker_app1.repository.StoryRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StoryService {
 @Autowired
 
    StoryRepository storyRepository;


    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public Story addStory(Story story) {
        return storyRepository.save(story);
    }

    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }
}