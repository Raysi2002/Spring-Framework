package com.raysi.springjdbcmoduleretrive;

import com.raysi.springjdbcmoduleretrive.controller.Player;
import com.raysi.springjdbcmoduleretrive.mapper.PlayerMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class SpringJdbcModuleRetriveApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(SpringJdbcModuleRetriveApplication.class, args);
        JdbcTemplate template = context.getBean(JdbcTemplate.class);

        //Query Statement for fetching data from database
        String query = "select * from player";

        //Mapper always provide results in List<T>
        List<Player> players =  template.query(query, new PlayerMapper());

        //Players are fetched one by one
        for(Player player: players){
            System.out.println("PID: " + player.getPid());
            System.out.println("Name: " + player.getName());
            System.out.println("Type: " + player.getType());
            System.out.println("Rarity: " + player.getRarity());
            System.out.println("Power_Level: " + player.getPower_level());
            System.out.println("-------------------------------------------");
        }
    }

}
