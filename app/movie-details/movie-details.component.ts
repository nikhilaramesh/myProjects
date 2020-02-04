import { Component, OnInit } from '@angular/core';
import { Movie } from '../movie';

@Component({
  selector: 'app-movie-details',
  templateUrl: './movie-details.component.html',
  styleUrls: ['./movie-details.component.css']
})
export class MovieDetailsComponent implements OnInit {
  movArr:Movie[]=new Array();
  showView:boolean;
  showMovie:Movie;
  ticketsArr:number[] = new Array();
  constructor()
   {
    this.movArr[0]=new Movie("Rang de basanti","Movie to be watched on 24th jan 2020","../../assets/rdb.jpg");
    this.movArr[1]=new Movie("Zindagi Na Milegi Dobara","Its one such movie filled with fun!","../../assets/znmd.jpg");
    this.movArr[2]=new Movie("Taare Zameen Par","Changes your perspective,must watch!","../../assets/tzp.jpg");
    this.showView=false;
    for(var i=0;i<this.movArr.length;i++)
    {
      this.ticketsArr[i]=0;
    }
  }

  ngOnInit() 
  {
  }
  viewEventHandler(item)
  {
    this.showView=true;
    this.showMovie=item;
  }
  showTickets(item2)
  {
    console.log(item2);
  }
}