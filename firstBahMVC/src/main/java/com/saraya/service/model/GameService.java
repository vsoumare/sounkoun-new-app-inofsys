package com.saraya.service.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.saraya.model.Game;

@Repository
public class GameService {
	private static List<Game> games = new ArrayList<>();
	static int gameCount = 6;
	
	static {
				games.add(new Game(1,"Mario", "Adventure","A truly Legacy Adv", "$55.25"));
				games.add(new Game(2,"Super Man", "Action","A truly action Adv", "$5.25"));
				games.add(new Game(3,"Batman", "Action","A truly Legacy action", "$55.2"));
				games.add(new Game(4,"Supergirl", "Action","A action truly Legacy Adv", "$55.5"));
				games.add(new Game(5,"Batgirl", "Action","A truly action Legacy Adv", "$5.5"));
				games.add(new Game(6,"Fifa", "Sport","A truly sport Adv", "$55.25"));
	}
	
	public List<Game> retrieveAllGame(){
		return games;
	}
	
	public void addGame(String name, String genre, String description, String price) {
		games.add(new Game(++gameCount, name, genre, description, price));
	}
	
	public Game retrieveOneGame(int id) {
		for(Game game: games) {
			if(game.getId() == id) {
				return game;
			}
		}
		return null;
	}
	
	public void deleteGame(int id) {
		Iterator<Game> iterator = games.iterator();
		while(iterator.hasNext()) {
			Game game = iterator.next();
			if(game.getId() ==(id)) {
				iterator.remove();
			}
		}
	}
}
