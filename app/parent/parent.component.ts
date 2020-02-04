import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  score:number;
  showChild:boolean;
  constructor() {
    this.score=0;
    this.showChild=false;
   }

  ngOnInit() {
  }
  clickEventHandler(p1:string)
  {
    console.log(p1);
    this.score=parseInt(p1);
    this.showChild=true;

  }
  triggerParentEventHandler(p1)
  {
    alert("Event triggered in the parent from the child" +p1);
  }

}
