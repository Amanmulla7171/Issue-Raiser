public interface EmailService {
    void sendEmail(String to, String subject, String body);
    void sendIssueNotification(String userEmail, String issueTitle, String issueStatus);
}