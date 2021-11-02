import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { TextSearchRequest } from 'src/app/models/TextSearchRequest';
import { TextSearchResponse } from 'src/app/models/TextSearchResponse';
import { TextSearchService } from 'src/app/services/text-search.service';

@Component({
  selector: 'app-text-search',
  templateUrl: './text-search.component.html',
  styleUrls: ['./text-search.component.css']
})
export class TextSearchComponent implements OnInit {

  textSearchformGroup!: FormGroup;
  requestBody: TextSearchRequest | undefined;
  responseBody: TextSearchResponse | undefined;

  constructor(private fb: FormBuilder, private textSearchService: TextSearchService) { }

  ngOnInit(): void {

    this.textSearchformGroup = this.fb.group({

      searchWord: new FormControl('', Validators.compose([
        Validators.required
      ])),

      notepadText: new FormControl('', Validators.compose([
        Validators.required
      ])),
    })

  }

  searchWordInNotepad(formValue: any) {

    this.requestBody = { searchWord: formValue.searchWord, notepadText: formValue.notepadText };

    this.textSearchService.getWordFrequencyAndSimilarWords(this.requestBody).subscribe(response => {

      console.log(response);

      this.responseBody = { wordFrequency: response.wordFrequency, similarWords: response.similarWords }

    });

  }

}
