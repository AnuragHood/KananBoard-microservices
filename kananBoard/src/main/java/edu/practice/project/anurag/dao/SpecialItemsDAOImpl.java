package edu.practice.project.anurag.dao;

import edu.practice.project.anurag.dto.SpecialItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpecialItemsDAOImpl extends CrudRepository<SpecialItem, Integer> {
    @Query(value = "Select * from special_item where board_id =?", nativeQuery = true)
    Optional<SpecialItem> getSpecialItems(Integer boardId);
}
