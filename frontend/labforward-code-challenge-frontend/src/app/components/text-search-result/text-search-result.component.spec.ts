import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TextSearchResultComponent } from './text-search-result.component';

describe('TextSearchResultComponent', () => {
  let component: TextSearchResultComponent;
  let fixture: ComponentFixture<TextSearchResultComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TextSearchResultComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TextSearchResultComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
