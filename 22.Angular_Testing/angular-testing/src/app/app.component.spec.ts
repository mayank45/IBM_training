import { ComponentFixture, TestBed } from "@angular/core/testing";
import { AppComponent } from "./app.component";


/* 
main
    platformBrowserDynamic().bootstrapModule(AppModule)

    @NgModule
    AppModule
        declarations : [AppComponent] 
            template 
            Css/SCSS 
            class -> logic => variables, methods
        imports 
            BrowserModule
        providers 
        bootstrap 
 */


describe("AppComponent", function(){
    it("should be created", function(){
        TestBed.configureTestingModule({
            declarations : [AppComponent]
        });

        const fixture:ComponentFixture<AppComponent> = TestBed.createComponent(AppComponent);
        // console.log(fixture.componentInstance)

        let comp:AppComponent = fixture.componentInstance;
        expect(comp).not.toBe(null);
        expect(comp).toBeDefined();
    })    
})