/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.creator;

import command.AddWordCommand;
import command.EmptyCommand;
import command.LoginCommand;
import command.MemoWordsCommand;
import command.RegistrationCommand;
import interfaces.ActionCommand;

/**
 *
 * @author Melnikov
 */
public enum CreatorClassEnum {
    EMPTY{{this.command = new EmptyCommand();}},
    LOGIN{{this.command = new LoginCommand();}},
    MEMOWORDS{{this.command = new MemoWordsCommand();}},
    ADDWORD{{this.command = new AddWordCommand();}},
    REGISTRATION{{this.command = new RegistrationCommand();}},
    ;
    ActionCommand command;
    public ActionCommand getActionCommand(){
        return this.command;
    }
}
