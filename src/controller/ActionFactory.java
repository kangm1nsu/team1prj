package controller;

import imp.AdminActionLogin;

public class ActionFactory {

	public Action getAction(String command) {
		Action action = null;
		
		switch (command) {
		case "LOGIN" :
			action = new AdminActionLogin();
			break;
			
		
		}
		
		return action;
	}

}
