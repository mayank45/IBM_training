import { Directive, ElementRef, Input } from '@angular/core';

@Directive({
  selector: '[radius]'
})
export class RadiusDirective {

  @Input('radius')
  set radius(r:string){
    console.log(r);

    console.log(this.currentElement.nativeElement.childNodes[0])

    this.currentElement.nativeElement.childNodes[0].style.border = (r+1) + "px solid black";
    
    this.currentElement.nativeElement.childNodes[0].style.padding = (r+10) + "px";
    
    this.currentElement.nativeElement.childNodes[0].style["border-radius"] = (r+5)+"px";
  }

  constructor(private currentElement:ElementRef<any>) {
    // this.currentElement.nativeElement.style.backgroundColor;
  }

}
