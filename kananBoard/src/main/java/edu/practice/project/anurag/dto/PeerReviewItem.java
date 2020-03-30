package edu.practice.project.anurag.dto;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Objects;

@Entity
@EnableAutoConfiguration
@SequenceGenerator(name = "seq", initialValue = 0, allocationSize = 1)
public class PeerReviewItem {
    private Integer boardId;
    @Id
    private Integer peerReviewItemId;
    private String peerReviewItemTitle;
    private String peerReviewItemDescription;

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getPeerReviewItemId() {
        return peerReviewItemId;
    }

    public void setPeerReviewItemId(Integer peerReviewItemId) {
        this.peerReviewItemId = peerReviewItemId;
    }

    public String getPeerReviewItemTitle() {
        return peerReviewItemTitle;
    }

    public void setPeerReviewItemTitle(String peerReviewItemTitle) {
        this.peerReviewItemTitle = peerReviewItemTitle;
    }

    public String getPeerReviewItemDescription() {
        return peerReviewItemDescription;
    }

    public void setPeerReviewItemDescription(String peerReviewItemDescription) {
        this.peerReviewItemDescription = peerReviewItemDescription;
    }

    public PeerReviewItem(Integer boardId, Integer peerReviewItemId, String peerReviewItemTitle, String peerReviewItemDescription) {
        this.boardId = boardId;
        this.peerReviewItemId = peerReviewItemId;
        this.peerReviewItemTitle = peerReviewItemTitle;
        this.peerReviewItemDescription = peerReviewItemDescription;
    }

    public PeerReviewItem() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeerReviewItem that = (PeerReviewItem) o;
        return Objects.equals(boardId, that.boardId) &&
                Objects.equals(peerReviewItemId, that.peerReviewItemId) &&
                Objects.equals(peerReviewItemTitle, that.peerReviewItemTitle) &&
                Objects.equals(peerReviewItemDescription, that.peerReviewItemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boardId, peerReviewItemId, peerReviewItemTitle, peerReviewItemDescription);
    }

    @Override
    public String toString() {
        return "PeerReviewItems{" +
                "boardId=" + boardId +
                ", peerReviewItemId=" + peerReviewItemId +
                ", peerReviewItemTitle='" + peerReviewItemTitle + '\'' +
                ", peerReviewItemDescription='" + peerReviewItemDescription + '\'' +
                '}';
    }
}
