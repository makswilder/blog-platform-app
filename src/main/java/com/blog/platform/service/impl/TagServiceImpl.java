package com.blog.platform.service.impl;

import com.blog.platform.domain.entity.Tag;
import com.blog.platform.repository.TagRepository;
import com.blog.platform.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    @Override
    public List<Tag> getTags() {
        return tagRepository.findAllWithPostCount();
    }
}
