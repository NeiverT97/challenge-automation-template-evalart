#Author: Neiver Tapia Escobar
#Email: neiver.tapia@choucairtesting.com.co
#Date: 04/05/2023

Feature: As a user I need to clicked a correct button

  Background: Open Url
    Given the user open url application

  Scenario: The user performs the mathematical formula and clicks on the correct button.
    Given The user enter the page web and login
      | userName | password                                         |
      | 599467 | 10df2f32286b7120My0zLTc2NDk5NQ==30e0c83e6c29f1c3 |
    When The user selected and clicked correct button
      | numMatrix | sumNum |
      | 32        | 482    |
      | 89        | 875    |
      | 122       | 945    |
      | 196       | 497    |
      | 74        | 688    |
      | 38        | 665    |
      | 36        | 840    |
      | 109       | 551    |
      | 170       | 915    |
      | 102       | 892    |
      | 44        | 549    |
      | 157       | 692    |
      | 170       | 993    |
      | 135       | 579    |