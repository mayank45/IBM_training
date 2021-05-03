import { DebugElement } from "@angular/core";
import { ComponentFixture, TestBed } from "@angular/core/testing";
import { By } from "@angular/platform-browser";
import { AppComponent } from "./app.component";


describe("AppComponent_2", function(){

    let fixture:ComponentFixture<AppComponent> = null;
    let comp:AppComponent = null;
    let de:DebugElement = null;

    beforeEach(function(){
        TestBed.configureTestingModule({
            declarations: [AppComponent]
        }).compileComponents();
    })

    beforeEach(function(){
        fixture = TestBed.createComponent(AppComponent);
        comp = fixture.componentInstance;
    })
    
    it("should be created", function(){
        expect(comp).not.toBe(null);
        expect(comp).toBeDefined();
    })    
    
    it("should have input boxes", function(){
        let des:DebugElement[] = fixture.debugElement.queryAll(By.css("input"));
        fixture.detectChanges();

        console.log("+++++++")
        expect(des.length).toBe(2);
    })
    it("should have h5 saying 'Enter number'", ()=>{
        // document.getElementByTagName('h5')
        
        de = fixture.debugElement.query(By.css("#sTitle"));
        fixture.detectChanges();

        // console.log("+++++++")
        // console.log(de.nativeElement);


        let sh5Heading = de.nativeElement;
        // console.log(sh5Heading.innerText);

        expect(sh5Heading.innerText).toMatch(comp.title);
        expect(sh5Heading.innerText).toContain("number")
    })
})