package com.municipal.issueraiser.controller;

import com.municipal.issueraiser.dto.IssueRequest;
import com.municipal.issueraiser.dto.IssueResponse;
import com.municipal.issueraiser.entity.Issue;
import com.municipal.issueraiser.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    @PostMapping
    public ResponseEntity<IssueResponse> submitIssue(@RequestBody IssueRequest issueRequest) {
        IssueResponse response = issueService.submitIssue(issueRequest);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IssueResponse> getIssueById(@PathVariable Long id) {
        IssueResponse response = issueService.getIssueById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<IssueResponse>> getIssuesByUserId(@PathVariable Long userId) {
        List<IssueResponse> responses = issueService.getIssuesByUserId(userId);
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IssueResponse> updateIssue(@PathVariable Long id, @RequestBody IssueRequest issueRequest) {
        IssueResponse response = issueService.updateIssue(id, issueRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}