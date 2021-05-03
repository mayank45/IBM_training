import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyAnchorComponent } from './my-anchor.component';

describe('MyAnchorComponent', () => {
  let component: MyAnchorComponent;
  let fixture: ComponentFixture<MyAnchorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyAnchorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MyAnchorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
