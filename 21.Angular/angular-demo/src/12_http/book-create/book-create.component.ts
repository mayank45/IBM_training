import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { BookService } from '../services/book.service';

@Component({
  selector: 'app-book-create',
  templateUrl: './book-create.component.html',
  styleUrls: ['./book-create.component.css']
})
export class BookCreateComponent implements OnInit {

  bookForm: FormGroup;
  /*
title;
author;
price;
publisher;
publishedDate;//yyyy-MM-dd
sn;
  */

  constructor(private bookService:BookService) {
  }

  ngOnInit(): void {
    this.bookForm = new FormGroup({

      title: new FormControl("Default title", [
        Validators.required
      ]),
      author: new FormControl("Default author", Validators.required),
      price: new FormControl("99", [Validators.required, Validators.min(1)]),
      publisher: new FormControl("Nutan", Validators.required),
      publishedDate: new FormControl("1986-07-31", Validators.required),
      sn: new FormControl("123456", Validators.required)

    });
  }

  create(){
    console.log(this.bookForm.value);
    this.bookService.saveBook(this.bookForm.value)

    .subscribe((res:any)=>{
      console.log(res);

      this.bookService.getBooks().subscribe((res:any)=>{
        this.bookService.books = res;
      })
    })
  }

}
