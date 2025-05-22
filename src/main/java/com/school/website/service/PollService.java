// PollService.java
package com.school.website.service;

import com.school.website.dto.PollDTO;

public interface PollService {
    void createPoll(PollDTO pollDto);
    PollDTO getPollById(Long pollId);
    void submitResponse(Long pollId, Object responseDto);
    Object getResults(Long pollId);
}
