# project01
***************** COFFEE MACHINE PROJECT TASK ***************

1. Build a simple Coffee machine. Let's have 3 kinds of coffee. 2. Let the system ask: "Which Coffee would you like?" 3. Let the user see the coffee information with this question. Example: Which Coffee Would You Like? 1.Turkish Coffee 2.Filter Coffee 3.Espresso
         Create the String whichCoffee and write one of the existing coffees. (eg: Turkish Coffee, or Turkish coffee. ---> Use the String method to avoid case insensitivity.) todo 1. Condition section If the coffee is Turkish coffee, console = Turkish coffee is being prepared. (Do not write plain Turkish coffee. Call String WhichKahve!!) If it is filter coffee, console = Filter coffee is being prepared. write it. (Use whichKahve String !) If it is Espresso, write = Preparing Espresso... in the console. (Use String whichKahve !) If you enter the wrong letter, you have entered the console = Wrong keying. write it. (The code will continue to work after a miskey, you haven't seen that topic yet, so start over.)
   todo ------------------------------------------------
         Let the system ask us the following question: "Would you like us to add milk? (Answer Yes or No): " It should read exactly like this in the console. Let it be in the brackets in the console.
        Create string milk.
Todo 2.Condition Section If String milk is equal to yes, the console will get the message Adding milk.... -- (Use String method to be case insensitive. Possible possibilities: Yes, YES, Yes, YES etc.
       If String milk is equal to no, the console displays the message No milk is added.
  todo ------------------------------------------------
         The system asks us a question like "Would you like candy? (Answer yes or no): ". (Use string method to avoid case insensitivity. Create String candy. todo 3.Condition Section todo if(){ If String candy is equal to Yes, the system should ask us "How many candies?". At the bottom of the question, create int how many Candies. Candy Enter the number and print the following to the console example: Adding 5 sugars (hint: All of these codes will be in the if block) todo } todo else{ If String sugar is equal to no, the system will give us the answer "No sugar is added".
             IMPORTANT !! = If we are going to enter a String after an int input, we need to insert an empty nextLine. (String bosKod = sc.nextLine(); ) Add dummy code.
   Let the system ask us the question "What size should it be? (Enter large size - medium size - small size.) : (it should not be case sensitive. that is, it should accept when the user enters large size or LARGE. Create a String size...
                                                    todo 4.Condition Section if String size is equal to Large size = Your coffee is prepared in large size. (Let's write the large part using String size = "Your coffee" + size + "preparing.")
         If String size is equal to Medium = Your coffee is being medium size.. ("Your coffee is" + size + "making.)
         If String size is equal to Small size = Your coffee is being prepared small size. write it. ("Your coffee" + size + "is being prepared.)
                     //todo CONCLUSION SECTION
                     We placed our orders. We want to see the final state. print the following to the console example:
         Turkish Coffee is medium size ready. Enjoy your meal !!! (Use String which Coffee for Turkish coffee. Use String size for medium size.)
