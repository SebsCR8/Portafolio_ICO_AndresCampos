package com.casopractico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@SpringBootApplication
public class CasoPracticoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasoPracticoApplication.class, args);
    }
}
