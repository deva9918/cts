import { Component, OnInit } from '@angular/core';

import { Company } from 'src/app/company';

import { Observable } from 'rxjs';

import { CompanyService } from 'src/app/company.service';
import { Router } from '@angular/router';

@Component({

 selector: 'app-managecompany',

 templateUrl: './managecompany.component.html',

 styleUrls: ['./managecompany.component.css']

})

export class ManagecompanyComponent implements OnInit {

 isupdated: boolean;

 constructor(private router: Router,private companyservice: CompanyService) { }



 companyList: Observable<Company[]>;



 ngOnInit() {



  this.companyservice.getAllCompanies().subscribe(data => {



   this.companyList = data;



  })

 }
 deleteCompany(company : Company ) {

   this.companyservice.deleteCompany(company.companyname)

    .subscribe(

     data => {

      this.companyservice.getAllCompanies().subscribe(data =>{

       this.companyList =data;

       });
     }) ;

  }

  updateCompany(company : Company ) {

  window.localStorage.removeItem("edit-companyname");

  window.localStorage.setItem("edit-companyname", company.companyname.toString());

  this.router.navigate(['addcompany']);

  }



  }















