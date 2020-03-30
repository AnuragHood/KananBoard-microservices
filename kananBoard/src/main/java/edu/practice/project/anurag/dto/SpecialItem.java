package edu.practice.project.anurag.dto;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

@Entity
@EnableAutoConfiguration
@SequenceGenerator(name = "seq", initialValue = 0, allocationSize = 1)
public class SpecialItem {
    private Integer boardId;
    @Id
    private Integer specialItemId;
    private String specialItemTitle;
    private String specialItemDescription;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getSpecialItemId() {
        return specialItemId;
    }

    public void setSpecialItemId(Integer specialItemId) {
        this.specialItemId = specialItemId;
    }

    public String getSpecialItemTitle() {
        return specialItemTitle;
    }

    public void setSpecialItemTitle(String specialItemTitle) {
        this.specialItemTitle = specialItemTitle;
    }

    public String getSpecialItemDescription() {
        return specialItemDescription;
    }

    public void setSpecialItemDescription(String specialItemDescription) {
        this.specialItemDescription = specialItemDescription;
    }

    public SpecialItem() {
    }

    public SpecialItem(Integer boardId, Integer specialItemId,
                       String specialItemTitle, String specialItemDescription) {
        this.boardId = boardId;
        this.specialItemId = specialItemId;
        this.specialItemTitle = specialItemTitle;
        this.specialItemDescription = specialItemDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialItem that = (SpecialItem) o;
        return Objects.equals(boardId, that.boardId) &&
                Objects.equals(specialItemId, that.specialItemId) &&
                Objects.equals(specialItemTitle, that.specialItemTitle) &&
                Objects.equals(specialItemDescription, that.specialItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardId, specialItemId, specialItemTitle, specialItemDescription);
    }

    @Override
    public String toString() {
        return "SpecialItems{" +
                "boardId=" + boardId +
                ", specialItemId=" + specialItemId +
                ", specialItemTitle='" + specialItemTitle + '\'' +
                ", specialItemDescription='" + specialItemDescription + '\'' +
                '}';
    }
}
