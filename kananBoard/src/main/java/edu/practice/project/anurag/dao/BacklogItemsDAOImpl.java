package edu.practice.project.anurag.dao;

import edu.practice.project.anurag.dto.BacklogItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BacklogItemsDAOImpl extends CrudRepository<BacklogItem, Integer> {
    @Query(value = "Select * from backlog_item where board_id =?", nativeQuery = true)
    Optional<BacklogItem> getBacklogItems(Integer boardId);
}
