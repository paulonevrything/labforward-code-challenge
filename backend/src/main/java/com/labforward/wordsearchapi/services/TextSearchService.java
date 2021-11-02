package com.labforward.wordsearchapi.services;

import com.labforward.wordsearchapi.domain.request.TextSearchRequest;
import com.labforward.wordsearchapi.domain.response.TextSearchResponse;

public interface TextSearchService {
    TextSearchResponse getWordFrequencyAndSimilarWords(TextSearchRequest request);
}
