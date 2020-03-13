import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateipoinfoComponent } from './updateipoinfo.component';

describe('UpdateipoinfoComponent', () => {
  let component: UpdateipoinfoComponent;
  let fixture: ComponentFixture<UpdateipoinfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateipoinfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateipoinfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
