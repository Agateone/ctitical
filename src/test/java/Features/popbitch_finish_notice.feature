Feature: finish notice displayed on successfull signup




# POPSMO52
Scenario: Finish notice displayed on successful signup from FUN
Given I am a user of Axate and I am on the registration page through popbitch staging
When I enter all the required details on step1 and clicks on continue
And top up with a valid card in steptwo with £1 and clicks on continue
Then I get a funded axate wallet with £1 in it
And navigated to the same article
And finish notice is displayed as a popup



# POPSMO53
Scenario: Finish notice displayed on successful signup from wallet
Given I am a user of Axate 
When I register successfully on popbitch from wallet
And navigate to a premium article
Then a finish notice is displayed as a popup

# POPSMO52
Scenario: Authorise charge notice displayed on opting Ask me everytime on finish notice
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Ask me everytime on the finish notice and click ok
Then an authorise charge notice is displayed 



# POPSMO52
Scenario: Wallet balance detucted by 25p on opting just charge me on the finish notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me everytime on the finish notice and click ok
Then 25p is detucted from the wallet 


# POPSMO52
Scenario: Free point detucted by 25p on opting just charge me on the finish notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me everytime on the finish notice and click ok
Then 25p is detucted from the free point


 # POPSMO52
Scenario: full article displayed on opting just charge me on the finish notice 
Given I am a user of Axate and on the FUN of popbitch 
When I register successfully on popbitch from FUN
And opt Just charge me everytime on the finish notice and click ok
Then full article is displayed 