Feature: To Validate register functionlity 

Background:

Given user have to enter into comunity matrimony page
@login
Scenario Outline: user have to enter the login

When user have to enter the login url

When user have to enter valid "<username>" and password and "<status>"

And user have to click the submit button

When user have to enter the login url two

When user have to enter valid second "<username>" and password and "<status>"

And user have to click the submit button second

When user have to enter the login url third

When user have to enter valid third "<username>" and password and "<status>"

And user have to click the submit button third

Then user credentials
    Examples: 
      | username  |status|
    | AGR751804 |  publish status =3|
| AGR100176 |  publish status =3|
| AGR100719 |  publish status =3|
| AGR752761 |  publish status =5|
| AGR161189 |  publish status =5|
| AGR123656 | publish status =7|
| AGR752642 |  publish status =7|
| AGR101292 |  publish status =7|
| AGR601674 |  publish status =8|
| AGR101024 |  publish status =8|
| AGR163756 |  publish status =8|
| AGR100144 |  publish status =9|
| AGR100595 | publish status =9|
| AGR104000 | publish status =9|
| AGR755384 | publish status =10|
| AGR755382 | publish status =10|
| AGR601866 | publish status =10|
| AGR100892 | publish status =51|
| AGR752401 | publish status =52|
| AGR101085 | publish status =55|
| AGR601732 |publish status =60|
| AGR752005 |  publish status =95|
| AGR100421 |publish status =82|
| AGR103400 |publish status =85|
| AGR118147 | publish status =90|
| AGR754699 |publish status =100|
| AGR755075 |publish status =105|
| AGR755074 |  publish status =99|