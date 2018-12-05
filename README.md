# Oauth2ResourceServer

Don't forget to edit the issuer-uri in application.properties
Upon starting, the Resource Server will fetch the issuer public key. This key will allow token validation.

Once you have a JWT ready, you can test the app in a terminal this way:
```bash
export TOKEN=your_generated_token
curl -H "Authorization: Bearer $TOKEN" localhost:8080/
```
This ResourceServer work well with third party JWT authentication, like Firebase.

_________________

To improve towards a Resource Server with user specific data endpoints:
- Default AuthenticationManager still displaying random useless password in terminal.
- In the controller, you can get jwt or principal with @AuthenticationPrincipal, but if you try with User or UserDetails, you get a null.
- A UserDetails or User implementation expect a password field. Totally useless, it's not a AuthenticationServer.
