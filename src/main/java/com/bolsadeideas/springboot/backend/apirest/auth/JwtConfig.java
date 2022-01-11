package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEAvVYENT8mhyBbeIbWVJBTnWkeDWMe6JxEO/K+kH5himaQ65g2\r\n"
			+ "XxUeTtc9C9qIrzixzw4Uo6uJuWU2bf64XYZK1+6m4GhPmg2C/SQzCCZVJZEbG4Xb\r\n"
			+ "Igt2zn+Us1I43i595PNLimuqu++l0RdV0Nyew4BJnmiBHq1G5fbkBjvvzR+A77HC\r\n"
			+ "GSMD+Ht+D5TcR1DeVHufGAngxDSYSm7lbf9o9tTJ/vgNHlwqyP4m5KgH0yg16glv\r\n"
			+ "qM+fA22SxTl87EfcFw1urmqbLZlcqjUg5jbJ9VeyTbQ6BZzcs3tYawLN39UPZwiq\r\n"
			+ "ECnlcUTziO6nsgFn3gNNecUXVdd8VBbTNu2o7QIDAQABAoIBADFysY6me4126ezE\r\n"
			+ "al2ThALsXSjp5jyh80Ak2ZgrKZZXyyl8i1ax0USN+ieKX4BDskx9RO6p8kI1KM35\r\n"
			+ "ZHUoiYtzjKm3FHMLbFZoidtrB3nUN9wsTVrK27B6qX9bzfZY9hBBak0waVrD7+53\r\n"
			+ "xbXSqLQuYQu6B17XqliM7miiZrKPP7LD6lgNIF4F2XJFAMNuAQuYj+WinfzW9fL8\r\n"
			+ "ZJdBUaTwrib9oB+GHyBYqcOYhjAz4XWY2eVt8BcAkUa4d/0MGfRdmIoeEzoBwfYd\r\n"
			+ "n8IzgHTtdQPKKvBfNfJiXujzQ3XJUHy2poPj+kTDsJw6fkf5EAIqObnYJ2PfpHRj\r\n"
			+ "E1woKIECgYEA/COQQQrVIJhYCRHtCcTkxmSxqUyM7em82Wb63iObBPfwgOoGlmRA\r\n"
			+ "gSsLvzvVeK0R6XLM9IVJqlToU0S64MAkmqnrf9KB7LFyNvUiVKgbth25S/ZY1rek\r\n"
			+ "RmWz7Bd4lZ84QwGCtSG6j1FkdPNj+nYHFV2WMKdCR4bzP5we38HDb/UCgYEAwDxA\r\n"
			+ "qE2Mo/i5ZDzL2kfPZjnzTueCZgdS6QmWfsU/lWEIfpJ2tj8CnX64ZqN2sqzYtjfI\r\n"
			+ "9miBoCHMI5LGip7TKX0No1yOzR195aJp4MQR0wsKmQ5SA5pl20K0zC3vntcQ44Ty\r\n"
			+ "BBbmihpnQ6fcuM3JQ60VaGICC6KDq+B6f1hGkhkCgYEAjcWpbQkcQZGnnqH3uJB/\r\n"
			+ "WpZv1xP2Aih1SYC/+nvmxGptTu9H+PQx2O9NUZ/hLlOSSMOGPs9bVm0bnQZ+VbV0\r\n"
			+ "X4q/okXJTD+SSxiWzycfPc2EzROdbE4iDntNKakg4nB+gB6vUg2/CqrnY2Mfiksn\r\n"
			+ "PHo84uqJOBLHX7L3ITWgIKkCgYB9jdzdD+lvnx/W7C5onsZDCk5zlpmAcgAg3HZC\r\n"
			+ "zim9MucNZDPMzFK08vMVdmYsROA2AzFqXs9q+ygNg+vQ1fMtAdRKgkVyinST6wQk\r\n"
			+ "HWtW37tIRCYk3E7yahsT0FzU7brGHyrCqQJh6OTRN23d9eoiHYYB6yFS4A4H0FGx\r\n"
			+ "osJU4QKBgDHfAPTeIjGL9Nhls8P83F82+doxXQmMg8T4xS+UVdjvTkWJ5GIMhVWN\r\n"
			+ "APdGpgj1/2kfPLo6OrVO8pF2+iVJ3cmTU2qPU/ktCuAfJP4Frwp0TO6n2NJq5dtA\r\n"
			+ "6PYIb++tM4QGmyxZhtyT6CcVJ9mEnR3YroolzlVhEAqF0ic/bunZ\r\n"
			+ "-----END RSA PRIVATE KEY-----";

	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvVYENT8mhyBbeIbWVJBT\r\n"
			+ "nWkeDWMe6JxEO/K+kH5himaQ65g2XxUeTtc9C9qIrzixzw4Uo6uJuWU2bf64XYZK\r\n"
			+ "1+6m4GhPmg2C/SQzCCZVJZEbG4XbIgt2zn+Us1I43i595PNLimuqu++l0RdV0Nye\r\n"
			+ "w4BJnmiBHq1G5fbkBjvvzR+A77HCGSMD+Ht+D5TcR1DeVHufGAngxDSYSm7lbf9o\r\n"
			+ "9tTJ/vgNHlwqyP4m5KgH0yg16glvqM+fA22SxTl87EfcFw1urmqbLZlcqjUg5jbJ\r\n"
			+ "9VeyTbQ6BZzcs3tYawLN39UPZwiqECnlcUTziO6nsgFn3gNNecUXVdd8VBbTNu2o\r\n"
			+ "7QIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
