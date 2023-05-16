package net.netbase;

/*import com.fasterxml.jackson.core.JsonProcessingException;
import net.netbase.entities.User;
import net.netbase.helpers.CurrentWorkDirectoryHelper;*/

import net.netbase.lessions.Chapter2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
/*        System.out.printf("Hello and welcome!");
        String userJsonString = " {\r\n    \"id\": 7,\r\n    \"email\": \"michael.lawson@reqres.in\",\r\n    \"firstName\": \"Michael\",\r\n    \"lastName\": \"Lawson\",\r\n    \"avatar\": \"https://reqres.in/img/faces/7-image.jpg\"\r\n}";
        Class<User> cls = User.class;
        User u = User.<User>fromJsonClass(userJsonString, cls);
        System.out.printf(u.getId() + u.getFirstName() + u.getLastName() + u.getEmail() + u.getAvatar());
        System.out.println(u.toJsonString());
        System.out.println((CurrentWorkDirectoryHelper.currentWorkingDirectory()));*/
        Chapter2.learn();
    }
}