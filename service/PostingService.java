package com.sparta.week03hw.service;

import com.sparta.week03hw.domain.Posting;
import com.sparta.week03hw.domain.PostingRepository;
import com.sparta.week03hw.domain.PostingRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PostingService {

    private final PostingRepository postingRepository;

    @Transactional
    public Long update(Long id, PostingRequestDto requestDto) {
        Posting posting = postingRepository.findById(id).orElseThrow(
                () -> new NullPointerException("아이디가 존재하지 않습니다.")
        );
        posting.update(requestDto);
        return posting.getId();
    }
}
