package com.spring.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cts.JSONCompanyClient;
import com.spring.cts.dao.CompanyRepository;
import com.spring.cts.pojo.Company;
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/company")
public class CompanyController {
	@Autowired
	JSONCompanyClient jcompany;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	
	
		@RequestMapping("/getAllCompanies")
	public Iterable<Company> getAllCompanies()
	{
		return companyRepository.findAll();	
	}
		
		
		
		@PostMapping("/saveCompany")
		public Company saveCompany(@RequestBody Company company)
		{
			System.out.println(company);
			companyRepository.save(company);
			return company;
		}
		
		@PutMapping("/updatecompany/{companyname}")
		public Company updateCompany(@RequestBody Company company,@PathVariable("companyname") String companyname)
		{
			company.setCompanyname(companyname);
			System.out.println(company);
			companyRepository.save(company);
			return company;
		}

		@DeleteMapping("/deletecompany/{companyname}")
		public boolean deletecompany(@PathVariable("companyname") String companyname)
		{

			
			companyRepository.deleteById(companyname);
			return true;
		}
		@GetMapping("/findOneInAll1/{companyname}")
		public  Company findOneInAll1(@PathVariable("companyname") String companyname)
		{
			
			
			Optional<Company> company= companyRepository.findById(companyname);
			Company comp=company.get();

			 comp.setStockPriceList(jcompany.findByCompanyname(companyname));
			return company.get();
			
			
		}
}

