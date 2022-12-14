package com.app.sportsassignment.model

import com.app.sportsassignment.model.firstScreen.Batting
import com.app.sportsassignment.model.firstScreen.Bowling

//
// Created by Akshay Kondekar on 12/14/2022.
// Copyright (c) 2022 Appineers India. All rights reserved.
//
data class CustomPlayer(
    val position: String,
    val fullName: String,
    val type: String,
    val batting: Batting,
    val bowling: Bowling
)

val team1player1 = CustomPlayer(
    position = "5",
    fullName = "Shoaib Malik",
    type = "Captain",
    batting = Batting("35.17","7317","81.65","RHB"),
    bowling = Bowling("39.11","4.65","OB","156")
)

val team1player2 = CustomPlayer(
    position = "1",
    fullName = "Imam-ul-Haq",
    type = "Batsman",
    batting = Batting("60.17","910","81.54","LHB"),
    bowling = Bowling("0","0","LB","0")
)

val team1player3 = CustomPlayer(
    position = "2",
    fullName = "Fakhar Zaman",
    type = "Wicketkeeper",
    batting = Batting("55.17","1326","96.65","LHB"),
    bowling = Bowling("88.11","4.65","SLO","31")
)

val team1player4 = CustomPlayer(
    position = "3",
    fullName = "Babar Azam",
    type = "Batsman",
    batting = Batting("50.17","2328","84.65","RHB"),
    bowling = Bowling("0","0","OB","0")
)

val team1player5 = CustomPlayer(
    position = "6",
    fullName = "Sarfraz Ahmed",
    type = "Batsman",
    batting = Batting("32.17","1936","86.65","RHB"),
    bowling = Bowling("0","7.65","OB","0")
)

val team1player6 = CustomPlayer(
    position = "7",
    fullName = "Shadab Khan",
    type = "Bowler",
    batting = Batting("30.17","275","67.65","RHB"),
    bowling = Bowling("39.11","4.65","LB","45")
)

val team1player7 = CustomPlayer(
    position = "8",
    fullName = "Hussain Talat",
    type = "Batsman",
    batting = Batting("2","2","14.65","LHB"),
    bowling = Bowling("0","6","RMF","0")
)

val team1player8 = CustomPlayer(
    position = "9",
    fullName = "Faheem Ashraf",
    type = "Batsman",
    batting = Batting("15.17","104","71.65","LHB"),
    bowling = Bowling("28.11","4.65","RMF","18")
)

val team1player9 = CustomPlayer(
    position = "10",
    fullName = "Shadab Khan",
    type = "Bowler",
    batting = Batting("30.17","275","67.65","RHB"),
    bowling = Bowling("39.11","4.65","LB","45")
)

val team1player10 = CustomPlayer(
    position = "4",
    fullName = "Hussain Talat",
    type = "Bowler",
    batting = Batting("2","2","14.65","LHB"),
    bowling = Bowling("0","6","RMF","0")
)

val team1player11 = CustomPlayer(
    position = "11",
    fullName = "Faheem Ashraf",
    type = "Bowler",
    batting = Batting("15.17","104","71.65","LHB"),
    bowling = Bowling("28.11","4.65","RMF","18")
)

val firstTeam = arrayListOf(team1player1, team1player2, team1player3, team1player4, team1player5, team1player6, team1player7,
    team1player8, team1player9, team1player10, team1player11)

val team2player1 = CustomPlayer(
    position = "8",
    fullName = "Kagiso Rabada",
    type = "Bowler",
    batting = Batting("35.17","7317","81.65","RHB"),
    bowling = Bowling("39.11","4.65","OB","156")
)

val team2player2 = CustomPlayer(
    position = "1",
    fullName = "Hashim Amla",
    type = "Batsman",
    batting = Batting("60.17","7812","81.54","LHB"),
    bowling = Bowling("0","0","LB","0")
)

val team2player3 = CustomPlayer(
    position = "2",
    fullName = "Reeza Hendricks",
    type = "Batsman",
    batting = Batting("55.17","294","96.65","LHB"),
    bowling = Bowling("88.11","4.65","SLO","1")
)

val team2player4 = CustomPlayer(
    position = "3",
    fullName = "Rassie van der Dussen",
    type = "Batsman",
    batting = Batting("50.17","177","84.65","RHB"),
    bowling = Bowling("0","0","OB","0")
)

val team2player5 = CustomPlayer(
    position = "4",
    fullName = "Faf du Plessis",
    type = "Captain",
    batting = Batting("32.17","4701","86.65","RHB"),
    bowling = Bowling("0","7.65","OB","0")
)

val team2player6 = CustomPlayer(
    position = "5",
    fullName = "David Miller",
    type = "Batsman",
    batting = Batting("30.17","2827","67.65","RHB"),
    bowling = Bowling("39.11","4.65","LB","45")
)

val team2player7 = CustomPlayer(
    position = "6",
    fullName = "Heinrich Klaasen",
    type = "Wicketkeeper",
    batting = Batting("22","251","14.65","LHB"),
    bowling = Bowling("0","6","RMF","0")
)

val team2player8 = CustomPlayer(
    position = "7",
    fullName = "Andile Phehlukwayo",
    type = "Batsman",
    batting = Batting("15.17","104","71.65","LHB"),
    bowling = Bowling("28.11","4.65","RMF","18")
)

val team2player9 = CustomPlayer(
    position = "10",
    fullName = "Dane Paterson",
    type = "Bowler",
    batting = Batting("30.17","275","67.65","RHB"),
    bowling = Bowling("39.11","4.65","LB","45")
)

val team2player10 = CustomPlayer(
    position = "4",
    fullName = "Tabraiz Shamsi",
    type = "Bowler",
    batting = Batting("2","2","14.65","LHB"),
    bowling = Bowling("34","6","SLC","16")
)

val team2player11 = CustomPlayer(
    position = "11",
    fullName = "Duanne Olivier",
    type = "Bowler",
    batting = Batting("15.17","104","71.65","LHB"),
    bowling = Bowling("28.11","4.65","RMF","18")
)

val secondTeam = arrayListOf(team2player1, team2player2, team2player3, team2player4, team2player5, team2player6, team2player7,
    team2player8, team2player9, team2player10, team2player11)
