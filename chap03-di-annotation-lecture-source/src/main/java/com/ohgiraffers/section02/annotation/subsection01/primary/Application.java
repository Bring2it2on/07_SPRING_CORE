package com.ohgiraffers.section02.annotation.subsection01.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com/ohgiraffers/section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }

        // 스프링 컨텍스트에 등록된 같은 타입의 bean이 3개나 있음(파이리,피카츄,꼬부기)
        // 한개만 필요하므로 3개중 하나의 클래스를 @Primary 설정

        PokemonService pokemonService = context.getBean("pokemonServicePrimary", PokemonService.class);

        pokemonService.pokemonAttack();
    }
}
