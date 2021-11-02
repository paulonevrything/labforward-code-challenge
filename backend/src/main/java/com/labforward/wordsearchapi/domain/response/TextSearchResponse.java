package com.labforward.wordsearchapi.domain.response;

import java.util.List;

public class TextSearchResponse {

    private Integer wordFrequency;

    private List<String> similarWords;

    public Integer getWordFrequency() {
        return wordFrequency;
    }

    public void setWordFrequency(Integer wordFrequency) {
        this.wordFrequency = wordFrequency;
    }

    public List<String> getSimilarWords() {
        return similarWords;
    }

    public void setSimilarWords(List<String> similarWords) {
        this.similarWords = similarWords;
    }
}
