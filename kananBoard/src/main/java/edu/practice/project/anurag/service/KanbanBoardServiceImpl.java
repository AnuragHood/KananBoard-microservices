package edu.practice.project.anurag.service;

import edu.practice.project.anurag.dao.*;
import edu.practice.project.anurag.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class KanbanBoardServiceImpl implements KanbanBoardService {

    @Autowired
    private BacklogItemsDAOImpl backlogItemsDAO;
    @Autowired
    private BlockedItemsDAOImpl blockedItemsDAO;
    @Autowired
    private InProgressItemsDAOImpl inProgressItemsDAO;
    @Autowired
    private InTestItemsDAOImpl inTestItemsDAO;
    @Autowired
    private PeerReviewItemsDAOImpl peerReviewItemsDAO;
    @Autowired
    private SpecialItemsDAOImpl specialItemsDAO;
    @Autowired
    private KanbanBoard kanbanBoard;


    @Override
    public KanbanBoard getKanbanBoard(Integer boardId) {
        //get BackLogItems
        Optional<BacklogItem> backlogItems = backlogItemsDAO.getBacklogItems(boardId);
        kanbanBoard.setBacklogItems(backlogItems.map(Collections::singleton).orElse(Collections.emptySet()));

        //getBlocked Items
        Optional<BlockedItem> blockedItems = blockedItemsDAO.getBlockedItems(boardId);
        kanbanBoard.setBlockedItems(blockedItems.map(Collections::singleton).orElse(Collections.emptySet()));

        //get InProgress Items
        Optional<InProgressItem> inProgressItems = inProgressItemsDAO.getInProgressItems(boardId);
        kanbanBoard.setInProgressItems(inProgressItems.map(Collections::singleton).orElse(Collections.emptySet()));

        //get InTestItems
        Optional<InTestItem> inTestItems = inTestItemsDAO.getInTestItems(boardId);
        kanbanBoard.setInTestItems(inTestItems.map(Collections::singleton).orElse(Collections.emptySet()));

        //get peer review items
        Optional<PeerReviewItem> peerReviewItems = peerReviewItemsDAO.getPeerReviewItems(boardId);
        kanbanBoard.setPeerReviewItems(peerReviewItems.map(Collections::singleton).orElse(Collections.emptySet()));

        //get specialItems
        Optional<SpecialItem> specialItems = specialItemsDAO.getSpecialItems(boardId);
        kanbanBoard.setSpecialItems(specialItems.map(Collections::singleton).orElse(Collections.emptySet()));

        return kanbanBoard;


    }
}
