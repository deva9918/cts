package com.spring.cts.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cts.dao.SectorRepository;
import com.spring.cts.pojo.IpoDetails;
import com.spring.cts.pojo.Sector;
@RestController
@RequestMapping
public class SectorController {
	@Autowired

	private SectorRepository sectorRepository;

	@RequestMapping("/getSectorId")

	public Iterable<Sector> getAllSectorDetails() {

		return sectorRepository.findAll();

	}

	@PostMapping("/saveSector")

	public Sector saveSectorDetails(@RequestBody Sector sector) {

		System.out.println(sector);

		sectorRepository.save(sector);

		return sector;

	}

	@PutMapping("/updateSector/{sectorid}")

	public Sector updateSectorDetails(@RequestBody Sector sector, @PathVariable("sectorid") Integer sectorid) {

		sector.setSectorid(sectorid);

		System.out.println(sector);

		sectorRepository.save(sector);

		return sector;

	}

	@DeleteMapping("/deleteSectordetails/{sectorid}")

	public Boolean deleteIpoDetails(@PathVariable("sectorid") Integer sectorid) {

		System.out.println(sectorid);

		Optional<Sector> sector = sectorRepository.findById(sectorid);

		sectorRepository.delete(sector.get());

		return true;

	}

	@GetMapping("/findOneInAll3/{sectorid}")

	public Sector findoneinall(@PathVariable("sectorid") Integer sectorid)

	{

		Optional<Sector> sector = sectorRepository.findById(sectorid);

		return sector.get();

	}
}
