import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteplayerComponent } from './deleteplayer.component';

describe('DeleteplayerComponent', () => {
  let component: DeleteplayerComponent;
  let fixture: ComponentFixture<DeleteplayerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeleteplayerComponent]
    });
    fixture = TestBed.createComponent(DeleteplayerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
