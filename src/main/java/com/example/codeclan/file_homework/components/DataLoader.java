package com.example.codeclan.file_homework.components;

import com.example.codeclan.file_homework.Repositories.FileRepository;
import com.example.codeclan.file_homework.Repositories.FolderRepository;
import com.example.codeclan.file_homework.Repositories.UserRepository;
import com.example.codeclan.file_homework.models.File;
import com.example.codeclan.file_homework.models.Folder;
import com.example.codeclan.file_homework.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User lorraine = new User("Lorraine Kelly");
        userRepository.save(lorraine);

        User anne = new User("Anne Robinson");
        userRepository.save(anne);

        Folder codeclan = new Folder("CodeClan");
        folderRepository.save(codeclan);

        Folder games = new Folder("Games");
        folderRepository.save(games);

        File file1 = new File("lab hw", ".md", 45);
        fileRepository.save(file1);

        File file2 = new File("Football Manager", ".exe", 690);
        fileRepository.save(file2);

        codeclan.addFile(file1);
        folderRepository.save(codeclan);


    }

}