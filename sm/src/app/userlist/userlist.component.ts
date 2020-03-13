import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { User } from '../user';
import { UserService } from '../user.service';
import { Observable } from 'rxjs/internal/Observable';
import { Router } from '@angular/router';
@Component({
  selector: 'app-userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {
  constructor(private router:Router, private userservice: UserService) { }
  userList: Observable<User[]>;
  user: User = new User();
  deleteMessage = false;
  isupdated = false;
  ngOnInit() {
    this.userservice.getAllUser().subscribe(data => {
      this.userList = data;
    })
  }
  deleteUser(user:User)
 {
 this.userservice.deleteUser(user.username).subscribe(data=>{
 this.userservice.getAllUser().subscribe(data=>{this.userList=data;});
 });
 }
 updateUser(user : User ) {

  window.localStorage.removeItem("edit-username");



  window.localStorage.setItem("edit-username", user.username.toString());



  this.router.navigate(['signup']);

  };

 }
 /*
  userupdateform = new FormGroup({
    username: new FormControl(),
    password: new FormControl(),
    email: new FormControl(),
    phone: new FormControl(),
    firstname: new FormControl(),
    lastname: new FormControl(),
    gender: new FormControl(),
    confirmed: new FormControl(),
  });
  get Username() {
    return this.userupdateform.get('username');
  }
  get Password() {
    return this.userupdateform.get('password');
  }
  get Email() {
    return this.userupdateform.get('email');
  }
  get Phone() {
    return this.userupdateform.get('phone');
  }
  get Firstname() {
    return this.userupdateform.get('firstname');
  }
  get Lastname() {
    return this.userupdateform.get('lastname');
  }
  get Address() {
    return this.userupdateform.get('address');
  }
  get Gender() {
    return this.userupdateform.get('gender');
  }
  get Confirmed() {
    return this.userupdateform.get('confirmed');
  }
  changeisUpdate() {
    this.isupdated = false;
  }
}

*/