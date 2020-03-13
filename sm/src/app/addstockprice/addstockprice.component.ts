import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StockpriceService } from '../stockprice.service';
import { Stockprice } from '../stockprice';
import { Router } from '@angular/router';


@Component({
  selector: 'app-addstockprice',
  templateUrl: './addstockprice.component.html',
  styleUrls: ['./addstockprice.component.css']
})
export class AddstockpriceComponent implements OnInit {

  constructor(private router: Router, private stockepriceservice : StockpriceService) { }
 
 
 
  stockprice: Stockprice=new Stockprice();
 
 
 
  submitted = false;
 
 
  ngOnInit() {

    var stockexchange=window.localStorage.getItem("edit-stockexchange");
  
    if(stockexchange !=null && stockexchange !="")
    {
    this.stockepriceservice.getStockPrice(stockexchange)
  
      .subscribe(
  
       data => {
  
        this.stockprice =data;
  
        this.stockpricesaveform.setValue(this.stockprice);
  
       }) ;
  
  
  
    this.submitted = false;
  
   }
  }
 
  stockpricesaveform=new FormGroup({
 
 
 
  companyname:new FormControl('',[Validators.required , Validators.minLength(1) ]),

  stockexchange:new FormControl('',[Validators.required]),

  currentprice:new FormControl('',[Validators.required]),
  date:new FormControl('',[Validators.required , Validators.minLength(1) ]),
  time:new FormControl('',[Validators.required , Validators.minLength(1) ]),
  uploadfile: new FormControl()
 
 
   });
 
 
 
  saveStockprice(saveStockprice){
 
 
 
  this.stockprice=new Stockprice();
 
 
  this.stockprice.companyname=this.Companyname.value;
  this.stockprice.stockexchange=this.Stockexchange.value;
 
  this.stockprice.currentprice=this.Currentprice.value;
  
 
  this.stockprice.date=this.Date.value;
 
  this.stockprice.time=this.Time.value;
  this.stockprice.uploadfile=this.Uploadfile.value;
  
 
 
  this.submitted = true;
 
 
 
  this.save();
 
 
 
  }
 
 
 
  save() {
 
 
 
  this.stockepriceservice.saveStockPrice(this.stockprice)
 
 
 
   .subscribe(data => console.log(data), error => console.log(error));
    
 
 
  this.stockprice = new Stockprice();
  window.localStorage.removeItem("edit-stockexchange");



  this.router.navigate(['stockprice']);
 
 
  }
  get Companyname(){
 
 
 
    return this.stockpricesaveform.get('companyname');
   
   
   
    }
 
 
 
 
 
 
  get Stockexchange(){
 
 
 
  return this.stockpricesaveform.get('stockexchange');
 
 
 
  }
  get Currentprice(){
 
 
 
    return this.stockpricesaveform.get('currentprice');
   
   
   
    }
    get Date(){
 
 
 
      return this.stockpricesaveform.get('date');
     
     
     
      }
      get Time(){
 
 
 
        return this.stockpricesaveform.get('time');
       
       
       
        }
        get Uploadfile() {



          return this.stockpricesaveform.get('ploadfile');
      
      
        }
  
 
  saveStockpriceForm(){
 
 
 
  this.submitted=false;
 
 
 
  this.stockpricesaveform.reset();
 
 
 
  }
 
 

}
