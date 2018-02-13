/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import command.creator.RoutingManager;
import interfaces.ActionCommand;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Melnikov
 */
public class AddWordCommand implements ActionCommand{

    @Override
    public String execute(HttpServletRequest request) {
        request.setAttribute("info", "Hello from AddWordCommand");
        return RoutingManager.getRoute("path.page.addWord");
    }
    
}
