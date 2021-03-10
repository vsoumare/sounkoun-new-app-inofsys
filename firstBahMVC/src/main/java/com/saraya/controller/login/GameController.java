package com.saraya.controller.login;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.saraya.controller.service.authentication.LoginService;
import com.saraya.model.Game;
import com.saraya.service.model.GameService;

@Controller
public class GameController {
	@Autowired
	GameService gameService;
	
	@RequestMapping(value="/game", method = RequestMethod.GET)
	
	//@ResponseBody
	public String showLoginPage(ModelMap model) {
		model.put("game", gameService.retrieveAllGame());
		return "gamelist";
	}
	
	
	@RequestMapping(value="/detail", method = RequestMethod.GET)
	public String showDetailPage(ModelMap model, @RequestParam int id) {
		model.put("game", gameService.retrieveOneGame(id));
		return "gamedetail";
	}
	
	@RequestMapping(value="/deletegame", method = RequestMethod.GET)
	public String deleteOneGame(@RequestParam int id) {
	 gameService.deleteGame(id);
		return "redirect:/game";
	}
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String createOneGame(ModelMap model) {
		model.addAttribute("game", new Game());
	
		return "creategame";
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST)
	public String createOne(ModelMap model, @Valid Game game, BindingResult result) {
			
		if(result.hasErrors()) {
			return "creategame";
		}else {
			gameService.addGame(game.getName(), game.getGenre(), game.getDescription(), game.getPrice());
			model.clear();
			return "redirect:/game";
		}
		
	}



}
