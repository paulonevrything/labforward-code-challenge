package com.labforward.wordsearchapi.controllers;

import com.labforward.wordsearchapi.domain.request.TextSearchRequest;
import com.labforward.wordsearchapi.domain.response.TextSearchResponse;
import com.labforward.wordsearchapi.services.TextSearchService;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api/v1/textSearch", consumes = "application/json", produces = "application/json")
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "An internal error occurred"),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success")
}
)
public class TextSearchController {

    @Autowired
    TextSearchService textSearchService;

    @PostMapping("/getWordFrequencyAndSimilarWords")
    public ResponseEntity<TextSearchResponse> getWordFrequencyAndSimilarWords(@RequestBody @Valid TextSearchRequest request) {

        TextSearchResponse response = textSearchService.getWordFrequencyAndSimilarWords(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
