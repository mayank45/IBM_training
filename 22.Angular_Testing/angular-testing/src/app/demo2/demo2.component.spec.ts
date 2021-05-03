import { DebugElement } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { CapitalizePipe } from '../pipes/capitalize.pipe';
import { UserService } from '../services/user.service';

import { Demo2Component } from './demo2.component';

describe('Demo2Component', () => {
  let component: Demo2Component;
  let fixture: ComponentFixture<Demo2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Demo2Component, CapitalizePipe ],
      providers: [UserService]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Demo2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should test service', () => {
    let service: UserService = TestBed.inject(UserService);
    fixture.detectChanges();
    expect(component.message).toMatch("you are not a valid user");
    // expect(component.message).toMatch("welcome user");
    let de:DebugElement = fixture.debugElement.query(By.css("h1"));
    console.log(de.nativeElement.innerText);
    expect(de.nativeElement.innerText.toLowerCase()).toMatch("you are not a valid user".toLowerCase());
  });

});
