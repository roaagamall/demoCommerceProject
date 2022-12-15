@smoke

  Feature: F04_Search | search field is working successfully

      Scenario Outline: user could search using sku
        Given test this value "<sku>"

        Examples:
        |sku|
        |APPLE_CAM|
        |SCI_FAITH|
        |SF_PRO_11|



    Scenario Outline : user could search by product name
      Given test this values "<product>"
      Examples:
        |product|
        |book  |
        |nike  |
        |laptop|

