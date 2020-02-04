import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MyFirstProject';
  UserName:string;
  Password:string;
  txtUserName(e){
    console.log(e);
    console.log(e.target.value);
    this.UserName=e.target.value;
  }
  txtPassword(e){
    this.Password=e.target.value;
  }
  printDetails(e)
  {
    this.UserName=e.target.value;
    this.Password=e.target.value;

  }
}
