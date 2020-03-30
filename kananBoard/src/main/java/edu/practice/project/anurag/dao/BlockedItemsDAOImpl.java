package edu.practice.project.anurag.dao;

import edu.practice.project.anurag.dto.BlockedItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlockedItemsDAOImpl extends CrudRepository<BlockedItem, Integer> {
    @Query(value = "Select * from blocked_item where board_id =?", nativeQuery = true)
    Optional<BlockedItem> getBlockedItems(Integer boardId);
}
