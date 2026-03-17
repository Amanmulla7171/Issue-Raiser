public class IssueComment {
    private Long id;
    private String comment;
    private Long issueId;
    private Long userId;
    private LocalDateTime createdAt;

    // Constructors
    public IssueComment() {
    }

    public IssueComment(Long id, String comment, Long issueId, Long userId, LocalDateTime createdAt) {
        this.id = id;
        this.comment = comment;
        this.issueId = issueId;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}