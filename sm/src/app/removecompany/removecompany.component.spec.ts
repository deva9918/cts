import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemovecompanyComponent } from './removecompany.component';

describe('RemovecompanyComponent', () => {
  let component: RemovecompanyComponent;
  let fixture: ComponentFixture<RemovecompanyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemovecompanyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemovecompanyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
