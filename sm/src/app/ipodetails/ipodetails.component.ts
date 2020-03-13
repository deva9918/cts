import { Component, OnInit } from '@angular/core';
import { Company } from 'src/app/company';
import { Observable } from 'rxjs';
import { IpodetailsService } from '../ipodetails.service';
import { Ipodetails } from '../ipodetails';
import { Router } from '@angular/router';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-ipodetails',
  templateUrl: './ipodetails.component.html',
  styleUrls: ['./ipodetails.component.css']
})
export class IpodetailsComponent implements OnInit {

  isupdated: boolean;

 constructor(private router:Router, private ipodetailsservice: IpodetailsService) { }



 ipodetailsList: Observable<Company[]>;



 ngOnInit() {



  this.ipodetailsservice.getAllIpoDetails().subscribe(data => {



   this.ipodetailsList = data;



  })

 }

 deleteIpo(ipos : Ipodetails ) {

  this.ipodetailsservice.deleteIpoDetails(ipos.ipoid)

   .subscribe(

    data => {

     this.ipodetailsservice.getAllIpoDetails().subscribe(data =>{

      this.ipodetailsList =data;

      });



    }) ;

 };

 updateIpo(ipos : Ipodetails ) {

 window.localStorage.removeItem("edit-ipoid");

 window.localStorage.setItem("edit-ipoid", ipos.ipoid.toString());

 this.router.navigate(['addipo']);

 };

 ipodetailssaveform = new FormGroup({



  ipoid: new FormControl('', [Validators.required, Validators.minLength(1)]),

  companyname: new FormControl('', [Validators.required]),

  opendatetime: new FormControl('', [Validators.required]),

  pricepershare: new FormControl('', [Validators.required]),

  stockexchange: new FormControl('', [Validators.required, Validators.minLength(1)]),

  totalnoofshares: new FormControl('', [Validators.required, Validators.minLength(1)]),


});
get Ipoid() {



  return this.ipodetailssaveform.get('ipoid');



}






get CompanyName() {



  return this.ipodetailssaveform.get('companyname');



}










get Opendatetime() {



  return this.ipodetailssaveform.get('opendatetime');



}

get Pricepershare() {



  return this.ipodetailssaveform.get('pricepershare');



}
get Stockexchange() {



  return this.ipodetailssaveform.get('stockexchange');



}
get Totalnoofshares() {



  return this.ipodetailssaveform.get('totalnoofshares');



}

 }






