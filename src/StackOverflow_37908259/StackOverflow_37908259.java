package StackOverflow_37908259;


/**
 * This is the answer for StackOverflow post 37908259
 */

public class StackOverflow_37908259 {

    StackOverflow_37908259() {
        String name = "", username = "", age = "", password = "";

        Response.Listener<String> responseListener = new Response.Listener<String>() {

            RegisterRequest registerRequest = new RegisterRequest(name, username, age, password, this);

            @Override
            public void onResponse(String response) {

            }

        };
    }

}
