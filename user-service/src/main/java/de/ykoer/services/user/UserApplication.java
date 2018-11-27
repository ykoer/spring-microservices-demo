package de.ykoer.services.user;

import de.ykoer.services.user.model.User;
import de.ykoer.services.user.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

	@Bean
	public Docket swaggerPersonApi10() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage("pl.piomin.services.employee.controller"))
					.paths(PathSelectors.any())
				.build()
				.apiInfo(new ApiInfoBuilder().version("1.0").title("User API").description("Documentation User API v1.0").build());
	}
	
	@Bean
	UserRepository repository() {
		UserRepository repository = new UserRepository();
		repository.add(new User("Brendon","Foxwell"));
		repository.add(new User("Dyan","Bannister"));
		repository.add(new User("Elfriede","Lebsock"));
		repository.add(new User("Mariah","Spadaro"));
		repository.add(new User("Markita","Arent"));
		repository.add(new User("Brenna","Tann"));
		repository.add(new User("Lois","Beery"));
		repository.add(new User("Leonel","Bohannon"));
		repository.add(new User("Cherryl","Mcwhite"));
		repository.add(new User("Sibyl","Camire"));
		repository.add(new User("Giuseppe","Oliveras"));
		repository.add(new User("Huey","Blaze"));
		repository.add(new User("James","Lake"));
		repository.add(new User("Cindie","Stanislawski"));
		repository.add(new User("Millie","Farraj"));
		repository.add(new User("Grace","Pleas"));
		repository.add(new User("Eldon","Fergus"));
		repository.add(new User("Mirian","Hopson"));
		repository.add(new User("Cristie","Sandoz"));
		repository.add(new User("Jennefer","Munger"));
		return repository;
	}


}
