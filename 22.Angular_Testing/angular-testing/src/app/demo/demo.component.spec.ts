import { ComponentFixture, TestBed, tick, fakeAsync } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DemoComponent } from './demo.component';

describe('DemoComponent', () => {
  let component: DemoComponent;
  let fixture: ComponentFixture<DemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });


  it('should click btn', fakeAsync(() => {
    spyOn(component, 'decrease').and.callThrough();
    spyOn(component, 'update').and.callThrough();

		// expect(component.decrease).toHaveBeenCalled();

    component.decrease();
		expect(component.decrease).toHaveBeenCalled();
	
		// let button = fixture.debugElement.queryAll(By.css('button'))[0];
		let button = fixture.debugElement.queryAll(By.css('button'))[0];
		button.triggerEventHandler('click', component.decrease);
		
		tick(); // simulates the passage of time until all pending asynchronous activities finish
	
		fixture.detectChanges();
	
		expect(component.decrease).toHaveBeenCalledTimes(2);
		
		component.decrease();
		
		expect(component.decrease).toHaveBeenCalledTimes(3);
    expect(component.num).toBe(-3)

    let n = 5;
    component.update(n);
		expect(component.update).toHaveBeenCalledWith(n);
    expect(component.num).toBe(n);
	}));

});
