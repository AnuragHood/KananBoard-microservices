package edu.practice.project.anurag.dao;

import edu.practice.project.anurag.dto.InTestItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InTestItemsDAOImpl extends CrudRepository<InTestItem, Integer> {
    @Query(value = "Select * from in_progress_item where board_id =?", nativeQuery = true)
    Optional<InTestItem> getInTestItems(Integer boardId);
}
