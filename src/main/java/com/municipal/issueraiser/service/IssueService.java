public interface IssueService {
    IssueResponse submitIssue(IssueRequest issueRequest);
    IssueResponse updateIssue(Long issueId, IssueRequest issueRequest);
    IssueResponse getIssueById(Long issueId);
    List<IssueResponse> getAllIssuesByUserId(Long userId);
    List<IssueResponse> getAllIssues();
    void assignIssueToOfficer(Long issueId, Long officerId);
    void updateIssueStatus(Long issueId, String status);
}