Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase then number of ways that I can read the time

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 24:00:00
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO

Scenario: Morning
When the time is 05:00:00
Then the clock should look like
Y
ROOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Before Morning
When the time is 03:30:59
Then the clock should look like
O
OOOO
RRRO
YYRYYROOOOO
OOOO

Scenario: After Morning
When the time is 11:45:45
Then the clock should look like
O
RROO
ROOO
YYRYYRYYROO
OOOO

Scenario: Afternoon
When the time is 12:00:00
Then the clock should look like
Y
RROO
RROO
OOOOOOOOOOO
OOOO

Scenario: Evening
When the time is 18:30:00
Then the clock should look like
Y
RRRO
RRRO
YYRYYROOOOO
OOOO

Scenario: After Evening
When the time is 22:30:55
Then the clock should look like
O
RRRR
RROO
YYRYYROOOOO
OOOO
