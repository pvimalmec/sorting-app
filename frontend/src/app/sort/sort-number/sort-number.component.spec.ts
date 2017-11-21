import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SortNumberComponent } from './sort-number.component';

describe('SortNumberComponent', () => {
  let component: SortNumberComponent;
  let fixture: ComponentFixture<SortNumberComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SortNumberComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SortNumberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
