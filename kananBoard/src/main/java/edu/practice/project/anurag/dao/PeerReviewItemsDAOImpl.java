package edu.practice.project.anurag.dao;

import edu.practice.project.anurag.dto.PeerReviewItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeerReviewItemsDAOImpl extends CrudRepository<PeerReviewItem, Integer> {
    @Query(value = "Select * from peer_review_item where board_id =?", nativeQuery = true)
    Optional<PeerReviewItem> getPeerReviewItems(Integer boardId);
}
