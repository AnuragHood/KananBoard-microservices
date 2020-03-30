package edu.practice.project.anurag.dto;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

@Entity
@EnableAutoConfiguration
@SequenceGenerator(name = "seq", initialValue = 0, allocationSize = 1)
public class BacklogItem {
    private Integer boardId;
    @Id
    private Integer inTestItemId;
    private String inTestItemTitle;
    private String inTestItemDescription;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getInTestItemId() {
        return inTestItemId;
    }

    public void setInTestItemId(Integer inTestItemId) {
        this.inTestItemId = inTestItemId;
    }

    public String getInTestItemTitle() {
        return inTestItemTitle;
    }

    public void setInTestItemTitle(String inTestItemTitle) {
        this.inTestItemTitle = inTestItemTitle;
    }

    public String getInTestItemDescription() {
        return inTestItemDescription;
    }

    public void setInTestItemDescription(String inTestItemDescription) {
        this.inTestItemDescription = inTestItemDescription;
    }

    public BacklogItem(Integer boardId, Integer inTestItemId, String inTestItemTitle, String inTestItemDescription) {
        this.boardId = boardId;
        this.inTestItemId = inTestItemId;
        this.inTestItemTitle = inTestItemTitle;
        this.inTestItemDescription = inTestItemDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BacklogItem that = (BacklogItem) o;
        return Objects.equals(boardId, that.boardId) &&
                Objects.equals(inTestItemId, that.inTestItemId) &&
                Objects.equals(inTestItemTitle, that.inTestItemTitle) &&
                Objects.equals(inTestItemDescription, that.inTestItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardId, inTestItemId, inTestItemTitle, inTestItemDescription);
    }
}
