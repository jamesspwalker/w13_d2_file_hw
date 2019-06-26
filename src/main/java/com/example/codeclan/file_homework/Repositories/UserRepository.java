package com.example.codeclan.file_homework.Repositories;

import com.example.codeclan.file_homework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
