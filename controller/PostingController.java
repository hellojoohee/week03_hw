package com.sparta.week03hw.controller;

import com.sparta.week03hw.domain.Posting;
import com.sparta.week03hw.domain.PostingRepository;
import com.sparta.week03hw.domain.PostingRequestDto;
import com.sparta.week03hw.service.PostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostingController {

    private final PostingRepository postingRepository;
    private final PostingService postingService;

    @PostMapping("/api/postings")
    public Posting createPosting(@RequestBody PostingRequestDto requestDto) {
        Posting posting = new Posting(requestDto);
        return postingRepository.save(posting);
    }

    @GetMapping("/api/postings")
    public List<Posting> getPosting() {
        return postingRepository.findAllByOrderByModifiedAtDesc();
    }

    @PutMapping("/api/postings/{id}")
    public Long updatePosting(@PathVariable Long id, @RequestBody PostingRequestDto requestDto) {
        postingService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/postings/{id}")
    public Long deletePosting(@PathVariable Long id) {
        postingRepository.deleteById(id);
        return id;
    }
}
