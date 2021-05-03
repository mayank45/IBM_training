import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'myDate'
})
export class MyDatePipe implements PipeTransform {

  transform(timeInMillis: number): Date {
    return new Date(timeInMillis);
  }

}
