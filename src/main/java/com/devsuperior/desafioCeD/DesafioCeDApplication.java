package com.devsuperior.desafioCeD;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class DesafioCeDApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(DesafioCeDApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Scanner keyboard = new Scanner(System.in);

		System.out.println("(dados do pedido: código, valor básico, porcentagem de desconto:)");
		int code = keyboard.nextInt();
		double basic = keyboard.nextDouble();
		double discount = keyboard.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	}
}
