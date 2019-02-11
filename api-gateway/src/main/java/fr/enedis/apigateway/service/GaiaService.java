package fr.enedis.apigateway.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("gaia-service")
public interface GaiaService
{
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello();
}
