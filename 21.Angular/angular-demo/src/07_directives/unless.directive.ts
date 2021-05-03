import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

@Directive({
  selector: '[unless]'
})
export class UnlessDirective {

  // private tempRef:TemplateRef<any> = new TemplateRef();
  // private viewContainerRef:ViewContainerRef = new ViewContainerRef()

  @Input() set unless(condition: boolean) {
    console.log("Condition is "+condition);
    console.log(this.tempRef);

    if(condition){
      console.log("hinding template")
      this.viewContainerRef.clear()
    } else {
      console.log("showing template")
      this.viewContainerRef.createEmbeddedView(this.tempRef);
    }

  }
  
  constructor(private viewContainerRef:ViewContainerRef, private tempRef:TemplateRef<any>) {

  }
  
}
