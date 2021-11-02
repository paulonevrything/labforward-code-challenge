package com.labforward.wordsearchapi.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.labforward.wordsearchapi.domain.request.TextSearchRequest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class TextSearchControllerTest extends AbstractTest{

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void getWordFrequencyAndSimilarWords() throws Exception {

        String uri = "/api/v1/textSearch/getWordFrequencyAndSimilarWords";

        TextSearchRequest request = new TextSearchRequest();
        request.setSearchWord("Word");
        request.setNotepadText("Word Words Wor word");

        String inputJson = super.mapToJson(request);

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
    }
}
