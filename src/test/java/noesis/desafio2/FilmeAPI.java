package noesis.desafio2;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.path.json.JsonPath;

public class FilmeAPI {
	private JsonPath jsonPath;
	private String idFilme = "tt1285016";
	private String apiKey = "52ec71bf";

	public String getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(String idFilme) {
		this.idFilme = idFilme;
	}

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public JsonPath getJsonPath() {
		return jsonPath;
	}

	public void setJsonPath(String url) {
		this.jsonPath = given()

				.when().get(url).then().extract().response().getBody().jsonPath();

	}

	@Test
	public void validarTituloDoFilme() {
		String urlBase = "http://www.omdbapi.com/?i=" + getIdFilme() + "&apikey=" + getApiKey();

		setJsonPath(urlBase);
		String title = "The Social Network";

		assertEquals(title, getValue("Title"));

	}

	@Test
	public void validarAnoDoFilme() {
		String urlBase = "http://www.omdbapi.com/?i=" + getIdFilme() + "&apikey=" + getApiKey();

		setJsonPath(urlBase);
		String year = "2010";

		assertEquals(year, getValue("Year"));

	}

	@Test
	public void validarIdiomaDoFilme() {
		String urlBase = "http://www.omdbapi.com/?i=" + getIdFilme() + "&apikey=" + getApiKey();

		setJsonPath(urlBase);
		String language = "English, French";

		assertEquals(language, getValue("Language"));

	}

	@Test
	public void validarFilmeInexistente() {
		setIdFilme("tt285016");
		String urlBase = "http://www.omdbapi.com/?i=" + getIdFilme() + "&apikey=" + getApiKey();

		setJsonPath(urlBase);
		String response = "False";
		String error = "Incorrect IMDb ID.";

		assertEquals(response, getValue("Response"));
		assertEquals(error, getValue("Error"));

	}

	@Test
	public void validarFilmeAPIKeyInvalida() {
		setApiKey("52ec71b");
		String urlBase = "http://www.omdbapi.com/?i=" + getIdFilme() + "&apikey=" + getApiKey();

		setJsonPath(urlBase);
		String response = "False";
		String error = "Invalid API key!";

		assertEquals(response, getValue("Response"));
		assertEquals(error, getValue("Error"));

	}

	public String getValue(String key) {

		return getJsonPath().get(key).toString();
	}

}
