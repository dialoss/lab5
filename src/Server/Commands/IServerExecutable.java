package Server.Commands;

import Server.Commands.List.CommandArgument;
import Server.Storage.CollectionManager;

public interface IServerExecutable {
    String execute(CollectionManager collectionManager, CommandArgument[] args);
}