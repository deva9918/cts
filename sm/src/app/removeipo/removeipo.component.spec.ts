import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemoveipoComponent } from './removeipo.component';

describe('RemoveipoComponent', () => {
  let component: RemoveipoComponent;
  let fixture: ComponentFixture<RemoveipoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemoveipoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemoveipoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
