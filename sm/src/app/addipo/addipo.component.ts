import { Component, OnInit } from '@angular/core';




import { Company } from '../company';



import { FormGroup, FormControl, Validators } from '@angular/forms';
import { IpodetailsService } from '../ipodetails.service';
import { Ipodetails } from '../ipodetails';
import { Router } from '@angular/router';



@Component({
  selector: 'app-addipo',
  templateUrl: './addipo.component.html',
  styleUrls: ['./addipo.component.css']
})
export class AddipoComponent implements OnInit {



  constructor(private router: Router, private ipodetailsservice: IpodetailsService) { }



  ipodetails: Ipodetails = new Ipodetails();



  submitted = false;







  ngOnInit() {

    var id = window.localStorage.getItem("edit-ipoid");
    if (id !== null && id != "") {
      this.ipodetailsservice.getIpoDetails(parseInt(id))

        .subscribe(

          data => {

            this.ipodetails = data;

            this.ipodetailssaveform.setValue(this.ipodetails);

          });

    }

    this.submitted = false;

  }



  ipodetailssaveform = new FormGroup({



    ipoid: new FormControl('', [Validators.required, Validators.minLength(1)]),

    companyname: new FormControl('', [Validators.required]),

    opendatetime: new FormControl('', [Validators.required]),

    pricepershare: new FormControl('', [Validators.required]),

    stockexchange: new FormControl('', [Validators.required, Validators.minLength(1)]),

    totalnoofshares: new FormControl('', [Validators.required, Validators.minLength(1)]),


  });



  saveIpodetails(saveIpodetails) {



    this.ipodetails = new Ipodetails();


    this.ipodetails.ipoid = this.Ipoid.value;

    this.ipodetails.companyname = this.CompanyName.value;

    this.ipodetails.opendatetime = this.Opendatetime.value;
    this.ipodetails.pricepershare = this.Pricepershare.value;
    this.ipodetails.stockexchange = this.Stockexchange.value;
    this.ipodetails.totalnoofshares = this.Totalnoofshares.value;



    this.submitted = true;



    this.save();



  }



  save() {



    this.ipodetailsservice.saveIpoDetails(this.ipodetails)



      .subscribe(data => console.log(data), error => console.log(error));



    this.ipodetails = new Ipodetails();

    window.localStorage.removeItem("edit-ipoid");



    this.router.navigate(['ipodetails'])


  }
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



  saveCompanyForm() {



    this.submitted = false;



    this.ipodetailssaveform.reset();



  }





}
