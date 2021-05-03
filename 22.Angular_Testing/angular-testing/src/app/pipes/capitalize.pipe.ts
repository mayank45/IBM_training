import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'capitalize'
})
export class CapitalizePipe implements PipeTransform {

  transform(str: string, args?: any): string {
    return str.charAt(0).toUpperCase() + str.slice(1).toLowerCase();
  }


}
