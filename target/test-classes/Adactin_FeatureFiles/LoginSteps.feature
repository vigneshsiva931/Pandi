Feature: To validate Addactin Login 

 Scenario Outline: To validate Login Using Valid Username Valid Password
 
 Given User Launch Addactin Login
 When User Enter "<UserName>" and "<PassWord>"
 And Click Login button
 Then check login sucessful
 
 	Examples: 
 	|	UserName 		 			|PassWord 	|
 	| Pandisiva123 			|Pandi@931	|				
  | VigneshPandi12345 |Pandi@567	|   
	|	VigneshNihi				|Pandi@siva	|