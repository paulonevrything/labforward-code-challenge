package com.labforward.wordsearchapi.services;

import com.labforward.wordsearchapi.domain.request.TextSearchRequest;
import com.labforward.wordsearchapi.domain.response.TextSearchResponse;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TextSearchServiceImpl implements TextSearchService{

    private static final Log logger = LogFactory.getLog(TextSearchServiceImpl.class);

    @Override
    public TextSearchResponse getWordFrequencyAndSimilarWords(TextSearchRequest request) {

        TextSearchResponse response = new TextSearchResponse();

        try {

            getWordFrequency(request, response);

            getSimilarWords(request, response);

            return response;
        }
        catch (Exception ex) {

            logger.error(ex.getMessage());
            throw new RuntimeException();
        }
    }

    private void getWordFrequency(TextSearchRequest request, TextSearchResponse response) {

        String[] wordsInNotePad = request.getNotepadText().split(" ");

        int frequency = 0;

        for(String word : wordsInNotePad) {

            if(word.equals(request.getSearchWord())) {

                frequency++;
            }
        }

        response.setWordFrequency(frequency);
    }

    private void getSimilarWords(TextSearchRequest request, TextSearchResponse response) {

        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();

        List<String> similarWords = new ArrayList<String>();

        String[] wordsInNotePad = request.getNotepadText().split(" ");

        for(String word : wordsInNotePad) {

            if(!word.equals(request.getSearchWord()) && levenshteinDistance.apply(word, request.getSearchWord()) <= 1) {

                similarWords.add(word);
            }
        }

        response.setSimilarWords(similarWords);

    }
}
