import { Component } from '@angular/core';

@Component({
    // selector: "my-first-component",
    selector: "app-root",
    // template: `<h1>It is my very first angular component---------</h1>`,
    templateUrl: `app.component.html`,
    styleUrls: [`app.component.css`]
})
export default class AppComponent {
    head:string = "Super Calculator";
    result:number = 0;
    operator:string = "+";
    

    constructor() {
        console.log("my calculator component is rendered");
    }

    update(p:string){
        console.log(p);
        this.operator = p;
    }

    calculate(n1:number, n2:number){
        console.log("show result");
        switch(this.operator){
            case "+":
                this.result = n1 + n2;
                break;
            case "-":
                this.result = n1-n2;
                break;
            case "/":
                this.result = n1/n2;
                break;
            case "*":
                this.result = n1*n2;
                break;
            default:
                this.result = 0;
        }

    }
}