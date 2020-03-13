import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { SectorService } from '../sector.service';
import { Sector } from '../sector';
import { Router } from '@angular/router';


@Component({
  selector: 'app-addsector',
  templateUrl: './addsector.component.html',
  styleUrls: ['./addsector.component.css']
})
export class AddsectorComponent implements OnInit {

  constructor(private router: Router,private sectorservice : SectorService) { }
 
 
 
  sector : Sector=new Sector();
 
 
 
  submitted = false;
 
 
 
 
 
 
 
  ngOnInit() {

    var sectorid=window.localStorage.getItem("edit-companyname");
    this.sectorservice.getSectorDetails(parseInt(sectorid))
  
      .subscribe(
  
       data => {
  
        this.sector =data;
  
        this.sectorsaveform.setValue(this.sector);
  
       }) ;
  
  
  
    this.submitted = false;
  
   }
 
 
 
  sectorsaveform=new FormGroup({
 
 
 
  sectorid:new FormControl('',[Validators.required , Validators.minLength(1) ]),

  sectorname:new FormControl('',[Validators.required]),

  brief:new FormControl('',[Validators.required]),

  
 
 
   });
 
 
 
  saveSector(saveSector){
 
 
 
  this.sector=new Sector();
 
 
  this.sector.sectorid=this.Sectorid.value;
 
  this.sector.sectorname=this.Sectorname.value;
  
  this.sector.brief=this.Brief.value;
  
 
 
  this.submitted = true;
 
 
 
  this.save();
 
 
 
  }
 
 
 
  save() {
 
 
 
  this.sectorservice.saveSectorDetails(this.sector)
 
 
 
   .subscribe(data => console.log(data), error => console.log(error));
 
 
 
  this.sector = new Sector();
  window.localStorage.removeItem("edit-companyname");



  this.router.navigate(['sector'])
 
 
 
  }
  get Sectorid(){
 
 
 
    return this.sectorsaveform.get('sectorid');
   
   
   
    }
 
 
 
 
 
 
  get Sectorname(){
 
 
 
  return this.sectorsaveform.get('sectorname');
 
 
 
  }
 
 
 
 
 
 
 
 
 
 
  get Brief(){
 
 
 
  return this.sectorsaveform.get('brief');
 
 
 
  }
  
 
  saveSectorForm(){
 
 
 
  this.submitted=false;
 
 
 
  this.sectorsaveform.reset();
 
 
 
  }
 
 

}
