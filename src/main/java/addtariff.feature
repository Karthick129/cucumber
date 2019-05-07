Feature: Add tariff plans


  Scenario: Add Tariffs
    Given The user in add tariff page
    When user enters the tariff details
    |Mrental|LMinute|Iminute|smspack|Lpminutes|IpMinute|Smscharge|
    |100|20|50|50|120|123|345|
    |200|30|60|450|25|153|565|
    |300|40|350|550|20|10|145|
    And user clicks the submit button
    Then  traiff added successfully
