@smoke
  Feature: F08_WishList
    Scenario: add product to wishlist
      When  user click on love button
      Then  product wishlist add successfully


      Scenario: wish list product count
        When user click on love button
        And  click on wishlist icon
        Then verify number of specified product