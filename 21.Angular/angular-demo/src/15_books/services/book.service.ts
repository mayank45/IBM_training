import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private data:any[] = [];

  public set books(books){
    this.data = books;
  }
  public get books(){
    return this.data;
  }

  private host:string = "http://localhost:8080";

  constructor(private http: HttpClient) { }

  getBooks(){
    return this.http.get(`${this.host}/books`);
  }
  saveBook(book){
    return this.http.post(`${this.host}/books`, book);
  }

  deleteBook(id){
    return this.http.delete(`${this.host}/books/${id}`);
  }

  findBookById(id){
    return this.http.get(`${this.host}/books/${id}`);
  }

  editBook(id, newBook){
    return this.http.put(`${this.host}/books/${id}`, newBook);
  }
}
