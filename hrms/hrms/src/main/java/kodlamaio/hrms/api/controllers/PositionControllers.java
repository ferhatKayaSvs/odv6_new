package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstruct.PositionService;
import kodlamaio.hrms.entities.concretes.Position;
@RestController
@RequestMapping("/api/position")
public class PositionControllers {

	private PositionService positionService;

	@Autowired
	public PositionControllers(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
    
	@GetMapping("/getall")
	public List<Position> getAll() {
		return this.positionService.getAll();

	}

}
