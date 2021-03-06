package fr.ul.tp4spring.dao;

import fr.ul.tp4spring.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ICardDAO extends CrudRepository<Card, String> {
    List<Card> findAll();

    Optional<Card> findById(String id);

    void deleteById(String id);

    void deleteAll();

    // Card updateCard(String id, Card card);
}
