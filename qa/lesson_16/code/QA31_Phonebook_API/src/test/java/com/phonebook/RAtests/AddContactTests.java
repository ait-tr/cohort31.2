package com.phonebook.RAtests;

import com.phonebook.dto.ContactDto;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class AddContactTests extends TestBase{

    @Test
    public void addContactSuccessTest() {
        ContactDto dto = ContactDto.builder()
                .name("Adam")
                .lastName("Kross")
                .email("kross@gm.com")
                .phone("1234567890")
                .address("Koblenz")
                .description("goalkeeper")
                .build();

        //MessageDto message =
                given()
                .contentType(ContentType.JSON)
                .header(AUTH, token)
                .body(dto)
                .when()
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message",containsString("Contact was added!"));
              //  .extract().response().as(MessageDto.class);
       // System.out.println(message.getMessage());
    }
}

//Contact was added! ID: da4ffb9f-bb7c-41c1-9347-6fbf585dd423
