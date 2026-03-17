public class AdminController {

    private final IssueService issueService;
    private final UserService userService;

    public AdminController(IssueService issueService, UserService userService) {
        this.issueService = issueService;
        this.userService = userService;
    }

    @GetMapping("/admin/issues")
    public ResponseEntity<List<IssueResponse>> getAllIssues() {
        List<IssueResponse> issues = issueService.getAllIssues();
        return ResponseEntity.ok(issues);
    }

    @GetMapping("/admin/analytics")
    public ResponseEntity<AnalyticsResponse> getAnalytics() {
        AnalyticsResponse analytics = issueService.getAnalytics();
        return ResponseEntity.ok(analytics);
    }

    @PostMapping("/admin/assign-officer")
    public ResponseEntity<String> assignOfficer(@RequestBody AssignOfficerRequest request) {
        issueService.assignOfficer(request.getIssueId(), request.getOfficerId());
        return ResponseEntity.ok("Officer assigned successfully");
    }

    @GetMapping("/admin/users")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}