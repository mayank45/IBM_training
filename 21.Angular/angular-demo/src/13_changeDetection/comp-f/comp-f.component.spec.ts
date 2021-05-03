import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompFComponent } from './comp-f.component';

describe('CompFComponent', () => {
  let component: CompFComponent;
  let fixture: ComponentFixture<CompFComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CompFComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CompFComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
