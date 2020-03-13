import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { User } from '../user';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register', 
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  selectedFiles: any;

  constructor(private router:Router,private userservice: UserService) { }
  user: User = new User();
  submitted = false;

  ngOnInit() {
    var id = window.localStorage.getItem("edit-username");
    if (id !== null && id != "") {
     this.userservice.find(id)
      .subscribe(data => {
       this.user = data;

       this.usersaveform.setValue(this.user);
  
      });
  
     this.submitted = false;
  
    }
  
  

  }
  selectFile(event) {

    const file = event.target.files.item(0);



    if (file.type.match('image.*')) {

     var size = event.target.files[0].size;

     if(size > 1000000)

     {

       alert("size must not exceeds 1 MB");

       this.usersaveform.get('profileimage').setValue("");

     }

     else

     {

      this.selectedFiles = event.target.files;

     }

    } else {

     alert('invalid format!');

    }



   }   



  usersaveform = new FormGroup({

    username: new FormControl('', [Validators.required, Validators.minLength(3)]),



    password: new FormControl('', [Validators.required, Validators.minLength(3)]),



    // confirmed: new FormControl('', [Validators.required]),



    firstname: new FormControl('', [Validators.required, Validators.minLength(3)]),



    lastname: new FormControl('', [Validators.required, Validators.minLength(3)]),



    email: new FormControl('', [Validators.required,Validators.email]),



    phone: new FormControl('', [Validators.required]),



    gender: new FormControl('', [Validators.required]),

    // usertype: new FormControl('', [Validators.required]),


    address: new FormControl('', [Validators.required]),
    profileimage: new FormControl()
  });



  saveUser(saveUser) {
    this.user = new User();
    this.user.username = this.UserName.value;
    this.user.password = this.Password.value;
    this.user.confirmed = "no";
    this.user.firstname = this.FirstName.value;
    this.user.lastname = this.LastName.value;
    this.user.email = this.Email.value;
    this.user.phone = this.Phone.value;
    this.user.gender = this.Gender.value;
    this.user.usertype = "user";
    this.user.address = this.Address.value;
    this.user.profileimage = this.Profileimage.value;
    this.submitted = true;
    this.save();
  }
  


  save() {
    this.userservice.saveUser(this.user)
      .subscribe(data => console.log(data), error => console.log(error));
    this.user = new User();
    window.localStorage.removeItem("edit-username");
    this.router.navigate(['userlist'])
  }

  get UserName() {



    return this.usersaveform.get('username');



  }

  get Password() {



    return this.usersaveform.get('password');



  }

  get Confirmed() {



    return this.usersaveform.get('confirmed');



  }



  
  get FirstName() {



    return this.usersaveform.get('firstname');



  }

  get LastName() {



    return this.usersaveform.get('lastname');



  }

  get Email() {



    return this.usersaveform.get('email');



  }

  get Phone() {



    return this.usersaveform.get('phone');



  }

  get Gender() {



    return this.usersaveform.get('gender');



  }
  get UserType() {



    return this.usersaveform.get('usertype');



  }


  get Address() {



    return this.usersaveform.get('address');



  }
  get Profileimage() {



    return this.usersaveform.get('profileimage');



  }
 


  saveUserForm() {

    this.submitted = false;

    this.usersaveform.reset();

  }



}

