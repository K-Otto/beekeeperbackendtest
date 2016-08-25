package otto.factory;

import otto.domain.Staff;

import java.util.Map;

/**
 * Created by Karl Otto on 4/10/2016.
 */
public class StaffFactory {

    public static Staff createStaffMember(Map<String, String> values){

        Staff staff = new Staff.Builder().name(values.get("name"))
                .idNumber(values.get("idNumber")).password(values.get("password")).surname(values.get("surname"))
                .build();

        return staff;
    }

}
