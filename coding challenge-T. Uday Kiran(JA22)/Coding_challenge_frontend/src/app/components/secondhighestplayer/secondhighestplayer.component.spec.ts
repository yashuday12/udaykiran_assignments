import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecondhighestplayerComponent } from './secondhighestplayer.component';

describe('SecondhighestplayerComponent', () => {
  let component: SecondhighestplayerComponent;
  let fixture: ComponentFixture<SecondhighestplayerComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SecondhighestplayerComponent]
    });
    fixture = TestBed.createComponent(SecondhighestplayerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
