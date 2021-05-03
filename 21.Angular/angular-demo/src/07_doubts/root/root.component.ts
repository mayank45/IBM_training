import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './root.component.html',
  styleUrls: ['./root.component.css']
})
export class RootComponent implements OnInit {

  images:string[] = [
    "https://m.media-amazon.com/images/M/MV5BMTQ3ZGIzNjMtYWJhMC00MDRhLTgyYWItMjBjNzM0MTIzM2JlXkEyXkFqcGdeQWRvb2xpbmhk._V1_CR1,0,1109,624_AL_UX477_CR0,0,477,268_AL_.jpg",
    "https://filmschoolrejects.com/wp-content/uploads/2021/02/Tom-Jerry-Best-Cartoons-HBO-Max.jpg",
    "https://static.toiimg.com/photo/msid-79277884/79277884.jpg?212066",
    "https://img.jakpost.net/c/2020/04/22/2020_04_22_93420_1587522578._medium.jpg"
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
