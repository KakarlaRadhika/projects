import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DatadetailsComponent } from './datadetails.component';

describe('DatadetailsComponent', () => {
  let component: DatadetailsComponent;
  let fixture: ComponentFixture<DatadetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DatadetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DatadetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
