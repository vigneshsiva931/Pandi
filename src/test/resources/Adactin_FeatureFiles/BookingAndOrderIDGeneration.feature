Feature: To validate Booking Option  

 Scenario: To validate Booking Option Using All Valid Details  
 
 Given User Launch Addactin LoginPage Login using Username Password 
 And Enter Valid Details Required 
 And  verify select Hotel
 When Enter All Valid Paymnet Details
 Then Check Order Id  Gernerated