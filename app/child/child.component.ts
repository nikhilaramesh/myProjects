import { Component, OnInit, Input, EventEmitter,Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
@Input() dataToChild:number;
@Output() triggerParentEvent =new EventEmitter<number>();
newData:number;
  constructor() { }

  ngOnInit() {
    console.log("data received from parent", this.dataToChild);
    //alert(this.dataToChild);
    this.newData=this.dataToChild*100;

  }
  sendDataToParentEventHandler()
  {
    this.triggerParentEvent.emit(this.newData);
  }

}
