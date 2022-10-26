package io.helioanacronista.helpdesk.repositories;

import io.helioanacronista.helpdesk.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
