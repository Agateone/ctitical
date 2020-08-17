Feature: Register to Axate






#1
Scenario: Successful Registration from FUN with top up
Given I am a new user and choose to register
When I enter a new email and click on continue
And I click on continue on marketing preferences page without opting
And I click on change My preferences on missing out page
And I opt to share personal data and offers and click on continue
And choose Three pounds on top up page and click on Add Payment details
And choose card on payment options page
And enter valid card details and billing details and click on continue
And choose auto top up OFF and Auto pay On and click on confirm 
Then I see a finish notice
And Three pounds in the wallet 
And Auto top up off shows ADD FUNDS on the wallet



#2
Scenario: Successful top up from Top up notice
Given I am a new user and choose to register
When I enter a new email and click on continue
And I click on continue on marketing preferences page without opting
And I click on change My preferences on missing out page
And I opt to share personal data and offers and click on continue
And return to the article
And I click on add funds on top up notice
And choose Three pounds on top up page and click on Add Payment details
And choose card on payment options page
And enter valid card details and billing details and click on continue
And choose auto top up OFF and Auto pay On and click on confirm 
Then I see a finish notice
And Three pounds in the wallet 
And Auto top up off shows ADD FUNDS on the wallet