
**Problem statement: **
  Given a list of shopping, calculate the total cost of those items. Multiple items are present multiple times in the list, so for example ["Apple", "Apple", "Banana"] is a       basket with two apples and one banana.
    Items are priced as follows: 
    - Apples are 35p each
    - Bananas are 20p each
    - Melons are 50p each, but are available as ‘buy one get one free’
    - Limes are 15p each, but are available in a ‘three for the price of two’ offer
**Steps to follow for code review/testing.**
1.	Added a simple program that contains Shopping List - added with various items to calculate the total shopping basket cost.
2.	ShoppingCart.java has main method which invokes calculateShoppingCost() method from ShoppingCartProcessor.java
3.	As we have different items and each item has its own unit price, discount scheme/ logic, created an Enum called Item.java which will hold all the necessary information required for an item
4.	ShoppingCartProcessor.java files uses the values from Item enum for all the items added in the cart/shopping basket and calculates the total cost.
5.	Various JUnit test cases are added with various combination of line items.
**Key considerations:**
1.	As per the task, we need to write a simple program that calculates the total shopping cost considering all the discount rules if applicable.
2.	IF in future there is any change in the unit price per item or changes in the discount rules, we will simply modify the Item.java enum, to keep code clean and readable.
3.	Focus to add a clean yet robust logic with proper unit testing and JUnits.
