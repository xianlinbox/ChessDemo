Meta:
@author liuxianning
@theme  composite

Narrative: This story is used to show composite steps.

Scenario: Add a student into the class

Given There is a student with default details
When system add the student into class
Then we can get student 'Lincoln2' from class

