import { Component, OnInit } from '@angular/core';
import { BookService } from '../services/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  constructor(public bookService:BookService) { }

  ngOnInit(): void {
    this.getAllBooks();
  }

  getAllBooks(){
    this.bookService.getBooks()
    .subscribe((res:any)=>{
      console.log(res);
      // this.books = res;
      this.bookService.books = res;
    })
  }


  deleteBook(book){
    this.bookService.deleteBook(book.id)
    .subscribe((res:any)=>{
      this.getAllBooks();
    })
  }

}
