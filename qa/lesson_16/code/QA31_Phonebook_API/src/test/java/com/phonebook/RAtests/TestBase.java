package com.phonebook.RAtests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static final String token =
            "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoibWFudWVsQGdtLmNvbSIsImlzcyI6IlJlZ3VsYWl0IiwiZXhwIjoxNzExMDExNjM3LCJpYXQiOjE3MTA0MTE2Mzd9.HdeGtuAoKGVVoHRwfAVRLMMPNEpsAvG3Ymw4ZRxPCyU";

    public static final String AUTH = "Authorization";

    @BeforeMethod
    public void init() {
        RestAssured.baseURI = "https://contactapp-telran-backend.herokuapp.com";
        RestAssured.basePath = "v1";
    }
}
