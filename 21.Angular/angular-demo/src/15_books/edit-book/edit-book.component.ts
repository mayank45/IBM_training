import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { BookService } from '../services/book.service';

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent implements OnInit {

  book: any = {};

  bookForm: FormGroup;

  constructor(private router: Router, private activatedRoute: ActivatedRoute, private bookService: BookService) { }

  ngOnInit(): void {
    this.activatedRoute.params.subscribe((params: any) => {
      console.log(params.id);

      // send request to fetch/find/load data from server where id = id
      this.findBook(params.id);
    })
  }

  findBook(id) {
    this.bookService.findBookById(id)
      .subscribe((res: any) => {
        console.log(res);
        this.book = res;


        this.initBookForm();
      })
  }


  initBookForm() {
    this.bookForm = new FormGroup({

      title: new FormControl(this.book.title, [
        Validators.required
      ]),
      author: new FormControl(this.book.author, Validators.required),
      price: new FormControl(this.book.price, [Validators.required, Validators.min(1)]),
      publisher: new FormControl(this.book.publisher, Validators.required),
      publishedDate: new FormControl(this.book.publishedDate, Validators.required),
      sn: new FormControl(this.book.sn, Validators.required)

    });

  }


  update(){
    console.log(this.bookForm.value);
    console.log(this.book.id);

    this.bookService.editBook(this.book.id, this.bookForm.value)
    .subscribe((res:any)=>{
      console.log(res);
      this.router.navigate(["list"]);
    })
  }

}






