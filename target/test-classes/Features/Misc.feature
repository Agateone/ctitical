Feature: extra extra 


# POPSMO2
Scenario: Successful signup from popbitch Wallet staging
Given I am a user of Axate and I am on the registration page through popbitch staging
When I enter all the required details on step1 and clicks on continue
And top up with a valid card in steptwo with £3 and clicks on continue
Then I get a funded axate wallet with £1 in it
And navigated to popbitch.com



# POPSMO2
Scenario: Successful registration through login page
Given I am a user of axate and I am on the login page from popbitch FUN
When I click on register here on login page
And I enter all the required details on step1 and clicks on continue
And I top up with a valid card in steptwo with £1 and click on continue
Then I get a funded axate wallet with £1 in it

# POPSMO3
Scenario: Payment system loads on selecting the £1 on regpage2 
Given User is on the registration page through popbitch staging
When he enters all the required details on step1 and clicks on continue
And he clicks on £1 on regpage2
Then payment system displays payment options


# POPSMO4
Scenario:  Payment system loads on selecting the £3 on regpage2 
Given User is on the registration page through popbitch staging  
When he enters all the required details on step1 and clicks on continue
And he clicks on £3 on regpage2
Then payment system displays payment options

# POPSMO5
Scenario: Payment system loads on selecting the £5 on regpage2 
Given User is on the registration page through popbitch staging  
When he enters all the required details on step1 and clicks on continue 
And he clicks on £5 on regpage2
Then payment system displays payment options

# POPSMO3
Scenario: paypal system loads on selecting the £1 on regpage2 
Given User is on the registration page through popbitch staging
When he enters all the required details on step1 and clicks on continue
And he clicks on £1 on regpage2
Then paypal system displays payment options


# POPSMO4
Scenario:  paypal system loads on selecting the £3 on regpage2 
Given User is on the registration page through popbitch staging  
When he enters all the required details on step1 and clicks on continue
And he clicks on £3 on regpage2
Then paypal system displays payment options

# POPSMO5
Scenario: paypal system loads on selecting the £5 on regpage2 
Given User is on the registration page through popbitch staging  
When he enters all the required details on step1 and clicks on continue 
And he clicks on £5 on regpage2
Then paypal system displays payment options

# POPSMO6
Scenario: Successful initial top up through card  
Given User is on the registration page through popbitch staging  
When he enters all the required details on step1 and clicks on continue
And he clicks on £1 on regpage2
And enters valid card details and clicks on continue
Then user successfully creates a £1 funded axate wallet 


# POPSMO7
Scenario: Sucessful registration with an empty wallet on skipping payment  
Given User is on the registration page through popbitch staging FUN 
When he enters all the required details on step1 and clicks on continue
And refreshes the page by navigating to article
Then User is registered with an empty wallet 



# POPSMO8
Scenario: Axate lets user select their country
Given User is on the registration page through popbitch staging FUN 
When he enters all the required details on step1 and clicks on continue
And user selects their country from the drop down
Then user is registered with the selected country 


# POPSMO8
Scenario: Seleting US as country user should be asked for city and zipcode
Given User is on the registration page through popbitch staging FUN 
When he enters all the required details on step1 and clicks on continue
And user selects US as their country from the dropdown
Then user is asked for city adn zip code


# POPSMO8
Scenario: User registers by selecting USA as their country 
Given User is on the registration page through popbitch staging FUN 
When he enters all the required details on step1 and clicks on continue
And adds a voucher on the voucher page
And user selects US as their country from the dropdown
And enters the city and postcode 
Then User is registered with USA as their country 
