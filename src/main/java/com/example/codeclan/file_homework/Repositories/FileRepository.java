package com.example.codeclan.file_homework.Repositories;

import com.example.codeclan.file_homework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
