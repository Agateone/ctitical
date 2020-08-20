Feature: Register to Axate






#1
Scenario: Successful Registration from FUN with top up
Given I am a new user 
When I register
Then I see a wallet with £3




#1
Scenario: Successful Registration from FUN with top up
Given I am a new user 
When I dont top up during reg
Then I top up with add funds through top up page 


#1
Scenario: Successful Transaction from authorise charge notice
Given I am a new user 
When I register and top up 
Then I can read a premium article from authoirse charge notice

#1
Scenario: Successful Transaction from New publication notice
Given I am a new user 
When I register from popbitch
And I navigate to cornwall
Then I can transact from New publication notice


#1
Scenario: Account succesfully auto tops up 
Given I register on maidenhead with auto top up ON
When My balance gets below one pound
Then My account is Auto topped up










