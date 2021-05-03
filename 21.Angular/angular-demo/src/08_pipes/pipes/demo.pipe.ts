import { Pipe } from "@angular/core";

@Pipe({name: "demo"})
export class DemoPipe{
    transform(value:any, str:string){
        let obj = JSON.parse(str);
        let a = obj.a;
        let b = obj.b;
        let c = obj.c;
        console.log(a)
        console.log(b)
        console.log(c)
        return "demo string";
    }
}