import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[highlight]'
})
export class HighlightDirective {

  constructor(private el: ElementRef) { 
  //   el.nativeElement.style.backgroundColor = 'yellow';
  }

  @Input('highlight')
  highlightColor:string;

  @HostListener("mouseenter")
  mouseEnter(){
    console.log("mouse entered");
    this.el.nativeElement.style.backgroundColor = this.highlightColor;
  }

  @HostListener("mouseleave")
  mouseLeave(){
    console.log("mouse left");
    this.el.nativeElement.style.backgroundColor = "white";
  }

}
