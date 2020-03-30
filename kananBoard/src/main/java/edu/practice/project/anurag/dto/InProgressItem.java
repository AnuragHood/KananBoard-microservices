package edu.practice.project.anurag.dto;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

@Entity
@EnableAutoConfiguration
@SequenceGenerator(name = "seq", initialValue = 0, allocationSize = 1)
public class InProgressItem {
    private Integer boardId;
    @Id
    private Integer inProgressItemId;
    private String inProgressItemTitle;
    private String inProgressItemDescription;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getInProgressItemId() {
        return inProgressItemId;
    }

    public void setInProgressItemId(Integer inProgressItemId) {
        this.inProgressItemId = inProgressItemId;
    }

    public String getInProgressItemTitle() {
        return inProgressItemTitle;
    }

    public void setInProgressItemTitle(String inProgressItemTitle) {
        this.inProgressItemTitle = inProgressItemTitle;
    }

    public String getInProgressItemDescription() {
        return inProgressItemDescription;
    }

    public void setInProgressItemDescription(String inProgressItemDescription) {
        this.inProgressItemDescription = inProgressItemDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InProgressItem that = (InProgressItem) o;
        return Objects.equals(boardId, that.boardId) &&
                Objects.equals(inProgressItemId, that.inProgressItemId) &&
                Objects.equals(inProgressItemTitle, that.inProgressItemTitle) &&
                Objects.equals(inProgressItemDescription, that.inProgressItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardId, inProgressItemId, inProgressItemTitle, inProgressItemDescription);
    }

    @Override
    public String toString() {
        return "InProgressItem{" +
                "boardId=" + boardId +
                ", inProgressItemId=" + inProgressItemId +
                ", inProgressItemTitle='" + inProgressItemTitle + '\'' +
                ", inProgressItemDescription='" + inProgressItemDescription + '\'' +
                '}';
    }
}
