package fr.enedis.apigateway.controller;

import fr.enedis.apigateway.service.GaiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/gaia")
public class GaiaController
{
	private GaiaService gaiaService;

	@Autowired
	public GaiaController(GaiaService gaiaService)
	{
		this.gaiaService = gaiaService;
	}

	@RequestMapping(value = "/hello")
	public String hello()
	{
		return this.gaiaService.hello();
	}
}
