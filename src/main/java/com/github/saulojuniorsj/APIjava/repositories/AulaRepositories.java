package com.github.saulojuniorsj.APIjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.saulojuniorsj.APIjava.models.Aula;

public interface AulaRepositories extends JpaRepository<Aula, Long> {
	Aula findById(long id);
}
