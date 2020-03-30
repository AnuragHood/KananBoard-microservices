package edu.practice.project.anurag.dto;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

@Entity
@EnableAutoConfiguration
@SequenceGenerator(name = "seq", initialValue = 0, allocationSize = 1)
public class BlockedItem {
    private Integer boardId;
    @Id
    private Integer blockedItemId;
    private String blockedItemTitle;
    private String blockedItemDescription;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getBlockedItemId() {
        return blockedItemId;
    }

    public void setBlockedItemId(Integer blockedItemId) {
        this.blockedItemId = blockedItemId;
    }

    public String getBlockedItemTitle() {
        return blockedItemTitle;
    }

    public void setBlockedItemTitle(String blockedItemTitle) {
        this.blockedItemTitle = blockedItemTitle;
    }

    public String getBlockedItemDescription() {
        return blockedItemDescription;
    }

    public void setBlockedItemDescription(String blockedItemDescription) {
        this.blockedItemDescription = blockedItemDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockedItem that = (BlockedItem) o;
        return Objects.equals(boardId, that.boardId) &&
                Objects.equals(blockedItemId, that.blockedItemId) &&
                Objects.equals(blockedItemTitle, that.blockedItemTitle) &&
                Objects.equals(blockedItemDescription, that.blockedItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardId, blockedItemId, blockedItemTitle, blockedItemDescription);
    }

    public BlockedItem(Integer boardId, Integer blockedItemId, String blockedItemTitle, String blockedItemDescription) {
        this.boardId = boardId;
        this.blockedItemId = blockedItemId;
        this.blockedItemTitle = blockedItemTitle;
        this.blockedItemDescription = blockedItemDescription;
    }

    @Override
    public String toString() {
        return "BlockedItem{" +
                "boardId=" + boardId +
                ", blockedItemId=" + blockedItemId +
                ", blockedItemTitle='" + blockedItemTitle + '\'' +
                ", blockedItemDescription='" + blockedItemDescription + '\'' +
                '}';
    }
}
