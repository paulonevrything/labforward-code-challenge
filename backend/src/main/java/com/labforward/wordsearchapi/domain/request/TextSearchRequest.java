package com.labforward.wordsearchapi.domain.request;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TextSearchRequest {

    @NotBlank
    @NotNull
    private String searchWord;

    @NotBlank
    @NotNull
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
