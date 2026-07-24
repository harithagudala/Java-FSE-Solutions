import React from "react";

function ListofPlayers() {

    const players = [
        { name: "Virat Kohli", score: 85 },
        { name: "Rohit Sharma", score: 92 },
        { name: "Shubman Gill", score: 45 },
        { name: "KL Rahul", score: 68 },
        { name: "Hardik Pandya", score: 75 },
        { name: "Ravindra Jadeja", score: 55 },
        { name: "R Ashwin", score: 80 },
        { name: "Mohammed Shami", score: 40 },
        { name: "Jasprit Bumrah", score: 72 },
        { name: "Surya Kumar Yadav", score: 65 },
        { name: "Ishan Kishan", score: 90 }
    ];

    const lowScorePlayers = players.filter(player => player.score < 70);

    return (
        <div>

            <h2>List of Players</h2>

            <h3>All Players</h3>

            <ul>
                {players.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

            <h3>Players with Score below 70</h3>

            <ul>
                {lowScorePlayers.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

        </div>
    );
}

export default ListofPlayers;