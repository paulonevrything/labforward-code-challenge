package com.labforward.wordsearchapi.services;

import com.labforward.wordsearchapi.domain.request.TextSearchRequest;
import com.labforward.wordsearchapi.domain.response.TextSearchResponse;
import org.springframework.stereotype.Service;

@Service
public class TextSearchServiceImpl implements TextSearchService{

    @Override
    public TextSearchResponse getWordFrequencyAndSimilarWords(TextSearchRequest request) {
        return null;
    }
}
