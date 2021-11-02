package com.labforward.wordsearchapi.domain.request;

public class TextSearchRequest {

    private String searchWord;

    private String notepadText;

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public String getNotepadText() {
        return notepadText;
    }

    public void setNotepadText(String notepadText) {
        this.notepadText = notepadText;
    }

}
