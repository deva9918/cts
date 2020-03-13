import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StockexchangeService } from '../stockexchange.service';
import { Stockexchange } from '../stockexchange';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addstockexchange',
  templateUrl: './addstockexchange.component.html',
  styleUrls: ['./addstockexchange.component.css']
})
export class AddstockexchangeComponent implements OnInit {
  constructor(private router:Router,private stockexchangeservice : StockexchangeService) { }
 
 
 
  stockexchange: Stockexchange=new Stockexchange();
 
 
 
  submitted = false;
 
  ngOnInit() {

    var seid=window.localStorage.getItem("edit-seid");
    if(seid !=null && seid !="")
    {
    this.stockexchangeservice.findOneInAll4(parseInt(seid))
  
      .subscribe(
  
       data => {
  
        this.stockexchange =data;
  
        this.stockexchangesaveform.setValue(this.stockexchange);
  
       }) ;
  
  
  
    this.submitted = false;
  
   }
 
  }
 
 
 
 
 
  stockexchangesaveform=new FormGroup({
 
 
 
  seid:new FormControl('',[Validators.required , Validators.minLength(5) ]),

  brief:new FormControl('',[Validators.required]),

  contact_address:new FormControl('',[Validators.required]),
  remarks:new FormControl('',[Validators.required , Validators.minLength(5) ]),
  stock_exchange:new FormControl('',[Validators.required , Validators.minLength(5) ]),
  
 
 
   });
 
 
 
  saveStockExchange(saveStockExchange){
 
 
 
  this.stockexchange=new Stockexchange();
 
 
  this.stockexchange.seid=this.Seid.value;
  this.stockexchange.brief=this.Brief.value;
 
  this.stockexchange.contact_address=this.Contact_address.value;
  
 
  this.stockexchange.remarks=this.Remarks.value;
 
  this.stockexchange.stock_exchange=this.Stock_exchange.value;
  
  
 
 
  this.submitted = true;
 
 
 
  this.save();
 
 
 
  }
 
 
 
  save() {
 
 
 
  this.stockexchangeservice.savestockexchange(this.stockexchange)
 
 
 
   .subscribe(data => console.log(data), error => console.log(error));
 
 
 
  this.stockexchange = new Stockexchange();
  window.localStorage.removeItem("edit-seid");



  this.router.navigate(['stockexchange'])
 
 
 
  }
  get Seid(){
 
 
 
    return this.stockexchangesaveform.get('seid');
   
   
   
    }
 
 
 
 
 
 
  get Brief(){
 
 
 
  return this.stockexchangesaveform.get('brief');
 
 
 
  }
  get Contact_address(){
 
 
 
    return this.stockexchangesaveform.get('contact_address');
   
   
   
    }
    get Remarks(){
 
 
 
      return this.stockexchangesaveform.get('remarks');
     
     
     
      }
      get Stock_exchange(){
 
 
 
        return this.stockexchangesaveform.get('stock_exchange');
       
       
       
        }
       
  
 
  saveStockExchangeForm(){
 
 
 
  this.submitted=false;
 
 
 
  this.stockexchangesaveform.reset();
 
 
 
  }
 

}

