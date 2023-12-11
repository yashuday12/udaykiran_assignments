import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewplayersComponent } from './viewplayers.component';

describe('ViewplayersComponent', () => {
  let component: ViewplayersComponent;
  let fixture: ComponentFixture<ViewplayersComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewplayersComponent]
    });
    fixture = TestBed.createComponent(ViewplayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
