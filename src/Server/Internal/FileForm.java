package Server.Internal;

import Client.Shell.IForm;
import Client.Shell.IOdevice;

public class FileForm extends IForm {
    public FileForm(IOdevice device) {
        super(device);
    }

    @Override
    protected void validationError(String message) {
    }

    @Override
    protected String input() {
        return this.device.input();
    }

    @Override
    protected void out(String data) {
    }
}