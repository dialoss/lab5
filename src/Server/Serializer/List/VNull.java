package Server.Serializer.List;

import Common.Exceptions.NotNullField;

import java.lang.reflect.Field;

public class VNull extends Validator {
    public VNull() {
        super("NULL");
    }

    @Override
    public void validate(Field f, Object value, Object declaredValue) {
        if (!((boolean) declaredValue) && value == null)
            throw new NotNullField(String.format("���� %s �� ����� ���� NULL", f.getName()));
    }
}