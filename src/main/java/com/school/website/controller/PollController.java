package com.school.website.controller;

import com.school.website.dto.PollDTO;
import com.school.website.service.PollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    private final PollService pollService;

    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping
    public ResponseEntity<String> createPoll(@RequestBody PollDTO pollDto) {
        pollService.createPoll(pollDto);
        return ResponseEntity.ok("Poll created successfully");
    }

    @GetMapping("/{pollId}")
    public ResponseEntity<PollDTO> getPoll(@PathVariable Long pollId) {
        PollDTO poll = pollService.getPollById(pollId);
        return ResponseEntity.ok(poll);
    }

    @PostMapping("/{pollId}/respond")
    public ResponseEntity<String> respondToPoll(@PathVariable Long pollId, @RequestBody Object responseDto) {
        pollService.submitResponse(pollId, responseDto);
        return ResponseEntity.ok("Poll response submitted");
    }

    @GetMapping("/{pollId}/results")
    public ResponseEntity<?> getPollResults(@PathVariable Long pollId) {
        return ResponseEntity.ok(pollService.getResults(pollId));
    }
}
