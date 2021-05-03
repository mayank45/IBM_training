import { Component } from '@angular/core';

@Component({
    selector: "my-first-component",
    // template: `<h1>It is my very first angular component---------</h1>`,
    templateUrl: `app.component.html`,
    styleUrls: [`app.component.css`]
})
export default class AppComponent {
    constructor() {
        console.log("my first component is rendered");
    }
}