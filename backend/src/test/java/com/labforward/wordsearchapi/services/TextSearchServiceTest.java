package com.labforward.wordsearchapi.services;

import com.labforward.wordsearchapi.domain.request.TextSearchRequest;
import com.labforward.wordsearchapi.domain.response.TextSearchResponse;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration
public class TextSearchServiceTest {

    @Autowired
    private TextSearchService textSearchService;


    @Test
    public void testGetWordFrequencyAndSimilarWords() {

        TextSearchRequest testRequest = new TextSearchRequest();

        testRequest = new TextSearchRequest();
        testRequest.setSearchWord ("Word");
        testRequest.setNotepadText ("Word Words Wor word");

        List<String> similarWords = new ArrayList<>();
        similarWords.add("Words");
        similarWords.add("Wor");
        similarWords.add("word");

        TextSearchResponse expectedResponse = new TextSearchResponse();
        expectedResponse = new TextSearchResponse();
        expectedResponse.setWordFrequency(1);
        expectedResponse.setSimilarWords(similarWords);

        TextSearchResponse testResponse = textSearchService.getWordFrequencyAndSimilarWords(testRequest);

        Assertions.assertNotNull (testResponse.getWordFrequency(), "Frequencies must not be empty");
        Assertions.assertEquals (1, testResponse.getWordFrequency(), "The response should return a frequency of 1");
        Assertions.assertEquals (expectedResponse.getSimilarWords(), testResponse.getSimilarWords(), "The list of similar words should be equal");
    }
}
