import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoDemoComponent } from './demo-demo.component';

describe('DemoDemoComponent', () => {
  let component: DemoDemoComponent;
  let fixture: ComponentFixture<DemoDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemoDemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
