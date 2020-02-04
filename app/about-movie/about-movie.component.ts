import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-about-movie',
  templateUrl: './about-movie.component.html',
  styleUrls: ['./about-movie.component.css']
})
export class AboutMovieComponent implements OnInit {
@Input() dataToParent;
@Output() dataFromChild = new EventEmitter<number>();
  constructor() { }

  ngOnInit() {
  }
  clickEventHandler(item1)
  {
    console.log(item1);
    this.dataFromChild.emit(item1);
  }
  

}
