package Server.Models;

import Server.Storage.OrderedItem;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static Server.Models.FieldParameters.*;

public class Organization extends BaseModel {
    ModelField<String> name = new ModelField<>("", Map.of(
            NOT_NULL, true,
            NOT_EMPTY, true
    ));
    private final ModelField<Coordinates> coordinates = new ModelField<>(null, Map.of(
            NOT_NULL, true
    ));
    private final ModelField<java.time.ZonedDateTime> creationDate = new ModelField<>(null, Map.of(
            NOT_NULL, true,
            AUTO_GENERATE, true
    ));
    private final ModelField<Float> annualTurnover = new ModelField<>(0F, Map.of(
            MIN, 1
    ));
    private final ModelField<Address> postalAddress = new ModelField<>(null, Map.of(
            NOT_NULL, true
    ));
    private final ModelField<OrganizationType> type = new ModelField<>(null, Map.of(
            NOT_NULL, true
    ));
}