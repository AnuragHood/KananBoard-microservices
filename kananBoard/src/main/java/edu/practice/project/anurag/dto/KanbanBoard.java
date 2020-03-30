package edu.practice.project.anurag.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Set;

@Component
public class KanbanBoard {
    private Integer boardId;
    private String boardName;
    private Set<BacklogItem> backlogItems;
    private Set<InProgressItem> inProgressItems;
    private Set<PeerReviewItem> peerReviewItems;
    private Set<BlockedItem> blockedItems;
    private Set<SpecialItem> specialItems;

    public KanbanBoard(Integer boardId, String boardName,
                       Set<BacklogItem> backlogItems, Set<InProgressItem> inProgressItems,
                       Set<PeerReviewItem> peerReviewItems, Set<InTestItem> inTestItems,
                       Set<BlockedItem> blockedItems, Set<SpecialItem> specialItems) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.backlogItems = backlogItems;
        this.inProgressItems = inProgressItems;
        this.peerReviewItems = peerReviewItems;
        this.inTestItems = inTestItems;
        this.blockedItems = blockedItems;
        this.specialItems = specialItems;
    }

    public KanbanBoard() {
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    private Set<InTestItem> inTestItems;

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public Set<BacklogItem> getBacklogItems() {
        return backlogItems;
    }

    public void setBacklogItems(Set<BacklogItem> backlogItems) {
        this.backlogItems = backlogItems;
    }

    public Set<InProgressItem> getInProgressItems() {
        return inProgressItems;
    }

    public void setInProgressItems(Set<InProgressItem> inProgressItems) {
        this.inProgressItems = inProgressItems;
    }


    public Set<PeerReviewItem> getPeerReviewItems() {
        return peerReviewItems;
    }

    public void setPeerReviewItems(Set<PeerReviewItem> peerReviewItems) {
        this.peerReviewItems = peerReviewItems;
    }

    public Set<InTestItem> getInTestItems() {
        return inTestItems;
    }

    public void setInTestItems(Set<InTestItem> inTestItems) {
        this.inTestItems = inTestItems;
    }

    public Set<BlockedItem> getBlockedItems() {
        return blockedItems;
    }

    public void setBlockedItems(Set<BlockedItem> blockedItems) {
        this.blockedItems = blockedItems;
    }

    public Set<SpecialItem> getSpecialItems() {
        return specialItems;
    }

    public void setSpecialItems(Set<SpecialItem> specialItems) {
        this.specialItems = specialItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KanbanBoard that = (KanbanBoard) o;
        return Objects.equals(boardId, that.boardId) &&
                Objects.equals(boardName, that.boardName) &&
                Objects.equals(backlogItems, that.backlogItems) &&
                Objects.equals(inProgressItems, that.inProgressItems) &&
                Objects.equals(peerReviewItems, that.peerReviewItems) &&
                Objects.equals(blockedItems, that.blockedItems) &&
                Objects.equals(specialItems, that.specialItems) &&
                Objects.equals(inTestItems, that.inTestItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardId, boardName, backlogItems, inProgressItems, peerReviewItems, blockedItems, specialItems, inTestItems);
    }

    @Override
    public String toString() {
        return "KanbanBoard{" +
                "boardId=" + boardId +
                ", boardName='" + boardName + '\'' +
                ", backlogItems=" + backlogItems +
                ", inProgressItems=" + inProgressItems +
                ", peerReviewItems=" + peerReviewItems +
                ", blockedItems=" + blockedItems +
                ", specialItems=" + specialItems +
                ", inTestItems=" + inTestItems +
                '}';
    }
}
