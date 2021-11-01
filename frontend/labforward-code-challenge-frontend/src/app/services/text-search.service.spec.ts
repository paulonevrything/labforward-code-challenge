import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';

import { TextSearchService } from './text-search.service';
import { TextSearchRequest } from '../models/TextSearchRequest';
import { TextSearchResponse } from '../models/TextSearchResponse';
import { environment } from 'src/environments/environment';

describe('TextSearchService', () => {
  let service: TextSearchService;
  let httpTestingController: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });

    httpTestingController = TestBed.get(HttpTestingController);

    service = TestBed.inject(TextSearchService);
  });

  afterEach(() => {
    httpTestingController.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('#getWordFrequencyAndSimilarWords should return word frequency and return similar words', () => {

    const request: TextSearchRequest = { searchWord: "Word", notepadText: "Word words wor" };

    const expectedResponse: TextSearchResponse = {
      wordFrequency: 1,
      similarWords: ["word", "word", "words"]
    }

    service.getWordFrequencyAndSimilarWords(request).subscribe(data => {
      expect(data).toEqual(expectedResponse);
    });

    const testRequest = httpTestingController.expectOne({ method: "POST", url: environment.getWordFrequencyAndSimilarWords });
    testRequest.flush(expectedResponse);

  });
  
});
