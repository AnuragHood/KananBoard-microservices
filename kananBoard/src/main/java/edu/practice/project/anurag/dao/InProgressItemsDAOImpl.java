package edu.practice.project.anurag.dao;

import edu.practice.project.anurag.dto.InProgressItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InProgressItemsDAOImpl extends CrudRepository<InProgressItem, Integer> {
    @Query(value = "Select * from in_progress_item where board_id =?", nativeQuery = true)
    Optional<InProgressItem> getInProgressItems(Integer boardId);
}
