import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../user';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  constructor(private userservice: UserService) { }
  userList: Observable<User[]>;
  user: User = new User();
  

  ngOnInit() {
    this.userservice.getAllUser().subscribe(data => {
      this.userList = data;
    })

  }

}
