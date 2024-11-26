package com.raysi.springjdbcmoduleretrive.mapper;

import com.raysi.springjdbcmoduleretrive.controller.Player;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlayerMapper implements RowMapper<Player> {

    //MapRow fetches each row at a time but entire row
    @Override
    public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
        Player player = new Player();

        //Player details are fetched one by one through result set and then it is set to players through row mapping
        player.setPid(rs.getInt(1));
        player.setName(rs.getString(2));
        player.setType(rs.getString(3));
        player.setRarity(rs.getString(4));
        player.setPower_level(rs.getInt(5));
        return player;
    }
}
