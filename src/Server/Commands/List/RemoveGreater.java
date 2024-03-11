package Server.Commands.List;

import Server.Commands.ServerCommand;
import Server.Models.Organization;
import Server.Storage.CollectionManager;

public class RemoveGreater extends ServerCommand {
    public RemoveGreater() {
        super("remove_greater", "������� �� ��������� ��� ��������, ����������� ��������",
                new CommandArgument[]{new CommandArgument("element", Organization.class)});
    }

    @Override
    public String execute(CollectionManager collectionManager, CommandArgument[] args) {
        Integer id = (Integer) args[0].getValue();
        collectionManager.delete(id);
        return String.format("������� %s �����", id);
    }
}