import { Pipe } from "@angular/core";

@Pipe({name: 'capitalize'})
export class CapitalizePipe{
    transform(input:string, n:number):string{
        console.log("input value is : "+input)
        if(!!n && n>0){
            return (input.charAt(0).toUpperCase()+input.substr(1).toLowerCase()).substring(0, n)+"...";
        } else {
            return input.charAt(0).toUpperCase()+input.substr(1).toLowerCase();
        }
    }

}
